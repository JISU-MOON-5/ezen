package p0218;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GameInfoCRUD {
	
	static List<Map<String,String>> getGames() {
		List<Map<String,String>> games = new ArrayList<>();
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		String url = "jdbc:mysql://localhost:3306/ezen";
		String user = "root";
		String pwd = "r1r2r3";
		Connection con = null;
		try {
			con = DriverManager.getConnection(url, user, pwd);
			Statement stmt = con.createStatement();
			String sql = "SELECT GI_NUM, GI_NAME, GI_PRICE, GI_GENRE, GI_DESC FROM GAME_INFO";
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				Map<String,String> game = new HashMap<>();
				String giNum = rs.getString("GI_NUM");
				String giName = rs.getString("GI_NAME");
				String giPrice = rs.getString("GI_PRICE");
				String giGenre = rs.getString("GI_GENRE");
				String giDesc = rs.getString("GI_DESC");
				game.put("giNum", giNum);
				game.put("giName", giName);
				game.put("giPrice", giPrice);
				game.put("giGenre", giGenre);
				game.put("giDesc", giDesc);
				games.add(game);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return games;
	}
	static int insertGameInfo(String giName, String giPrice, String giGenre, String giDesc) {
		List<Map<String,String>> games = new ArrayList<>();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			String url = "jdbc:mysql://localhost:3306/ezen";
			String user = "root";
			String pwd = "r1r2r3";
			Connection con = null;
			try {
				con = DriverManager.getConnection(url, user, pwd);
				Statement stmt = con.createStatement();
				String sql = "INSERT INTO GAME_INFO(GI_NAME,GI_PRICE,GI_GENRE,GI_DESC)";
				sql += " VALUES('" + giName + "','" + giPrice + "','" + giGenre + "','" + giDesc + "')";
				return stmt.executeUpdate(sql);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return 0;
	}
	static int deleteGameInfo(int giNum) {
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		String url = "jdbc:mysql://localhost:3306/ezen";
		String user = "root";
		String pwd = "r1r2r3";
		Connection con = null;
		try {
			con = DriverManager.getConnection(url, user, pwd);
			Statement stmt = con.createStatement();
			String sql = "DELETE FROM GAME_INFO WHERE GI_NUM=" + giNum;
			return stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
	static int updateGameInfo(int giNum, String giName, String giPrice, String giGenre, String giDesc) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			String url = "jdbc:mysql://localhost:3306/ezen";
			String user = "root";
			String pwd = "r1r2r3";
			Connection con = null;
			try {
				con = DriverManager.getConnection(url, user, pwd);
				Statement stmt = con.createStatement();
				String sql = "UPDATE GAME_INFO";
				sql += " SET GI_NAME= '" + giName + "',";
				sql += " GI_PRICE= '" + giPrice + "',";
				sql += " GI_GENRE= '" + giGenre + "',";
				sql += " GI_DESC= '" + giDesc + "'";
				sql += " WHERE GI_NUM=" + giNum;
				
				return stmt.executeUpdate(sql);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return 0;
		}
						
	
	public static void main(String[] arsg) {
		int result = 0;
		//int result = insertGameInfo("크아","0","아케이드","존잼");
		//System.out.println("입력한 갯수 : " + result);
		//result = deleteGameInfo(6);
		//System.out.println("삭제한 갯수 : " + result);
		result = updateGameInfo(5,"스도쿠","1000","지략","인생게임");
		System.out.println("업데이트한 갯수 : " + result);
		
		List<Map<String,String>> games = getGames();
		for (Map<String,String> game : games) {
			System.out.println(game);
		}
	}

}
