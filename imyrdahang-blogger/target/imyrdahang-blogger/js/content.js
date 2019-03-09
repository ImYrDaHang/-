/**
 * 关于文章详情页面是否显示下载链接和说明的问题
 * 	通过这个js来判断是否该添加
 * 	也就是说，关于下载显示的一些东西，修改这个js即可
 * aCUrl		下载链接
 * aCUrlDepict	下载描述
 * <p class='bt-blue'><a href='https://pan.baidu.com/s/1eS9xy2A' target='_blank'>下 载</a></p>
	      <p><b>下载说明：</b></p>
	      <p>1、解压密码：yangqq.com</p>
	      <p>2、只有部分模板会提供多页面下载，未加说明都是只有一个首页index.html模板。</p>
	      <p>3、如果您发现模板有错，或者您有其他更好的意见、建议请给我们留言，我们会及时处理！</p>
	      <p>4、如果您遇到什么问题，也可加入本站互动QQ群 280998807(交流群)  280998843（技术群）咨询！</p>
	      <p class='ps'>* 下载本站模板以及作品仅供学习研究之用，若发现任何组织机构及个人有用于商业目的者,必追究其法律责任 *</p>
		  <p>&nbsp;</p>
		  downInfops 
 */
/*$(function(){
	if(aCUrl==null||aCUrl==''){
		return false;
	}
	var htm="<p class='bt-blue'><a href='"+aCUrl+"' target='_blank'>下 载</a></p>"+
	     "<p><b>下载说明：</b></p>"+
	     "<p>"+aCUrlDepict+"</p>"+
	     "<p>2、只有部分模板会提供多页面下载，未加说明都是只有一个首页index.html模板。</p>"+
	     "<p>3、如果您发现模板有错，或者您有其他更好的意见、建议请给我们留言，我们会及时处理！</p>"+
	     "<p>4、如果您遇到什么问题，也可加入本站互动QQ群 280998807(交流群)  280998843（技术群）咨询！</p>"+
	     "<p class='ps'>* 下载本站模板以及作品仅供学习研究之用，若发现任何组织机构及个人有用于商业目的者,必追究其法律责任 *</p>"+
		 "<p>&nbsp;</p>";
	$('#downInfops').append(htm);
	});*/
$(function(){
	if(aCUrl==null||aCUrl==''){
		return false;
	}
	var htm="<p class='bt-blue'><a href='"+aCUrl+"' target='_blank'>下 载</a></p>"+
	     "<p><b>下载说明：</b></p>"+
	     "<p>"+aCUrlDepict+"</p>";
	$('#downInfops').append(htm);
	});