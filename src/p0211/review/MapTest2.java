package p0211.review;

import java.util.HashMap;

public class MapTest2 {
	
	public static void main(String[] args) {
		HashMap<String,String> map = new HashMap<>();
		map.put("이름", "홍길동");
		map.put("age", "33");
		map.put("address", "한양");
		map.put("job", "도적");
		
		System.out.println(map);
	}

}
