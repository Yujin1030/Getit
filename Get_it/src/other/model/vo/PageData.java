package other.model.vo;

import java.util.ArrayList;

public class PageData {
	private ArrayList<Other> pageList;
	private String pageNavi;
	
	public PageData() {}

	public ArrayList<Other> getPageList() {
		return pageList;
	}

	public void setPageList(ArrayList<Other> pageList) {
		this.pageList = pageList;
	}

	public String getPageNavi() {
		return pageNavi;
	}

	public void setPageNavi(String pageNavi) {
		this.pageNavi = pageNavi;
	}
}
