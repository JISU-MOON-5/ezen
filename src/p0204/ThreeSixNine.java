package p0204;

public class ThreeSixNine {

	public static void main(String[] args) {
		/*
		 * 1~100까지 출력하되
		 * 3,6,9가 들어가면 모두 짝을 출력
		 * 3,6,9,13,16,19,23,26,29,30,31,32...
		 */
		for(int i=1; i<100; i++) {
			int n1 = i % 10;
			int n2 = i / 10;
			
			if((n1!=0 && n1 % 3 == 0) || (n2 % 3 == 0 && i>10)) {
				System.out.println(i + ":짝");
			}
		}
	}
}
