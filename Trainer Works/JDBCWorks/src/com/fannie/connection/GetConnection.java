package com.fannie.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class GetConnection {
	// all DB Connection variables shall be kept here
	static Connection conn = null;
	public PreparedStatement ps, ps1;
	public ResultSet rs;

	public static Connection getMySQLConnection() {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost/sdet5",
						"root", "mysql");

			return conn;
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

		return null;

	}

}
