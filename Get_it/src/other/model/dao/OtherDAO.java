package other.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import common.JDBCTemplate;
import other.model.vo.Other;

public class OtherDAO {
	public ArrayList<Other> selectOtherList(Connection conn, int currentPage, int recordCountPerPage) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		ArrayList<Other> list = null;
		String query = "SELECT * FROM (SELECT OTHER_PRODUCT.*, ROW_NUMBER() OVER(ORDER BY O_PRODUCT_NO) AS NUM FROM OTHER_PRODUCT) WHERE NUM BETWEEN ? AND ?";
		int start = currentPage * recordCountPerPage - (recordCountPerPage - 1);
		int end = currentPage * recordCountPerPage;
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, start);
			pstmt.setInt(2, end);
			rset = pstmt.executeQuery();
			list = new ArrayList<Other>();
			while(rset.next()) {
				Other other = new Other();
				other.setoProductNo(rset.getInt("O_PRODUCT_NO"));
				other.setoProductCode(rset.getString("O_PRODUCT_CODE"));
				other.setoProductName(rset.getString("O_PRODUCT_NAME"));
				other.setoProductAcount(rset.getInt("O_PRODUCT_ACOUNT"));
				other.setoProductPrice(rset.getInt("O_PRODUCT_PRICE"));
				other.setoProductContents(rset.getString("O_PRODUCT_CONTENTS"));
				other.setFileName(rset.getString("PICTURE_NAME"));
				other.setFilePath(rset.getString("PICTURE_PATH"));
				list.add(other);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(rset);
			JDBCTemplate.close(pstmt);
		}
		return list;
	}
	
	public ArrayList<Other> selectMonitorList(Connection conn, int currentPage, int recordCountPerPage) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		ArrayList<Other> list = null;
		String query = "SELECT * FROM (SELECT OTHER_PRODUCT.*, ROW_NUMBER() OVER(ORDER BY O_PRODUCT_NO) AS NUM FROM OTHER_PRODUCT WHERE O_PRODUCT_CODE = 'MT') WHERE NUM BETWEEN ? AND ?";
		int start = currentPage * recordCountPerPage - (recordCountPerPage - 1);
		int end = currentPage * recordCountPerPage;
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, start);
			pstmt.setInt(2, end);
			rset = pstmt.executeQuery();
			list = new ArrayList<Other>();
			while(rset.next()) {
				Other other = new Other();
				other.setoProductNo(rset.getInt("O_PRODUCT_NO"));
				other.setoProductCode(rset.getString("O_PRODUCT_CODE"));
				other.setoProductName(rset.getString("O_PRODUCT_NAME"));
				other.setoProductAcount(rset.getInt("O_PRODUCT_ACOUNT"));
				other.setoProductPrice(rset.getInt("O_PRODUCT_PRICE"));
				other.setoProductContents(rset.getString("O_PRODUCT_CONTENTS"));
				other.setFileName(rset.getString("PICTURE_NAME"));
				other.setFilePath(rset.getString("PICTURE_PATH"));
				list.add(other);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(rset);
			JDBCTemplate.close(pstmt);
		}
		return list;
	}
	
	public ArrayList<Other> selectKeyboardList(Connection conn, int currentPage, int recordCountPerPage) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		ArrayList<Other> list = null;
		String query = "SELECT * FROM (SELECT OTHER_PRODUCT.*, ROW_NUMBER() OVER(ORDER BY O_PRODUCT_NO) AS NUM FROM OTHER_PRODUCT WHERE O_PRODUCT_CODE = 'K') WHERE NUM BETWEEN ? AND ?";
		int start = currentPage * recordCountPerPage - (recordCountPerPage - 1);
		int end = currentPage * recordCountPerPage;
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, start);
			pstmt.setInt(2, end);
			rset = pstmt.executeQuery();
			list = new ArrayList<Other>();
			while(rset.next()) {
				Other other = new Other();
				other.setoProductNo(rset.getInt("O_PRODUCT_NO"));
				other.setoProductCode(rset.getString("O_PRODUCT_CODE"));
				other.setoProductName(rset.getString("O_PRODUCT_NAME"));
				other.setoProductAcount(rset.getInt("O_PRODUCT_ACOUNT"));
				other.setoProductPrice(rset.getInt("O_PRODUCT_PRICE"));
				other.setoProductContents(rset.getString("O_PRODUCT_CONTENTS"));
				other.setFileName(rset.getString("PICTURE_NAME"));
				other.setFilePath(rset.getString("PICTURE_PATH"));
				list.add(other);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(rset);
			JDBCTemplate.close(pstmt);
		}
		return list;
	}
	
	public ArrayList<Other> selectMouseList(Connection conn, int currentPage, int recordCountPerPage) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		ArrayList<Other> list = null;
		String query = "SELECT * FROM (SELECT OTHER_PRODUCT.*, ROW_NUMBER() OVER(ORDER BY O_PRODUCT_NO) AS NUM FROM OTHER_PRODUCT WHERE O_PRODUCT_CODE = 'MS') WHERE NUM BETWEEN ? AND ?";
		int start = currentPage * recordCountPerPage - (recordCountPerPage - 1);
		int end = currentPage * recordCountPerPage;
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, start);
			pstmt.setInt(2, end);
			rset = pstmt.executeQuery();
			list = new ArrayList<Other>();
			while(rset.next()) {
				Other other = new Other();
				other.setoProductNo(rset.getInt("O_PRODUCT_NO"));
				other.setoProductCode(rset.getString("O_PRODUCT_CODE"));
				other.setoProductName(rset.getString("O_PRODUCT_NAME"));
				other.setoProductAcount(rset.getInt("O_PRODUCT_ACOUNT"));
				other.setoProductPrice(rset.getInt("O_PRODUCT_PRICE"));
				other.setoProductContents(rset.getString("O_PRODUCT_CONTENTS"));
				other.setFileName(rset.getString("PICTURE_NAME"));
				other.setFilePath(rset.getString("PICTURE_PATH"));
				list.add(other);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(rset);
			JDBCTemplate.close(pstmt);
		}
		return list;
	}
	
	public ArrayList<Other> selectSpeakerList(Connection conn, int currentPage, int recordCountPerPage) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		ArrayList<Other> list = null;
		String query = "SELECT * FROM (SELECT OTHER_PRODUCT.*, ROW_NUMBER() OVER(ORDER BY O_PRODUCT_NO) AS NUM FROM OTHER_PRODUCT WHERE O_PRODUCT_CODE = 'S') WHERE NUM BETWEEN ? AND ?";
		int start = currentPage * recordCountPerPage - (recordCountPerPage - 1);
		int end = currentPage * recordCountPerPage;
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, start);
			pstmt.setInt(2, end);
			rset = pstmt.executeQuery();
			list = new ArrayList<Other>();
			while(rset.next()) {
				Other other = new Other();
				other.setoProductNo(rset.getInt("O_PRODUCT_NO"));
				other.setoProductCode(rset.getString("O_PRODUCT_CODE"));
				other.setoProductName(rset.getString("O_PRODUCT_NAME"));
				other.setoProductAcount(rset.getInt("O_PRODUCT_ACOUNT"));
				other.setoProductPrice(rset.getInt("O_PRODUCT_PRICE"));
				other.setoProductContents(rset.getString("O_PRODUCT_CONTENTS"));
				other.setFileName(rset.getString("PICTURE_NAME"));
				other.setFilePath(rset.getString("PICTURE_PATH"));
				list.add(other);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(rset);
			JDBCTemplate.close(pstmt);
		}
		return list;
	}
	
	public ArrayList<Other> selectHeadsetList(Connection conn, int currentPage, int recordCountPerPage) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		ArrayList<Other> list = null;
		String query = "SELECT * FROM (SELECT OTHER_PRODUCT.*, ROW_NUMBER() OVER(ORDER BY O_PRODUCT_NO) AS NUM FROM OTHER_PRODUCT WHERE O_PRODUCT_CODE = 'H') WHERE NUM BETWEEN ? AND ?";
		int start = currentPage * recordCountPerPage - (recordCountPerPage - 1);
		int end = currentPage * recordCountPerPage;
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, start);
			pstmt.setInt(2, end);
			rset = pstmt.executeQuery();
			list = new ArrayList<Other>();
			while(rset.next()) {
				Other other = new Other();
				other.setoProductNo(rset.getInt("O_PRODUCT_NO"));
				other.setoProductCode(rset.getString("O_PRODUCT_CODE"));
				other.setoProductName(rset.getString("O_PRODUCT_NAME"));
				other.setoProductAcount(rset.getInt("O_PRODUCT_ACOUNT"));
				other.setoProductPrice(rset.getInt("O_PRODUCT_PRICE"));
				other.setoProductContents(rset.getString("O_PRODUCT_CONTENTS"));
				other.setFileName(rset.getString("PICTURE_NAME"));
				other.setFilePath(rset.getString("PICTURE_PATH"));
				list.add(other);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(rset);
			JDBCTemplate.close(pstmt);
		}
		return list;
	}
	
	public String getPageNavi(Connection conn, int currentPage, int recordCountPerPage, int naviCountPerPage) {
		int recordTotalCount = totalCount(conn);
		int pageTotalCount = 0;
		if(recordTotalCount % recordCountPerPage > 0) {
			pageTotalCount = recordTotalCount / recordCountPerPage + 1;
		} else {
			pageTotalCount = recordTotalCount / recordCountPerPage;
		}
		
		if(currentPage < 1) {
			currentPage = 1;
		} else if(currentPage > pageTotalCount) {
			currentPage = pageTotalCount;
		}
		
		int startNavi = ((currentPage - 1) / naviCountPerPage) * naviCountPerPage + 1;
		int endNavi = startNavi + naviCountPerPage - 1;
		
		if(endNavi > pageTotalCount) {
			endNavi = pageTotalCount;
		}
		
		boolean needPrev = true;
		boolean needNext = true;
		if(startNavi == 1) {
			needPrev = false;
		}
		if(endNavi == pageTotalCount) {
			needNext = false;
		}
		
		StringBuilder sb = new StringBuilder();
		if(needPrev) {
			sb.append("<li class='page-item'><a class='page-link' href='/other/allList?currentPage=" + (startNavi-1) + "'> < </a></li>");
		}
		for(int i = startNavi; i <= endNavi; i++) {
			if(i == currentPage) {
				sb.append("<li class='page-item'><a class='page-link' href='/other/allList?currentPage=" + i + "'>" + i + "</a></li>");
			} else {
				sb.append("<li class='page-item'><a class='page-link' href='/other/allList?currentPage=" + i + "'>" + i + "</a></li>");
			}
		}
		if(needNext) {
			sb.append("<li class='page-item'><a class='page-link' href='/other/allList?currentPage=" + (endNavi+1) + "'> > </a></li>");
		}
		return sb.toString();
	}
	
	public String getMonitorPageNavi(Connection conn, int currentPage, int recordCountPerPage, int naviCountPerPage) {
		int recordTotalCount = totalMonitorCount(conn);
		int pageTotalCount = 0;
		if(recordTotalCount % recordCountPerPage > 0) {
			pageTotalCount = recordTotalCount / recordCountPerPage + 1;
		} else {
			pageTotalCount = recordTotalCount / recordCountPerPage;
		}
		
		if(currentPage < 1) {
			currentPage = 1;
		} else if(currentPage > pageTotalCount) {
			currentPage = pageTotalCount;
		}
		
		int startNavi = ((currentPage - 1) / naviCountPerPage) * naviCountPerPage + 1;
		int endNavi = startNavi + naviCountPerPage - 1;
		
		if(endNavi > pageTotalCount) {
			endNavi = pageTotalCount;
		}
		
		boolean needPrev = true;
		boolean needNext = true;
		if(startNavi == 1) {
			needPrev = false;
		}
		if(endNavi == pageTotalCount) {
			needNext = false;
		}
		
		StringBuilder sb = new StringBuilder();
		if(needPrev) {
			sb.append("<li class='page-item'><a class='page-link' href='/other/monitor?currentPage=" + (startNavi-1) + "'> < </a></li>");
		}
		for(int i = startNavi; i <= endNavi; i++) {
			if(i == currentPage) {
				sb.append("<li class='page-item'><a class='page-link' href='/other/monitor?currentPage=" + i + "'>" + i + "</a></li>");
			} else {
				sb.append("<li class='page-item'><a class='page-link' href='/other/monitor?currentPage=" + i + "'>" + i + "</a></li>");
			}
		}
		if(needNext) {
			sb.append("<li class='page-item'><a class='page-link' href='/other/monitor?currentPage=" + (endNavi+1) + "'> > </a></li>");
		}
		return sb.toString();
	}
	
	public String getKeyboardPageNavi(Connection conn, int currentPage, int recordCountPerPage, int naviCountPerPage) {
		int recordTotalCount = totalKeyboardCount(conn);
		int pageTotalCount = 0;
		if(recordTotalCount % recordCountPerPage > 0) {
			pageTotalCount = recordTotalCount / recordCountPerPage + 1;
		} else {
			pageTotalCount = recordTotalCount / recordCountPerPage;
		}
		
		if(currentPage < 1) {
			currentPage = 1;
		} else if(currentPage > pageTotalCount) {
			currentPage = pageTotalCount;
		}
		
		int startNavi = ((currentPage - 1) / naviCountPerPage) * naviCountPerPage + 1;
		int endNavi = startNavi + naviCountPerPage - 1;
		
		if(endNavi > pageTotalCount) {
			endNavi = pageTotalCount;
		}
		
		boolean needPrev = true;
		boolean needNext = true;
		if(startNavi == 1) {
			needPrev = false;
		}
		if(endNavi == pageTotalCount) {
			needNext = false;
		}
		
		StringBuilder sb = new StringBuilder();
		if(needPrev) {
			sb.append("<li class='page-item'><a class='page-link' href='/other/keyboard?currentPage=" + (startNavi-1) + "'> < </a></li>");
		}
		for(int i = startNavi; i <= endNavi; i++) {
			if(i == currentPage) {
				sb.append("<li class='page-item'><a class='page-link' href='/other/keyboard?currentPage=" + i + "'>" + i + "</a></li>");
			} else {
				sb.append("<li class='page-item'><a class='page-link' href='/other/keyboard?currentPage=" + i + "'>" + i + "</a></li>");
			}
		}
		if(needNext) {
			sb.append("<li class='page-item'><a class='page-link' href='/other/keyboard?currentPage=" + (endNavi+1) + "'> > </a></li>");
		}
		return sb.toString();
	}
	
	public String getMousePageNavi(Connection conn, int currentPage, int recordCountPerPage, int naviCountPerPage) {
		int recordTotalCount = totalMouseCount(conn);
		int pageTotalCount = 0;
		if(recordTotalCount % recordCountPerPage > 0) {
			pageTotalCount = recordTotalCount / recordCountPerPage + 1;
		} else {
			pageTotalCount = recordTotalCount / recordCountPerPage;
		}
		
		if(currentPage < 1) {
			currentPage = 1;
		} else if(currentPage > pageTotalCount) {
			currentPage = pageTotalCount;
		}
		
		int startNavi = ((currentPage - 1) / naviCountPerPage) * naviCountPerPage + 1;
		int endNavi = startNavi + naviCountPerPage - 1;
		
		if(endNavi > pageTotalCount) {
			endNavi = pageTotalCount;
		}
		
		boolean needPrev = true;
		boolean needNext = true;
		if(startNavi == 1) {
			needPrev = false;
		}
		if(endNavi == pageTotalCount) {
			needNext = false;
		}
		
		StringBuilder sb = new StringBuilder();
		if(needPrev) {
			sb.append("<li class='page-item'><a class='page-link' href='/other/mouse?currentPage=" + (startNavi-1) + "'> < </a></li>");
		}
		for(int i = startNavi; i <= endNavi; i++) {
			if(i == currentPage) {
				sb.append("<li class='page-item'><a class='page-link' href='/other/mouse?currentPage=" + i + "'>" + i + "</a></li>");
			} else {
				sb.append("<li class='page-item'><a class='page-link' href='/other/mouse?currentPage=" + i + "'>" + i + "</a></li>");
			}
		}
		if(needNext) {
			sb.append("<li class='page-item'><a class='page-link' href='/other/mouse?currentPage=" + (endNavi+1) + "'> > </a></li>");
		}
		return sb.toString();
	}
	
	public String getSpeakerPageNavi(Connection conn, int currentPage, int recordCountPerPage, int naviCountPerPage) {
		int recordTotalCount = totalSpeakerCount(conn);
		int pageTotalCount = 0;
		if(recordTotalCount % recordCountPerPage > 0) {
			pageTotalCount = recordTotalCount / recordCountPerPage + 1;
		} else {
			pageTotalCount = recordTotalCount / recordCountPerPage;
		}
		
		if(currentPage < 1) {
			currentPage = 1;
		} else if(currentPage > pageTotalCount) {
			currentPage = pageTotalCount;
		}
		
		int startNavi = ((currentPage - 1) / naviCountPerPage) * naviCountPerPage + 1;
		int endNavi = startNavi + naviCountPerPage - 1;
		
		if(endNavi > pageTotalCount) {
			endNavi = pageTotalCount;
		}
		
		boolean needPrev = true;
		boolean needNext = true;
		if(startNavi == 1) {
			needPrev = false;
		}
		if(endNavi == pageTotalCount) {
			needNext = false;
		}
		
		StringBuilder sb = new StringBuilder();
		if(needPrev) {
			sb.append("<li class='page-item'><a class='page-link' href='/other/speaker?currentPage=" + (startNavi-1) + "'> < </a></li>");
		}
		for(int i = startNavi; i <= endNavi; i++) {
			if(i == currentPage) {
				sb.append("<li class='page-item'><a class='page-link' href='/other/speaker?currentPage=" + i + "'>" + i + "</a></li>");
			} else {
				sb.append("<li class='page-item'><a class='page-link' href='/other/speaker?currentPage=" + i + "'>" + i + "</a></li>");
			}
		}
		if(needNext) {
			sb.append("<li class='page-item'><a class='page-link' href='/other/speaker?currentPage=" + (endNavi+1) + "'> > </a></li>");
		}
		return sb.toString();
	}
	
	public String getHeadsetPageNavi(Connection conn, int currentPage, int recordCountPerPage, int naviCountPerPage) {
		int recordTotalCount = totalHeadsetCount(conn);
		int pageTotalCount = 0;
		if(recordTotalCount % recordCountPerPage > 0) {
			pageTotalCount = recordTotalCount / recordCountPerPage + 1;
		} else {
			pageTotalCount = recordTotalCount / recordCountPerPage;
		}
		
		if(currentPage < 1) {
			currentPage = 1;
		} else if(currentPage > pageTotalCount) {
			currentPage = pageTotalCount;
		}
		
		int startNavi = ((currentPage - 1) / naviCountPerPage) * naviCountPerPage + 1;
		int endNavi = startNavi + naviCountPerPage - 1;
		
		if(endNavi > pageTotalCount) {
			endNavi = pageTotalCount;
		}
		
		boolean needPrev = true;
		boolean needNext = true;
		if(startNavi == 1) {
			needPrev = false;
		}
		if(endNavi == pageTotalCount) {
			needNext = false;
		}
		
		StringBuilder sb = new StringBuilder();
		if(needPrev) {
			sb.append("<li class='page-item'><a class='page-link' href='/other/headset?currentPage=" + (startNavi-1) + "'> < </a></li>");
		}
		for(int i = startNavi; i <= endNavi; i++) {
			if(i == currentPage) {
				sb.append("<li class='page-item'><a class='page-link' href='/other/headset?currentPage=" + i + "'>" + i + "</a></li>");
			} else {
				sb.append("<li class='page-item'><a class='page-link' href='/other/headset?currentPage=" + i + "'>" + i + "</a></li>");
			}
		}
		if(needNext) {
			sb.append("<li class='page-item'><a class='page-link' href='/other/headset?currentPage=" + (endNavi+1) + "'> > </a></li>");
		}
		return sb.toString();
	}
	
	public int totalCount(Connection conn) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		String query = "SELECT COUNT(*) AS TOTALCOUNT FROM OTHER_PRODUCT";
		int recordTotalCount = 0;
		try {
			pstmt = conn.prepareStatement(query);
			rset = pstmt.executeQuery();
			if(rset.next()) {
				recordTotalCount = rset.getInt("TOTALCOUNT");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(rset);
			JDBCTemplate.close(pstmt);
		}
		return recordTotalCount;
	}
	
	public int totalMonitorCount(Connection conn) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		String query = "SELECT COUNT(*) AS TOTALCOUNT FROM OTHER_PRODUCT WHERE O_PRODUCT_CODE = 'MT'";
		int recordTotalCount = 0;
		try {
			pstmt = conn.prepareStatement(query);
			rset = pstmt.executeQuery();
			if(rset.next()) {
				recordTotalCount = rset.getInt("TOTALCOUNT");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(rset);
			JDBCTemplate.close(pstmt);
		}
		return recordTotalCount;
	}
	
	public int totalKeyboardCount(Connection conn) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		String query = "SELECT COUNT(*) AS TOTALCOUNT FROM OTHER_PRODUCT WHERE O_PRODUCT_CODE = 'K'";
		int recordTotalCount = 0;
		try {
			pstmt = conn.prepareStatement(query);
			rset = pstmt.executeQuery();
			if(rset.next()) {
				recordTotalCount = rset.getInt("TOTALCOUNT");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(rset);
			JDBCTemplate.close(pstmt);
		}
		return recordTotalCount;
	}
	
	public int totalMouseCount(Connection conn) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		String query = "SELECT COUNT(*) AS TOTALCOUNT FROM OTHER_PRODUCT WHERE O_PRODUCT_CODE = 'MS'";
		int recordTotalCount = 0;
		try {
			pstmt = conn.prepareStatement(query);
			rset = pstmt.executeQuery();
			if(rset.next()) {
				recordTotalCount = rset.getInt("TOTALCOUNT");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(rset);
			JDBCTemplate.close(pstmt);
		}
		return recordTotalCount;
	}
	
	public int totalSpeakerCount(Connection conn) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		String query = "SELECT COUNT(*) AS TOTALCOUNT FROM OTHER_PRODUCT WHERE O_PRODUCT_CODE = 'S'";
		int recordTotalCount = 0;
		try {
			pstmt = conn.prepareStatement(query);
			rset = pstmt.executeQuery();
			if(rset.next()) {
				recordTotalCount = rset.getInt("TOTALCOUNT");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(rset);
			JDBCTemplate.close(pstmt);
		}
		return recordTotalCount;
	}
	
	public int totalHeadsetCount(Connection conn) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		String query = "SELECT COUNT(*) AS TOTALCOUNT FROM OTHER_PRODUCT WHERE O_PRODUCT_CODE = 'H'";
		int recordTotalCount = 0;
		try {
			pstmt = conn.prepareStatement(query);
			rset = pstmt.executeQuery();
			if(rset.next()) {
				recordTotalCount = rset.getInt("TOTALCOUNT");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(rset);
			JDBCTemplate.close(pstmt);
		}
		return recordTotalCount;
	}
	
	public Other selectOther(Connection conn, int oProductNo) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		Other other = null;
		String query = "SELECT * FROM OTHER_PRODUCT WHERE O_PRODUCT_NO = ?";
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, oProductNo);
			rset = pstmt.executeQuery();
			if(rset.next()) {
				other = new Other();
				other.setoProductNo(rset.getInt("O_PRODUCT_NO"));
				other.setoProductCode(rset.getString("O_PRODUCT_CODE"));
				other.setoProductName(rset.getString("O_PRODUCT_NAME"));
				other.setoProductAcount(rset.getInt("O_PRODUCT_ACOUNT"));
				other.setoProductPrice(rset.getInt("O_PRODUCT_PRICE"));
				other.setoProductContents(rset.getString("O_PRODUCT_CONTENTS"));
				other.setFileName(rset.getString("PICTURE_NAME"));
				other.setFilePath(rset.getString("PICTURE_PATH"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(rset);
			JDBCTemplate.close(pstmt);
		}
		return other;
	}
}
