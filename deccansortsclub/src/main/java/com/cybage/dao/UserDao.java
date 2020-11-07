package com.cybage.dao;

import java.sql.SQLException;

import com.cybage.pojos.Users;

public interface UserDao {
   public void adduser(String username,String password,String address,
		   String phone,String email) throws SQLException, Exception;
}
