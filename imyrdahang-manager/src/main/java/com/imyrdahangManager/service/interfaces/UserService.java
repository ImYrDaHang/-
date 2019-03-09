package com.imyrdahangManager.service.interfaces;

import java.util.List;

import com.imyrdahang.common.pojo.TaotaoResult;
import com.imyrdahang.pojo.Users;

public interface UserService {
	public Users selectUserByPrimarykey(int uId)throws Exception;
	public List<Users> selectUsers()throws Exception;
	public Users login(String username,String pwd)throws Exception;
	public TaotaoResult loginFlushDateAndIp(Users user)throws Exception;
}
