package p0219;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBCon {
	private static final String DRIVER_NAME = "com.mysql.cj.jdbc.Driver";
	private static final String URL = "jdbc:mysql://localhost:3306/ezen";
	private static final String USER = "root";
	private static final String PWD = "r1r2r3";
	
	public static Connection getCon() throws SQLException {
		try {
			Class.forName(DRIVER_NAME);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return DriverManager.getConnection(URL, USER, PWD);}
	
	public static void main(String[] args) {
		try {
			getCon();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}

