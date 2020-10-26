package main.model.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import common.JDBCTemplate;
import recommend.vo.Recommend;

public class MainDao {
	
	public MainDao() {}
	
	public ArrayList<Recommend> selectRecommend(Connection conn) {
		Statement stmt = null;
		ResultSet rset = null;
		ArrayList<Recommend> recommendList = null;
		String query = "select * from end_product";
		try {
			stmt = conn.createStatement();
			rset = stmt.executeQuery(query);
			if(rset!=null) {
				recommendList = new ArrayList<Recommend>();
				while(rset.next()) {
					Recommend recom = new Recommend();
					recom.setaNo(rset.getInt("a_no"));
					recom.setaName(rset.getString("a_name"));
					recom.setaPrice(rset.getInt("a_price"));
					recom.setaAccount(rset.getInt("a_account"));
					recom.setaDetail(rset.getString("a_Detail"));
					recom.setaCategory(rset.getString("a_category"));
					recom.setFileName(rset.getString("filename"));
					recom.setFilePath(rset.getString("filepath"));
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(rset);
			JDBCTemplate.close(stmt);
		}
		return recommendList;
	}
}
