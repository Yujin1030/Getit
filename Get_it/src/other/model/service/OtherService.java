package other.model.service;

import java.sql.Connection;
import java.sql.SQLException;

import common.JDBCTemplate;
import other.model.dao.OtherDAO;
import other.model.vo.Other;
import other.model.vo.PageData;

public class OtherService {
	private JDBCTemplate factory;
	private OtherDAO OtherDAO;
	
	public OtherService() {
		factory = JDBCTemplate.getConnection();
	}
	
	public PageData selectProductList(int currentPage) {
		Connection conn = null;
		int recordCountPerPage = 12;
		int naviCountPerPage = 5;
		PageData pd = new PageData();
		try {
			conn = factory.createConnection();
			pd.setPageList(new OtherDAO().selectOtherList(conn, currentPage, recordCountPerPage));
			pd.setPageNavi(new OtherDAO().getPageNavi(conn, currentPage, recordCountPerPage, naviCountPerPage));
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(conn);
		}
		return pd;
	}
	
	public PageData selectProductMonitor(int currentPage) {
		Connection conn = null;
		int recordCountPerPage = 12;
		int naviCountPerPage = 5;
		PageData pd = new PageData();
		try {
			conn = factory.createConnection();
			pd.setPageList(new OtherDAO().selectMonitorList(conn, currentPage, recordCountPerPage));
			pd.setPageNavi(new OtherDAO().getMonitorPageNavi(conn, currentPage, recordCountPerPage, naviCountPerPage));
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(conn);
		}
		return pd;
	}
	
	public PageData selectProductKeyboard(int currentPage) {
		Connection conn = null;
		int recordCountPerPage = 12;
		int naviCountPerPage = 5;
		PageData pd = new PageData();
		try {
			conn = factory.createConnection();
			pd.setPageList(new OtherDAO().selectKeyboardList(conn, currentPage, recordCountPerPage));
			pd.setPageNavi(new OtherDAO().getKeyboardPageNavi(conn, currentPage, recordCountPerPage, naviCountPerPage));
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(conn);
		}
		return pd;
	}
	
	public PageData selectProductMouse(int currentPage) {
		Connection conn = null;
		int recordCountPerPage = 12;
		int naviCountPerPage = 5;
		PageData pd = new PageData();
		try {
			conn = factory.createConnection();
			pd.setPageList(new OtherDAO().selectMouseList(conn, currentPage, recordCountPerPage));
			pd.setPageNavi(new OtherDAO().getMousePageNavi(conn, currentPage, recordCountPerPage, naviCountPerPage));
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(conn);
		}
		return pd;
	}
	
	public PageData selectProductSpeaker(int currentPage) {
		Connection conn = null;
		int recordCountPerPage = 12;
		int naviCountPerPage = 5;
		PageData pd = new PageData();
		try {
			conn = factory.createConnection();
			pd.setPageList(new OtherDAO().selectSpeakerList(conn, currentPage, recordCountPerPage));
			pd.setPageNavi(new OtherDAO().getSpeakerPageNavi(conn, currentPage, recordCountPerPage, naviCountPerPage));
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(conn);
		}
		return pd;
	}
	
	public PageData selectProductHeadset(int currentPage) {
		Connection conn = null;
		int recordCountPerPage = 12;
		int naviCountPerPage = 5;
		PageData pd = new PageData();
		try {
			conn = factory.createConnection();
			pd.setPageList(new OtherDAO().selectHeadsetList(conn, currentPage, recordCountPerPage));
			pd.setPageNavi(new OtherDAO().getHeadsetPageNavi(conn, currentPage, recordCountPerPage, naviCountPerPage));
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(conn);
		}
		return pd;
	}
	
	public Other selectOther(int oProductNo) {
		Other other = null;
		Connection conn = null;
		try {
			conn = factory.createConnection();
			other = new OtherDAO().selectOther(conn, oProductNo);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(conn);
		}
		return other;
	}
}
