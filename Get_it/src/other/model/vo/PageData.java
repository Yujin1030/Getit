package other.model.vo;

import java.util.ArrayList;

import product.model.vo.Product;
import product.model.vo.ProductReview;

public class PageData {
	private ArrayList<Product> pageList;
	private ArrayList<ProductReview> pageReList;
	private String pageNavi;
	private String pageReNavi;
	
	public PageData() {}

	public ArrayList<Product> getPageList() {
		return pageList;
	}

	public void setPageList(ArrayList<Product> pageList) {
		this.pageList = pageList;
	}

	public String getPageNavi() {
		return pageNavi;
	}

	public void setPageNavi(String pageNavi) {
		this.pageNavi = pageNavi;
	}

	public ArrayList<ProductReview> getPageReList() {
		return pageReList;
	}

	public void setPageReList(ArrayList<ProductReview> pageReList) {
		this.pageReList = pageReList;
	}

	public String getPageReNavi() {
		return pageReNavi;
	}

	public void setPageReNavi(String pageReNavi) {
		this.pageReNavi = pageReNavi;
	}
}
