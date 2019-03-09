package com.imyrdahangManager.service.impl;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.imyrdahang.common.pojo.TaotaoResult;
import com.imyrdahang.dao.ArticleContentsMapper;
import com.imyrdahang.dao.ArticlesMapper;
import com.imyrdahang.pojo.ArticleContents;
import com.imyrdahang.pojo.Articles;
import com.imyrdahang.pojo.ArticlesExample;
import com.imyrdahang.pojo.ArticlesExample.Criteria;
import com.imyrdahang.pojo.MergeArticle;
import com.imyrdahangManager.service.interfaces.ArticleService;
@Service
public class ArticleServiceImpl implements ArticleService {
	@Value("${SELECT_ARTICLES_SORT_TERM}")
	private String SELECT_ARTICLES_SORT_TERM;
	@Autowired
	private ArticlesMapper articleMapper;
	@Autowired
	private ArticleContentsMapper articleContentsMapper;
	//添加文章
	@Override
	public TaotaoResult saveArticle(ArticleContents articleContent,Articles article) throws Exception {
		//信息补全
		Date date=new Date();
		article.setaCreateDate(date);
		article.setaUpdateDate(date);
		article.setaHits(0);
		//若为置顶的话，取消以前置顶的
		if(article.getaState()==3){
			Articles articles = new Articles();
			articles.setaState(1);
			ArticlesExample example = new ArticlesExample();
			example.createCriteria().andAStateEqualTo(3);
			articleMapper.updateByExampleSelective(articles, example);
		}
		articleMapper.insert(article);
		Integer aId = article.getaId();
		articleContent.setaCId(aId);
		articleContentsMapper.insertSelective(articleContent);
		return TaotaoResult.build(200, String.valueOf(aId));
	}
	//分页查询文章
	@SuppressWarnings("unchecked")
	@Override
	public List<Articles> selectArticles(int pages,int rows) throws Exception {
		@SuppressWarnings("rawtypes")
		Map map=new HashMap();
		map.put("pages", (pages-1)*rows);
		map.put("rows",rows);
		//排序字段，根据那个字段是升还是倒序
		map.put("fieldAndSort", SELECT_ARTICLES_SORT_TERM+" desc");
		return articleMapper.selectByPagesAndRows(map);
	}
	//查询文章总数
	@Override
	public int selectArticlesCount() throws Exception {
		return articleMapper.countByExample(new ArticlesExample());
	}
	//根据ID查文章和文章内容
	@Override
	public MergeArticle selectMergeArticleByPrimaryKey(int aId) throws Exception {
		MergeArticle ma=new MergeArticle();
		ma.setArticles(articleMapper.selectByPrimaryKey(aId));
		ma.setArticleContents(articleContentsMapper.selectByPrimaryKey(aId));
		return ma;
	}
	//修改文章，并作权限认证
	@Override
	public TaotaoResult updateMergeArticleByPrimaryKey(ArticleContents articleContent, Articles article, int uId)
			throws Exception {
		Articles articles = articleMapper.selectByPrimaryKey(article.getaId());
		if(articles.getaUId()!=uId) return TaotaoResult.build(403, "对不起！您没有该文章的修改权限");
		article.setaUpdateDate(new Date());
		articleContent.setaCId(article.getaId());
		//若为置顶的话，置顶最多为三条，自动去掉最早置顶的
		if(article.getaState()==3){
			ArticlesExample example = new ArticlesExample();
			Criteria criteria = example.createCriteria();
			criteria.andAStateEqualTo(3);
			List<Articles> listState3 = articleMapper.selectByExample(example);
			if(listState3.size()>=3){
				Articles updateDateArticles=new Articles();
				updateDateArticles.setaId(listState3.get(0).getaId());
				updateDateArticles.setaUpdateDate(listState3.get(0).getaUpdateDate());
				updateDateArticles.setaState(1);
				for(Articles a:listState3){
					if(updateDateArticles.getaUpdateDate().after(a.getaUpdateDate())){
						updateDateArticles.setaId(a.getaId());
						updateDateArticles.setaUpdateDate(a.getaUpdateDate());
					}
				}
				articleMapper.updateByPrimaryKeySelective(updateDateArticles);
			}
			Articles a = new Articles();
			a.setaState(1);
		}
		articleMapper.updateByPrimaryKeySelective(article);
		articleContentsMapper.updateByPrimaryKeySelective(articleContent);
		return TaotaoResult.ok();
	}
	//删除文章
	@Override
	public TaotaoResult deleteMergeArticleByPrimaryKey(int aId, int uId) throws Exception {
		Articles articles = articleMapper.selectByPrimaryKey(aId);
		if(articles.getaUId()!=uId) return TaotaoResult.build(403, "对不起！您没有该文章的删除权限");
		articleMapper.deleteByPrimaryKey(aId);
		articleContentsMapper.deleteByPrimaryKey(aId);
		return TaotaoResult.ok();
	}
	//根据用户ID查询该用户下的文章数
	@Override
	public int selectArticlesCountByUId(int uId) throws Exception {
		ArticlesExample example=new ArticlesExample();
		Criteria criteria = example.createCriteria();
		criteria.andAUIdEqualTo(uId);
		return articleMapper.countByExample(example);
	}

}
