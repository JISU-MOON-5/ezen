package p0211.review;

import java.util.HashMap;
import java.util.Iterator;

public class MapTest {
	
	public static void main(String[] args) {
		HashMap<String,String> map = new HashMap<>();
		map.put("sido5", "서울");
		map.put("sido4", "대전");
		map.put("sido3", "대구");
		map.put("sido2", "부산");
		map.put("sido1", "광주");
		
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) {
			String key = it.next();
			System.out.println(key + "," + map.get(key));
		}
	}

}
