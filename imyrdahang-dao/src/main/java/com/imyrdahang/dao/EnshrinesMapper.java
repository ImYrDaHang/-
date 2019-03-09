package com.imyrdahang.dao;

import com.imyrdahang.pojo.Enshrines;
import com.imyrdahang.pojo.EnshrinesExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface EnshrinesMapper {
    int countByExample(EnshrinesExample example);

    int deleteByExample(EnshrinesExample example);

    int deleteByPrimaryKey(Integer eId);

    int insert(Enshrines record);

    int insertSelective(Enshrines record);

    List<Enshrines> selectByExample(EnshrinesExample example);

    Enshrines selectByPrimaryKey(Integer eId);

    int updateByExampleSelective(@Param("record") Enshrines record, @Param("example") EnshrinesExample example);

    int updateByExample(@Param("record") Enshrines record, @Param("example") EnshrinesExample example);

    int updateByPrimaryKeySelective(Enshrines record);

    int updateByPrimaryKey(Enshrines record);
    
    //------------------------------------------------------
    /**
     * 根据状态，用户查询，排序分页
     * @method selectByPagesAndRows
     * @see 分页查询
     * @param map
     * 	--可选	eState	int		不等于什么状态，1，正常，2，删除
     * 	--可选	eUId	int		用户ID
     * 	--必填	fieldAndSort	String	排序条件
     * 	--必填	pages	int		页码
     * 	--必填	rows	int		条数
     * @return List<Enshrines>
     */
    List<Enshrines> selectByPagesAndRows(Map map);
    
}