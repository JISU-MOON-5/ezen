package p0211.review;

import java.util.ArrayList;
import java.util.Random;

public class Lotto {
	
	public static void main(String[] args) {
		// 1~45까지의 난수 6개를 lotto에 추가합니다.
				// 단 중복은 제외
				// 추가한 후의 lotto의 값을 출력해라.
		ArrayList<Integer> lotto = new ArrayList<>();
		Random r = new Random();
		while(lotto.size() < 6) {
			int rNum = r.nextInt(45)+1;
			if(lotto.indexOf(rNum) == -1) {
				lotto.add(rNum);
			}
		}
		System.out.println(lotto);
	}

}
