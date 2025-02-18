package p0218;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListMap3 {
	
	static List<Map<String,String>> getUserInfo() {
		List<Map<String,String>> users = new ArrayList<>();
		Map<String,String> user1 = new HashMap<>();
		user1.put("NUM", "1");
		user1.put("NAME", "성룡");
		user1.put("ID", "SUNG");
		user1.put("PWD", "1234");
		
		Map<String,String> user2 = new HashMap<>();
		user2.put("NUM", "2");
		user2.put("NAME", "홍길동");
		user2.put("ID", "HONG");
		user2.put("PWD", "1234");
		
		Map<String,String> user3 = new HashMap<>();
		user3.put("NUM", "3");
		user3.put("NAME", "김길동");
		user3.put("ID", "KIM");
		user3.put("PWD", "1234");
		
		Map<String,String> user4 = new HashMap<>();
		user4.put("NUM", "4");
		user4.put("NAME", "이길동");
		user4.put("ID", "LEE");
		user4.put("PWD", "1234");
		
		users.add(user1);
		users.add(user2);
		users.add(user3);
		users.add(user4);
		
		return users;
		
	}	
	public static void main(String[] args) {
		List<Map<String,String>> users = getUserInfo();
		for(Map<String,String> user : users) {
			System.out.println(users);
		}
	}
}
