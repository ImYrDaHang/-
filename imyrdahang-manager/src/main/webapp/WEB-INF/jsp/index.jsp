<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="zh-CN">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="renderer" content="webkit">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>imyrdahang博客管理系统</title>
<link rel="stylesheet" type="text/css" href="/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="/css/style.css">
<link rel="stylesheet" type="text/css" href="/css/font-awesome.min.css">
<link rel="stylesheet" type="text/css" href="/js/jquery-easyui-1.4.1/themes/default/easyui.css" />
<link rel="stylesheet" type="text/css" href="/js/jquery-easyui-1.4.1/themes/icon.css" />
<script type="text/javascript" src="/js/jquery-easyui-1.4.1/jquery.min.js"></script>
<script type="text/javascript" src="/js/jquery-easyui-1.4.1/jquery.easyui.min.js"></script>
<script type="text/javascript" src="/js/jquery-easyui-1.4.1/locale/easyui-lang-zh_CN.js"></script>
</head>
<body class="user-select">
<section class="container-fluid">
<jsp:include page="./top.jsp" />
  <div class="row">
    <aside class="col-sm-3 col-md-2 col-lg-2 sidebar">
      <ul class="nav nav-sidebar">
        <li class="active"><a href="/index">报告</a></li>
      </ul>
     <ul id='actives' class="nav nav-sidebar">
        <li ><a href="/article">文章</a></li>
        <li><a href="/flink">收藏链接</a></li>
        </ul>
      <ul id='actives' class="nav nav-sidebar">
        <li><a href="/category">栏目</a></li>
        <li><a href="/configs">缓存配置</a></li>
      </ul>
    </aside>
    <div class="col-sm-9 col-sm-offset-3 col-md-10 col-lg-10 col-md-offset-2 main" id="main">
      <h1 class="page-header">信息总览</h1>
      <div class="row placeholders">
        <div class="col-xs-6 col-sm-3 placeholder">
          <h4>文章</h4>
          <span class="text-muted">${articls } 条</span> </div>
        <div class="col-xs-6 col-sm-3 placeholder">
          <h4>链接</h4>
          <span class="text-muted">${flinks } 条</span> </div>
      </div>
      <!-- 以下为网站信息，看自己需求加 -->
      <h1 class="page-header">状态</h1>
      <div class="table-responsive">
        <table class="table table-striped table-hover">
          <tbody>
            <tr>
              <td>登录者: <span>${user.uName }</span>
            </tr>
            <tr>
              <td>上次登录时间: <fmt:formatDate value="${user.loginDate}" pattern="yyyy-MM-dd HH:mm:ss"/> , 上次登录IP: ${user.loginIp }</td>
            </tr>
          </tbody>
        </table>
      </div> 
      <div class="table-responsive">
          <table class="table table-striped table-hover">
            <thead>
              <tr>
                <th><span class="glyphicon glyphicon-file"></span> <span class="visible-lg">用户名</span></th>
                <th><span class="glyphicon glyphicon-list"></span> <span class="visible-lg">所属文章数</span></th>
                <th><span class="glyphicon glyphicon-pencil"></span> <span class="visible-lg">所属链接数</span></th>
                <th><span class="glyphicon glyphicon-list"></span> <span class="visible-lg">最近登陆时间</span></th>
                <th><span class="glyphicon glyphicon-time"></span> <span class="visible-lg">最近登陆IP</span></th>
              </tr>
            </thead>
            <tbody>
              <c:forEach items="${users}" var="infoUser">
                <tr>
	              <td class="article-title">${infoUser.uName}</td>
	              <td>${infoUser.ext1 }</td>
	              <td>${infoUser.ext2 }</td>
	              <td><fmt:formatDate value="${infoUser.loginDate}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
	              <td class="hidden-sm">${infoUser.loginIp }</td>
	            </tr>
              </c:forEach>
            </tbody>
          </table>
        </div>
    </div>
  </div>
 
</section>
<jsp:include page="./bottom.jsp" />
<script src="/js/bootstrap.min.js"></script> 
<script src="/js/admin-scripts.js"></script>
<script>
function jsonpFun(){
	alert("jsonp跨域请求开始");
	$.ajax({
		url : "http://localhost:8080/jsonp/go.do",
		dataType : "jsonp",
		type : "GET",
		success : function(data){
			alert("11");
			if(data.status == 200){
				alert(data.msg);
				alert("跨域请求成功");
			}else{
				alert("请求失败");
			}
		}
	});
}
</script>
</body>
</html>
