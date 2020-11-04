package community.model.service;

import java.sql.Connection;
import java.sql.SQLException;

import common.JDBCTemplate;
import community.model.dao.CommunityDao;
import community.model.vo.QnA;
import community.model.vo.QnaPageData;

public class CommunityService {
	
	public JDBCTemplate factory;
	
	public CommunityService() {
		factory = JDBCTemplate.getConnection();
	}
	
	public QnaPageData selectQnaAll(int currentPage) {
		Connection conn = null;
		QnaPageData pagedata = new QnaPageData();
		int recordCountPerPage= 10;
		int naviCountPerPage =5;
		try {
			conn = factory.createConnection();
			pagedata.setQnaList(new CommunityDao().selectQnaAll(conn,currentPage,recordCountPerPage));
			pagedata.setPageNavi(new CommunityDao().getPageNavi(conn,currentPage,recordCountPerPage,naviCountPerPage));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(conn);
		}
		return pagedata;
	}
	// QnA 검색
	public QnaPageData qnaSearch(int currentPage, String search) {
		Connection conn = null;
		QnaPageData pagedata =new QnaPageData();
		int recordCountPerPage =10;
		int naviCountPerPage = 5;
		try {
			conn = factory.createConnection();
			pagedata.setQnaList(new CommunityDao().qnaSearch(conn,currentPage,recordCountPerPage,search));
			pagedata.setPageNavi(new CommunityDao().getSerachNavi(conn,currentPage,recordCountPerPage,naviCountPerPage,search));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(conn);
		}
		return pagedata;
	}

	// QnA 등록
	public int qnaInsert(String memberId, String title, String contents) {
		Connection conn = null;
		int result =0;
		try {
			conn = factory.createConnection();
			result = new CommunityDao().qnaInsert(conn,memberId,title,contents);
			if(result>0) {
				JDBCTemplate.commit(conn);
			}else {
				JDBCTemplate.rollback(conn);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(conn);
		}
		return result;
	}
	
	// QnA 세부페이지
	public QnA qnaDetail(int qnaNo) {
		Connection conn = null;
		QnA qna = new QnA();
		try {
			conn = factory.createConnection();
			qna = new CommunityDao().qnaDetail(conn,qnaNo);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(conn);
		}
		return qna;
	}
	
	// QnA 수정
	public int qnaUpdate(int qnaNo, String title, String contents) {
		Connection conn = null;
		int result = 0;
		try {
			conn = factory.createConnection();
			result = new CommunityDao().qnaUpdate(conn,qnaNo,title,contents);
			if(result>0) {
				JDBCTemplate.commit(conn);
			}else {
				JDBCTemplate.rollback(conn);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(conn);
		}
		return result;
	}
	
	// QnA 삭제
	public int qnaDelete(int qnaNo) {
		Connection conn =null;
		int result =0;
		try {
			conn =factory.createConnection();
			result = new CommunityDao().qnaDelete(conn,qnaNo);
			if(result>0) {
				JDBCTemplate.commit(conn);
			}else {
				JDBCTemplate.rollback(conn);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(conn);
		}
		return result;
	}
}
