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
<title>文章 - imyrdahang博客管理系统</title>
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
       <li   class="active"><a href="/article">文章</a></li>
        <li><a href="/flink">收藏链接</a></li>
        </ul>
      <ul id='actives' class="nav nav-sidebar">
        <li><a href="/category">栏目</a></li>
        <li><a href="/configs">缓存配置</a></li>
      </ul>
    </aside>
    <div class="col-sm-9 col-sm-offset-3 col-md-10 col-lg-10 col-md-offset-2 main" id="main">
      <form action="/Article/checkAll" method="post" >
        <h1 class="page-header">操作</h1>
        <ol class="breadcrumb">
          <li><a href="/article/add">增加文章</a></li>
        </ol>
        <h1 class="page-header">管理 </h1>
        <div class="table-responsive">
          <table class="table table-striped table-hover">
            <thead>
              <tr>
                <th><span class="glyphicon glyphicon-file"></span> <span class="visible-lg">标题</span></th>
                <th><span class="glyphicon glyphicon-list"></span> <span class="visible-lg">所属模块</span></th>
                <th><span class="glyphicon glyphicon-pencil"></span> <span class="visible-lg">编辑人</span></th>
                <th class="hidden-sm"><span class="glyphicon glyphicon-tag"></span> <span class="visible-lg">点击量</span></th>
                <th><span class="glyphicon glyphicon-list"></span> <span class="visible-lg">文章状态</span></th>
                <th><span class="glyphicon glyphicon-time"></span> <span class="visible-lg">发布日期</span></th>
                <th><span class="glyphicon glyphicon-time"></span> <span class="visible-lg">修改日期</span></th>
                <th><span class="glyphicon glyphicon-pencil"></span> <span class="visible-lg">操作</span></th>
              </tr>
            </thead>
            <tbody>
              <c:forEach items="${pagingArticles.date}" var="article">
                <tr>
	              <td class="article-title">${article.aTitle}</td>
	              <td>${article.ext2 }</td>
	              <td>${article.ext1 }</td>
	              <td class="hidden-sm">${article.aHits }</td>
	              <td>${article.aState==1?"公开":article.aState==2?"隐藏":"置顶"}</td>
	              <td><fmt:formatDate value="${article.aCreateDate}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
	              <td><fmt:formatDate value="${article.aUpdateDate}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
	              <td>
		              <a href="javascript:void(0)" onclick="updateFun(${article.aId},${article.aUId},${user.uId},'article')">修改</a> 
		              <a href="javascript:void(0)" onClick="deleteFun(${article.aId},${article.aUId},${user.uId},'article')">删除</a>
	              </td>
	            </tr>
              </c:forEach>
            </tbody>
          </table>
        </div>
        <footer class="message_footer">
          <nav>
           <ul class="pagination pagenav">
            <li class="disabled"><a>共${pagingArticles.pages}页</a></li>
              <li><a href="javascript:void(0)" onclick="toppage(${pagingArticles.page},'article')">上一页</a></li>
              <li class="active"><a>${pagingArticles.page}</a></li>
              <li><a href="javascript:void(0)" onclick="lowpage(${pagingArticles.page},${pagingArticles.pages},'article')">下一页</a></li>
               <li class="disabled"><a>总${pagingArticles.sum }条</a></li>
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
