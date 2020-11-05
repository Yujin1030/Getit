package other.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import common.JDBCTemplate;
import product.model.vo.Product;

public class FileDAO {
	public int uploadFile(Connection conn, Product product, String systemFileName) {
		PreparedStatement pstmt = null;
		int result = 0;
		String query = "UPDATE OTHER_PRODUCT SET CONT_PICTURE_NAME = ?, CONT_PICTURE_PATH = ? WHERE O_PRODUCT_NO = ?";
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, systemFileName);
			pstmt.setString(2, product.getpFilepath());
			pstmt.setInt(3, product.getSerialNo());
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(pstmt);
		}
		return result;
	}
}
