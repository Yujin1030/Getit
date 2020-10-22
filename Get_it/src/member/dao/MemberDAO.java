package member.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import common.JDBCTemplate;
import member.Member;

public class MemberDAO {

	
	public int insertMember(Connection conn, Member member) {
		
		PreparedStatement pstmt = null;
		int result=0;
		String query = "INSERT INTO MEMBER_TBL VALUES(?,?,?,?,?,?,SYSDATE,?,?,?,?)";
		
		try {
			//연결코드 다 삭제 , Template 로 옮겨졌기 때문
			pstmt = conn.prepareStatement(query);
			
			pstmt.setString(1, member.getMemberId());
			pstmt.setString(2, member.getMemberName());
			pstmt.setString(3, member.getGender());
			pstmt.setString(4, member.getDob());
			pstmt.setString(5, member.getEmail());
			pstmt.setString(6, member.getPhone());
			pstmt.setString(7, "Y");
			pstmt.setDate(8, null);
			pstmt.setString(9, member.getMemberPwd());
			pstmt.setString(10, member.getAddress());
			
		
			
			result=pstmt.executeUpdate();
			// DB 순서대로 코딩 짜야됨.
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(pstmt);
		}
		
		
		return result;
	}
}
