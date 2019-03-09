package com.imyrdahangBlogger.service.interfaces;

import java.util.List;

import com.imyrdahang.pojo.Configs;

public interface ConfigService {
	public List<Configs> selectConfigByCode(String code1,String code2)throws Exception;
	public List<Configs> selectConfigBySortCode(String code1,String code2,String SortFieldAndSort)throws Exception;
}
