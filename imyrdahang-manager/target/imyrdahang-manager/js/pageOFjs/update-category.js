//提交表单
function submitForm(){
	//有效性验证
	var mName=$('#mName').val();
	var mKeyword=$('#mKeyword').val();
	var mDepict=$('#mDepict').val();
	if(mName==""||mName==null){
		$.messager.alert('提示','栏目名称不能为空');
		return ;
	}
	if(mKeyword==""||mKeyword==null){
		$.messager.alert('提示','关键字不能为空');
		return ;
	}
	if(mDepict==""||mDepict==null){
		$.messager.alert('提示','描述不能为空');
		return ;
	}
	$.post("/model/update/yes",$("#columnmodularAddForm").serialize(), function(data){
		if(data.status == 200){
			$.messager.alert('提示','栏目修改成功', "info", function () {
				window.location.href = "/category";
	        });
		}
	});
}
//父栏目设置默认
$(function(){
	$("#mFId").find("option[value='"+mFId+"']").attr("selected",true);
});