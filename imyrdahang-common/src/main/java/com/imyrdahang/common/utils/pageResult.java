package com.imyrdahang.common.utils;

public class pageResult {
	//当前页
	public Integer page;
	//总页数
	public Integer pages;
	//总数据条数
	public Integer sum;
	//当页数据
	public Object date;
	public Integer getPage() {
		return page;
	}
	public void setPage(Integer page) {
		this.page = page;
	}
	public Integer getPages() {
		return pages;
	}
	public void setPages(Integer pages) {
		this.pages = pages;
	}
	public Integer getSum() {
		return sum;
	}
	public void setSum(Integer sum) {
		this.sum = sum;
	}
	public Object getDate() {
		return date;
	}
	public void setDate(Object date) {
		this.date = date;
	}
	
}
