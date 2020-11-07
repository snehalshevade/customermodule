package com.cybage.dao;

import java.sql.SQLException;

import com.cybage.pojos.Users;

public interface LoginDaoI {
	public Users authenticate(String username,String password)throws SQLException,Exception;
}
