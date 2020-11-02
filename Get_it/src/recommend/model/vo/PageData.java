package product.model.vo;

import java.util.ArrayList;

public class PageData {
	
	private ArrayList<Product> pageList;
	private String pageNavi;
	private ArrayList<ProductReview> reviewList;

	public PageData() {}
	
	

	public ArrayList<ProductReview> getReviewList() {
		return reviewList;
	}

	public void setReviewList(ArrayList<ProductReview> reviewList) {
		this.reviewList = reviewList;
	}

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
	
}
