package p0214;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import p0217.DataBaseConnector;

public class UpdateDB2 {
	
	public static void main(String[] args) {
		try {
			Connection con = DataBaseConnector.getCon();
			Statement stmt = con.createStatement();
			String sql = "UPDATE USER_INFO"  // sql += 사용 안 해도 되는 방법
			+ " SET UI_NAME='유덕화'"
			+ " WHERE UI_NAME='김길동'";
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
