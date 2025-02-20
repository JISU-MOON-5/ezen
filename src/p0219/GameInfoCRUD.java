package p0219;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GameInfoCRUD {
	
	public int insertGameInfo(String giName, String giPrice, String giGenre, String giDesc) {
		String sql = "INSERT INTO GAME_INFO(GI_NAME, GI_PRICE, GI_GENRE, GI_DESC) VALUES('%s','%s','%s','%s')";
		sql = String.format(sql, giName, giPrice, giGenre, giDesc);
		try (Connection con = DBCon.getCon();
				Statement stmt = con.createStatement(); ){
			return stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
	public int updateGameInfo(int giNum, String giName, String giPrice, String giGenre, String giDesc) {
		String sql = "UPDATE GAME_INFO"
		+ " SET GI_NAME='%s',"
		+ " GI_PRICE='%s',"
		+ " GI_GENRE='%s',"
		+ " GI_DESC='%s'"
		+ " WHERE GI_NUM=%d";
		sql = String.format(sql, giName, giPrice, giGenre, giDesc, giNum);
		try (Connection con = DBCon.getCon();
				Statement stmt = con.createStatement(); ){
			return stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
	public int deleteGameInfo(int giNum) {
		String sql = "DELETE FROM GAME_INFO WHERE GI_NUM=%d";
		sql = String.format(sql, giNum);
		try (Connection con = DBCon.getCon();
				Statement stmt = con.createStatement(); ){
			return stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
	public List<Map<String,String>> selectGameInfos() {
		List<Map<String,String>> gameInfos = new ArrayList<>();
		String sql = "SELECT GI_NUM, GI_NAME, GI_PRICE, GI_GENRE, GI_DESC FROM GAME_INFO";
		try (Connection con = DBCon.getCon();
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(sql);
				) {
			while(rs.next()) {
				Map<String,String> gameInfo = new HashMap<>();
				gameInfo.put("giNum", rs.getString("GI_NUM"));
				gameInfo.put("giName", rs.getString("GI_NAME"));
				gameInfo.put("giPrice", rs.getString("GI_PRICE"));
				gameInfo.put("giGenre", rs.getString("GI_GENRE"));
				gameInfo.put("giDesc", rs.getString("GI_DESC"));
				gameInfos.add(gameInfo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return gameInfos;
	}
	public List<Map<String,String>> selectGameInfos2(String type, String str) {
		List<Map<String,String>> gameInfos = new ArrayList<>();
		String sql = "SELECT GI_NUM, GI_NAME, GI_PRICE, GI_GENRE, GI_DESC FROM GAME_INFO";
		if("1".equals(type)) {
			sql += " WHERE GI_NAME LIKE CONCAT('%',?,'%')";
		}else if("2".equals(type)) {
			sql += " WHRER GI_PRICE LIKE CONCAT('%',?,'%')";
		}else if("3".equals(type)) {
			sql += " WHERE GI_GENRE LIKE CONCAT('%',?,'%')";
		}else if("4".equals(type)) {
			sql += " WHERE GI_DESC LIKE CONCAT('%',?,'%')";
		}
		try (Connection con = DBCon.getCon();
				PreparedStatement ps = con.prepareStatement(sql);){
			ps.setString(1, str);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				Map<String,String> gameInfo = new HashMap<>();
				gameInfo.put("giNum", rs.getString("GI_NUM"));
				gameInfo.put("giName", rs.getString("GI_NAME"));
				gameInfo.put("giPrice", rs.getString("GI_PRICE"));
				gameInfo.put("giGenre", rs.getString("GI_GENRE"));
				gameInfo.put("giDesc", rs.getString("GI_DESC"));
				gameInfos.add(gameInfo);
			}
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return gameInfos;
	}
	public int insertGameInfo2(String giName, String giPrice, String giGenre, String giDesc) {
		String sql = "INSERT INTO GAME_INFO(GI_NAME, GI_PRICE, GI_GENRE, GI_DESC) VALUES(?,?,?,?)";
		try (Connection con = DBCon.getCon();
				PreparedStatement ps = con.prepareStatement(sql);){
			ps.setString(1, giName);
			ps.setString(2, giPrice);
			ps.setString(3, giGenre);
			ps.setString(4, giDesc);
			return ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
	public int updateGameInfo2(int giNum, String giName, String giPrice, String giGenre, String giDesc) {
		String sql = "UPDATE GAME_INFO"
		+ " SET GI_NAME=?,"
		+ " GI_PRICE=?,"
		+ " GI_GENRE=?,"
		+ " GI_DESC=?"
		+ " WHERE GI_NUM=?";
		try (Connection con = DBCon.getCon(); 
				PreparedStatement ps = con.prepareStatement(sql);){
			ps.setString(1, giName);
			ps.setString(2, giPrice);
			ps.setString(3, giGenre);
			ps.setString(4, giDesc);
			ps.setInt(5, giNum);
			return ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
	public int deleteGameInfo2(int giNum) {
		String sql = "DELETE FROM GAME_INFO WHERE GI_NUM=?";
		try (Connection con = DBCon.getCon();
				PreparedStatement ps = con.prepareStatement(sql);){
			ps.setInt(1, giNum);
			return ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	public static void main(String[] args) {
		GameInfoCRUD cuic = new GameInfoCRUD();
		List<Map<String,String>> gameInfo2 = cuic.selectGameInfos2("1","스도쿠");
		for(Map<String,String> gameInfo : gameInfo2) {
			System.out.println(gameInfo);
		}
		//int result = cuic.insertGameInfo2("아무게임", "500", "아무장르", "아무멘트");
		//System.out.println("입력한 갯수 : " + result);
		//int result = cuic.updateGameInfo2(3, "포트리스", "0", "아케이드", "슈웅");
		//System.out.println("수정한 갯수 : " + result);
		int result = cuic.deleteGameInfo2(8);
		System.out.println("삭제한 갯수 : " + result);
	}

}
