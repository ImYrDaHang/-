<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
<title>王大行个人博客 - 初入IT之路的草根</title>
<meta name="keywords" content="${modelData.mKeyword }" />
<meta name="description" content="${modelData.mDepict }" />
<link rel="apple-touch-icon-precomposed" href="/images/favicon.ico">
<link rel="shortcut icon" href="/images/favicon.ico">
<link href="/css/base.css" rel="stylesheet">
<link href="/css/about.css" rel="stylesheet">
<script src="/js/scrollReveal.js"></script>
<script type="text/javascript" charset="utf-8" src="/js/baiduInfo.js"></script>
</head>
<body>
<%@ include file="topOptions.html" %> 
<article>
  <div class="container">
    <div class="banner">
      <p data-scroll-reveal="enter top over 2s">${aboutBanner.cData1 }</p>
      <p data-scroll-reveal="enter left over 2s after 1s">${aboutBanner.cData2 }</p>
      <p data-scroll-reveal="enter bottom over 2s after 2s">${aboutBanner.cData3 }</p>
     </div>
    <div class="memorial_day">
      <div class="time_axis"></div>
      <ul>
        <li class="n1"><a href="${aboutTime[0].cData3 }">${aboutTime[0].cData2 }</a>
          <div class="dateview">${aboutTime[0].cData1 }</div>
        </li>
        <li class="n2"><a href="${aboutTime[1].cData3 }">${aboutTime[1].cData2 }</a>
          <div class="dateview">${aboutTime[1].cData1 }</div>
        </li>
        <li class="n3"><a href="${aboutTime[2].cData3 }">${aboutTime[2].cData2 }</a>
          <div class="dateview">${aboutTime[2].cData1 }</div>
        </li>
        <li class="n4"><a href="${aboutTime[3].cData3 }">${aboutTime[3].cData2 }</a>
          <div class="dateview">${aboutTime[3].cData1 }</div>
        </li>
        <li class="n5"><a href="${aboutTime[4].cData3 }">${aboutTime[4].cData2 }</a>
          <div class="dateview">${aboutTime[4].cData1 }</div>
        </li>
        
      </ul>
    </div>
    <div class="about left">
  <h2>Just about me</h2>
    <ul> 
     ${about.cData1 }
    </ul>
    <h2>About my blog</h2>
    <p>${aboutState.cData1 } </p>
    <p>${aboutState.cData2 }<a href="${aboutState.cData3 }" target="_blank" class="blog_link">购买空间</a></p>

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
