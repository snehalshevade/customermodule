package com.cybage.services;

import java.sql.SQLException;

import com.cybage.dao.UserDao;
import com.cybage.dao.UserDaoImpl;
import com.cybage.pojos.Users;

public class UserServiceImpl implements UserServiceI{
	UserDao dao=new UserDaoImpl();
	public void adduser(String username,String password,String address,
			   String phone,String email) throws SQLException, Exception 
	{
	   dao.adduser(username, password, address, phone, email);
	}
}
