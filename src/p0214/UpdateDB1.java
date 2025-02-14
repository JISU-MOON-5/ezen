package p0214;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateDB1 {
	
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String url = "jdbc:mysql://localhost:3306/ezen";
		String user = "root";
		String password = "r1r2r3";
		try {
			Connection con = DriverManager.getConnection(url, user, password);
			Statement stmt = con.createStatement();
			String sql = "UPDATE USER_INFO"  // sql += 사용 안 해도 되는 방법
			+ " SET UI_NAME='송길동'"
			+ " WHERE UI_NAME='박길동'";
			int result = stmt.executeUpdate(sql);
			if(result>=1) {
				System.out.println("업데이트 성공");
			}else {
				System.out.println("업데이트 실패");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
