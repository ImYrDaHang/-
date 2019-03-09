package com.imyrdahangBlogger.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imyrdahang.common.pojo.TaotaoResult;
import com.imyrdahang.dao.ArticleContentsMapper;
import com.imyrdahang.dao.ArticlesMapper;
import com.imyrdahang.pojo.Articles;
import com.imyrdahang.pojo.ArticlesExample;
import com.imyrdahang.pojo.ArticlesExample.Criteria;
import com.imyrdahang.pojo.MergeArticle;
import com.imyrdahangBlogger.service.interfaces.ArticleService;

@Service
public class ArticleServiceImpl implements ArticleService {
	@Autowired
	private ArticlesMapper articlesMapper;
	@Autowired
	private ArticleContentsMapper articleContentsMapper;
	/* 
	 * @method selectArticlesBySortField
	 * @see 根据分页，排序条件和排序规则进行查询
	 * @param pages 	页码
	 * @param rows		每页条数
	 * @param SortField	排序条件
	 * @param Sort		排序规则，desc升序
	 * @return			多个文章的集合
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<Articles> selectArticlesBySortField(int pages, int rows,String SortFieldAndSort) throws Exception {
		@SuppressWarnings("rawtypes")
		Map map=new HashMap();
		map.put("pages", (pages-1)*rows);
		map.put("rows",rows);
		map.put("aState", 2);
		//排序字段，根据那个字段是升还是倒序
		map.put("fieldAndSort", SortFieldAndSort);
		return articlesMapper.selectByPagesAndRows(map);
	}
	/* 
	 * @method selectArticlesByAMIdAndPageAndSortField
	 * @see 根据模块，分页，排序查询
	 * @param aMId				模块ID
	 * @param pages				页码
	 * @param rows				条数
	 * @param SortFieldAndSort	排序条件
	 * @return					
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<Articles> selectArticlesByAMIdAndPageAndSortField(int aMId, int pages, int rows,
			String SortFieldAndSort) throws Exception {
		@SuppressWarnings("rawtypes")
		Map map=new HashMap();
		map.put("aMId", aMId);
		map.put("pages", (pages-1)*rows);
		map.put("rows",rows);
		map.put("aState", 2);
		//排序字段，根据那个字段是升还是倒序
		map.put("fieldAndSort", SortFieldAndSort);
		return articlesMapper.selectByPagesAndRows(map);
	}
	/* 
	 * @method selectArticleCountByAMId
	 * @see 查询该模块下的文章数
	 * @param aMId
	 * @return
	 * @throws Exception
	 */
	@Override
	public int selectArticleCountByAMId(int aMId) throws Exception {
		ArticlesExample example=new ArticlesExample();
		Criteria criteria = example.createCriteria();
		criteria.andAMIdEqualTo(aMId);
		return articlesMapper.countByExample(example);
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<Articles> selectArticlesByRootMIdAndPageAndSortField(int MId, int pages, int rows,
			String SortFieldAndSort) throws Exception {
		@SuppressWarnings("rawtypes")
		Map map=new HashMap();
		map.put("mFId", MId);
		map.put("pages", (pages-1)*rows);
		map.put("rows",rows);
		map.put("aState", 2);
		//排序字段，根据那个字段是升还是倒序
		map.put("fieldAndSort", SortFieldAndSort);
		return articlesMapper.selectByRootMIdAndPagesAndRows(map);
	}
	@SuppressWarnings("unchecked")
	public int selectArticleCountByRootMId(int MId) throws Exception {
		@SuppressWarnings("rawtypes")
		Map map=new HashMap();
		map.put("mFId", MId);
		map.put("aState", 2);
		return articlesMapper.selectCountByRootMId(map);
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<Articles> selectArticleByUpAndDownPiece(int aMId, int aId) throws Exception {
		@SuppressWarnings("rawtypes")
		Map map=new HashMap();
		map.put("aMId", aMId);
		map.put("aId", aId);
		return articlesMapper.selectArticleByUpAndDownPiece(map);
	}
	@Override
	public MergeArticle selectMergeArticleByPrimaryKey(int aId) throws Exception {
		MergeArticle ma=new MergeArticle();
		ma.setArticles(articlesMapper.selectByPrimaryKey(aId));
		ma.setArticleContents(articleContentsMapper.selectByPrimaryKey(aId));
		return ma;
	}
	@SuppressWarnings("unchecked")
	@Override
	public TaotaoResult updateArticleOfHitsByPrimaryKey(Map<Integer, Integer> map) throws Exception {
		@SuppressWarnings("rawtypes")
		Map coll=new HashMap();
		Map<Integer,Integer> down=new HashMap<Integer,Integer>();
		for(Map.Entry<Integer,Integer> m:map.entrySet()){
			coll.put("aId", m.getKey());
			coll.put("sum", m.getValue());
			try {
				articlesMapper.updateArticleOfHtisByPrimaryKey(coll);
			} catch (Exception e) {
				down.put(m.getKey(), m.getValue());
			}
			coll.clear();
		}
		return TaotaoResult.build(200, "点击量刷新完成",down);
	}
}
