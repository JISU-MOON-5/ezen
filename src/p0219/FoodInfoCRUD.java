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

public class FoodInfoCRUD {

	public int insertFoodInfo(String fiName, String fiPrice) {
		String sql = "INSERT INTO FOOD_INFO(FI_NAME, FI_PRICE) VALUES('%s','%s')";
		sql = String.format(sql, fiName, fiPrice);
		try (Connection con = DBCon.getCon(); Statement stmt = con.createStatement();) {
			return stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	public int updateFoodInfo(int fiNum, String fiName, String fiPrice) {
		String sql = "UPDATE FOOD_INFO" + " SET FI_NAME='%s'," + " FI_PRICE='%s'" + " WHERE FI_NUM=%d";
		sql = String.format(sql, fiName, fiPrice, fiNum);
		try (Connection con = DBCon.getCon(); Statement stmt = con.createStatement();) {
			return stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	public int deleteFoodInfo(int fiNum) {
		String sql = "DELETE FROM FOOD_INFO WHERE FI_NUM=%d";
		sql = String.format(sql, fiNum);
		try (Connection con = DBCon.getCon(); Statement stmt = con.createStatement();) {
			return stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	public List<Map<String, String>> selectFoodInfos() {
		List<Map<String, String>> foodInfos = new ArrayList<>();
		String sql = "SELECT FI_NUM, FI_NAME, FI_PRICE FROM FOOD_INFO";
		try (Connection con = DBCon.getCon();
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(sql);) {
			while (rs.next()) {
				Map<String, String> foodInfo = new HashMap<>();
				foodInfo.put("fiNum", rs.getString("FI_NUM"));
				foodInfo.put("fiName", rs.getString("FI_NAME"));
				foodInfo.put("fiPrice", rs.getString("FI_PRICE"));
				foodInfos.add(foodInfo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return foodInfos;
	}

	public List<Map<String, String>> selectFoodInfos2(String type, String str) {
		List<Map<String, String>> foodInfos = new ArrayList<>();
		String sql = "SELECT FI_NUM, FI_NAME, FI_PRICE FROM FOOD_INFO";
		if ("1".equals(type)) {
			sql += " WHERE FI_NAME LIKE CONCAT('%',?,'%')";
		} else if ("2".equals(type)) {
			sql += " WHERE FI_PRICE LIKE CONCAT('%',?,'%')";
		}
		try (Connection con = DBCon.getCon(); 
				PreparedStatement ps = con.prepareStatement(sql);) {
			ps.setString(1, str);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Map<String, String> foodInfo = new HashMap<>();
				foodInfo.put("fiNum", rs.getString("FI_NUM"));
				foodInfo.put("fiName", rs.getString("FI_NAME"));
				foodInfo.put("fiPrice", rs.getString("FI_PRICE"));
				foodInfos.add(foodInfo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return foodInfos;
	}
	public int insertFoodInfo2(String fiName, String fiPrice) {
		String sql = "INSERT INTO FOOD_INFO(FI_NAME, FI_PRICE) VALUES(?,?)";
		try (Connection con = DBCon.getCon();
				PreparedStatement ps = con.prepareStatement(sql);){		
			ps.setString(1, fiName);
			ps.setString(2, fiPrice);
			return ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
	public int updateFoodInfo2(int fiNum, String fiName, String fiPrice) {
		String sql = "UPDATE FOOD_INFO"
		+ " SET FI_NAME=?,"
		+ " FI_PRICE=?"
		+ " WHERE FI_NUM=?";
		try (Connection con = DBCon.getCon();
				PreparedStatement ps = con.prepareStatement(sql);){
			ps.setString(1, fiName);
			ps.setString(2, fiPrice);
			ps.setInt(3, fiNum);
			return ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
	public int deleteFoodInfo2(int fiNum) {
		String sql = "DELETE FROM FOOD_INFO WHERE FI_NUM=?";
		try (Connection con = DBCon.getCon();
				PreparedStatement ps = con.prepareStatement(sql);){
			ps.setInt(1, fiNum);
			return ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	public static void main(String[] args) {
		FoodInfoCRUD cuic = new FoodInfoCRUD();
		List<Map<String,String>> foodInfo2 = cuic.selectFoodInfos2("2", "1000");
		for(Map<String,String> foodInfo : foodInfo2) {
			System.out.println(foodInfo);
		}
		//int result = cuic.insertFoodInfo2("우동", "8000");
		//System.out.println("입력한 갯수 : " + result);
		//int result = cuic.updateFoodInfo2(4, "돈까스", "10000");
		//System.out.println("수정한 갯수 : " + result);
		int result = cuic.deleteFoodInfo2(3);
		System.out.println("삭제한 갯수 : " + result);
	}
}
