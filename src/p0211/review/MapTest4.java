package p0211.review;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MapTest4 {
	
	public static void main(String[] args) {
		ArrayList<Map<String,Integer>> list = new ArrayList<>();
		for(int i=1; i<=2; i++) {
			HashMap<String,Integer> map = new HashMap<>();
			map.put("번호", i);
			list.add(map);
		}
		System.out.println(list.get(0));
		System.out.println(list.get(1));
	}

}
