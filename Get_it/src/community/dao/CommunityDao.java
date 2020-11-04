package community.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import common.JDBCTemplate;
import community.model.vo.QnA;

public class CommunityDao {
	
	public CommunityDao() {}
	// QnA 전체목록 불러오는 메소드
	public ArrayList<QnA> selectQnaAll(Connection conn, int currentPage, int recordCountPerPage){
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		ArrayList<QnA> qnaList = null;
		String query = "select * from (select A.*, row_number() over(order by fix desc, qna_no desc) as num from (select * from qna)A)  where num between ? and ?";
		int start = currentPage*recordCountPerPage - (recordCountPerPage-1);
		int end = currentPage*recordCountPerPage;
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, start);
			pstmt.setInt(2, end);
			rset = pstmt.executeQuery();
			if(rset!=null) {
				qnaList= new ArrayList<QnA>();
				while(rset.next()) {
					QnA qna = new QnA();
					qna.setQnaNo(rset.getInt("qna_no"));
					qna.setQnaTitle(rset.getString("q_title"));
					qna.setQnaContents(rset.getString("q_contents"));
					qna.setQnaDate(rset.getDate("q_date"));
					qna.setMemberId(rset.getString("member_id"));
					qna.setFix(rset.getInt("fix"));
					qnaList.add(qna);
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(rset);
			JDBCTemplate.close(pstmt);
		}
		return qnaList;
	}
	
	public String getPageNavi(Connection conn, int currentPage, int recordCountPerPage, int naviCountPerPage) {
		int recordTotalCount = qnaTotalCount(conn);
		int pageTotalCount = 0;
		if(recordTotalCount%recordCountPerPage>0) {
			pageTotalCount = recordTotalCount/recordCountPerPage +1;
		}else {
			pageTotalCount = recordTotalCount/recordCountPerPage;
		}
		int startNavi = ((currentPage-1)/naviCountPerPage)*naviCountPerPage +1;
		int endNavi = startNavi + naviCountPerPage - 1;
		
		if(currentPage<1) {
			currentPage=1;
		}else if(currentPage>pageTotalCount) {
			currentPage=pageTotalCount;
		}
		
		if(endNavi>pageTotalCount) {
			endNavi=pageTotalCount;
		}
		
		boolean needPrev = true;
		boolean needNext = true;
		
		if(currentPage==1) {
			needPrev = false;
		}
		if(currentPage==pageTotalCount) {
			needNext = false;
		}
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("<ul class='pagination'>");
		if(needPrev) {
			sb.append("<li class='page-item'><a class='page-link' href='/review/main?currentPage=" + (startNavi-1) + "' aria-label='Next'><span aria-hidden='true'>&raquo;</span></a></li>");
		}
		for(int i=startNavi; i<=endNavi; i++) {
			if(i==currentPage) {
				sb.append("<li class='page-item'><a class='page-link' href='/review/main?currentPage=" + i + "'>" +"<b>" + i + "</b></a></li>" );
			}else {
				sb.append("<li class='page-item'><a class='page-link' href='/review/main?currentPage=" + i + "'>" +  i   + "</a></li>");
			}
		}
		if(needNext) {
			sb.append("<li class='page-item'><a class='page-link' href='/review/main?currentPage=" +(endNavi+1) + "' aria-label='Next'><span aria-hidden='true'>&raquo;</span></a></li>");
		}
		sb.append("</ul>");
		return sb.toString();
	}
	
	public int qnaTotalCount(Connection conn) {
		Statement stmt = null;
		ResultSet rset =null;
		int recordTotalCount = 0;
		String query = "select count(*) as totalcount from qna";
		try {
			stmt =conn.createStatement();
			rset = stmt.executeQuery(query);
			if(rset.next()) {
				recordTotalCount = rset.getInt("totalcount");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(rset);
			JDBCTemplate.close(stmt);
		}
		return recordTotalCount;
	}
	// QnA 검색 목록 불러오는 메소드
	public ArrayList<QnA> qnaSearch(Connection conn,int currentPage,int recordCountPerPage,String search){
		PreparedStatement pstmt= null;
		ResultSet rset = null;
		ArrayList<QnA> qnaList = null;
		String query ="select * from (select A.*, row_number() over(order by fix desc, qna_no desc) as num from (select * from qna where q_title like ? or fix ='1')A)  where num between ? and ?";
		int start = currentPage*recordCountPerPage - (recordCountPerPage-1);
		int end = currentPage*recordCountPerPage;
		try {
			pstmt= conn.prepareStatement(query);
			pstmt.setString(1, "%"+search+"%");
			pstmt.setInt(2, start);
			pstmt.setInt(3, end);
			rset = pstmt.executeQuery();
			if(rset!=null) {
				qnaList = new ArrayList<QnA>();
				while(rset.next()) {
					QnA qna = new QnA();
					qna.setQnaNo(rset.getInt("qna_no"));
					qna.setQnaTitle(rset.getString("q_title"));
					qna.setQnaContents(rset.getString("q_contents"));
					qna.setQnaDate(rset.getDate("q_date"));
					qna.setMemberId(rset.getString("member_id"));
					qna.setFix(rset.getInt("fix"));
					qnaList.add(qna);
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(rset);
			JDBCTemplate.close(pstmt);
		}
		return qnaList;
	}
	
	public String getSerachNavi(Connection conn,int currentPage, int recordCountPerPage, int naviCountPerPage, String search) {
		int recordTotalCount = searchTotalCount(conn,search);
		int pageTotalCount = 0;
		if(recordTotalCount%recordCountPerPage>0) {
			pageTotalCount = recordTotalCount/recordCountPerPage+1;
		}else {
			pageTotalCount= recordTotalCount/recordCountPerPage;
		}
		
		int startNavi = ((currentPage-1)/naviCountPerPage)*naviCountPerPage + 1;
		int endNavi = startNavi + naviCountPerPage -1;
		
		if(currentPage<1) {
			currentPage=1;
		}else if(currentPage>pageTotalCount) {
			currentPage = pageTotalCount;
		}
		
		if(endNavi>pageTotalCount) {
			endNavi = pageTotalCount;
		}
		
		boolean needPrev = true;
		boolean needNext = true;
		
		if(currentPage==1) {
			needPrev = false;
		}
		if(currentPage==pageTotalCount) {
			needNext = false;
		}
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("<ul class='pagination'>");
		if(needPrev) {
			sb.append("<li class='page-item'><a class='page-link' href='/review/main?currentPage=" + (startNavi-1) +"&search=" + search +  "' aria-label='Next'><span aria-hidden='true'>&raquo;</span></a></li>");
		}
		for(int i=startNavi; i<=endNavi; i++) {
			if(i==currentPage) {
				sb.append("<li class='page-item'><a class='page-link' href='/review/main?currentPage=" + i + "&search=" + search + "'>" +"<b>" + i + "</b></a></li>" );
			}else {
				sb.append("<li class='page-item'><a class='page-link' href='/review/main?currentPage=" + i + "&search=" + search + "'>" +  i   + "</a></li>");
			}
		}
		if(needNext) {
			sb.append("<li class='page-item'><a class='page-link' href='/review/main?currentPage=" +(endNavi+1) + "&search=" + search + "' aria-label='Next'><span aria-hidden='true'>&raquo;</span></a></li>");
		}
		sb.append("</ul>");
		return sb.toString();
	}
	
	public int searchTotalCount(Connection conn, String search) {
		PreparedStatement pstmt = null;
		ResultSet rset= null;
		int recordTotalCount = 0;
		String query = "select count(*) as totalcount from qna where fix='1' or q_title like ?";
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, "%"+search+"%");
			rset = pstmt.executeQuery();
			if(rset.next()) {
				recordTotalCount = rset.getInt("totalcount");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(rset);
			JDBCTemplate.close(pstmt);
		}
		return recordTotalCount;
	}
	
	// QnA 게시글 등록
	public int qnaInsert(Connection conn, String memberId, String title, String contents) {
		PreparedStatement pstmt = null;
		int result =0;
		String query ="";
		if(memberId.equals("admin")) {
	    query ="insert into qna values(qna_seq.nextval,?,?,sysdate,?,1)";
		}else {
	    query = "insert into qna values(qna_seq.nextval,?,?,sysdate,?,0)";
		}
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, title);
			pstmt.setString(2, contents);
			pstmt.setString(3, memberId);
			result =pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(pstmt);
		}
		return result;
	}
	
	// QnA 세부내용
	public QnA qnaDetail(Connection conn, int qnaNo) {
		PreparedStatement pstmt= null;
		ResultSet rset = null;
		String query ="select * from qna where qna_no=?";
		QnA qna =null;
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, qnaNo);
			rset = pstmt.executeQuery();
			if(rset.next()) {
				qna = new QnA();
				qna.setQnaNo(rset.getInt("qna_no"));
				qna.setQnaTitle(rset.getString("q_title"));
				qna.setQnaContents(rset.getString("q_contents"));
				qna.setQnaDate(rset.getDate("q_date"));
				qna.setMemberId(rset.getString("member_id"));
				qna.setFix(rset.getInt("fix"));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(pstmt);
			JDBCTemplate.close(rset);
		}
		return qna;
	}
	
	// QnA 게시글 수정
	public int qnaUpdate(Connection conn, int qnaNo, String title, String contents) {
		PreparedStatement pstmt = null;
		int result =0;
		String query="update qna set q_title=?,q_contents=? where qna_no=?";
		try {
			pstmt =conn.prepareStatement(query);
			pstmt.setString(1, title);
			pstmt.setString(2, contents);
			pstmt.setInt(3, qnaNo);
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(pstmt);
		}
		return result;
	}
	
	// QnA 게시글 삭제
	public int qnaDelete(Connection conn, int qnaNo) {
		PreparedStatement pstmt= null;
		int result =0;
		String query ="delete from qna where qna_no=?";
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, qnaNo);
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
