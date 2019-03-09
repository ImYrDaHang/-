package com.imyrdahangBlogger.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imyrdahang.common.pojo.TaotaoResult;
import com.imyrdahang.dao.UsersMapper;
import com.imyrdahang.pojo.Users;
import com.imyrdahang.pojo.UsersExample;
import com.imyrdahang.pojo.UsersExample.Criteria;
import com.imyrdahangBlogger.service.interfaces.UserService;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UsersMapper usersMapper;
	//根据用户ID查用户
	@Override
	public Users selectUserByPrimarykey(int uId) throws Exception{
		return usersMapper.selectByPrimaryKey(uId);
	}
	//查询所有用户
	@Override
	public List<Users> selectUsers() throws Exception {
		return usersMapper.selectByExample(new UsersExample());
	}
	//用户登录验证
	@Override
	public Users login(String username, String pwd) throws Exception {
		UsersExample example=new UsersExample();
		Criteria criteria = example.createCriteria();
		criteria.andUAccountEqualTo(username);
		criteria.andUPasswordEqualTo(pwd);
		List<Users> list = usersMapper.selectByExample(example);
		if(list!=null&&list.size()>0&&list.size()<2) return list.get(0);
		return null;
	}
	//设置用户登录时间和Ip
	@Override
	public TaotaoResult loginFlushDateAndIp(Users user) throws Exception {
		usersMapper.updateByPrimaryKeySelective(user);
		return TaotaoResult.ok();
	}
	
}
