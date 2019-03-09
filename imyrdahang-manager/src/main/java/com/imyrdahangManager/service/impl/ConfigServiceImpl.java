package com.imyrdahangManager.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imyrdahang.common.pojo.TaotaoResult;
import com.imyrdahang.dao.ConfigsMapper;
import com.imyrdahang.pojo.Configs;
import com.imyrdahang.pojo.ConfigsExample;
import com.imyrdahangManager.service.interfaces.ConfigService;
@Service
public class ConfigServiceImpl implements ConfigService {
	@Autowired
	private ConfigsMapper configsMapper;
	//添加
	@Override
	public TaotaoResult saveConfig(Configs config) throws Exception {
		configsMapper.insert(config);
		return TaotaoResult.ok();
	}
	//分页查询所有
	@SuppressWarnings("unchecked")
	@Override
	public List<Configs> selectConfigs(int pages, int rows) throws Exception {
		@SuppressWarnings("rawtypes")
		Map map=new HashMap();
		map.put("pages", (pages-1)*rows);
		map.put("rows",rows);
		//排序字段，根据那个字段是升还是倒序
		map.put("fieldAndSort", "c_id desc");
		return configsMapper.selectByPagesAndRows(map);
	}
	@Override
	public int selectConfigsCount() throws Exception {
		return configsMapper.countByExample(new ConfigsExample());
	}
	//根据ID查询
	@Override
	public Configs selectConfigByPrimaryKey(int cId) throws Exception {
		return configsMapper.selectByPrimaryKey(cId);
	}
	//修改
	@Override
	public TaotaoResult updateConfigByPrimaryKey(Configs config, int uId) throws Exception {
		Configs nativeConfig = configsMapper.selectByPrimaryKey(config.getcId());
		if(nativeConfig.getcUId()!=uId) return TaotaoResult.build(403, "对不起！您没有该缓存配置的修改权限"); 
		configsMapper.updateByPrimaryKeySelective(config);
		return TaotaoResult.ok();
	}
	@Override
	public TaotaoResult deleteConfigByPrimaryKey(int cId, int uId) throws Exception {
		Configs nativeConfig = configsMapper.selectByPrimaryKey(cId);
		if(nativeConfig.getcUId()!=uId) return TaotaoResult.build(403, "对不起！您没有该缓存配置的删除权限");
		configsMapper.deleteByPrimaryKey(cId);
		return TaotaoResult.ok();
	}
	
}
