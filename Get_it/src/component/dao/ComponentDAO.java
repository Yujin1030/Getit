package component.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import common.JDBCTemplate;
import component.vo.COOLER;
import component.vo.CPU;
import component.vo.GCARD;
import component.vo.HDD;
import component.vo.MainBoard;
import component.vo.Other;
import component.vo.POWER;
import component.vo.RAM;
import component.vo.SKIN;
import component.vo.SSD;

public class ComponentDAO {
//	private COOLER COOLER;
//	private CPU CPU;
//	private GCARD GCARD;
//	private HDD HDD;
//	private MainBoard MainBoard;
//	private POWER POWER;
//	private RAM RAM;
//	private SKIN SKIN;
//	private SSD SSD;
	
	
	
	
			// CPU All LIST
	public ArrayList<CPU> cpuAllList(Connection conn) {
		ArrayList<CPU> cpuList = null;
		Statement stmt = null;
		ResultSet rset = null;
		String cpuQuery = "SELECT * FROM CPU";
		
		try {
			stmt = conn.createStatement();
			rset = stmt.executeQuery(cpuQuery);
			cpuList = new ArrayList<CPU>();
			
			while(rset.next()) {
				CPU cpu = new CPU();
				cpu.setCpuCode(rset.getString("CPU_CODE"));
				cpu.setProductNum(rset.getInt("CPU_NO"));
				cpu.setCpuName(rset.getString("CPU_NAME"));
				cpu.setCpuPrice(rset.getInt("CPU_PRICE"));
				cpu.setCpuContent(rset.getString("CPU_CONTENT"));
				cpu.setCpuCount(rset.getInt("CPU_ACCOUNT"));
				// File LINE
				cpu.setCpufileName(rset.getString("CPU_FILENAME"));
				cpu.setCpufilePath(rset.getString("CPU_FILEPATH"));
				cpuList.add(cpu);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(rset);
			JDBCTemplate.close(stmt);
		}
		return cpuList;
	}




			// COOLER All LIST
	public ArrayList<COOLER> coolerAllList(Connection conn) {
		ArrayList<COOLER> coolerList = null;
		Statement stmt = null;
		ResultSet rset = null;
		String coolerQuery = "SELECT * FROM CPUCOOLER";
		
		try {
			stmt = conn.createStatement();
			rset = stmt.executeQuery(coolerQuery);
			coolerList = new ArrayList<COOLER>();
			while(rset.next()) {
				COOLER cooler = new COOLER();
				cooler.setCoolerCode(rset.getString("CCL_CODE"));
				cooler.setCoolerNum(rset.getInt("CCL_NO"));
				cooler.setCoolerName(rset.getString("CCL_NAME"));
				cooler.setCoolerPrice(rset.getInt("CCL_PRICE"));
				cooler.setCoolerContent(rset.getString("CCL_CONTENT"));
				cooler.setCoolerCount(rset.getInt("CCL_ACCOUNT"));
				//
				cooler.setCoolerfileName(rset.getString("CCL_FILENAME"));
				cooler.setCoolerfilePath(rset.getString("CCL_FILEPATH"));
				coolerList.add(cooler);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(rset);
			JDBCTemplate.close(stmt);
		}
		return coolerList;
	}



			// GPU All LIST
	public ArrayList<GCARD> gcardAllList(Connection conn) {
		ArrayList<GCARD> gcardList = null;
		Statement stmt = null;
		ResultSet rset = null;
		String gpuQuery = "SELECT * FROM GPU";
		
		try {
			stmt = conn.createStatement();
			rset = stmt.executeQuery(gpuQuery);
			gcardList = new ArrayList<GCARD>();
			while(rset.next()) {
				GCARD gcard = new GCARD();
				gcard.setGcardCode(rset.getString("GPU_CODE"));
				gcard.setGcardNum(rset.getInt("GPU_NO"));
				gcard.setGcardName(rset.getString("GPU_NAME"));
				gcard.setGcardPrice(rset.getInt("GPU_PRICE"));
				gcard.setGcardContent(rset.getString("GPU_CONTENT"));
				gcard.setGcardCount(rset.getInt("GPU_ACCOUNT"));
				//
				gcard.setGcardfileName(rset.getString("GPU_FILENAME"));
				gcard.setGcardfilePath(rset.getString("GPU_FILEPATH"));
				gcardList.add(gcard);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(stmt);
			JDBCTemplate.close(rset);
		}
		return gcardList;
	}



			// HDD All LIST
	public ArrayList<HDD> hddAllList(Connection conn) {
		ArrayList<HDD> hddList = null;
		Statement stmt = null;
		ResultSet rset = null;
		String hddQuery = "SELECT * FROM HDD";
		
		try {
			stmt = conn.createStatement();
			rset = stmt.executeQuery(hddQuery);
			hddList = new ArrayList<HDD>();
			while(rset.next()) {
				HDD hdd = new HDD();
				hdd.setHddCode(rset.getString("HDD_CODE"));
				hdd.setHddNum(rset.getInt("HDD_NO"));
				hdd.setHddName(rset.getString("HDD_NAME"));
				hdd.setHddPrice(rset.getInt("HDD_PRICE"));
				hdd.setHddContent(rset.getString("HDD_CONTENT"));
				hdd.setHddCount(rset.getInt("HDD_ACCOUNT"));
				//
				hdd.setHddfileName(rset.getString("HDD_FILENAME"));
				hdd.setHddfilePath(rset.getString("HDD_FILEPATH"));
				hddList.add(hdd);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(stmt);
			JDBCTemplate.close(rset);
		}
		return hddList;
	}
	
	
	


			// RAM All LIST
	public ArrayList<RAM> ramAllList(Connection conn) {
		ArrayList<RAM> ramList = null;
		Statement stmt = null;
		ResultSet rset = null;
		String ramQuery = "SELECT * FROM RAM";
		
		try {
			stmt = conn.createStatement();
			rset = stmt.executeQuery(ramQuery);
			ramList = new ArrayList<RAM>();
			while(rset.next()) {
				RAM ram = new RAM();
				ram.setRamCode(rset.getString("RAM_CODE"));
				ram.setRamNum(rset.getInt("RAM_NO"));
				ram.setRamName(rset.getString("RAM_NAME"));
				ram.setRamPrice(rset.getInt("RAM_PRICE"));
				ram.setRamContent(rset.getString("RAM_CONTENT"));
				ram.setRamCount(rset.getInt("RAM_ACCOUNT"));
				//
				ram.setRamfileName(rset.getString("RAM_FILENAME"));
				ram.setRamfilePath(rset.getString("RAM_FILEPATH"));
				ramList.add(ram);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(stmt);
			JDBCTemplate.close(rset);
		}
		return ramList;
	}



	
			// SKIN All LIST
	public ArrayList<SKIN> skinAllList(Connection conn) {
		ArrayList<SKIN> skinList = null;
		Statement stmt = null;
		ResultSet rset = null;
		String skinQuery = "SELECT * FROM SKIN";
		
		try {
			stmt = conn.createStatement();
			rset = stmt.executeQuery(skinQuery);
			skinList = new ArrayList<SKIN>();
			
			while(rset.next()) {
				SKIN skin = new SKIN();
				skin.setSkinCode(rset.getString("SKIN_CODE"));
				skin.setSkinNum(rset.getInt("SKIN_NO"));
				skin.setSkinName(rset.getString("SKIN_NAME"));
				skin.setSkinPrice(rset.getInt("SKIN_PRICE"));
				skin.setSkinContent(rset.getString("SKIN_CONTENT"));
				skin.setSkinCount(rset.getInt("SKIN_ACCOUNT"));
				// DB 컬럼 순서 다른테이블이랑 좀 다름
				skin.setSkinfileName(rset.getString("SKIN_FILENAME"));
				skin.setSkinfilePath(rset.getString("SKIN_FILEPATH"));
				skinList.add(skin);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(stmt);
			JDBCTemplate.close(rset);
		}
		return skinList;
	}
	
	
	
	// POWER All LIST
	public ArrayList<POWER> powerAllList(Connection conn) {
		ArrayList<POWER> powerList = null;
		Statement stmt = null;
		ResultSet rset = null;
		String powerQuery = "SELECT * FROM POWER_TBL";
		
		try {
			stmt = conn.createStatement();
			rset = stmt.executeQuery(powerQuery);
			powerList = new ArrayList<POWER>();
			while(rset.next()) {
				POWER power = new POWER();
				power.setPowerCode(rset.getString("POWER_CODE"));
				power.setPowerNum(rset.getInt("POWER_NO"));
				power.setPowerName(rset.getString("POWER_NAME"));
				power.setPowerPrice(rset.getInt("POWER_PRICE"));
				power.setPowerContent(rset.getString("POWER_CONTENT"));
				power.setPowerCount(rset.getInt("POWER_ACCOUNT"));
				//
				power.setPowerfileName(rset.getString("POWER_FILENAME"));
				power.setPowerfilePath(rset.getString("POWER_FILEPATH"));
				powerList.add(power);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return powerList;
	}

	
		
		// SSD All LIST
	public ArrayList<SSD> ssdAllList(Connection conn) {
		ArrayList<SSD> ssdList = null;
		Statement stmt = null;
		ResultSet rset = null;
		String ssdQuery = "SELECT * FROM SSD";
		
		try {
			stmt = conn.createStatement();
			rset = stmt.executeQuery(ssdQuery);
			ssdList = new ArrayList<SSD>();
			while(rset.next()) {
				SSD ssd = new SSD();
				ssd.setSsdCode(rset.getString("SSD_CODE"));
				ssd.setSsdNum(rset.getInt("SSD_NO"));
				ssd.setSsdName(rset.getString("SSD_NAME"));
				ssd.setSsdPrice(rset.getInt("SSD_PRICE"));
				ssd.setSsdContent(rset.getString("SSD_CONTENT"));
				ssd.setSsdCount(rset.getInt("SSD_ACCOUNT"));
				//
				ssd.setSsdfileName(rset.getString("SSD_FILENAME"));
				ssd.setSsdfilePath(rset.getString("SSD_FILEPATH"));
				ssdList.add(ssd);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(rset);
			JDBCTemplate.close(stmt);
		}
		return ssdList;
	}
			
	
	
			// MAIN BOARD All LIST
	/*
	public ArrayList<MainBoard> mainboardAllList(Connection conn) {
		ArrayList<MainBoard> boardList = null;
		Statement stmt = null;
		ResultSet rset = null;
		String boardQuery = "SELECT * FROM MAINBOARD";
		
		try {
			stmt = conn.createStatement();
			rset = stmt.executeQuery(boardQuery);
			while(rset.next()) {
				MainBoard board = new MainBoard();
				board.setMainboardCode(rset.getString(""));
				board.setMainboard
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}
	*/
	
	
	
			// Other All List
	public ArrayList<Other> otherAllList(Connection conn) {
		ArrayList<Other> otherList = null;
		Statement stmt = null;
		ResultSet rset = null;
		String otherQuery = "SELECT * FROM OTHER_PRODUCT";
		
		try {
			stmt = conn.createStatement();
			rset = stmt.executeQuery(otherQuery);
			otherList = new ArrayList<Other>();
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
				otherList.add(other);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(rset);
			JDBCTemplate.close(stmt);
		}
		return otherList;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
