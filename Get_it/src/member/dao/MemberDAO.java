package member.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import common.JDBCTemplate;
import member.Member;

public class MemberDAO {


	public int insertMember(Connection conn, Member member) {

		PreparedStatement pstmt = null;
		int result=0;
		String query = "INSERT INTO MEMBER_TBL VALUES(?,?,?,?,?,?,SYSDATE,?,?,?,?,?,?)";

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
			pstmt.setString(11, member.getDetailAddress());
			pstmt.setString(12, member.getZipcode());



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

	public Member selectOne(Connection conn, String userId, String userPwd) {
		Statement stmt = null;
		ResultSet rset = null;
		String query = "SELECT*FROM MEMBER_TBL WHERE MEMBER_ID='"+ userId+ "'AND PASSWORD='" + userPwd+"'";
		Member member = null;

		try {
			stmt = conn.createStatement();
			rset= stmt.executeQuery(query);

			if(rset.next()) {
				member = new Member();
				member.setMemberId(rset.getString("MEMBER_ID"));
				member.setMemberName(rset.getString("MEMBER_NAME"));
				member.setGender(rset.getString("GENDER"));
				member.setDob(rset.getString("BIRTH"));
				member.setEmail(rset.getString("EMAIL"));
				member.setPhone(rset.getString("PHONE"));
				member.setEnrollDate(rset.getDate("ENROLL_DATE"));
				member.setOutYN(rset.getString("OUT_YN"));
				member.setOutDate(rset.getDate("OUT_DATE"));
				member.setMemberPwd(rset.getString("PASSWORD"));
				member.setAddress(rset.getString("ADDRESS"));
				member.setDetailAddress(rset.getString("DETAILADDRESS"));
				member.setZipcode(rset.getString("ZIPCODE"));

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JDBCTemplate.close(rset);
			JDBCTemplate.close(stmt);
		}

		return member;


	}
	public Member selectOne(Connection conn, String userId) {
		PreparedStatement pstmt=null;
		ResultSet rset = null;
		String query ="SELECT*FROM MEMBER_TBL WHERE MEMBER_ID=?";
		Member member = null;

		try {
			pstmt=conn.prepareStatement(query);
			pstmt.setString(1, userId);
			rset=pstmt.executeQuery();

			if(rset.next()) {
				member = new Member();
				member.setMemberId(rset.getString("MEMBER_ID"));
				member.setMemberName(rset.getString("MEMBER_NAME"));
				member.setGender(rset.getString("GENDER"));
				member.setDob(rset.getString("BIRTH"));
				member.setEmail(rset.getString("EMAIL"));
				member.setPhone(rset.getString("PHONE"));
				member.setEnrollDate(rset.getDate("ENROLL_DATE"));
				member.setOutYN(rset.getString("OUT_YN"));
				member.setOutDate(rset.getDate("OUT_DATE"));
				member.setMemberPwd(rset.getString("PASSWORD"));
				member.setAddress(rset.getString("ADDRESS"));
				member.setDetailAddress(rset.getString("DETAILADDRESS"));
				member.setZipcode(rset.getString("ZIPCODE"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(rset);
			JDBCTemplate.close(pstmt);
		}
		return member;

	}
	public int deleteMember  (Connection conn, String userId) {
		int result = 0;
		PreparedStatement pstmt = null;
		String query = "DELETE FROM MEMBER WHERE MEMBER_ID=?";
		
			try {
				pstmt = conn.prepareStatement(query);
				pstmt.setString(1, userId);
				result = pstmt.executeUpdate();
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				JDBCTemplate.close(pstmt);
				
			}
			return result;
			
		
		
	}
}
