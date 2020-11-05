package other.model.service;

import java.sql.Connection;
import java.sql.SQLException;

import common.JDBCTemplate;
import other.model.dao.FileDAO;
import product.model.vo.Product;

public class FileService {
	private JDBCTemplate factory;
	
	public FileService() {
		factory = JDBCTemplate.getConnection();
	}
	
	public int uploadFile(Product product, String systemFileName) {
		Connection conn = null;
		int result = 0;
		try {
			conn = factory.createConnection();
			result = new FileDAO().uploadFile(conn, product, systemFileName);
			if(result > 0) {
				JDBCTemplate.commit(conn);
			} else {
				JDBCTemplate.rollback(conn);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(conn);
		}
		return result;
	}
}
