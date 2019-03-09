<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<title>${mainArticle.articles.aTitle }</title>
<meta name="keywords" content="${mainArticle.articleContents.aCKeyword }" />
<meta name="description" content="${mainArticle.articleContents.aCDepict }" />
<link rel="apple-touch-icon-precomposed" href="/images/favicon.ico">
<link rel="shortcut icon" href="/images/favicon.ico">
<link href="/css/base.css" rel="stylesheet">
<link href="/css/about.css" rel="stylesheet">
<link href="/css/content.css" rel="stylesheet">
<script src="/js/scrollReveal.js"></script>
<script type="text/javascript" src="/js/jquery-1.8.3.js"></script>
<script type="text/javascript" charset="utf-8" src="/js/changyanComment.js"></script>
</head>
<body>
<header>
<%@ include file="topOptions.html" %> 
<article>
  <div class="container">
   
    <div class="about left">

    <ul> 
		<h4 class="atitle"><span><fmt:formatDate value="${mainArticle.articles.aUpdateDate}" pattern="yyyy-MM-dd"/></span>${mainArticle.articles.aTitle}</h4>
		
		<p class="newsnav">您现在的位置是:<a href="/">首页</a>&nbsp;>&nbsp;<a href="/position/${fatherModels.mId }.html">${fatherModels.mName }</a>&nbsp;>&nbsp;<a href="/position/${fatherModels.mId }.html?aMId=${seedModels.mId }">${seedModels.mName }</a>
		<span>阅读量：${mainArticle.articles.aHits}</span><span>作者：${user.uName}</span>
		</p>
		
		${mainArticle.articleContents.aCContent } 
		   
	</ul>
	 
    <div class="infops" id='downInfops'>
	</div>
    <div class="keybq">
    <p><span>关键字词</span>：${mainArticle.articleContents.aCKeyword }</p>    
    </div>
	<div class="nextinfo">
		<p>上一篇：<a href='/content/${UpArticle.aId }.html'>${UpArticle.aTitle}</a></p>
		<p>下一篇：<a href='/content/${DownArticle.aId }.html'>${DownArticle.aTitle }</a></p> 
    </div>
    <div class="otherlink">
      <h2>相关文章</h2>
      <ul>
      	<c:forEach items="${correlationArticles}" var="article">
      		<li><a href="/content/${article.aId }.html" title="${article.aTitle }">${article.aTitle }</a></li>
      	</c:forEach>
      </ul>
    </div>
<!-- 留言板块，引用畅言评论系统 -->
<div class='gbko'>
	<div id="SOHUCS" sid="article${mainArticle.articles.aId }" ></div> 
</div>
</div>

</div>
  </div>
  </aside>
</article>
<footer>
<%@ include file="bottom.html" %>
</footer>
<script type="text/javascript" charset="utf-8" src="/js/content.js"></script>
<script>
	if (!(/msie [6|7|8|9]/i.test(navigator.userAgent))){
		(function(){
			window.scrollReveal = new scrollReveal({reset: true});
		})();
	};
	var aCUrl=${mainArticle.articleContents.aCUrl } ;
	var aCUrlDepict=${mainArticle.articleContents.aCUrlDepict } ;
</script>
</body>
</html>
