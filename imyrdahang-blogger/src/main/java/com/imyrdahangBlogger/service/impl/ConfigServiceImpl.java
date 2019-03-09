package com.imyrdahangBlogger.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imyrdahang.dao.ConfigsMapper;
import com.imyrdahang.pojo.Configs;
import com.imyrdahang.pojo.ConfigsExample;
import com.imyrdahang.pojo.ConfigsExample.Criteria;
import com.imyrdahangBlogger.service.interfaces.ConfigService;
@Service
public class ConfigServiceImpl implements ConfigService {
	@Autowired
	private ConfigsMapper configsMapper;
	/* 
	 * @method selectConfigByCode
	 * @see 根据code查询配置
	 * @param code1
	 * @param code2
	 * @return
	 * @throws Exception
	 */
	@Override
	public List<Configs> selectConfigByCode(String code1, String code2) throws Exception {
		ConfigsExample example = new ConfigsExample();
		Criteria criteria = example.createCriteria();
		criteria.andCCode1EqualTo(code1);
		criteria.andCCode2EqualTo(code2);
		return configsMapper.selectByExample(example);
	}
	/* 
	 * @method selectConfigBySortCode
	 * @see 根据code和排序条件规则查询(主要用于入行时间轴)
	 * @param code1
	 * @param code2
	 * @param SortFieldAndSort 排序条件和排序规则
	 * @return
	 * @throws Exception
	 */
	@Override
	public List<Configs> selectConfigBySortCode(String code1, String code2, String SortFieldAndSort) throws Exception {
		ConfigsExample example = new ConfigsExample();
		Criteria criteria = example.createCriteria();
		criteria.andCCode1EqualTo(code1);
		criteria.andCCode2EqualTo(code2);
		example.setOrderByClause(SortFieldAndSort);
		return configsMapper.selectByExample(example);
	}
}
