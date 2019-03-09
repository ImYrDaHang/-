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
<title>栏目 - imyrdahang博客管理系统</title>
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
        <li><a href="/flink">收藏链接</a></li>
        </ul>
      <ul id='actives' class="nav nav-sidebar">
        <li  class="active"><a href="/category">栏目</a></li>
        <li><a href="/configs">缓存配置</a></li>
      </ul>
    </aside>
    <!-- 栏目管理 -->
    <div class="col-sm-9 col-sm-offset-3 col-md-10 col-lg-10 col-md-offset-2 main" id="main">
      <div class="row">
		<div class="col-md-5">
          <h1 class="page-header">添加</h1>
          <form method="post" id="columnmodularAddForm">
            <div class="form-group">
              <label for="category-name">栏目名称</label>
              <input type="text" id="mName" name="mName" class="form-control" placeholder="在此处输入栏目名称" required autocomplete="off">
              <span class="prompt-text"></span> </div>
            <div class="form-group">
              <label for="category-fname">父节点</label>
              <select id="mFId" class="form-control" name="mFId">
                <option value="0" selected>无</option>
                <c:forEach items="${optionModels}" var="optionModel">
                	<option value="${optionModel.mId}">${optionModel.mName}</option>
                </c:forEach>
                <!-- <option value="1">前端技术</option> -->
              </select>
              <span class="prompt-text">栏目是有层级关系的，您可以有一个“音乐”分类目录，在这个目录下可以有叫做“流行”和“古典”的子目录。选择无，就是根节点。</span> 
              <span class="prompt-text"><code>若要增加文章的模块，只需在学无止尽下添加子节点即可</code></span>
              </div>
            <div class="form-group">
              <label for="category-keywords">关键字</label>
              <input type="text" id="mKeyword" name="mKeyword" class="form-control" placeholder="在此处输入栏目关键字,多个逗号隔开" autocomplete="off">
              <span class="prompt-text">关键字会出现在网页的keywords属性中。</span> </div>
            <div class="form-group">
              <label for="category-describe">描述</label>
              <textarea class="form-control" id="mDepict" name="mDepict" rows="4" autocomplete="off"></textarea>
              <span class="prompt-text">用于页面的description属性，同样主要为了提高搜索定位到这篇文章的几率</span> </div>
           </form>
           <a href="javascript:void(0)" class="btn btn-primary" onclick="submitForm()">添加</a>
	    	<a href="javascript:void(0)" class="btn btn-primary" onclick="clearForm()">重置</a> 
        </div>
        <div class="col-md-7">
          <h1 class="page-header">管理 </h1>
          <div class="table-responsive">
            <table class="table table-striped table-hover">
              <thead>
                <tr>
                  <th><span class="glyphicon glyphicon-paperclip"></span> <span class="visible-lg">ID</span></th>
                  <th><span class="glyphicon glyphicon-file"></span> <span class="visible-lg">名称</span></th>
                  <th><span class="glyphicon glyphicon-list-alt"></span> <span class="visible-lg">所属栏目ID</span></th>
                  <th><span class="glyphicon glyphicon-pushpin"></span> <span class="visible-lg">其下文章数</span></th>
                  <th><span class="glyphicon glyphicon-pencil"></span> <span class="visible-lg">操作</span></th>
                  <th><span class="glyphicon glyphicon-pushpin"></span> <span class="visible-lg">创建时间</span></th>
                </tr>
              </thead>
              <tbody>
               <c:forEach items="${models}" var="model">
               <tr>
                  <td>${model.mId }</td>
                  <td>${model.mName }</td>
                  <td>${model.mFId==0? "根栏目":model.mFId} </td>
                  <td>${model.mASum==null?"0":model.mASum}</td>
                  <td><a href="/model/update/${model.mId}">修改</a> <a rel="1">删除</a></td>
                  <td><fmt:formatDate value="${model.mCreateDate}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
                </tr>
                </c:forEach>
              </tbody>
            </table>
            <span class="prompt-text"><strong>注：</strong>删除功能暂时没有，防止失误，需要的话去数据库手动删!</span> </div>
        </div>
      </div>
    </div>
  </div>
</section>
<jsp:include page="./bottom.jsp" />
<script src="js/bootstrap.min.js"></script> 
<script src="js/admin-scripts.js"></script> 
<script type="text/javascript" charset="utf-8" src="/js/pageOFjs/category.js"></script>
</body>
</html>
