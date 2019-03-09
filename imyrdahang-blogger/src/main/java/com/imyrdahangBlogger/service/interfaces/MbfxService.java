package com.imyrdahangBlogger.service.interfaces;

import java.util.List;

import com.imyrdahang.pojo.Enshrines;

public interface MbfxService {
	public List<Enshrines> selectEnshrinesByPageAndSortField(int pages,int rows,String SortFieldAndSort)throws Exception;
	public int selectEnshrineCount()throws Exception;
}
