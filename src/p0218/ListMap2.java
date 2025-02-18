package p0218;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListMap2 {
	
	static List<Map<String,String>> getList() {
		List<Map<String,String>> maps = new ArrayList<>();
		Map<String,String> map1 = new HashMap<>();
		map1.put("year", "2018");
		map1.put("week", "1");
		map1.put("TV", "2301");
		map1.put("Online", "378");
		map1.put("Newspaper", "692");
		
		Map<String,String> map2 = new HashMap<>();
		map2.put("year", "2018");
		map2.put("week", "2");
		map2.put("TV", "445");
		map2.put("Online", "393");
		map2.put("Newspaper", "451");
		
		Map<String,String> map3 = new HashMap<>();
		map3.put("year", "2018");
		map3.put("week", "3");
		map3.put("TV", "172");
		map3.put("Online", "459");
		map3.put("Newspaper", "693");
		
		Map<String,String> map4 = new HashMap<>();
		map4.put("year", "2018");
		map4.put("week", "4");
		map4.put("TV", "1808");
		map4.put("Online", "108");
		map4.put("Newspaper", "584");
		
		maps.add(map1);
		maps.add(map2);
		maps.add(map3);
		maps.add(map4);
		
		return maps;
		
	}
	public static void main(String[] args) {
		List<Map<String,String>> maps = getList(); 
		for(Map<String,String> map:maps) {
			System.out.println(map);
		}
	}
}
