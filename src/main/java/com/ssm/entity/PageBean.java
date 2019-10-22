package com.ssm.entity;

import java.util.ArrayList;
import java.util.List;

public class PageBean {
	
	
	//当前是哪一页
	private int currentPage;
	//共有多少页
	private int totalPage;
	//共有多少条记录
	private int totalCount;
	//当前商品页
	private List<HappyFarmLandinfo> landList =new ArrayList<>();
	public int getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	public int getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	public int getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}
	public List<HappyFarmLandinfo> getLandList() {
		return landList;
	}
	public void setLandList(List<HappyFarmLandinfo> landList) {
		this.landList = landList;
	}
	
}
