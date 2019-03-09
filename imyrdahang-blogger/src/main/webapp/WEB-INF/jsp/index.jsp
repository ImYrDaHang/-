<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<title>王大行个人博客 - 初入IT之路的草根</title>
<meta name="keywords" content="${modelData.mKeyword }" />
<meta name="description" content="${modelData.mDepict }" />
<link rel="apple-touch-icon-precomposed" href="/images/favicon.ico">
<link rel="shortcut icon" href="/images/favicon.ico">
<link href="/css/base.css" rel="stylesheet">
<link href="/css/index.css" rel="stylesheet">
<link rel="shortcut icon" href="/images/favicon.ico">
<script src="/js/scrollReveal.js"></script>
<script type="text/javascript" charset="utf-8" src="/js/baiduInfo.js"></script>
</head>
<body>
<%@ include file="topOptions.html" %> 
<!-- 导入html乱码的问题 -->
<!-- 在html顶头加上下面这一行，那么服务器在合并的时候就会把这个html以utf8的格式来解析  -->
<%-- <%@ page language="java" pageEncoding="utf-8"%> --%> 
<article>
  <div class="container">
    <div class="blog" data-scroll-reveal="enter top" >
    <c:forEach items="${recommendArticles}" var="article">
      <figure>
        <ul>
          <a href="/content/${article.aId }.html"  target="_blank" title="${article.aTitle}"><img src="${article.aChart}"><span>查看详情</span></a>
        </ul>
        <p><a href="/content/${article.aId }.html">${article.aTitle}</a></p>
        <figcaption>${article.aAbstract}</figcaption>
      </figure>
    </c:forEach>
    </div>
   <ul class="cbp_tmtimeline">
		<c:forEach items="${timerArticles}" var="article">
		<li>
			<time class="cbp_tmtime">
				<span><fmt:formatDate value="${article.aUpdateDate}" pattern="MM-dd"/></span> 
				<span><fmt:formatDate value="${article.aUpdateDate}" pattern="yyyy"/></span>
			</time>
			<div class="cbp_tmicon"></div>
			<div class="cbp_tmlabel" data-scroll-reveal="enter right over 1s" >
				<h2>${article.aTitle}</h2>
				 <p><span class="blogpic"><a href="/content/${article.aId }.html" target="_blank" title="${article.aTitle}"><img src="${article.aChart}"></a></span>
				 	<c:if test="${fn:length(article.aAbstract)>'105'}">
						${fn:substring(article.aAbstract,0,105)}...
					</c:if>
					<c:if test="${fn:length(article.aAbstract)<='105'}">
						${article.aAbstract}
					</c:if>
				 </p>
	             <a href="/content/${article.aId }.html" target="_blank" class="readmore">阅读全文&gt;&gt;</a>
			<div class="myDateview"><span>作者：${article.ext1}</span><span>文章类型：[<a href="/seed/model/page/${article.aMId }.html">${article.ext2}</a>]</span><span>阅读量：${article.aHits}</span></div>
			</div>
		</li>
		</c:forEach>
  </ul>
  </div>
</article>
<footer>
<%@ include file="bottom.html" %>
</footer>
<script>
	//页面滚动显示动画
	if (!(/msie [6|7|8|9]/i.test(navigator.userAgent))){
		(function(){
			window.scrollReveal = new scrollReveal({reset: true});
		})();
	};
	
</script> 
</body>
</html>
