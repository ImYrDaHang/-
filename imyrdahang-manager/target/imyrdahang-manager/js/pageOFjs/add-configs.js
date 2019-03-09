//提交表单
function submitForm(){
	//有效性验证
	var cDepict=$('#cDepict').val();
	var cCode1=$('#cCode1').val();
	var cCode2=$('#cCode2').val();
	if(cDepict==""||cDepict==null){
		$.messager.alert('提示','配置描述不能为空');
		return ;
	}
	if(cCode1==""||cCode1==null){
		$.messager.alert('提示','标识1不能为空');
		return ;
	}
	if(cCode2==""||cCode2==null){
		$.messager.alert('提示','标识2不能为空');
		return ;
	}
	$.post("/configs/add/yes",$("#friendship").serialize(), function(data){
		if(data.status == 200){
			$.messager.alert('提示','配置添加成功', "info", function () {
				window.location.href = "/configs";
	        });
		}
	});
}