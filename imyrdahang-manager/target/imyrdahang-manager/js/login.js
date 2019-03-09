//登陆
$('[data-toggle="tooltip"]').tooltip();
window.oncontextmenu = function(){
	//return false;
};
$('.siteIcon img').click(function(){
	window.location.reload();
});
function submitFormLogin(){
	var username=$('#userName').val();
	var pwd=$('#userPwd').val();
	if(username == ''||username==null){
		$.messager.alert('提示',"请输入账号");
		return;
	}
	if(pwd == ''||pwd==null){
		$.messager.alert('提示',"请输入密码");
		return;
	}
	console.log(username);
	console.log(pwd);
	$.post("/login/go",$("#itemAddForm").serialize(), function(data){
		if(data.status == 200){
			$.messager.alert('提示','登陆成功', "info", function () {
				window.location.href = "/index";
	        });
		}else if(data.status == 500){
			$.messager.alert('提示',data.msg);
		}
	});
}