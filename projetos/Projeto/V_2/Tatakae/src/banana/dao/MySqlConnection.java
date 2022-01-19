package banana.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class MySqlConnection {

	public Connection getConnection() {
		Connection conn = null;

		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sysschool", "root", "");
		} catch (Exception e) {
			e.printStackTrace();
		}

		return conn;
	}

}
