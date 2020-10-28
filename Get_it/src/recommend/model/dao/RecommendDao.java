package recommend.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import common.JDBCTemplate;
import component.model.vo.COOLER;
import component.model.vo.CPU;
import component.model.vo.GCARD;
import component.model.vo.HDD;
import component.model.vo.MainBoard;
import component.model.vo.POWER;
import component.model.vo.RAM;
import component.model.vo.SKIN;
import component.model.vo.SSD;
import recommend.model.vo.Recommend;

public class RecommendDao {

	public RecommendDao() {}

	public ArrayList<Recommend> recommendAll(Connection conn,int currentPage,int recordCountPerPage) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		ArrayList<Recommend> recomList = null;
	    
		String query 
		= "select * from(\r\n" + 
				"select A.*,row_number() over(order by a_no desc) as num\r\n" + 
				"from (select * from\r\n" + 
				"(select * from end_product\r\n" + 
				"join power_tbl using(power_code)\r\n" + 
				"join ssd using(ssd_code) \r\n" + 
				"join skin using(skin_code) \r\n" + 
				"join gpu using(gpu_code) \r\n" + 
				"join hdd using (hdd_code) \r\n" + 
				"join cpu using (cpu_code)\r\n" + 
				"join mainboard using (mainboard_code) \r\n" + 
				"join cpucooler using (ccl_code) \r\n" + 
				"join ram using(ram_code)))A)\r\n" + 
				"where num between ? and ?";
		try {
			pstmt = conn.prepareStatement(query);
			int start = currentPage*recordCountPerPage - (recordCountPerPage-1);
			int end = currentPage * recordCountPerPage;
			pstmt.setInt(1, start);
			pstmt.setInt(2, end);
			rset = pstmt.executeQuery();
			if(rset!=null) {
				recomList = new ArrayList<Recommend>();
				while(rset.next()) {
					Recommend recommend = new Recommend();
					// 완제품
					recommend.setaNo(rset.getInt("a_no"));
					recommend.setaName(rset.getString("a_name"));
					recommend.setaPrice(rset.getInt("a_price"));
					recommend.setaAccount(rset.getInt("a_account"));
					recommend.setaDetail(rset.getString("a_detail"));
					recommend.setaCategory(rset.getString("a_category"));
					recommend.setFileName(rset.getString("a_filename"));
					recommend.setFilePath(rset.getString("a_filepath"));
					// 파워
					recommend.setPowerCode(rset.getString("power_code"));
//					recommend.setPowerName(rset.getString("power_name"));
//					recommend.setPowerAccount(rset.getInt("power_account"));
//					recommend.setPowerPrice(rset.getInt("power_price"));
					// ssd
					recommend.setSsdCode(rset.getString("ssd_code"));
//					recommend.setSsdName(rset.getString("ssd_name"));
//					recommend.setSsdAccount(rset.getInt("ssd_account"));
//					recommend.setSsdPrice(rset.getInt("ssd_price"));
					// case
					recommend.setSkinCode(rset.getString("skin_code"));
//					recommend.setSkinName(rset.getString("skin_name"));
//					recommend.setSkinAccount(rset.getInt("skin_account"));
//					recommend.setSkinPrice(rset.getInt("skin_price"));
					// gpu
					recommend.setGcardCode(rset.getString("gpu_code"));
//					recommend.setGpuName(rset.getString("gpu_name"));
//					recommend.setGpuAccount(rset.getInt("gpu_account"));
//					recommend.setGpuPrice(rset.getInt("gpu_price"));
					// hdd
					recommend.setHddCode(rset.getString("hdd_code"));
//					recommend.setHddName(rset.getString("hdd_name"));
//					recommend.setHddAccount(rset.getInt("hdd_account"));
//					recommend.setHddPrice(rset.getInt("hdd_price"));
					// ccl
					recommend.setCoolerCode(rset.getString("ccl_code"));
//					recommend.setCclName(rset.getString("ccl_name"));
//					recommend.setCclAccount(rset.getInt("ccl_account"));
//					recommend.setCclPrice(rset.getInt("ccl_price"));
					// ram
					recommend.setRamCode(rset.getString("ram_code"));
//					recommend.setRamName(rset.getString("ram_name"));
//					recommend.setRamAccount(rset.getInt("ram_account"));
//					recommend.setRamPrice(rset.getInt("ram_price"));
					// cpu
					recommend.setCpuCode(rset.getString("cpu_code"));
//					recommend.setCpuName(rset.getString("cpu_name"));
//					recommend.setCpuAccount(rset.getInt("cpu_account"));
//					recommend.setCpuPrice(rset.getInt("cpu_price"));
					// mainboard
					recommend.setMainboardCode(rset.getString("mainboard_code"));
//					recommend.setMainBoardName(rset.getString("mainboard_name"));
//					recommend.setMainBoardAccount(rset.getInt("mainboard_account"));
//					recommend.setMainBoardPrice(rset.getInt("mainboard_price"));
					recomList.add(recommend);
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(rset);
			JDBCTemplate.close(pstmt);
		}
		return recomList;
	}

	public String getPageNavi(Connection conn, int currentPage, int recordCountPerPage, int naviCountPerPage) {
		// 게시물 총 갯수
		int recordTotalCount = totalCount(conn);
		// 페이지 총 갯수
		int pageTotalCount = 0;

		// navi 개수
		if(recordTotalCount % recordCountPerPage >0) {
			pageTotalCount = recordTotalCount/recordCountPerPage +1;
		}else {
			pageTotalCount = recordTotalCount/recordCountPerPage;
		}

		int startNavi = ((currentPage-1)/naviCountPerPage) * naviCountPerPage +1;
		int endNavi = startNavi + naviCountPerPage -1;

		// 페이지 오류 방지
		if(currentPage<1) {
			currentPage =1;
		}else if( currentPage> pageTotalCount) {
			currentPage = pageTotalCount;
		}

		// navi 오류 방지 코드
		if(endNavi>pageTotalCount) {
			endNavi = pageTotalCount;
		}
		// 이전페이지
		boolean needPrev =true;
		// 다음페이지
		boolean needNext =true;
		// 페이지가 1페이지면 이전페이지 사용X
		if(startNavi==1) {
			needPrev =false;
		}
		// 페이지가 마지막페이지 일때 다음페이지 사용X
		if(endNavi==pageTotalCount) {
			needNext =false;
		}
		// String을 연결해주는 클래스
		StringBuilder sb = new StringBuilder();
		// 이전페이지를 누르면 해당 페이지의 게시물을 가져옴
		sb.append("<ul class='pagination'>");
		if(needPrev) {
			sb.append("<li class='page-item'><a class='page-link' href='/recommend/listview?currentPage=" + (startNavi-1) + "' aria-label='Next'><span aria-hidden='true'>&raquo;</span></a></li>");
		}
		for(int i=startNavi; i<=endNavi; i++) {
			if(i==currentPage) {
				sb.append("<li class='page-item'><a class='page-link' href='/recommend/listview?currentPage=" + i + "'>" +"<b>" + i + "</b></a></li>" );
			}else {
				sb.append("<li class='page-item'><a class='page-link' href='/recommend/listview?currentPage=" + i + "'>" +  i   + "</a></li>");
			}
		}
		
		if(needNext) {
			sb.append("<li class='page-item'><a class='page-link' href='/recommend/listview?currentPage=" +(endNavi+1) + "' aria-label='Next'><span aria-hidden='true'>&raquo;</span></a></li>");
		}
		sb.append("</ul>");
		return sb.toString();
	}

	public int totalCount(Connection conn) {
		PreparedStatement pstmt = null;
		ResultSet rset =null;
		String query = "select count(*) as totalcount from end_product";
		int recordtotalCount = 0;
		try {
			pstmt = conn.prepareStatement(query);
			rset = pstmt.executeQuery();
			if(rset.next()) {
				recordtotalCount = rset.getInt("totalcount");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(pstmt);
			JDBCTemplate.close(rset);
		}
		return recordtotalCount;
	}

	public int recommendInsert(Connection conn,Recommend recommend,String systemFileName) {
		PreparedStatement pstmt = null;
		int result = 0;
		String query 
		="insert into end_product values(end_product_seq.nextval,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, recommend.getaName());
			pstmt.setInt(2, recommend.getaPrice());
			pstmt.setInt(3, recommend.getaAccount());
			pstmt.setString(4, recommend.getaDetail());
			pstmt.setString(5, recommend.getaCategory());
			pstmt.setString(6, systemFileName);
			pstmt.setString(7, recommend.getFilePath());
			pstmt.setString(8, recommend.getPowerCode());
			pstmt.setString(9, recommend.getSsdCode());
			pstmt.setString(10, recommend.getSkinCode());
			pstmt.setString(11, recommend.getGcardCode());
			pstmt.setString(12, recommend.getHddCode());
			pstmt.setString(13, recommend.getCoolerCode());
			pstmt.setString(14, recommend.getRamCode());
			pstmt.setString(15, recommend.getCpuCode());
			pstmt.setString(16, recommend.getMainboardCode());
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(pstmt);
		}
		return result;
	}

	// Power 테이블
	public ArrayList<POWER> selectPowerAll(Connection conn){
		Statement stmt = null;
		ResultSet rset = null;
		ArrayList<POWER> powerList = null;
		String query ="select * from power_tbl";
		try {
			stmt = conn.createStatement();
			rset = stmt.executeQuery(query);
			if(rset!=null) {
				powerList = new ArrayList<POWER>();
				while(rset.next()) {
					POWER power = new POWER();
					power.setPowerCode(rset.getString("power_code"));
					power.setPowerNum(rset.getInt("power_no"));
					power.setPowerName(rset.getString("power_name"));
					power.setPowerPrice(rset.getInt("power_price"));
					power.setPowerContent(rset.getString("power_content"));			
					power.setPowerCount(rset.getInt("power_account"));
					powerList.add(power);
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(rset);
			JDBCTemplate.close(stmt);
		}
		return powerList;
	}
	// SSD 테이블
	public ArrayList<SSD> selectSsdAll(Connection conn){
		Statement stmt = null;
		ResultSet rset = null;
		ArrayList<SSD> ssdList = null;
		String query ="select * from ssd";
		try {
			stmt = conn.createStatement();
			rset = stmt.executeQuery(query);
			if(rset!=null) {
				ssdList = new ArrayList<SSD>();
				while(rset.next()) {
					SSD ssd = new SSD();
					ssd.setSsdCode(rset.getString("ssd_code"));
					ssd.setSsdNum(rset.getInt("ssd_no"));
					ssd.setSsdName(rset.getString("ssd_name"));
					ssd.setSsdPrice(rset.getInt("ssd_price"));
					ssd.setSsdContent(rset.getString("ssd_content"));			
					ssd.setSsdCount(rset.getInt("ssd_account"));
					ssdList.add(ssd);
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(rset);
			JDBCTemplate.close(stmt);
		}
		return ssdList;
	}

	// SKIN 테이블
	public ArrayList<SKIN> selectSkinAll(Connection conn){
		Statement stmt = null;
		ResultSet rset = null;
		ArrayList<SKIN> skinList = null;
		String query ="select * from skin";
		try {
			stmt = conn.createStatement();
			rset = stmt.executeQuery(query);
			if(rset!=null) {
				skinList = new ArrayList<SKIN>();
				while(rset.next()) {
					SKIN skin = new SKIN();
					skin.setSkinCode(rset.getString("skin_code"));
					skin.setSkinNum(rset.getInt("skin_no"));
					skin.setSkinName(rset.getString("skin_name"));
					skin.setSkinPrice(rset.getInt("skin_price"));
					skin.setSkinContent(rset.getString("skin_content"));			
					skin.setSkinCount(rset.getInt("skin_account"));
					skinList.add(skin);
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(rset);
			JDBCTemplate.close(stmt);
		}
		return skinList;
	}

	// GPU 테이블
	public ArrayList<GCARD> selectGcardAll(Connection conn){
		Statement stmt = null;
		ResultSet rset = null;
		ArrayList<GCARD> gpuList = null;
		String query ="select * from gpu";
		try {
			stmt = conn.createStatement();
			rset = stmt.executeQuery(query);
			if(rset!=null) {
				gpuList = new ArrayList<GCARD>();
				while(rset.next()) {
					GCARD gpu = new GCARD();
					gpu.setGcardCode(rset.getString("gpu_code"));
					gpu.setGcardNum(rset.getInt("gpu_no"));
					gpu.setGcardName(rset.getString("gpu_name"));
					gpu.setGcardPrice(rset.getInt("gpu_price"));
					gpu.setGcardContent(rset.getString("gpu_content"));			
					gpu.setGcardCount(rset.getInt("gpu_account"));
					gpuList.add(gpu);
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(rset);
			JDBCTemplate.close(stmt);
		}
		return gpuList;
	}

	// Hdd 테이블
	public ArrayList<HDD> selectHddAll(Connection conn){
		Statement stmt = null;
		ResultSet rset = null;
		ArrayList<HDD> hddList = null;
		String query ="select * from hdd";
		try {
			stmt = conn.createStatement();
			rset = stmt.executeQuery(query);
			if(rset!=null) {
				hddList = new ArrayList<HDD>();
				while(rset.next()) {
					HDD hdd = new HDD();
					hdd.setHddCode(rset.getString("hdd_code"));
					hdd.setHddNum(rset.getInt("hdd_no"));
					hdd.setHddName(rset.getString("hdd_name"));
					hdd.setHddPrice(rset.getInt("hdd_price"));
					hdd.setHddContent(rset.getString("hdd_content"));			
					hdd.setHddCount(rset.getInt("hdd_account"));
					hddList.add(hdd);
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(rset);
			JDBCTemplate.close(stmt);
		}
		return hddList;
	}
	// Ram 테이블
	public ArrayList<RAM> selectRamAll(Connection conn){
		Statement stmt = null;
		ResultSet rset = null;
		ArrayList<RAM> ramList = null;
		String query ="select * from ram";
		try {
			stmt = conn.createStatement();
			rset = stmt.executeQuery(query);
			if(rset!=null) {
				ramList = new ArrayList<RAM>();
				while(rset.next()) {
					RAM ram = new RAM();
					ram.setRamCode(rset.getString("ram_code"));
					ram.setRamNum(rset.getInt("ram_no"));
					ram.setRamName(rset.getString("ram_name"));
					ram.setRamPrice(rset.getInt("ram_price"));
					ram.setRamContent(rset.getString("ram_content"));			
					ram.setRamCount(rset.getInt("ram_account"));
					ramList.add(ram);
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(rset);
			JDBCTemplate.close(stmt);
		}
		return ramList;
	}

	// CpuCooler 테이블
	public ArrayList<COOLER> selectCoolerAll(Connection conn){
		Statement stmt = null;
		ResultSet rset = null;
		ArrayList<COOLER> cclList = null;
		String query ="select * from cpucooler";
		try {
			stmt = conn.createStatement();
			rset = stmt.executeQuery(query);
			if(rset!=null) {
				cclList = new ArrayList<COOLER>();
				while(rset.next()) {
					COOLER ccl = new COOLER();
					ccl.setCoolerCode(rset.getString("ccl_code"));
					ccl.setCoolerNum(rset.getInt("ccl_no"));
					ccl.setCoolerName(rset.getString("ccl_name"));
					ccl.setCoolerPrice(rset.getInt("ccl_price"));
					ccl.setCoolerContent(rset.getString("ccl_content"));			
					ccl.setCoolerCount(rset.getInt("ccl_account"));
					cclList.add(ccl);
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(rset);
			JDBCTemplate.close(stmt);
		}
		return cclList;
	}

	// MainBoard 테이블
	public ArrayList<MainBoard> selectMainboardAll(Connection conn){
		Statement stmt = null;
		ResultSet rset = null;
		ArrayList<MainBoard> mbList = null;
		String query ="select * from mainboard";
		try {
			stmt = conn.createStatement();
			rset = stmt.executeQuery(query);
			if(rset!=null) {
				mbList = new ArrayList<MainBoard>();
				while(rset.next()) {
					MainBoard mb = new MainBoard();
					mb.setMainboardCode(rset.getString("mainboard_code"));
					mb.setMainboardNum(rset.getInt("mainboard_no"));
					mb.setMainboardName(rset.getString("mainboard_name"));
					mb.setMainboardPrice(rset.getInt("mainboard_price"));
					mb.setMainboardContent(rset.getString("mainboard_content"));			
					mb.setMainboardCount(rset.getInt("mainboard_account"));
					mb.setComCode(rset.getString("com_code"));
					mbList.add(mb);
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(rset);
			JDBCTemplate.close(stmt);
		}
		return mbList;
	}

	// Cpu 테이블
	public ArrayList<CPU> selectCpuAll(Connection conn){
		Statement stmt = null;
		ResultSet rset = null;
		ArrayList<CPU> cpuList = null;
		String query ="select * from cpu";
		try {
			stmt = conn.createStatement();
			rset = stmt.executeQuery(query);
			if(rset!=null) {
				cpuList = new ArrayList<CPU>();
				while(rset.next()) {
					CPU cpu = new CPU();
					cpu.setCpuCode(rset.getString("cpu_code"));
					cpu.setCpuNum(rset.getInt("cpu_no"));
					cpu.setCpuName(rset.getString("cpu_name"));
					cpu.setCpuPrice(rset.getInt("cpu_price"));
					cpu.setCpuContent(rset.getString("cpu_content"));			
					cpu.setCpuCount(rset.getInt("cpu_account"));
					cpuList.add(cpu);
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(rset);
			JDBCTemplate.close(stmt);
		}
		return cpuList;
	}

	public int recommendDelete(Connection conn, String[] aName) {
		PreparedStatement pstmt  = null;
		
		int result = 0;
		for(int i=0; i<aName.length; i++) {
			String query = "delete from end_product where a_name =?";
			try {
				pstmt = conn.prepareStatement(query);
				pstmt.setString(1, aName[i]);
				
				result = pstmt.executeUpdate();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				JDBCTemplate.close(pstmt);
			}
		}
		return result;
	}
	
	public Recommend selectRecommendOne(Connection conn,Recommend recommend) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		Recommend recom = null;
		String query 
		= "select * from end_product where a_no=?";
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, recommend.getaNo());
			rset = pstmt.executeQuery();
			if(rset.next()) {
				recom = new Recommend();
					// 완제품
				recom.setFileName(rset.getString("a_filename"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(rset);
			JDBCTemplate.close(pstmt);
		}
		return recom;
	}
	
	// selectPower 테이블
		public POWER selectPowerOne(Connection conn,Recommend recommend){
			PreparedStatement pstmt = null;
			ResultSet rset = null;
			POWER power = null;
			String query ="select * from power_tbl where power_code= ?";
			try {
				pstmt = conn.prepareStatement(query);
				pstmt.setString(1, recommend.getPowerCode());
				rset = pstmt.executeQuery();
				if(rset.next()) {
						power = new POWER();
						power.setPowerCode(rset.getString("power_code"));
						power.setPowerNum(rset.getInt("power_no"));
						power.setPowerName(rset.getString("power_name"));
						power.setPowerPrice(rset.getInt("power_price"));
						power.setPowerContent(rset.getString("power_content"));			
						power.setPowerCount(rset.getInt("power_account"));
					}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				JDBCTemplate.close(rset);
				JDBCTemplate.close(pstmt);
			}
			return power;
		}
		// selectSSD 테이블
		public SSD selectSsdOne(Connection conn,Recommend recommend){
			PreparedStatement pstmt = null;
			ResultSet rset = null;
			SSD ssd = null;
			String query ="select * from ssd where ssd_code=?";
			try {
				pstmt =conn.prepareStatement(query);
				pstmt.setString(1, recommend.getSsdCode());
				rset = pstmt.executeQuery();
				if(rset.next()) {
					ssd = new SSD();
						ssd.setSsdCode(rset.getString("ssd_code"));
						ssd.setSsdNum(rset.getInt("ssd_no"));
						ssd.setSsdName(rset.getString("ssd_name"));
						ssd.setSsdPrice(rset.getInt("ssd_price"));
						ssd.setSsdContent(rset.getString("ssd_content"));			
						ssd.setSsdCount(rset.getInt("ssd_account"));
					}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				JDBCTemplate.close(rset);
				JDBCTemplate.close(pstmt);
			}
			return ssd;
		}

		// select SKIN 테이블
		public SKIN selectSkinOne(Connection conn, Recommend recommend){
			PreparedStatement pstmt = null;
			ResultSet rset = null;
			SKIN skin = null;
			String query ="select * from skin where skin_code=?";
			try {
				pstmt = conn.prepareStatement(query);
				pstmt.setString(1, recommend.getSkinCode());
				rset = pstmt.executeQuery();
				if(rset.next()) {
						skin = new SKIN();
						skin.setSkinCode(rset.getString("skin_code"));
						skin.setSkinNum(rset.getInt("skin_no"));
						skin.setSkinName(rset.getString("skin_name"));
						skin.setSkinPrice(rset.getInt("skin_price"));
						skin.setSkinContent(rset.getString("skin_content"));			
						skin.setSkinCount(rset.getInt("skin_account"));
					}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				JDBCTemplate.close(rset);
				JDBCTemplate.close(pstmt);
			}
			return skin;
		}

		// select GPU 테이블
		public GCARD selectGcardOne(Connection conn,Recommend recommend){
			PreparedStatement pstmt = null;
			ResultSet rset = null;
			GCARD gpu = null;
			String query ="select * from gpu where gpu_code=?";
			try {
				pstmt = conn.prepareStatement(query);
				pstmt.setString(1, recommend.getGcardCode());
				rset = pstmt.executeQuery();
				if(rset.next()) {
						gpu = new GCARD();
						gpu.setGcardCode(rset.getString("gpu_code"));
						gpu.setGcardNum(rset.getInt("gpu_no"));
						gpu.setGcardName(rset.getString("gpu_name"));
						gpu.setGcardPrice(rset.getInt("gpu_price"));
						gpu.setGcardContent(rset.getString("gpu_content"));			
						gpu.setGcardCount(rset.getInt("gpu_account"));
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				JDBCTemplate.close(rset);
				JDBCTemplate.close(pstmt);
			}
			return gpu;
		}

		// Hdd 테이블
		public HDD selectHddOne(Connection conn,Recommend recommend){
			PreparedStatement pstmt = null;
			ResultSet rset = null;
			HDD hdd = null;
			String query ="select * from hdd where hdd_code=?";
			try {
				pstmt = conn.prepareStatement(query);
				pstmt.setString(1, recommend.getHddCode());
				rset = pstmt.executeQuery();
				if(rset.next()) {
						hdd = new HDD();
						hdd.setHddCode(rset.getString("hdd_code"));
						hdd.setHddNum(rset.getInt("hdd_no"));
						hdd.setHddName(rset.getString("hdd_name"));
						hdd.setHddPrice(rset.getInt("hdd_price"));
						hdd.setHddContent(rset.getString("hdd_content"));			
						hdd.setHddCount(rset.getInt("hdd_account"));
					}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				JDBCTemplate.close(rset);
				JDBCTemplate.close(pstmt);
			}
			return hdd;
		}
		
		// select Ram 테이블
		public RAM selectRamOne(Connection conn,Recommend recommend){
			PreparedStatement pstmt = null;
			ResultSet rset = null;
			RAM ram = null;
			String query ="select * from ram where ram_code=?";
			try {
				pstmt = conn.prepareStatement(query);
				pstmt.setString(1, recommend.getRamCode());
				rset = pstmt.executeQuery();
				if(rset.next()) {
						ram = new RAM();
						ram.setRamCode(rset.getString("ram_code"));
						ram.setRamNum(rset.getInt("ram_no"));
						ram.setRamName(rset.getString("ram_name"));
						ram.setRamPrice(rset.getInt("ram_price"));
						ram.setRamContent(rset.getString("ram_content"));			
						ram.setRamCount(rset.getInt("ram_account"));
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				JDBCTemplate.close(rset);
				JDBCTemplate.close(pstmt);
			}
			return ram;
		}

		// CpuCooler 테이블
		public COOLER selectCoolerOne(Connection conn,Recommend recommend){
			PreparedStatement pstmt = null;
			ResultSet rset = null;
			COOLER cooler = null;
			String query ="select * from cpucooler where ccl_code=?";
			try {
				pstmt = conn.prepareStatement(query);
				pstmt.setString(1, recommend.getCoolerCode());
				rset = pstmt.executeQuery();
				if(rset.next()) {
					cooler = new COOLER();
					cooler.setCoolerCode(rset.getString("ccl_code"));
					cooler.setCoolerNum(rset.getInt("ccl_no"));
					cooler.setCoolerName(rset.getString("ccl_name"));
					cooler.setCoolerPrice(rset.getInt("ccl_price"));
					cooler.setCoolerContent(rset.getString("ccl_content"));			
					cooler.setCoolerCount(rset.getInt("ccl_account"));
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				JDBCTemplate.close(rset);
				JDBCTemplate.close(pstmt);
			}
			return cooler;
		}

		// MainBoard 테이블
		public MainBoard selectMainboardOne(Connection conn,Recommend recommend){
			PreparedStatement pstmt = null;
			ResultSet rset = null;
			MainBoard mainboard = null;
			String query ="select * from mainboard where mainboard_code=?";
			try {
				pstmt = conn.prepareStatement(query);
				pstmt.setString(1, recommend.getMainboardCode());
				rset = pstmt.executeQuery();
				if(rset.next()) {
						mainboard = new MainBoard();
						mainboard.setMainboardCode(rset.getString("mainboard_code"));
						mainboard.setMainboardNum(rset.getInt("mainboard_no"));
						mainboard.setMainboardName(rset.getString("mainboard_name"));
						mainboard.setMainboardPrice(rset.getInt("mainboard_price"));
						mainboard.setMainboardContent(rset.getString("mainboard_content"));			
						mainboard.setMainboardCount(rset.getInt("mainboard_account"));
						mainboard.setComCode(rset.getString("com_code"));
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				JDBCTemplate.close(rset);
				JDBCTemplate.close(pstmt);
			}
			return mainboard;
		}

		// Cpu 테이블
		public CPU selectCpuOne(Connection conn,Recommend recommend){
			PreparedStatement pstmt = null;
			ResultSet rset = null;
			CPU cpu= null;
			String query ="select * from cpu where cpu_code=?";
			try {
				pstmt = conn.prepareStatement(query);
				pstmt.setString(1, recommend.getCpuCode());
				rset = pstmt.executeQuery();
				if(rset.next()) {
						cpu = new CPU();
						cpu.setCpuCode(rset.getString("cpu_code"));
						cpu.setCpuNum(rset.getInt("cpu_no"));
						cpu.setCpuName(rset.getString("cpu_name"));
						cpu.setCpuPrice(rset.getInt("cpu_price"));
						cpu.setCpuContent(rset.getString("cpu_content"));			
						cpu.setCpuCount(rset.getInt("cpu_account"));
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				JDBCTemplate.close(rset);
				JDBCTemplate.close(pstmt);
			}
			return cpu;
		}
}
