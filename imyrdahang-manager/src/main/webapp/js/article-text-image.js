var TT = TAOTAO = {
	// 编辑器参数
	kingEditorParams : {
		//指定上传文件参数名称
		filePostName  : "pictureFile",
		//指定上传文件请求的url。
		uploadJson : '/article/image',
		//上传类型，分别为image、flash、media、file
		dir : "image"
	},
    init : function(data){
    	// 初始化图片上传组件
    	this.initPicUpload(data);
    },
    // 初始化图片上传组件
    initPicUpload : function(data){
    	$(".picFileUpload").each(function(i,e){
    		var _ele = $(e);
    		_ele.siblings("div.pics").remove();
    		_ele.after('\
    			<div class="pics">\
        			<ul></ul>\
        		</div>');
    		// 回显图片
        	if(data && data.pics){
        		var imgs = data.pics.split(",");
        		for(var i in imgs){
        			if($.trim(imgs[i]).length > 0){
        				_ele.siblings(".pics").find("ul").append("<li><a href='"+imgs[i]+"' target='_blank'><img src='"+imgs[i]+"' width='80' height='50' /></a></li>");
        			}
        		}
        	}
        	//给“上传图片按钮”绑定click事件
        	$(e).click(function() {
        		var form = $(this).parentsUntil("form").parent("form");
        		KindEditor.editor(TT.kingEditorParams).loadPlugin('image', function() {
        			var editor = this;
        			editor.plugin.imageDialog({
        	            clickFn : function(url, title, width, height, border, align) {
        	            	form.find(".pics ul").append("<li><a href='"+url+"' target='_blank'><img src='"+url+"' width='80' height='50' /></a></li>");
        	            	$('#litimg').val(url);
        	            	form.find("[name=aChart]").val(url);
        	                editor.hideDialog();
        	            }
        	        });
        	    });
        	});
        	/*$(e).click(function(){
        		var form = $(this).parentsUntil("form").parent("form");
        		//打开图片上传窗口
        		KindEditor.editor(TT.kingEditorParams).loadPlugin('multiimage',function(){
        			var editor = this;
        			editor.plugin.multiImageDialog({
						clickFn : function(urlList) {
							var imgArray = [];
							KindEditor.each(urlList, function(i, data) {
								imgArray.push(data.url);
								form.find(".pics ul").append("<li><a href='"+data.url+"' target='_blank'><img src='"+data.url+"' width='80' height='50' /></a></li>");
							});
							form.find("[name=bChart]").val(imgArray.join(","));
							editor.hideDialog();
						}
					});
        		});
        	});*/
    	});
    },
    createEditor : function(select){
    	return KindEditor.create(select, TT.kingEditorParams);
    },
    /**
     * 初始化单图片上传组件 <br/>
     * 选择器为：.onePicUpload <br/>
     * 上传完成后会设置input内容以及在input后面追加<img> 
     */
    initOnePicUpload : function(){
    	$(".onePicUpload").click(function(){
			var _self = $(this);
			KindEditor.editor(TT.kingEditorParams).loadPlugin('image', function() {
				this.plugin.imageDialog({
					showRemote : false,
					clickFn : function(url, title, width, height, border, align) {
						var input = _self.siblings("input");
						input.parent().find("img").remove();
						input.val(url);
						input.after("<a href='"+url+"' target='_blank'><img src='"+url+"' width='80' height='50'/></a>");
						this.hideDialog();
					}
				});
			});
		});
    }
};
var itemAddEditor ;
$(function(){
	//创建富文本编辑器
	itemAddEditor = TAOTAO.createEditor("#itemAddForm [name=aCContent]");
	//初始化类目选择和图片上传器
	TAOTAO.init({fun:function(node){
	}});
});
/* 这是窗体变化事件 */
window.onresize=function(){
    window.location.reload();
}