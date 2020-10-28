package member.service;

import java.sql.Connection;
import java.sql.SQLException;

import common.JDBCTemplate;
import member.Member;
import member.dao.MemberDAO;

public class MemberService {

	private JDBCTemplate factory;
	public MemberService() {
		factory = JDBCTemplate.getConnection();

	}

	public int insertMember(Member member) {
		int result = 0;

		try {
			Connection conn = factory.createConnection();
			result =new MemberDAO().insertMember(conn, member);
			JDBCTemplate.close(conn);

		} catch (SQLException e) {
			e.printStackTrace();
		}


		// 리턴 타입 int와 리턴값은 자료형이 같아야함.
		return result;
	}

	public Member selectMember(String userId, String userPwd) {
		Member member = null;
		Connection conn;

		try {
			conn= factory.createConnection();
			member = new MemberDAO().selectOne(conn, userId, userPwd);
			JDBCTemplate.close(conn);
		} catch (SQLException e) {
			e.printStackTrace();
		}


		return member;
	}

	public Member selectMember(String userId) {
		Member member = null;
		Connection conn;

		try {
			conn=factory.createConnection();
			member = new MemberDAO().selectOne(conn, userId);
			JDBCTemplate.close(conn);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return member;

	}

	public int deleteMember(String userId) {
		int result = 0;
		Connection conn;

		try {
			conn = factory.createConnection();
			result = new MemberDAO().deleteMember(conn, userId);
			JDBCTemplate.close(conn);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;


	}

}
