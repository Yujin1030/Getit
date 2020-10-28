package member.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import common.JDBCTemplate;
import member.OrderList;

public class OrderListDAO {
	
	public OrderList selectOrderList(Connection conn, String userId) {
		Statement stmt= null;
		ResultSet rset = null;
		String query="SELECT*FROM ORDER_INFO WHERE MEMBER_ID='"+userId+"'";
		
		OrderList orderList = null;
		
		try {
			stmt = conn.createStatement();
			rset = stmt.executeQuery(query);
			
			if(rset.next()) {
				orderList = new OrderList();
				orderList.setOrderNo(rset.getInt("orderNo"));
				orderList.setChangeYN(rset.getString("changeYN"));
				orderList.setChangeRE(rset.getString("changeRE"));
				orderList.setReturnYN(rset.getString("returnYN"));
				orderList.setReturnRE(rset.getString("returnRE"));
				orderList.setChangeA(rset.getInt("changeA"));
				orderList.setReturnA(rset.getInt("returnA"));
				orderList.setdMessage(rset.getString("dMessage"));
				orderList.setPayYN(rset.getString("payYN"));
				orderList.setdStatus(rset.getString("dStatus"));
				orderList.setPayNo(rset.getInt("payNo"));
				orderList.setMemberId(rset.getString("memberId"));
				orderList.setProductName(rset.getString("productName"));
				
				
				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JDBCTemplate.close(rset);
			JDBCTemplate.close(stmt);
		}
		
		return orderList;
	}
	
	

}
