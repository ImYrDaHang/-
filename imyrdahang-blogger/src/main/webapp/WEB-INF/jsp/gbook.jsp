<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
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
<link href="/css/book.css" rel="stylesheet">
<script src="/js/scrollReveal.js"></script>
<script type="text/javascript" charset="utf-8" src="/js/baiduInfo.js"></script>
<script type="text/javascript" charset="utf-8" src="/js/changyanComment.js"></script>
</head>
<body>
<%@ include file="topOptions.html" %> 
<article>
  <div class="container">
    <h2 class="ctitle"><b>留言板</b> <span>${learnCtitle.cData1 }</span></h2>
    <div class="gbook">
      <div class="about">
        <div id="fountainG">
          <li></li>
          <li></li>
          <li></li>
          <li></li>
          <li></li>
          <li></li>
          <li></li>
          <li></li>
        </div>
        <div class="about_girl"><span><a href="/"><img src="${learnCtitle.cData2 }"></a></span>
          <p>${learnCtitle.cData3 }</p>
        </div>
        <!-- 留言板块，引用畅言评论系统 -->
        <div class='gbko'>
        	<div id="SOHUCS" sid="imyrdahangComment" ></div>   
        </div>
      </div>
    </div>
  </div>
  </aside>
</article>
<footer> 
<%@ include file="bottom.html" %>
 </footer>
<script>
	if (!(/msie [6|7|8|9]/i.test(navigator.userAgent))){
		(function(){
			window.scrollReveal = new scrollReveal({reset: true});
		})();
	};
</script>
</body>
</html>
