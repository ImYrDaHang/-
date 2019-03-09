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
    <div class="col-sm-9 col-sm-offset-3 col-md-10 col-lg-10 col-md-offset-2 main" id="main">
      <h1 class="page-header">修改栏目</h1>
      <form method="post" id="columnmodularAddForm">
        <div class="form-group">
          <label for="category-name">栏目名称</label>
          <input type="text" id="mName" name="mName" value="${model.mName }" class="form-control" placeholder="在此处输入栏目名称" required autocomplete="off">
          <span class="prompt-text"></span> </div>
        <div class="form-group">
          <label for="category-fname">父节点</label>
          <select id="mFId" class="form-control" name="mFId">
            <option value="0">无</option>
            <c:forEach items="${fuModels}" var="models">
                	<option value="${models.mId }"  >${models.mName }</option>
            </c:forEach>
          </select>
          <span class="prompt-text">栏目是有层级关系的，您可以有一个“音乐”分类目录，在这个目录下可以有叫做“流行”和“古典”的子目录。选择无，就是根节点。</span> 
          <span class="prompt-text"><code>若要增加文章的模块，只需在学无止尽下添加子节点即可</code></span> </div>
        <div class="form-group">
          <label for="category-keywords">关键字</label>
          <input type="text" id="mKeyword" name="mKeyword" value="${model.mKeyword }" class="form-control" placeholder="在此处输入栏目关键字" autocomplete="off">
          <span class="prompt-text">关键字会出现在网页的keywords属性中。</span> </div>
        <div class="form-group">
          <label for="category-describe">描述</label>
          <textarea class="form-control" id="mDepict" name="mDepict" rows="4" autocomplete="off">${model.mDepict }</textarea>
            <span class="prompt-text">用于页面的description属性，同样主要为了提高搜索定位到这篇文章的几率</span> </div>
          <input type="hidden" name="mId" value="${model.mId}"/>
        <a href="javascript:void(0)" class="btn btn-primary" onclick="submitForm()">提交修改</a>
      </form>
    </div>
  </div>
</section>
<jsp:include page="./bottom.jsp" />
<script src="/js/bootstrap.min.js"></script> 
<script src="/js/admin-scripts.js"></script>
<script type="text/javascript" charset="utf-8" src="/js/pageOFjs/update-category.js"></script>
<script type="text/javascript">
//mFId用于父栏目设置默认
var mFId=${model.mFId};
/* $(function(){
	var mFId=${model.mFId};
	$("#mFId").find("option[value='"+mFId+"']").attr("selected",true);
}); */
</script>
</body>
</html>
