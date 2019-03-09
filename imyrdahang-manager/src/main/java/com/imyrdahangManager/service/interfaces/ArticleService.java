package com.imyrdahangManager.service.interfaces;

import java.util.List;

import com.imyrdahang.common.pojo.TaotaoResult;
import com.imyrdahang.pojo.ArticleContents;
import com.imyrdahang.pojo.Articles;
import com.imyrdahang.pojo.MergeArticle;

public interface ArticleService {
	public TaotaoResult saveArticle(ArticleContents articleContent,Articles article)throws Exception;
	public List<Articles> selectArticles(int pages,int rows)throws Exception;
	public int selectArticlesCount()throws Exception;
	public MergeArticle selectMergeArticleByPrimaryKey(int aId)throws Exception;
	public TaotaoResult updateMergeArticleByPrimaryKey(ArticleContents articleContent,Articles article,int uId)throws Exception;
	public TaotaoResult deleteMergeArticleByPrimaryKey(int aId,int uId)throws Exception;
	public int selectArticlesCountByUId(int uId)throws Exception;
}
