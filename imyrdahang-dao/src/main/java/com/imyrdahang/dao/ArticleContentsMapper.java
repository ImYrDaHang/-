package com.imyrdahang.dao;

import com.imyrdahang.pojo.ArticleContents;
import com.imyrdahang.pojo.ArticleContentsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ArticleContentsMapper {
    int countByExample(ArticleContentsExample example);

    int deleteByExample(ArticleContentsExample example);

    int deleteByPrimaryKey(Integer aCId);

    int insert(ArticleContents record);

    int insertSelective(ArticleContents record);

    List<ArticleContents> selectByExampleWithBLOBs(ArticleContentsExample example);

    List<ArticleContents> selectByExample(ArticleContentsExample example);

    ArticleContents selectByPrimaryKey(Integer aCId);

    int updateByExampleSelective(@Param("record") ArticleContents record, @Param("example") ArticleContentsExample example);

    int updateByExampleWithBLOBs(@Param("record") ArticleContents record, @Param("example") ArticleContentsExample example);

    int updateByExample(@Param("record") ArticleContents record, @Param("example") ArticleContentsExample example);

    int updateByPrimaryKeySelective(ArticleContents record);

    int updateByPrimaryKeyWithBLOBs(ArticleContents record);

    int updateByPrimaryKey(ArticleContents record);
}