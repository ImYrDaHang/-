package com.imyrdahangManager.service.interfaces;

import java.util.List;

import com.imyrdahang.common.pojo.TaotaoResult;
import com.imyrdahang.pojo.Configs;

public interface ConfigService {
	public TaotaoResult saveConfig(Configs config)throws Exception;
	public List<Configs> selectConfigs(int pages,int rows)throws Exception;
	public int selectConfigsCount()throws Exception;
	public Configs selectConfigByPrimaryKey(int cId)throws Exception;
	public TaotaoResult updateConfigByPrimaryKey(Configs config,int uId)throws Exception;
	public TaotaoResult deleteConfigByPrimaryKey(int cId,int uId)throws Exception;
}
