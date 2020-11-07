package com.cybage.services;

import java.sql.SQLException;

import com.cybage.pojos.Users;

public interface LoginServiceI {
 public Users authenticate(String username,String password)throws SQLException,Exception;
}
