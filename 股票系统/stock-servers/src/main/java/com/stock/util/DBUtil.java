package com.stock.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	private String driver = "com.mysql.jdbc.Driver";
	private String url = "jdbc:mysql://localhost:3306/stock_server?charcterEncoding=utf-8";
	private String user = "root";
	private String psw = "123456";
	private Connection con = null;

	public Connection getConnection() {
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, psw);
			System.out.println("conn mysql success!");
			con.setAutoCommit(false); // �ر��Զ��ύ
			if (con == null)
				throw new Exception("��ȡ���ݿ�����ʧ�ܣ�");
		} catch (SQLException e1) {
			e1.printStackTrace();
		} catch (ClassNotFoundException e2) {
			e2.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}

	public void commit() {
		try {
			con.commit();// �ֶ��ύ
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void close() {
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}