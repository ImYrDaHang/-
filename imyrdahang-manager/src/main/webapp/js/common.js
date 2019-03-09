//上一页下一页
function toppage(page,url){
	//有效性验证
	if(page<=1){
		return false;
	}
	window.location.href = "/"+url+"?pages="+(page-1);
}
function lowpage(page,pages,url){
	//有效性验证
	if(page>=pages){
		return false;
	}
	window.location.href = "/"+url+"?pages="+(page+1);
}
//修改按钮
function updateFun(aId,auId,uId,url){
	//有效性验证
	if(auId!=uId){
		$.messager.alert('提示','对不起！用户不符，无权修改');
		return false;
	}
	window.location.href = "/"+url+"/update/"+aId;
}
//删除按钮
function deleteFun(aId,auId,uId,url){
	$.messager.confirm("提示", "您确定要删除该条数据吗？", function (data) {
        if (data) {
        	if(auId!=uId){
        		$.messager.alert('提示','对不起！用户不符，无权删除');
        		return false;
        	}
        	$.post("/"+url+"/delete/"+aId,'', function(data){
        		if(data.status == 200){
        			$.messager.alert('提示','删除成功', "info", function () {
        				window.location.reload();
        	        });
        		}else if(data.status == 403){
        			$.messager.alert('提示',data.msg);
        		}
        	});
        }
        else {
            return false;
        }
    });
}