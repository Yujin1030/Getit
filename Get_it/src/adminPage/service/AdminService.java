package adminPage.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import adminPage.dao.AdminDAO;
import adminPage.vo.OrderM;
import common.JDBCTemplate;

public class AdminService {
	
	private JDBCTemplate factory;
	
	public AdminService() {
		factory = JDBCTemplate.getConnection();
	}
	
	
	public ArrayList<OrderM> depositSearch(){
		ArrayList<OrderM> orderM = null;
		
		try {
			Connection conn = factory.createConnection();
			orderM = new AdminDAO().depositSearch(conn);
			JDBCTemplate.close(conn);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return orderM;
		
		
	}
	public int depositCount() {
		int result = 0;
		Connection conn = null;
		try {
			conn = factory.createConnection();
			result = new AdminDAO().depositCount(conn);
			
			
			if (result > 0) {
				JDBCTemplate.commit(conn);

			}else {
				JDBCTemplate.rollback(conn);

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JDBCTemplate.close(conn);			
		}


		return result;
		
	}
	
	public int payCompleteCount() {
		int result = 0;
		Connection conn = null;
		try {
			conn = factory.createConnection();
			result = new AdminDAO().payCompleteCount(conn);
			
			
			if (result > 0) {
				JDBCTemplate.commit(conn);

			}else {
				JDBCTemplate.rollback(conn);

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JDBCTemplate.close(conn);			
		}


		return result;
		
	}
	
	public int rfdCount() {
		int result = 0;
		Connection conn = null;
		try {
			conn = factory.createConnection();
			result = new AdminDAO().rfdCount(conn);
			
			
			if (result > 0) {
				JDBCTemplate.commit(conn);

			}else {
				JDBCTemplate.rollback(conn);

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JDBCTemplate.close(conn);			
		}


		return result;
		
	}public int deliveringCount() {
		int result = 0;
		Connection conn = null;
		try {
			conn = factory.createConnection();
			result = new AdminDAO().deliveringCount(conn);
			
			
			if (result > 0) {
				JDBCTemplate.commit(conn);

			}else {
				JDBCTemplate.rollback(conn);

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JDBCTemplate.close(conn);			
		}


		return result;
		
	}public int dCompleteCount() {
		int result = 0;
		Connection conn = null;
		try {
			conn = factory.createConnection();
			result = new AdminDAO().dCompleteCount(conn);
			
			
			if (result > 0) {
				JDBCTemplate.commit(conn);

			}else {
				JDBCTemplate.rollback(conn);

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JDBCTemplate.close(conn);			
		}


		return result;
		
	}public int returnCount() {
		int result = 0;
		Connection conn = null;
		try {
			conn = factory.createConnection();
			result = new AdminDAO().returnCount(conn);
			
			
			if (result > 0) {
				JDBCTemplate.commit(conn);

			}else {
				JDBCTemplate.rollback(conn);

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JDBCTemplate.close(conn);			
		}


		return result;
		
	}public int changeCount() {
		int result = 0;
		Connection conn = null;
		try {
			conn = factory.createConnection();
			result = new AdminDAO().changeCount(conn);
			
			
			if (result > 0) {
				JDBCTemplate.commit(conn);

			}else {
				JDBCTemplate.rollback(conn);

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JDBCTemplate.close(conn);			
		}


		return result;
		
	}

}
