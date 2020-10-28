package member.service;

import java.sql.Connection;
import java.sql.SQLException;

import common.JDBCTemplate;
import member.OrderList;
import member.dao.OrderListDAO;

public class OrderListService {
	
	private JDBCTemplate factory;
	public OrderListService() {
		factory = JDBCTemplate.getConnection();
	}
	
	public OrderList selectOrderList(String userId) {
		OrderList orderList = null;
		Connection conn;
		
		try {
			conn= factory.createConnection();
			orderList = new OrderListDAO().selectOrderList(conn, userId);
			JDBCTemplate.close(conn);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return orderList;
	}
	

}
