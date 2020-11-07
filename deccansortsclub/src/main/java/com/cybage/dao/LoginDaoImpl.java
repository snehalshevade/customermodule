package com.cybage.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.cybage.dbutil.DbUtil;
import com.cybage.pojos.Users;
import com.mysql.cj.protocol.Resultset;

public class LoginDaoImpl implements LoginDaoI {

	@Override
	public Users authenticate(String username, String password) throws SQLException, Exception {
		String sql = "select * from users where username = ? and password= ?";
		Connection con = DbUtil.getConnection(); // new object
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, username);
		ps.setString(2, password);
		ResultSet rs = ps.executeQuery();
		if (rs.next()) {
		   Users user=new Users(rs.getInt(1), rs.getString(2), rs.getString(3),rs.getString(4), 
				   rs.getString(5), rs.getString(6), rs.getString(7));
			rs.close();
			ps.close();
			System.out.println("user found");
			System.out.println(user);
			return user;
			
		} else {
			rs.close();
			ps.close();
			con.close();
			System.out.println("user not found");
		}
	return null;
			
	}

}
