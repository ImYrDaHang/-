package com.imyrdahangManager.service.interfaces;

import java.util.List;

import com.imyrdahang.common.pojo.TaotaoResult;
import com.imyrdahang.pojo.Enshrines;

public interface FlinkService {
	public TaotaoResult saveFlink(Enshrines enshrine)throws Exception;
	public List<Enshrines> selectFlinks(int pages,int rows)throws Exception;
	public int selectFlinksCount()throws Exception;
	public Enshrines selectFlinkByPrimaryKey(int eId)throws Exception;
	public TaotaoResult updateFlinkByPrimaryKey(Enshrines enshrine,int uId)throws Exception;
	public TaotaoResult deleteFlinkByPrimaryKey(int eId,int uId)throws Exception;
	public int selectFlinsCountByUId(int uId)throws Exception;
}
