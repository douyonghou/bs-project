package com.stock.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.stock.bean.UserInfoBean;
import com.stock.util.DBUtil;

public class UserInfoModel {
	private DBUtil db = new DBUtil();

	// 添加用户信息
	public int appendUser(String userid, String password, String name,
			String sex, String birthday, String email, String telephone)
			throws SQLException {
		int num = 0;

		String sql = "insert into user_info (user_id,user, password, name, sex, birthday, email, telephone) values (?,?,?,?,?,?,?,?)";
		Connection con = db.getConnection();
		PreparedStatement pst = con.prepareStatement(sql);
		pst.setString(1, userid.hashCode()+"");
		pst.setString(2, userid);
		pst.setString(3, password);
		pst.setString(4, name);
		pst.setString(5, sex);
		pst.setString(6, birthday);
		pst.setString(7, email);
		pst.setString(8, telephone);
		num = pst.executeUpdate();
		db.commit();
		db.close();
		return num;
	}

	// 通过用户账号查询用户信息
	public UserInfoBean getUser(String userid) throws SQLException {
		String sql = "select user_id, password, name, sex, birthday, email, telephone from user_info where user_id=?";
		Connection con = db.getConnection();
		PreparedStatement pst = con.prepareStatement(sql);
		pst.setString(1, userid);
		UserInfoBean user = null;
		ResultSet rs = pst.executeQuery();
		if (rs.next()) {
			String password = rs.getString("password");
			String name = rs.getString("name");
			String sex = rs.getString("sex");
			String birthday = rs.getString("birthday");
			String email = rs.getString("email");
			String telephone = rs.getString("telephone");
			UserAccountModel uam = new UserAccountModel();
			String accountBalance = uam.getAccount(userid)[0];
			String lastModify = uam.getAccount(userid)[1];
			user = new UserInfoBean(userid, password, name, sex, birthday,
					email, telephone, accountBalance, lastModify);
		}
		db.commit();
		db.close();
		return user;
	}

	// 检查登陆
	public UserInfoBean checkLogin(String userid, String password)
			throws SQLException {
		UserInfoBean user = null;
		String sql = "select user, password, name, sex, birthday, email, telephone from user_info where user=? and password=?";
		Connection con = db.getConnection();
		PreparedStatement pst = con.prepareStatement(sql);
		pst.setString(1, userid);
		pst.setString(2, password);
		ResultSet rs = pst.executeQuery();
		if (rs.next()) {
			String name = rs.getString("name");
			String sex = rs.getString("sex");
			String birthday = rs.getString("birthday");
			String email = rs.getString("email");
			String telephone = rs.getString("telephone");
			UserAccountModel uam = new UserAccountModel();
			String accountBalance = uam.getAccount(userid)[0];
			String lastModify = uam.getAccount(userid)[1];
			user = new UserInfoBean(userid, password, name, sex, birthday,
					email, telephone, accountBalance, lastModify);
		}
		db.commit();
		db.close();
		return user;
	}
}