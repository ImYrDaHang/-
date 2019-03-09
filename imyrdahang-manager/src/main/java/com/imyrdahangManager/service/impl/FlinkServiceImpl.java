package com.imyrdahangManager.service.impl;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imyrdahang.common.pojo.TaotaoResult;
import com.imyrdahang.dao.EnshrinesMapper;
import com.imyrdahang.pojo.Enshrines;
import com.imyrdahang.pojo.EnshrinesExample;
import com.imyrdahang.pojo.EnshrinesExample.Criteria;
import com.imyrdahangManager.service.interfaces.FlinkService;
@Service
public class FlinkServiceImpl implements FlinkService {
	@Autowired
	private EnshrinesMapper enshrinesMapper;
	//添加连接
	@Override
	public TaotaoResult saveFlink(Enshrines enshrine) throws Exception {
		//信息补全
		Date date = new Date();
		enshrine.seteCreateDate(date);
		enshrine.seteUpdateDate(date);
		enshrinesMapper.insert(enshrine);
		return TaotaoResult.ok();
	}
	//查询所有链接数据
	@SuppressWarnings("unchecked")
	@Override
	public List<Enshrines> selectFlinks(int pages,int rows) throws Exception {
		@SuppressWarnings("rawtypes")
		Map map=new HashMap();
		map.put("pages", (pages-1)*rows);
		map.put("rows",rows);
		//排序字段，根据那个字段是升还是倒序
		map.put("fieldAndSort", "e_update_date desc");
		return enshrinesMapper.selectByPagesAndRows(map);
	}
	//查询链接总条数
	@Override
	public int selectFlinksCount() throws Exception {
		return enshrinesMapper.countByExample(new EnshrinesExample());
	}
	//根据主键查链接
	@Override
	public Enshrines selectFlinkByPrimaryKey(int eId) throws Exception {
		return enshrinesMapper.selectByPrimaryKey(eId);
	}
	//修改链接
	@Override
	public TaotaoResult updateFlinkByPrimaryKey(Enshrines enshrine,int uId) throws Exception {
		Enshrines nativeEnshrine = enshrinesMapper.selectByPrimaryKey(enshrine.geteId());
		if(nativeEnshrine.geteUId()!=uId) return TaotaoResult.build(403, "对不起！您没有该收藏链接的修改权限"); 
		enshrine.seteUpdateDate(new Date());
		enshrinesMapper.updateByPrimaryKeySelective(enshrine);
		return TaotaoResult.ok();
	}
	//删除链接
	@Override
	public TaotaoResult deleteFlinkByPrimaryKey(int eId, int uId) throws Exception {
		Enshrines nativeEnshrine = enshrinesMapper.selectByPrimaryKey(eId);
		if(nativeEnshrine.geteUId()!=uId) return TaotaoResult.build(403, "对不起！您没有该收藏链接的删除权限"); 
		enshrinesMapper.deleteByPrimaryKey(eId);
		return TaotaoResult.ok();
	}
	//根据用户ID查询其链接数
	@Override
	public int selectFlinsCountByUId(int uId) throws Exception {
		EnshrinesExample example=new EnshrinesExample();
		Criteria criteria = example.createCriteria();
		criteria.andEUIdEqualTo(uId);
		return enshrinesMapper.countByExample(example);
	}
	
}
