package com.imyrdahang.dao;

import com.imyrdahang.pojo.Configs;
import com.imyrdahang.pojo.ConfigsExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface ConfigsMapper {
    int countByExample(ConfigsExample example);

    int deleteByExample(ConfigsExample example);

    int deleteByPrimaryKey(Integer cId);

    int insert(Configs record);

    int insertSelective(Configs record);

    List<Configs> selectByExample(ConfigsExample example);

    Configs selectByPrimaryKey(Integer cId);

    int updateByExampleSelective(@Param("record") Configs record, @Param("example") ConfigsExample example);

    int updateByExample(@Param("record") Configs record, @Param("example") ConfigsExample example);

    int updateByPrimaryKeySelective(Configs record);

    int updateByPrimaryKey(Configs record);
    //=================================================
    List<Configs> selectByPagesAndRows(Map map);
}