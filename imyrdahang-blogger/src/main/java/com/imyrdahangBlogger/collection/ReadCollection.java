package com.imyrdahangBlogger.collection;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.imyrdahang.common.pojo.TaotaoResult;
import com.imyrdahangBlogger.service.interfaces.ArticleService;
@Component
public class ReadCollection {
	private static final Logger logger=LoggerFactory.getLogger(ReadCollection.class);
	@Value("${ARTICLE_READ_BRUSH_TIME}")
	private Integer ARTICLE_READ_BRUSH_TIME;
	@Autowired
	private ArticleService articleService;
	private ExecutorService readPool=Executors.newCachedThreadPool();
	private Map<Integer,Integer> readColl=new HashMap<Integer,Integer>();
	//增加次数
	private synchronized void brush(Integer id){
		Integer sum = readColl.get(id);
		if(sum==null){
			readColl.put(id, 1);
		}else{
			readColl.put(id, sum+1);
		}
	}
	//保存到数据库
	private synchronized void flush() throws Exception{
		TaotaoResult result = articleService.updateArticleOfHitsByPrimaryKey(readColl);
		Map<Integer,Integer> map=(Map<Integer,Integer>)result.getData();
		if(map.size()>0){
			logger.error("点击量刷新完成，刷新失败数据如下，刷新时间："+new Date().toString());
			for(Map.Entry<Integer,Integer> m:map.entrySet())
				logger.error("失败文章："+m.getKey()+"--应增加次数："+m.getValue());
		}else{
			logger.error("点击量刷新完成,刷新时间："+new Date().toString());
		}
		readColl.clear();
	}
	//增加点击量
	public void readUp(final Integer id){
		readPool.execute(new Runnable(){
			public void run() {
				brush(id);
			}
		});
	}
	//定时刷新到数据库
	public void readFlush(){
		Timer t=new Timer();
		t.schedule(new TimerTask(){
			public void run() {
				try {
					flush();
				} catch (Exception e) {
					logger.error("点击量刷新出错,时间："+new Date().toString(),e);
				}
			}
		}, 2000, ARTICLE_READ_BRUSH_TIME);//这里是每三小时刷新一次，在配置文件中设置
	}
}
