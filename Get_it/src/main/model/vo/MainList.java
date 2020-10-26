package main.model.vo;

import java.util.ArrayList;

import deal.vo.Deal;
import other.vo.Other;
import recommend.model.vo.Component;
import recommend.model.vo.Recommend;

public class MainList {
	
	private ArrayList<Recommend> recommendList; 
	private ArrayList<Deal> dealList;
	private ArrayList<Other> otherList;
	private ArrayList<Component> componentList;
	
	public MainList() {}

	public ArrayList<Recommend> getRecommendList() {
		return recommendList;
	}

	public void setRecommendList(ArrayList<Recommend> recommendList) {
		this.recommendList = recommendList;
	}

	public ArrayList<Deal> getDealList() {
		return dealList;
	}

	public void setDealList(ArrayList<Deal> dealList) {
		this.dealList = dealList;
	}

	public ArrayList<Other> getOtherList() {
		return otherList;
	}

	public void setOtherList(ArrayList<Other> otherList) {
		this.otherList = otherList;
	}

	public ArrayList<Component> getComponentList() {
		return componentList;
	}

	public void setComponentList(ArrayList<Component> componentList) {
		this.componentList = componentList;
	}
	
	

}
