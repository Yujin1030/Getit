package main.model.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import common.JDBCTemplate;
import main.model.dao.MainDao;
import product.model.vo.Product;

public class MainService {

	public JDBCTemplate factory;
	
	public MainService() {
		factory = JDBCTemplate.getConnection();
	}
	
	public ArrayList<Product> selectAllProduct() {
		Connection conn = null;
		ArrayList<Product> productList = null;
		try {
			conn = factory.createConnection();
			productList =  new MainDao().selectAllProduct(conn);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(conn);
		}
		return productList;
	}
}
