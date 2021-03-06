package com.imyrdahang.dao;

import com.imyrdahang.pojo.Models;
import com.imyrdahang.pojo.ModelsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ModelsMapper {
    int countByExample(ModelsExample example);

    int deleteByExample(ModelsExample example);

    int deleteByPrimaryKey(Integer mId);

    int insert(Models record);

    int insertSelective(Models record);

    List<Models> selectByExample(ModelsExample example);

    Models selectByPrimaryKey(Integer mId);

    int updateByExampleSelective(@Param("record") Models record, @Param("example") ModelsExample example);

    int updateByExample(@Param("record") Models record, @Param("example") ModelsExample example);

    int updateByPrimaryKeySelective(Models record);

    int updateByPrimaryKey(Models record);
    //=========================
    Models selectFatherModelByaMId(Integer aMId);
}