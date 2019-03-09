package com.imyrdahangManager.service.interfaces;

import java.util.List;

import com.imyrdahang.common.pojo.TaotaoResult;
import com.imyrdahang.pojo.Models;

public interface ModelService {
	public TaotaoResult saveModel(Models models) throws Exception;
	public List<Models> selectModels() throws Exception;
	public List<Models> selectModelsByMFId(int mFId)throws Exception;
	public Models selectModelByMId(int mId)throws Exception;
	public TaotaoResult updateModelByMId(Models models)throws Exception;
	public TaotaoResult updateMASumByMId(int mId)throws Exception;
}
