<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html lang="zh-CN">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="renderer" content="webkit">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>imyrdahang博客管理系统统</title>
<link rel="stylesheet" type="text/css" href="/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="/css/style.css">
<link rel="stylesheet" type="text/css" href="/css/login.css">
<link rel="stylesheet" type="text/css" href="/js/jquery-easyui-1.4.1/themes/default/easyui.css" />
<link rel="stylesheet" type="text/css" href="/js/jquery-easyui-1.4.1/themes/icon.css" />
<script type="text/javascript" src="/js/jquery-easyui-1.4.1/jquery.min.js"></script>
<script type="text/javascript" src="/js/jquery-easyui-1.4.1/jquery.easyui.min.js"></script>
<script type="text/javascript" src="/js/jquery-easyui-1.4.1/locale/easyui-lang-zh_CN.js"></script>

</head>

<body class="user-select">
<div class="container">
  <div class="siteIcon"><img src="/images/logo.png" alt="" data-toggle="tooltip" data-placement="top"  draggable="false" /></div>
  <form id="itemAddForm" method="post" autocomplete="off" class="form-signin">
    <h2 class="form-signin-heading">管理员登录</h2><font color="#903"></font>
    <label for="userName" class="sr-only">用户名</label>
    <input type="text" id="userName" name="username" class="form-control" placeholder="请输入用户名" required autofocus autocomplete="off" maxlength="20">
    <label for="userPwd" class="sr-only">密码</label>
    <input type="password" id="userPwd" name="pwd" class="form-control" placeholder="请输入密码" required autocomplete="off" maxlength="16">
    <a href="javascript:void(0)" class="btn btn-lg btn-primary btn-block" onclick="submitFormLogin()">登录</a>
  </form>
  <div class="footer">
    <p><a href="/index" data-toggle="tooltip" data-placement="left" title="不知道自己在哪?">回到后台 →</a></p>
  </div>
  
</div>
<jsp:include page="./bottom.jsp" />
<script src="/js/bootstrap.min.js"></script> 
<script type="text/javascript" charset="utf-8" src="/js/login.js"></script>
</body>
</html>
