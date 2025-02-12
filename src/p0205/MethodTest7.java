package p0205;

public class MethodTest7 {
	
	static int sum(int max) {
		int sum = 0;
		for(int i=1; i<=max; i++) {
			sum += i;
		}
		return sum;
	}
	public static void main(String[] args) {
		// 반복문을 만들어서 1~100까지 더한 뒤에
		// 출력하는 코드를 완성하세요
		int sum = sum(100);
		System.out.println(sum);
		}
	}
