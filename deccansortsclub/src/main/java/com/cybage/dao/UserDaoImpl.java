package com.cybage.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.cybage.dbutil.DbUtil;
import com.cybage.pojos.Users;

public class UserDaoImpl implements UserDao{

	@Override
	public void adduser(String username, String password, String address, String phone, String email)throws SQLException,Exception
	{
		String sql="insert into users(userName,password,role,address,phone,email)values(?,?,?,?,?,?)";
		Connection con=DbUtil.getConnection();
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setString(1, username);
		ps.setString(2, password);
		ps.setString(3, "CUSTOMER");
		ps.setString(4, address);
		ps.setString(5, phone);
		ps.setString(6, email);
		if(ps.executeUpdate()==1){
			System.out.println("record added");
		}
		else
		{
			System.out.println("not adde");
		}
		
	}

}
