package recommend.model.service;

import java.sql.Connection;
import java.sql.SQLException;

import common.JDBCTemplate;
import product.model.vo.Product;
import recommend.model.dao.RecommendDao;
import recommend.model.vo.Component;
import recommend.model.vo.ComponentList;
import recommend.model.vo.PageData;
import recommend.model.vo.Recommend;

public class RecommendService {
	
	private JDBCTemplate  factory;
	
	public RecommendService() {
		factory = JDBCTemplate.getConnection();
	}
   // 완제품 전체 목록 출력
	public PageData recommendAll(int currentPage){
		Connection conn = null;
		int recordCountPerPage = 16;
		int naviCountPerPage = 5;
		PageData pageData = new PageData();
		try {
			conn = factory.createConnection();
			pageData.setPageList(new RecommendDao().recommendAll(conn,currentPage,recordCountPerPage));
			pageData.setPageNavi(new RecommendDao().getPageNavi(conn,currentPage,recordCountPerPage,naviCountPerPage));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(conn);
		}
		return pageData;
	}
	// 완제품 등록 
	public int recommendInsert(Recommend recommend,String systemFileName) {
		Connection conn = null;
		int result = 0;
		try {
			conn = factory.createConnection();
			result = new RecommendDao().recommendInsert(conn,recommend,systemFileName);
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
	
	// 완제품 관련 데이터 전체 출력 
	public ComponentList recommendselectAll(){
		Connection conn = null;
		ComponentList componentList =new ComponentList();
		try {
			conn = factory.createConnection();
			componentList.setPowerList(new RecommendDao().selectPowerAll(conn)); 
			componentList.setCoolerList(new RecommendDao().selectCoolerAll(conn));
			componentList.setSsdList(new RecommendDao().selectSsdAll(conn));
			componentList.setHddList(new RecommendDao().selectHddAll(conn));
			componentList.setRamList(new RecommendDao().selectRamAll(conn));
			componentList.setMainboardList(new RecommendDao().selectMainboardAll(conn));
			componentList.setGcardList(new RecommendDao().selectGcardAll(conn));
			componentList.setSkinList(new RecommendDao().selectSkinAll(conn));
			componentList.setCpuList(new RecommendDao().selectCpuAll(conn));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			JDBCTemplate.close(conn);
		}
		return componentList;
	}
	
	// 선택한 완제품과 부속부품 가져오기 
	public Component recommendOne(Recommend recommend) {
		Connection conn = null;
		Component component = null;
		try {
			conn = factory.createConnection();
			component = new Component();
			component.setPower(new RecommendDao().selectPowerOne(conn,recommend));
			component.setCooler(new RecommendDao().selectCoolerOne(conn,recommend));
			component.setSsd(new RecommendDao().selectSsdOne(conn,recommend));
			component.setHdd(new RecommendDao().selectHddOne(conn,recommend));
			component.setRam(new RecommendDao().selectRamOne(conn,recommend));
			component.setMainboard(new RecommendDao().selectMainboardOne(conn,recommend));
			component.setGcard(new RecommendDao().selectGcardOne(conn,recommend));
			component.setSkin(new RecommendDao().selectSkinOne(conn,recommend));
			component.setCpu(new RecommendDao().selectCpuOne(conn,recommend));
			component.setRecommend(new RecommendDao().selectRecommendOne(conn, recommend));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(conn);
		}
		return component; 
	}
	
	public int recommendDelete(String[] aName) {
		Connection conn = null;
		int result = 0;
		try {
			conn = factory.createConnection();
			result = new RecommendDao().recommendDelete(conn,aName);
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
	
	// 상품등록
		public int recommendInsert(Product product, String systemFileName){
			Connection conn = null;
			int result =0;
			try {
				conn = factory.createConnection();
				result = new RecommendDao().recommendInsert(conn, product, systemFileName);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally{
				JDBCTemplate.close(conn);
			}
			return result;
		}
	
	
}
