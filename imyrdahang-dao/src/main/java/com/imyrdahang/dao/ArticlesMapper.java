package com.imyrdahang.dao;

import com.imyrdahang.pojo.Articles;
import com.imyrdahang.pojo.ArticlesExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface ArticlesMapper {
    int countByExample(ArticlesExample example);

    int deleteByExample(ArticlesExample example);

    int deleteByPrimaryKey(Integer aId);
    
    int insert(Articles record);

    int insertSelective(Articles record);

    List<Articles> selectByExample(ArticlesExample example);

    Articles selectByPrimaryKey(Integer aId);

    int updateByExampleSelective(@Param("record") Articles record, @Param("example") ArticlesExample example);

    int updateByExample(@Param("record") Articles record, @Param("example") ArticlesExample example);

    int updateByPrimaryKeySelective(Articles record);
    
    int updateByPrimaryKey(Articles record);
    //------------------------------------------------------------
    
    /**
     * 	根据状态，模块，用户，查询，排序分页
     * @method selectByPagesAndRows
     * @see 分页查询
     * @param map
     * 	--可选	aState	int		不等于什么状态，1，正常，2，删除，3，置顶
     * 	--可选	aMId	int		什么模块的文章
     * 	--可选	aUId	int		用户ID
     * 	--必填	fieldAndSort	String	排序条件
     * 	--必填	pages	int		页码
     * 	--必填	rows	int		条数
     * @param
     * @return List<Articles>
     */
    List<Articles> selectByPagesAndRows(Map map);
    /**
     * 	根据状态，根模块，用户，查询该根模块下子模块的所有文章，排序分页
     * @method selectByRootMIdAndPagesAndRows
     * @see 根据状态，根模块，用户，查询该根模块下子模块的所有文章，排序分页
     * @param map
     * 	--可选	aState	int		不等于什么状态，1，正常，2，删除，3，置顶
     * 	--可选	mFId	int		什么根模块的文章
     * 	--可选	aUId	int		用户ID
     * 	--必填	fieldAndSort	String	排序条件
     * 	--必填	pages	int		页码
     * 	--必填	rows	int		条数
     * @param
     * @return List<Articles>
     */
    List<Articles> selectByRootMIdAndPagesAndRows(Map map);
    /**
     * 根据用户，不属于什么状态，根栏目查询文章数
     * (方法描述)
     * @method selectCountByRootMId
     * @see (这里用一句话描述这个方法的作用)
     * @param map
     *  --可选	aState	int		不等于什么状态，1，正常，2，删除，3，置顶
     * 	--可选	mFId	int		什么根模块的文章
     * 	--可选	aUId	int		用户ID
     * @return
     * int
     */
    int selectCountByRootMId(Map map);
    /**
     * 根据文章ID和模块ID查询该文章的上下篇
     * @method selectByRootMIdAndPagesAndRows
     * @see 该查询的上下篇是根据该文章ID的updateDate时间来判定的
     * @param map	--必填  aMId int --必填 aId int 
     * @return
     * List<Articles>
     */
    List<Articles> selectArticleByUpAndDownPiece(Map map);
    /**
     * 文章点击量增加，根据文章ID来增加
     * @method updateArticleOfHtisByPrimaryKey
     * @see 文章点击量增加，根据文章ID来增加
     * @param map	--必填 aId int --必填 sum int(所增加的点击量)
     * @return
     * int
     */
    int updateArticleOfHtisByPrimaryKey(Map map);
    
}