package p0211;

import java.util.HashMap;

public class MapTest2 {
	
	public static void main(String[] args) {
		HashMap<String,String> map = new HashMap<>();
		map.put("이름", "홍길동");
		map.put("age", "33");
		map.put("address", "한양");
		map.put("job", "도적");
		
		System.out.println(map);
		 /*
		  * ArrayList의 장점 : 순서가 중요(순서 저장 출력이 빠름), idx에 관여할 필요가 없음, 사이즈만 알면 모든 값을 출력할 수 있음 -> element(구성원)이 중요!
		  * HashMap : (key, value)가 중요, 순서가 없음(입력한대로 출력되지 않음)
		  * 
		  */
	}
}
