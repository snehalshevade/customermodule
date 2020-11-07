package com.cybage.services;

import java.sql.SQLException;

import com.cybage.dao.LoginDaoI;
import com.cybage.dao.LoginDaoImpl;
import com.cybage.pojos.Users;

public class LoginServiceImpl implements LoginServiceI {
	LoginDaoI dao=new LoginDaoImpl();

	@Override
	public Users authenticate(String username, String password) throws SQLException,Exception{
		return dao.authenticate(username, password);
		
	}

}
