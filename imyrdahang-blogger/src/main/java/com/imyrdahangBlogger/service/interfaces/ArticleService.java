package com.imyrdahangBlogger.service.interfaces;

import java.util.List;
import java.util.Map;

import com.imyrdahang.common.pojo.TaotaoResult;
import com.imyrdahang.pojo.Articles;
import com.imyrdahang.pojo.MergeArticle;

public interface ArticleService {
	/**
	 * 根据分页，排序条件和排序规则进行查询，状态默认不等于2
	 * @method selectArticlesBySortField
	 * @see 根据分页，排序条件和排序规则进行查询，状态默认不等于2
	 * @param pages	页码
	 * @param rows	条数
	 * @param SortFieldAndSort	排序条件和规则
	 * @return
	 * @throws Exception
	 * List<Articles>
	 */
	public List<Articles> selectArticlesBySortField(int pages,int rows,String SortFieldAndSort)throws Exception;
	/**
	 * 根据模块，分页，排序查询，默认状态不等于2
	 * @method selectArticlesByAMIdAndPageAndSortField
	 * @see (这里用一句话描述这个方法的作用)
	 * @param aMId
	 * @param pages
	 * @param rows
	 * @param SortFieldAndSort
	 * @return
	 * @throws Exception
	 * List<Articles>
	 */
	public List<Articles> selectArticlesByAMIdAndPageAndSortField(int aMId,int pages,int rows,String SortFieldAndSort)throws Exception;
	/**
	 * 查询该模块下的文章数
	 * @method selectArticleCountByAMId
	 * @see 查询该模块下的文章数
	 * @param aMId	模块ID
	 * @return
	 * @throws Exception
	 * int
	 */
	public int selectArticleCountByAMId(int aMId)throws Exception;
	/**
	 * 根据根栏目查询该栏目下子栏目的所有文章，排序，分页,默认状态不等于2
	 * @method selectArticlesByRootMIdAndPageAndSortField
	 * @see 根据根栏目查询该栏目下子栏目的所有文章，排序，分页
	 * @param MId	根栏目ID
	 * @param pages	页码
	 * @param rows	条数
	 * @param SortFieldAndSort	排序条件和排序规则
	 * @return
	 * @throws Exception
	 * List<Articles>
	 */
	public List<Articles> selectArticlesByRootMIdAndPageAndSortField(int MId,int pages,int rows,String SortFieldAndSort)throws Exception;
	/**
	 * 根据根栏目ID查询文章总数，默认文章状态不为2
	 * @method selectArticleCountByRootMId
	 * @see 根据根栏目ID查询文章总数，默认文章状态不为2
	 * @param MId	根栏目ID
	 * @return
	 * @throws Exception
	 * int
	 */
	public int selectArticleCountByRootMId(int MId)throws Exception;
	/**
	 * 获取指定文章的上下篇,第一篇为上，第二篇为下
	 * @method selectArticleByUpAndDownPiece
	 * @see 获取指定文章的上下篇
	 * @param aMId	文章模块ID
	 * @param aId	该篇文章ID
	 * @return
	 * @throws Exception
	 * List<Articles>
	 */
	public List<Articles> selectArticleByUpAndDownPiece(int aMId,int aId)throws Exception;
	/**
	 * 根据文章ID查询该文章的全部数据
	 * @method selectMergeArticleByPrimaryKey
	 * @see 根据文章ID查询该文章的全部数据
	 * @param aId	文章ID
	 * @return
	 * @throws Exception
	 * MergeArticle
	 */
	public MergeArticle selectMergeArticleByPrimaryKey(int aId)throws Exception;
	/**
	 * 文章点击量增加，
	 * @method updateArticleOfHitsByPrimaryKey
	 * @see 
	 * @param map	key为文章ID，value为所增加的点击量
	 * @return
	 * @throws Exception
	 * TaotaoResult
	 */
	public TaotaoResult updateArticleOfHitsByPrimaryKey(Map<Integer,Integer> map)throws Exception;
}
