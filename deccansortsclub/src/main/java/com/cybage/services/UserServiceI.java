package com.cybage.services;

import java.sql.SQLException;

import com.cybage.pojos.Users;

public interface UserServiceI {
	public void adduser(String username,String password,String address,
			   String phone,String email) throws SQLException, Exception;
}
