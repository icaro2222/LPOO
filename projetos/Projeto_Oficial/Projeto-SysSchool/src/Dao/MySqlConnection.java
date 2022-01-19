package Dao;

import java.sql.Connection; 
import java.sql.DriverManager;

public class MySqlConnection {

	public Connection getConnection() {
		Connection conn = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (Exception e1) {
			e1.printStackTrace();
		}

		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sysschool", "root", "");
		} catch (Exception e) {
			e.printStackTrace();
		}

		return conn;
	}

}
