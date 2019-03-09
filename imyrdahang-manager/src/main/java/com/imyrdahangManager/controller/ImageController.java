package com.imyrdahangManager.controller;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.imyrdahang.common.utils.ImageResult;

@Controller
public class ImageController {
	@Value("${IMAGE_PATH}")
	private String IMAGE_PATH;
	@Value("${IMAGE_STORAGE_PATH}")
	private String IMAGE_STORAGE_PATH;
	@RequestMapping("/article/image")
	@ResponseBody
	public ImageResult addImage(MultipartFile pictureFile,HttpServletRequest request) throws Exception, IOException{
		String originalFilename = pictureFile.getOriginalFilename();
		String uuid =UUID.randomUUID().toString()+originalFilename.substring(originalFilename.lastIndexOf("."));
		//将文件存进去
		String path = imagePath(IMAGE_STORAGE_PATH,new Date(),uuid);
		pictureFile.transferTo(new File(IMAGE_STORAGE_PATH+path));
		ImageResult result=new ImageResult();
		result.setUrl(IMAGE_PATH+path);
		result.setError(0);
		System.out.println(IMAGE_PATH+path);
		return result;
	}
	//按年月创建文件目录来存储图片
	private String imagePath(String path,Date time,String name){
		SimpleDateFormat sdf=new SimpleDateFormat("yyyyMM");
		String date = sdf.format(time);
		File file=new File(path+date);
		file.setWritable(true, false);
		if(!file.exists()){
			file.mkdirs();
		}
		return date+File.separator+name;
	}
}
