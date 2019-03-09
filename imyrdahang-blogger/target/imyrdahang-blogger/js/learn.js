//设置知识模块按钮颜色
var backgrounds=['#FE5187','#339967','#FF8151','#3594cb','#66CC9A','#079798'];
$(function(){
	var backgrounds=['#FE5187','#339967','#FF8151','#3594cb','#66CC9A','#079798'];
	var lis=$("#KPAModel>li");
	var colorNum;
	for(var i=0;i<lis.length;i++){
		var num=Math.floor(Math.random()*(backgrounds.length));
		while(num==colorNum){//防止连着两个按钮颜色一样
			num=Math.floor(Math.random()*(backgrounds.length));
		}
		$(lis[i]).css("background-color",backgrounds[num]);
		colorNum=num;
	}
});












