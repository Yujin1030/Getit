package deal.model.vo;

import java.util.ArrayList;

public class DealPageData {
	
	private ArrayList<Deal> dealPageList;
	private String dealPageNavi;
	
	public DealPageData() {}

	public ArrayList<Deal> getDealPageList() {
		return dealPageList;
	}

	public void setDealPageList(ArrayList<Deal> dealPageList) {
		this.dealPageList = dealPageList;
	}

	public String getDealPageNavi() {
		return dealPageNavi;
	}

	public void setDealPageNavi(String dealPageNavi) {
		this.dealPageNavi = dealPageNavi;
	}
	
	
	
}
