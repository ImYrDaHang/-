<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html lang="zh-CN">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="renderer" content="webkit">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>写文章 - imyrdahang博客管理系统</title>
<link rel="stylesheet" type="text/css" href="/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="/css/style.css">
<link rel="stylesheet" type="text/css" href="/css/font-awesome.min.css">
<link rel="stylesheet" type="text/css" href="/js/jquery-easyui-1.4.1/themes/default/easyui.css" />
<link rel="stylesheet" type="text/css" href="/js/jquery-easyui-1.4.1/themes/icon.css" />
<script type="text/javascript" src="/js/jquery-easyui-1.4.1/jquery.min.js"></script>
<script type="text/javascript" src="/js/jquery-easyui-1.4.1/jquery.easyui.min.js"></script>
<script type="text/javascript" src="/js/jquery-easyui-1.4.1/locale/easyui-lang-zh_CN.js"></script>
<link href="/js/kindeditor-4.1.10/themes/default/default.css" type="text/css" rel="stylesheet">
<script type="text/javascript" charset="utf-8" src="/js/kindeditor-4.1.10/kindeditor-all-min.js"></script>
<script type="text/javascript" charset="utf-8" src="/js/kindeditor-4.1.10/lang/zh_CN.js"></script>

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
        <li  class="active" ><a href="/article">文章</a></li>
        <li><a href="/flink">收藏链接</a></li>
        </ul>
      <ul id='actives' class="nav nav-sidebar">
        <li><a href="/category">栏目</a></li>
        <li><a href="/configs">缓存配置</a></li>
      </ul>
    </aside>
    <!-- 添加博文的，主要加个富文本，加taotao里面的那个 -->
    <div class="col-sm-9 col-sm-offset-3 col-md-10 col-lg-10 col-md-offset-2 main" id="main">
      <div class="row">
        <form id="itemAddForm" method="post" class="add-article-form" autocomplete="off" draggable="false">
          <div class="col-md-9">
            <h1 class="page-header">撰写新文章</h1>
            <div class="form-group">
              <label for="article-title" class="sr-only">标题</label>
              <input type="text" id="aTitle" name="aTitle" class="form-control" placeholder="在此处输入标题" required autofocus autocomplete="off">
            </div>
            <div class="form-group" id="itemAddForm">
            	<h2 class="add-article-box-title"><span>文章内容--必填</span></h2>
            	<textarea id="aCContent" style="width:800px;height:300px;visibility:hidden;" name="aCContent"></textarea>
            </div>
            <div class="add-article-box">
              <h2 class="add-article-box-title"><span>关键字Keyword--必填</span></h2>
              <div class="add-article-box-content">
              	<input id='aCKeyword' type="text" class="form-control" placeholder="请输入关键字" name="aCKeyword" autocomplete="off">
                <span class="prompt-text">多个标签请用英文逗号,隔开。用于Keyword属性，主要为了提高搜索定位到这篇文章的几率</span>
              </div>
            </div>
            <div class="add-article-box">
              <h2 class="add-article-box-title"><span>描述description--必填</span></h2>
              <div class="add-article-box-content">
              	<input id='aCDepict' type="text" class="form-control" placeholder="请输入关键字" name="aCDepict" autocomplete="off">
                <span class="prompt-text">用于页面的description属性，同样主要为了提高搜索定位到这篇文章的几率</span>
              </div>
            </div>
            <div class="add-article-box">
              <h2 class="add-article-box-title"><span>描述--必填</span></h2>
              <div class="add-article-box-content">
              	<textarea id="aAbstract" class="form-control" name="aAbstract" autocomplete="off"></textarea>
                <span class="prompt-text">用于页面展示，给游客提供该文章的简略描述</span>
              </div>
            </div>
            <div class="add-article-box">
              <h2 class="add-article-box-title"><span>资料下载URL--可选</span></h2>
              <div class="add-article-box-content">
              	<input id='aCUrl' type="text" class="form-control" placeholder="请输入URL" name="aCUrl" autocomplete="off">
                <span class="prompt-text">提供该文章的附件的下载，一般用百度云盘连接或微云，其他的即可</span>
              </div>
            </div>
            <div class="add-article-box">
              <h2 class="add-article-box-title"><span>资料下载URL描述信息--可选</span></h2>
              <div class="add-article-box-content">
              	<textarea id="aCUrlDepict" class="form-control" name="aCUrlDepict" autocomplete="off"></textarea>
                <span class="prompt-text">用于对下载URL的使用说明</span>
              </div>
            </div>
          </div>
          <div class="col-md-3">
            <h1 class="page-header">操作</h1>
            <div class="add-article-box">
              <h2 class="add-article-box-title"><span>所属模块</span></h2>
              <div class="add-article-box-content">
                <ul class="category-list">
              <c:forEach items="${models}" var="model">
               	<li>
                    <label>
                      <input name="aMId" type="radio" value="${model.mId}" checked>
                      ${model.mName }<em class="hidden-md">( 所属栏目: <span>${model.ext1 }</span> )</em> </label>
                  </li>
              </c:forEach>
                </ul>
              </div>
            </div>
            <!-- 美化展示图片 -->
            <div class="add-article-box">
              <h2 class="add-article-box-title"><span>标题图片</span></h2>
              <div class="add-article-box-content">
                <!-- <input id="b_chart" type="text" class="form-control" placeholder="输入图片地址" name="bChart"> -->
              	<a href="javascript:void(0)" class="easyui-linkbutton picFileUpload">上传图片</a>
	            <input id="aChart" type="hidden" name="aChart"/>
              	<span class="prompt-text">作为美化展示的图片,上传一张即可</span> </div>
              </div>
              <div class="add-article-box">
              <h2 class="add-article-box-title"><span>文章状态</span></h2>
              <div class="add-article-box-content">
                <p><input type="radio" name="aState" value="1" checked/>正常 <input type="radio" name="aState" value="2" />删除 <input type="radio" name="aState" value="3" />置顶</p>
              	<span class="prompt-text">删除状态时，前台将不展示该文章。置顶是指将该文章放到首页的第一条，置顶文章后，以前置顶的文章会自动设置为正常状态</span> 
              	</div>
              </div>
              <div class="add-article-box-footer">
             	<a href="javascript:void(0)" class="btn btn-primary" onclick="submitFormUpdate()">发布</a>
              </div>
            </div>
            </div>
          </div>
        </form>
      </div>
    </div>
  </div>
</section>
<jsp:include page="./bottom.jsp" />
<script src="/js/bootstrap.min.js"></script> 
<script src="/js/admin-scripts.js"></script>
<script id="uploadEditor" type="text/plain" style="display:none;"></script>
<script type="text/javascript" charset="utf-8" src="/js/article-text-image.js"></script>
<script type="text/javascript" charset="utf-8" src="/js/pageOFjs/add-article.js"></script>
</body>
</html>
