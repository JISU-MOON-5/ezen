package p0211;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MapTest4 {
	
	public static void main(String[] args) {
		ArrayList<Map<String,Integer>> list = new ArrayList<>();
		for(int i=1; i<=2; i++) {
			HashMap<String,Integer> map = new HashMap<>();   
			// HashMap을 11라인에 먼저 쓰는 순간 값은 {번호=2} {번호=2}가 나옴. 위치 선정 중요!
			map.put("번호", i);
			list.add(map);
		}
		System.out.println(list.get(0));
		System.out.println(list.get(1));
	}
}
