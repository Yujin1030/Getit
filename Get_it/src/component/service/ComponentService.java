package component.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import common.JDBCTemplate;
import component.dao.ComponentDAO;
import component.vo.COOLER;
import component.vo.CPU;
import component.vo.GCARD;
import component.vo.HDD;
import component.vo.POWER;
import component.vo.RAM;
import component.vo.SKIN;
import component.vo.SSD;

public class ComponentService {
	
	// 커넥션
	private JDBCTemplate factory;
	public ComponentService() {
		factory = JDBCTemplate.getConnection();
	}
	
	private ComponentDAO ComponentDAO;
	
	
	
	
			// CPU All LIST
	public ArrayList<CPU> cpuAllList() {
		ArrayList<CPU> cpuList = null;
		Connection conn = null;
		try {
			conn = factory.createConnection();
			cpuList = new ComponentDAO().cpuAllList(conn);
			JDBCTemplate.close(conn);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return cpuList;
	}
	
	
	
			// COOLER All LIST
	public ArrayList<COOLER> coolerAllList() {
		ArrayList<COOLER> coolerList = null;
		Connection conn = null;
		
		try {
			conn = factory.createConnection();
			coolerList = new ComponentDAO().coolerAllList(conn);
			JDBCTemplate.close(conn);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return coolerList;
	}
	
	
			// GCARD All LIST
	public ArrayList<GCARD> gcardAllList(){
		ArrayList<GCARD> gcardList = null;
		Connection conn = null;
		
		try {
			conn = factory.createConnection();
			gcardList = new ComponentDAO().gcardAllList(conn);
			JDBCTemplate.close(conn);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return gcardList;
	}
	
			// HDD All LIST
	public ArrayList<HDD> hddAllList() {
		ArrayList<HDD> hddList = null;
		Connection conn = null;
		
		try {
			conn = factory.createConnection();
			hddList = new ComponentDAO().hddAllList(conn);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return hddList;
	}
		
	
		// POWER All LIST
	public ArrayList<POWER> powerAllList() {
		ArrayList<POWER> powerList = null;
		Connection conn = null;
		
		try {
			conn = factory.createConnection();
		powerList = new ComponentDAO().powerAllList(conn);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return powerList;
	}
	
	
	
		// RAM All LIST
	public ArrayList<RAM> ramAllList() {
		ArrayList<RAM> ramList = null;
		Connection conn = null;
		
		try {
			conn = factory.createConnection();
		ramList = new ComponentDAO().ramAllList(conn);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return ramList;
	}
	
	
	
	
		// SKIN All LIST
	public ArrayList<SKIN> skinAllList() {
		ArrayList<SKIN> skinList = null;
		Connection conn = null;
		
		try {
			conn = factory.createConnection();
		skinList = new ComponentDAO().skinAllList(conn);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return skinList;
	}
	
	
	
	
			// SSD All LIST
	public ArrayList<SSD> ssdAllList() {
		ArrayList<SSD> ssdList = null;
		Connection conn = null;
		try {
			conn = factory.createConnection();
			ssdList = new ComponentDAO().ssdAllList(conn);
			JDBCTemplate.close(conn);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return ssdList;
	}

			// MAINBOARD All LIST
/*	public ArrayList<MainBoard> mainboardAllList() {
		ArrayList<MainBoard> boardList = null;
		Connection conn = null;
		
		try {
			conn = factory.createConnection();
			boardList = new ComponentDAO().mainboardAllList();
			JDBCTemplate.close(conn);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return boardList;
	} */








	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
