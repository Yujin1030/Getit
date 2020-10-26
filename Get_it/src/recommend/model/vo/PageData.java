package recommend.model.vo;

import java.util.ArrayList;

public class PageData {
	
	private ArrayList<Recommend> pageList;
	private String pageNavi;

	public PageData() {}

	public ArrayList<Recommend> getPageList() {
		return pageList;
	}

	public void setPageList(ArrayList<Recommend> pageList) {
		this.pageList = pageList;
	}

	public String getPageNavi() {
		return pageNavi;
	}

	public void setPageNavi(String pageNavi) {
		this.pageNavi = pageNavi;
	}
	
	
	
	
}
