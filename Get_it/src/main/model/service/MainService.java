package main.model.service;

import java.sql.Connection;
import java.sql.SQLException;

import common.JDBCTemplate;
import main.model.dao.MainDao;
import main.model.vo.MainList;

public class MainService {

	public JDBCTemplate factory;
	
	public MainService() {
		factory = JDBCTemplate.getConnection();
	}
	
	public MainList selectMain() {
		Connection conn = null;
		MainList mainList = new MainList();
		try {
			conn = factory.createConnection();
			mainList.setRecommendList(new MainDao().selectRecommend(conn));
//			mainList.setComponentList(new MainDao.selectComponent(conn));
//			mainList.setOtherList(new MainDao.selectOther(conn));
//			mainList.setDealList(new MainDao.selectDeal(conn));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(conn);
		}
		return mainList;
	}
}
