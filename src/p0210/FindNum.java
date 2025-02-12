package p0210;

import java.util.Random;
import java.util.Scanner;

public class FindNum {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Random r = new Random();
		int rNum = r.nextInt(100)+1;
		int count = 1;
		
		while(true) {
			System.out.print("1~100 중의 숫자 : ");
			String numStr = s.nextLine();
			int num = Integer.parseInt(numStr);
			
			if(rNum < num) {
				System.out.println("DOWN");
			}else if(rNum > num) {
				System.out.println("UP"); 
			}else {
				System.out.println(count + "번 만에 맞췄다!");
				break;
			}
			count++;
		}
		System.out.println("게임이 끝났습니다.");
	}
}
