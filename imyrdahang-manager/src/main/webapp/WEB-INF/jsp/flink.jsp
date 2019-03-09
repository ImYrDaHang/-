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
<title>收藏链接 - imyrdahang博客管理系统</title>
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
        <li><a href="/index">报告</a></li>
      </ul>
     <ul id='actives' class="nav nav-sidebar">
        <li ><a href="/article">文章</a></li>
        <li  class="active"><a href="/flink">收藏链接</a></li>
        </ul>
      <ul id='actives' class="nav nav-sidebar">
        <li><a href="/category">栏目</a></li>
        <li><a href="/configs">缓存配置</a></li>
      </ul>
    </aside>
    <div class="col-sm-9 col-sm-offset-3 col-md-10 col-lg-10 col-md-offset-2 main" id="main">
      <form action="/Flink/checkAll" method="post" >
        <h1 class="page-header">操作</h1>
        <ol class="breadcrumb">
          <li><a href="/flink/add">增加收藏链接</a></li>
        </ol>
        <h1 class="page-header">管理</h1>
        <div class="table-responsive">
          <table class="table table-striped table-hover">
            <thead>
              <tr>
                <th><span class="glyphicon glyphicon-bookmark"></span> <span class="visible-lg">名称</span></th>
                <th><span class="glyphicon glyphicon-link"></span> <span class="visible-lg">URL</span></th>
                <th><span class="glyphicon glyphicon-pencil"></span> <span class="visible-lg">状态</span></th>
                <th><span class="glyphicon glyphicon-th-large"></span> <span class="visible-lg">用户</span></th>
                <th><span class="glyphicon glyphicon-time"></span> <span class="visible-lg">创建日期</span></th>
                <th><span class="glyphicon glyphicon-time"></span> <span class="visible-lg">修改日期</span></th>
                <th><span class="glyphicon glyphicon-pencil"></span> <span class="visible-lg">操作</span></th>
              </tr>
            </thead>
            <tbody>
              <c:forEach items="${pagingEnshrines.date}" var="enshrine">
               	<tr>
	                <!-- <td><input type="checkbox" class="input-control" name="checkbox[]" value="" /></td> -->
	                <td class="article-title">${enshrine.eName }</td>
	                <td>${enshrine.eUrl }</td>
	                <td>${enshrine.eState==1?"正常":"删除"}</td>
	                <td class="article-title">${enshrine.ext1 }</td>
	                <td><fmt:formatDate value="${enshrine.eCreateDate}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
	                <td><fmt:formatDate value="${enshrine.eUpdateDate}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
	            	<td>
		              <a href="javascript:void(0)" onclick="updateFun(${enshrine.eId},${enshrine.eUId},${user.uId},'flink')">修改</a> 
		              <a href="javascript:void(0)" onClick="deleteFun(${enshrine.eId},${enshrine.eUId},${user.uId},'flink')">删除</a>
	              </td>
	            </tr>
              </c:forEach>
            </tbody>
          </table>
        </div>
        <footer class="message_footer">
          <nav>
            <ul class="pagination pagenav">
            <li class="disabled"><a>共${pagingEnshrines.pages}页</a></li>
              <li><a href="javascript:void(0)" onclick="toppage(${pagingEnshrines.page},'flink')">上一页</a></li>
              <li class="active"><a>${pagingEnshrines.page}</a></li>
              <li><a href="javascript:void(0)" onclick="lowpage(${pagingEnshrines.page},${pagingEnshrines.pages},'flink')">下一页</a></li>
               <li class="disabled"><a>总${pagingEnshrines.sum }条</a></li>
            </ul>
          </nav>
        </footer>
      </form>
    </div>
  </div>
</section>
<jsp:include page="./bottom.jsp" />
<script src="/js/bootstrap.min.js"></script> 
<script src="/js/admin-scripts.js"></script> 
<script type="text/javascript" charset="utf-8" src="/js/common.js"></script>
<script type="text/javascript">
</script>
</body>
</html>
