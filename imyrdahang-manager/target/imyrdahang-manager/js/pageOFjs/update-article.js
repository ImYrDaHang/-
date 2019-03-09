function submitFormUpdate(){
	//有效性验证
	//同步文本框中的文章内容
	itemAddEditor.sync();
	var aTitle=$('#aTitle').val();
	var aCContent=$('#aCContent').val();
	var aCKeyword=$('#aCKeyword').val();
	var aAbstract=$('#aAbstract').val();
	var aCDepict=$('#aCDepict').val();
	if(aTitle==""||aTitle==null){
		$.messager.alert('提示','文章名称不能为空');
		return ;
	}
	if(aCDepict==""||aCDepict==null){
		$.messager.alert('提示','文章内容不能为空');
		return ;
	}
	if(aCKeyword==""||aCKeyword==null){
		$.messager.alert('提示','文章关键字不能为空');
		return ;
	}
	if(aAbstract==""||aAbstract==null){
		$.messager.alert('提示','文章描述不能为空');
		return ;
	}
	if(aCDepict==""||aCDepict==null){
		$.messager.alert('提示','文章description属性描述不能为空');
		return ;
	}
	$.post("/article/update/yes",$("#itemAddForm").serialize(), function(data){
		if(data.status == 200){
			$.messager.alert('提示','文章修改成功', "info", function () {
				window.location.href = "/article";
	        });
		}else if(data.status == 403){
			$.messager.alert('提示',data.msg, "info", function () {
				window.location.href = "/article";
	        });
		}
	});
}