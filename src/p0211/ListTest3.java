package p0211;

import java.util.ArrayList;
import java.util.Random;

public class ListTest3 {
	
	public static void main(String[] args) {
		ArrayList<String> strs = new ArrayList<>();
		// 1~45까지의 난수 생성, 중복 x, strs의 size가 6이 될 때까지 추가
		
		Random r = new Random();
		while(strs.size() < 6) {
			String num = r.nextInt(45)+1 + "";
			if(strs.indexOf(num) == -1) {
				strs.add(num);
			}
		}
		System.out.println(strs);
	}
}
