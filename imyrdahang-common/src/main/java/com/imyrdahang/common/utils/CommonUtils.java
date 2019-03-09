package com.imyrdahang.common.utils;

import java.util.List;

import com.imyrdahang.pojo.Articles;
import com.imyrdahang.pojo.Enshrines;
import com.imyrdahang.pojo.Models;
import com.imyrdahang.pojo.Users;

public class CommonUtils {
	//aUId转成名称
	public static void enshrinesOfUIdShiftUNamePutExt1(List<Enshrines> enshrines,List<Users> users){
		if(enshrines!=null&&users!=null){
			for(Enshrines a:enshrines){
				for(Users u:users){
					if(a.geteUId()==u.getuId()){
						a.setExt1(u.getuName());
						break;
					}
				}
			}
		}
	}
	//aUId转成名称
	public static void articlesOfUIdShiftUNamePutExt1(List<Articles> articles,List<Users> users){
		if(articles!=null&&users!=null){
			for(Articles a:articles){
				for(Users u:users){
					if(a.getaUId()==u.getuId()){
						a.setExt1(u.getuName());
						break;
					}
				}
			}
		}
	}
	//aMId转成名称
	public static void articlesOfMIdShiftMNamePutExt2(List<Articles> articles,List<Models> models){
		if(articles!=null&&models!=null){
			for(Articles a:articles){
				for(Models m:models){
					if(a.getaMId()==m.getmId()){
						a.setExt2(m.getmName());
						break;
					}
				}
			}
		}
	}
	
}
