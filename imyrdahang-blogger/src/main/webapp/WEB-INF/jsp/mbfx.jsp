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
<link href="/css/share.css" rel="stylesheet">
<script src="/js/scrollReveal.js"></script>
<script type="text/javascript" src="/js/jquery-1.8.3.js"></script>
<script type="text/javascript" charset="utf-8" src="/js/baiduInfo.js"></script>
</head>
<body>
<%@ include file="topOptions.html" %> 
<article>
  <div class="container">
    <h2 class="ctitle"><b>我的收藏</b> <span>${manshenghuoCtitle.cData1 }</span></h2>
    <!-- <div class="blog" data-scroll-reveal="enter top" > -->
    <ul class="cbp_tmtimeline">      
    <c:forEach items="${pageResult.date}" var="enshrine">
    <li>
       <time class="cbp_tmtime">
        <span><fmt:formatDate value="${enshrine.eUpdateDate}" pattern="MM-dd"/></span> 
        <span><fmt:formatDate value="${enshrine.eUpdateDate}" pattern="yyyy"/></span>
       </time>
       <div class="cbp_tmicon"></div>
       <div class="cbp_tmlabel" data-scroll-reveal="enter right over 1s" >
         <h2>${enshrine.eName}</h2>
      		  ${enshrine.eDepict}
         </p>
         <a href="${enshrine.eUrl}" target="_blank" class="readmore">传送阵&gt;&gt;</a> 
         <div class="myDateview"><span>收藏者：${enshrine.ext1}</span></div>
         </div>
     </li> 
     </c:forEach>
      </ul>
    <!-- 分页 -->
    <div class="page" id="paging"></div>
    </div>
  </aside>
</article>
<footer>
 <%@ include file="bottom.html" %>
 </footer>
 <script type="text/javascript" charset="utf-8" src="/js/page.js"></script>
 <script>
	if (!(/msie [6|7|8|9]/i.test(navigator.userAgent))){
		(function(){
			window.scrollReveal = new scrollReveal({reset: true});
		})();
	};
	var page=${pageResult.page};
	var pages=${pageResult.pages};
	var sum=${pageResult.sum};
	var url="/mbfx.html?pages=";
</script>
</body>
</html>
