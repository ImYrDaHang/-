package com.imyrdahangManager.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imyrdahang.common.pojo.TaotaoResult;
import com.imyrdahang.dao.ModelsMapper;
import com.imyrdahang.pojo.Models;
import com.imyrdahang.pojo.ModelsExample;
import com.imyrdahang.pojo.ModelsExample.Criteria;
import com.imyrdahangManager.service.interfaces.ModelService;
@Service
public class ModelServiceImpl implements ModelService {
	@Autowired
	private ModelsMapper modelsMapper;
	//添加栏目
	@Override
	public TaotaoResult saveModel(Models models) throws Exception{
		//信息补全
		models.setmCreateDate(new Date());
		//该模块下的文章数初始为0
		models.setmASum(0);
		modelsMapper.insert(models);
		return TaotaoResult.ok();
	}
	//查询所有栏目
	@Override
	public List<Models> selectModels() throws Exception {
		List<Models> list = modelsMapper.selectByExample(new ModelsExample());
		List<Models> sortList=new ArrayList<Models>();
		//这里的 for循环只是为了展示的时候父节点和自己的子几点在一起，增加阅读性
		for(Models m:list){
			if(m.getmFId()==0){
				sortList.add(m);
				for(Models models:list){
					if(models.getmFId()==m.getmId()) sortList.add(models);
				}
			}
		}
		return sortList;
	}
	//根据主键查栏目
	@Override
	public Models selectModelByMId(int mId) throws Exception {
		return modelsMapper.selectByPrimaryKey(mId);
	}
	//查询指定父ID下的所有栏目
	@Override
	public List<Models> selectModelsByMFId(int mFId) throws Exception {
		ModelsExample example = new ModelsExample();
		Criteria criteria = example.createCriteria();
		criteria.andMFIdEqualTo(mFId);
		return modelsMapper.selectByExample(example);
	}
	//根据主键修改栏目
	@Override
	public TaotaoResult updateModelByMId(Models models) throws Exception {
		modelsMapper.updateByPrimaryKeySelective(models);
		return TaotaoResult.ok();
	}
	//其下文章数加一
	@Override
	public TaotaoResult updateMASumByMId(int mId) throws Exception {
		Models m=modelsMapper.selectByPrimaryKey(mId);
		m.setmASum(m.getmASum()+1);
		modelsMapper.updateByPrimaryKeySelective(m);
		return TaotaoResult.ok();
	}
	
	
}
