package p0204;

public class Loop {

	public static void main(String[] args) {
		//총 9개의 for문을 사용해서
		//구구단 1~9단까지 출력해주세요
		for(int i=1; i<=9; i++) {
			System.out.println("1 X " + i + " = " + i);
		}
		for(int i=1; i<=9; i++) {
			System.out.println("2 X " + i + " = " + (i*2));
		}
		for(int i=1; i<=9; i++) {
			System.out.println("3 X " + i + " = " + (i*3));
		}
		for(int i=1; i<=9; i++) {
			System.out.println("4 X " + i + " = " + (i*4));
			//....
		}
		
		// 다중 포문을 사용해서 구구단을 완성해주세요
		for(int i=1; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				System.out.println(i + " X " + j + " = " + (i*j));
			}
		}
	}
}
