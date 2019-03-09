package com.imyrdahangBlogger.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.springframework.web.context.support.WebApplicationContextUtils;

import com.imyrdahangBlogger.collection.ReadCollection;

public class ReadBrushListener implements ServletContextListener {

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		ReadCollection read = WebApplicationContextUtils.getWebApplicationContext(sce.getServletContext()).getBean(ReadCollection.class);
		read.readFlush();
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		// TODO Auto-generated method stub

	}

}
/*public void contextInitialized(ServletContextEvent sce) {
	// TODO Auto-generated method stub
	ServletContext sc = sce.getServletContext();
	final List<HttpSession> list=Collections.synchronizedList(new ArrayList<HttpSession>());
	sc.setAttribute("sessions", list);
	//创建一个计时器
	Timer t=new Timer();
	t.schedule(new TimerTask() {
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			for (Iterator iterator = list.iterator(); iterator.hasNext();) {
				HttpSession httpSession = (HttpSession) iterator.next();
				long l=System.currentTimeMillis()-httpSession.getCreationTime();
				if(l>5000){//如果该session存在时间超过5秒就销毁移除
					httpSession.invalidate();
					iterator.remove();
				}
			}
			
			for(HttpSession hs:list){
				long l=System.currentTimeMillis()-hs.getCreationTime();
				if(l>5000){//如果该session存在时间超过5秒就销毁移除
					hs.invalidate();
					list.remove(hs);
				}
			}
			
		}
	}, 2000, 5000);
}*/