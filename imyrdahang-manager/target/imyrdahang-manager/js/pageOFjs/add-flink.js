//提交表单
function submitForm(){
	//有效性验证
	var eName=$('#eName').val();
	var eUrl=$('#eUrl').val();
	var eDepict=$('#eDepict').val();
	if(eName==""||eName==null){
		$.messager.alert('提示','链接名称不能为空');
		return ;
	}
	if(eUrl==""||eUrl==null){
		$.messager.alert('提示','链接地址不能为空');
		return ;
	}
	if(eDepict==""||eDepict==null){
		$.messager.alert('提示','链接描述不能为空');
		return ;
	}
	if(eDepict.length>105){
		$.messager.alert('提示','链接描述字数超出限制，现在字数为'+eDepict.length);
		return ;
	}
	$.post("/flink/add/yes",$("#friendship").serialize(), function(data){
		if(data.status == 200){
			$.messager.alert('提示','链接添加成功', "info", function () {
				window.location.href = "/flink";
	        });
		}
	});
}