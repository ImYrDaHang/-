<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html lang="zh-CN">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="renderer" content="webkit">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>增加缓存配置 - imyrdahang博客管理系统</title>
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
        <li><a href="/category">栏目</a></li>
        <li  class="active"><a href="/configs">缓存配置</a></li>
      </ul>
    </aside>
    <div class="col-sm-9 col-sm-offset-3 col-md-10 col-lg-10 col-md-offset-2 main" id="main">
      <div class="row">
        <form id="friendship" method="post" class="add-flink-form" autocomplete="off" draggable="false">
          <div class="col-md-9">
            <h1 class="page-header">增加缓存配置</h1>
            
            <div class="add-article-box">
              <h2 class="add-article-box-title"><span>描述</span></h2>
              <div class="add-article-box-content">
                <textarea id="cDepict" class="form-control" name="cDepict" autocomplete="off"></textarea>
                <span class="prompt-text">对于该配置数据的使用说明，比如配置数据1是用于前台。。。</span> </div>
            </div>
            <div class="add-article-box">
              <h2 class="add-article-box-title"><span>标识1</span></h2>
              <div class="add-article-box-content">
                <input type="text" id="cCode1" name="cCode1" class="form-control" placeholder="在此处输入名称" required autofocus autocomplete="off">
                <span class="prompt-text"></span> </div>
            </div>
            <div class="add-article-box">
              <h2 class="add-article-box-title"><span>标识2</span></h2>
              <div class="add-article-box-content">
                <input type="text" id="cCode2" name="cCode2" class="form-control" placeholder="在此处输入名称" required autofocus autocomplete="off">
                <span class="prompt-text"></span> </div>
            </div>
            <div class="add-article-box">
              <h2 class="add-article-box-title"><span>配置数据1</span></h2>
              <div class="add-article-box-content">
                <textarea id="cData1" class="form-control" name="cData1" autocomplete="off"></textarea>
                </div>
            </div>
            <div class="add-article-box">
              <h2 class="add-article-box-title"><span>配置数据2</span></h2>
              <div class="add-article-box-content">
                <textarea id="cData2" class="form-control" name="cData2" autocomplete="off"></textarea>
                </div>
            </div> <div class="add-article-box">
              <h2 class="add-article-box-title"><span>配置数据3</span></h2>
              <div class="add-article-box-content">
                <textarea id="cData3" class="form-control" name="cData3" autocomplete="off"></textarea>
                </div>
            </div> <div class="add-article-box">
              <h2 class="add-article-box-title"><span>配置数据4</span></h2>
              <div class="add-article-box-content">
                <textarea id="cData4" class="form-control" name="cData4" autocomplete="off"></textarea>
                </div>
            </div> <div class="add-article-box">
              <h2 class="add-article-box-title"><span>配置数据5</span></h2>
              <div class="add-article-box-content">
                <textarea id="cData5" class="form-control" name="cData5" autocomplete="off"></textarea>
                </div>
            </div>
            
          </div>
          <div class="col-md-3">
            <h1 class="page-header">操作</h1>
            <div class="add-article-box">
              <h2 class="add-article-box-title"><span>保存</span></h2>
              <div class="add-article-box-content">
                <p><label>标记：</label><input type="radio" name="cState" value="1" checked />使用&nbsp;&nbsp;<input type="radio" name="cState" value="2" />放弃&nbsp;&nbsp;
              </div>
              <div class="add-article-box-footer">
             	<a href="javascript:void(0)" class="btn btn-primary" onclick="submitForm()">增加</a>
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
<script type="text/javascript" charset="utf-8" src="/js/pageOFjs/add-configs.js"></script>
</body>
</html>