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
<title>修改收藏链接 - imyrdahang博客管理系统</title>
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
        <li><a href="index">报告</a></li>
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
      <div class="row">
        <form id="friendshipUpdate" method="post" class="add-flink-form" autocomplete="off" draggable="false">
          <div class="col-md-9">
            <h1 class="page-header">修改收藏链接</h1>
            <div class="add-article-box">
              <h2 class="add-article-box-title"><span>名称--必填</span></h2>
              <div class="add-article-box-content">
                <input type="text" id="eName" name="eName" value="${enshrine.eName }" class="form-control" placeholder="在此处输入名称" required autofocus autocomplete="off">
                <span class="prompt-text">例如：某某某的关于什么什么的文章，论文</span> </div>
            </div>
            <div class="add-article-box">
              <h2 class="add-article-box-title"><span>WEB地址--必填</span></h2>
              <div class="add-article-box-content">
                <input type="text" id="eUrl" name="eUrl" value="${enshrine.eUrl }"  class="form-control" placeholder="在此处输入URL地址" required autocomplete="off">
                <span class="prompt-text">例子：<code>www.imyrdahang.com</code>——注意不要忘了前台的那里要在前面加<code>http://</code></span> </div>
            </div>
            <div class="add-article-box">
              <h2 class="add-article-box-title"><span>描述--必填--字数限制<code>105</code>以内字符</span></h2>
              <div class="add-article-box-content">
                <textarea id="eDepict" class="form-control" name="eDepict" autocomplete="off">${enshrine.eDepict }</textarea>
                <span class="prompt-text">用于该连接的简要说明，注意字数限制</span> </div>
            </div>
          </div>
          <div class="col-md-3">
            <h1 class="page-header">操作</h1>
            <div class="add-article-box">
              <h2 class="add-article-box-title"><span>保存</span></h2>
              <div class="add-article-box-content">
                <p><label>标记：</label>
                <input type="radio" name="eState" value="1" ${enshrine.eState==1?"checked":""}/>使用&nbsp;&nbsp;
                <input type="radio" name="eState" value="2" ${enshrine.eState==2?"checked":""}/>放弃&nbsp;&nbsp;
              </div>
              <input type="hidden" name="eId" value="${enshrine.eId }"/>
              <div class="add-article-box-footer">
             	<a href="javascript:void(0)" class="btn btn-primary" onclick="submitFormUpdate()">修改</a>
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
<script type="text/javascript" charset="utf-8" src="/js/pageOFjs/update-flink.js"></script>
</body>
</html>