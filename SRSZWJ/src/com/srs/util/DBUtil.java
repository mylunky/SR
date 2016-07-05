package com.srs.util;

import java.sql.*;

public class DBUtil {
	private static String driverName;
	private static String dbURL;
	static{
		driverName = "org.sqlite.JDBC";
		dbURL="jdbc:sqlite:H:/workspace/SRSZWJ/DB/SRSZWJDB.db3";
	}
	public static Connection open(){
		try {	
				Class.forName(driverName);
			try {
				return DriverManager.getConnection(dbURL);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}
	public static void close(Connection Conn){
		if(Conn != null){
			try {
				Conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
