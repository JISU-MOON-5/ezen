package p0207;

import java.util.ArrayList;
import java.util.Random;

public class ListTest6 {
	
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		// list에 1~100까지 난수를 10개 집어넣고 출력
		Random r = new Random();
		while(list.size()<10) {
			list.add(r.nextInt(100)+1+"");
		}
		System.out.println(list);
	}
}
