package p0219;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DogInfoCRUD {
	public List<Map<String,String>> selectDogInfos(String type, String str) { 
		List<Map<String,String>> dogInfos = new ArrayList<>();
		String sql = "SELECT DI_NUM, DI_NAME, DI_AGE, DI_ID FROM DOG_INFO";
		if("1".equals(type)) {
			sql += " WHERE DI_NAME LIKE CONCAT('%',?,'%')";
		}else if("2".equals(type)) {
			sql += " WHERE DI_AGE LIKE CONCAT('%',?,'%')";
		}else if("3".equals(type)) {
			sql += " WHERE DI_ID LIKE CONCAT('%',?,'%')";
		}
		try (Connection con = DBCon.getCon();
				PreparedStatement ps = con.prepareStatement(sql);){
			ps.setString(1, str);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				Map<String,String> dogInfo = new HashMap<>();
				dogInfo.put("diNum", rs.getString("DI_NUM"));
				dogInfo.put("diName", rs.getString("DI_NAME"));
				dogInfo.put("diAge", rs.getString("DI_AGE"));
				dogInfo.put("diId", rs.getString("DI_ID"));
				dogInfos.add(dogInfo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return dogInfos;
	}
	public int insertDogInfo(String diName, String diAge, String diId) {
		String sql = "INSERT INTO DOG_INFO(DI_NAME, DI_AGE, DI_ID) VALUES(?,?,?)";
		try (Connection con = DBCon.getCon();
				PreparedStatement ps = con.prepareStatement(sql);){
			ps.setString(1, diName);
			ps.setString(2, diAge);
			ps.setString(3, diId);
			return ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
	public int updateDogInfo(int diNum, String diName, String diAge, String diId) {
		String sql = "UPDATE DOG_INFO"
		+ " SET DI_NAME=?,"
		+ " DI_AGE=?,"
		+ " DI_ID=?"
		+ " WHERE DI_NUM=?";
		try (Connection con = DBCon.getCon();
				PreparedStatement ps = con.prepareStatement(sql);){
			ps.setString(1, diName);
			ps.setString(2, diAge);
			ps.setString(3, diId);
			ps.setInt(4, diNum);
			return ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
	public int deleteDogInfo(int diNum) {
		String sql = "DELETE FROM DOG_INFO WHERE DI_NUM=?";
		try (Connection con = DBCon.getCon();
				PreparedStatement ps = con.prepareStatement(sql);){
			ps.setInt(1, diNum);
			return ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	public static void main(String[] args) {
		DogInfoCRUD cuic = new DogInfoCRUD();
		List<Map<String,String>> dogInfo = cuic.selectDogInfos("1","뽀또");
		for(Map<String,String> dogInfos : dogInfo) {
			System.out.println(dogInfo);
		}
		//int result = cuic.insertDogInfo("다롱", "20", "롱롱");
		//System.out.println("입력한 갯수 : " + result);
		//int result = cuic.updateDogInfo(2, "오댕", "5", "오뎅아님");
		//System.out.println("수정한 갯수 : " + result);
		int result = cuic.deleteDogInfo(5);
		System.out.println("삭제한 갯수 : " + result);
	}
}

