package p0205;

import java.util.Random;
import java.util.Scanner;

public class ScannerTest2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		// 1~10까지의 난수를 생성 후,
		// s의 nextLine()으로 값을 받아와서
		// 업앤다운을 만들어라
		// ex. 입력한 값이 4, 난수가 9 : 업
		System.out.print("입력한 값 : ");
		String numStr = s.nextLine();
		Random r = new Random();
		int rNum = r.nextInt(10) + 1;
		int num = Integer.parseInt(numStr);

		if (num < rNum) {
			System.out.println("업");
		} else if (num > rNum) {
			System.out.println("다운");
		} else {
			System.out.println("맞췄다!");
		}
		System.out.println("난수 : " + rNum);
	}
}
