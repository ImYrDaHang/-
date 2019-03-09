/**分页导航条的变换
 * 参数：
 * page：当前页数
 * pages:总页数
 * sum:总数据条数
 * url:跳转地址		例子：/article?number=		？前面为跳转地址，？后面为跳转页数name，注意加上等号，他会自动在后面加上对应的页数
 * 生成的分页条代码
 * <a title="Total record"><b>${result.pages}</b></a>
 * <b>1</b>
 * <a href="">2</a>
 * <a href="">3</a>
 * <a href="">4</a>
 * <a href="">5</a>
 * <a href="">></a>
 * <a href="">>></a>
 */
$(function(){
		if(pages>=5){
			pagingfunmax5(page,pages,sum,url);
			return;
		}
		pagingfunmin5(page,pages,sum,url);
		
	});
function pagingfunmin5(page, pages, sum, url){
	if(pages==1){
		return;
	} else{
		var htm="<a title='Total record'><b>"+sum+"</b></a>";
		for(var i=1;i<=pages;i++){
			if(i==page){
				htm=htm+"<b>"+i+"</b>";
			}else{
				htm=htm+"<a href='"+url+""+i+"'>"+i+"</a>";
			}
		}
		$('#paging').append(htm);
	}
}
function pagingfunmax5(page, pages, sum, url) {
	if(page==1){
		$('#paging').append(
				"<a title='Total record'><b>"+sum+"</b></a>" +
						"<b>1</b>" +
						"<a href='"+url+"2'>2</a>" +
						"<a href='"+url+"3'>3</a>" +
						"<a href='"+url+"4'>4</a>" +
						"<a href='"+url+"5'>5</a>" +
						"<a href='"+url+"2'>></a>" +
						"<a href='"+url+""+pages+"'>>></a>"
						);
		return;
	}
	if(page==2){
		$('#paging').append(
				"<a title='Total record'><b>"+sum+"</b></a>" +
						"<a href='"+url+"1'><<</a>" +
						"<a href='"+url+"1'><</a>" +
						"<a href='"+url+"1'>1</a>" +
						"<b>2</b>" +
						"<a href='"+url+"3'>3</a>" +
						"<a href='"+url+"4'>4</a>" +
						"<a href='"+url+"5'>5</a>" +
						"<a href='"+url+"3'>></a>" +
						"<a href='"+url+""+pages+"'>>></a>"
						);
		return;
	}
	if(page==(pages-1)){
		$('#paging').append(
				"<a title='Total record'><b>"+sum+"</b></a>" +
						"<a href='"+url+"1'><<</a>" +
						"<a href='"+url+""+(page-1)+"'><</a>" +
						"<a href='"+url+""+(page-3)+"'>"+(page-3)+"</a>" +
						"<a href='"+url+""+(page-2)+"'>"+(page-2)+"</a>" +
						"<a href='"+url+""+(page-1)+"'>"+(page-1)+"</a>" +
						"<b>"+page+"</b>" +
						"<a href='"+url+""+pages+"'>"+pages+"</a>" +
						"<a href='"+url+""+pages+"'>></a>" +
						"<a href='"+url+""+pages+"'>>></a>"
						);
		return;
	}
	if(page==pages){
		$('#paging').append(
				"<a title='Total record'><b>"+sum+"</b></a>" +
				"<a href='"+url+"1'><<</a>" +
				"<a href='"+url+""+(page-1)+"'><</a>" +
				"<a href='"+url+""+(page-4)+"'>"+(pages-4)+"</a>" +
				"<a href='"+url+""+(page-3)+"'>"+(pages-3)+"</a>" +
				"<a href='"+url+""+(page-2)+"'>"+(pages-2)+"</a>" +
				"<a href='"+url+""+(page-1)+"'>"+(pages-1)+"</a>" +
				"<b>"+page+"</b>"
				);
		return;
	}
	$('#paging').append(
			"<a title='Total record'><b>"+sum+"</b></a>" +
					"<a href='"+url+"1'><<</a>" +
					"<a href='"+url+""+(page-1)+"'><</a>" +
					"<a href='"+url+""+(page-2)+"'>"+(page-2)+"</a>" +
					"<a href='"+url+""+(page-1)+"'>"+(page-1)+"</a>" +
					"<b>"+page+"</b>" +
					"<a href='"+url+""+(page+1)+"'>"+(page+1)+"</a>" +
					"<a href='"+url+""+(page+2)+"'>"+(page+2)+"</a>" +
					"<a href='"+url+""+(page+1)+"'>></a>" +
					"<a href='"+url+""+pages+"'>>></a>"
					);
}