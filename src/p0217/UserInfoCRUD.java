package p0217;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserInfoCRUD {

	private final static String URL = "jdbc:mysql://localhost:3306/ezen";
	private final static String USER = "root";
	private final static String PASSWORD = "r1r2r3";
	private final static String DRIVER_NAME = "com.mysql.cj.jdbc.Driver";
	private static Connection con = null;
	static {
		try {
			Class.forName(DRIVER_NAME);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			con = DriverManager.getConnection(URL, USER, PASSWORD);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void close() {
		if (con != null) {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public static int insertUserInfo(String uiName, String uiId, String uiPwd) {
		try {
			Statement stmt = con.createStatement();
			String sql = "INSERT INTO USER_INFO(UI_NAME, UI_ID, UI_PWD)";
			sql += " VALUES('" + uiName + "','" + uiId + "','" + uiPwd + "')";
			return stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	public static int deleteUserInfo(int uiNum) {
		try {
			Statement stmt = con.createStatement();
			String sql = "DELETE FROM USER_INFO WHERE UI_NUM=" + uiNum;
			return stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
	public static int updateUserInfo(int uiNum, String uiName) {
		try {
			Statement stmt = con.createStatement();
			String sql = "UPDATE USER_INFO";
			sql += " SET UI_NAME='"+uiName+"',";
			sql += " WHERE UI_NUM=" + uiNum;
			return stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	// 업데이트 만들어오기 숙제

	public static List<Map<String, String>> selectUserInfo() {
		List<Map<String, String>> users = new ArrayList<>();

		try {
			Statement stmt = con.createStatement();
			String sql = "SELECT UI_NUM, UI_NAME, UI_ID, UI_PWD FROM USER_INFO";
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				Map<String, String> user = new HashMap<>();
				user.put("UI_NUM", rs.getString("UI_NUM"));
				user.put("UI_NAME", rs.getString("UI_NAME"));
				user.put("UI_ID", rs.getString("UI_ID"));
				user.put("UI_PWD", rs.getString("UI_PWD"));
				users.add(user);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return users;
	}
		public static void main(String[] args) {
		int result = insertUserInfo("홍길동", "hong", "r1r2r3");
		System.out.println("입력한 갯수 : " + result);
		result = deleteUserInfo(3);
		System.out.println("삭제한 갯수 : " + result);
		result = updateUserInfo(14, "문다롱");
		System.out.println("업데이트한 갯수 : " + result);
		List<Map<String, String>> users = selectUserInfo();
		for (Map<String, String> user : users) {
			System.out.print("번호 : " + user.get("UI_NUM"));
			System.out.print(",이름 : " + user.get("UI_NAME"));
			System.out.print(",아이디 : " + user.get("UI_ID"));
			System.out.println(",비번 : " + user.get("UI_PWD"));
		}
	}
}
