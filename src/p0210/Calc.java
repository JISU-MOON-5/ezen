package p0210;

public class Calc {
	//리턴하지 않으면서 메모리 생성을 안하고 싶을 때
	static void printAdd(int n1, int n2) {
		System.out.println(n1 + n2);
	}
	static void printMinus(int n1, int n2) {
		System.out.println(n1 - n2);
	}
	static void printMultiple(int n1, int n2) {
		System.out.println(n1 * n2);
	}
	static void printDivision(int n1, int n2) {
		System.out.println(n1 / n2);
	}
	static void printMod(int n1, int n2) {
		System.out.println(n1 % n2);
	}
	//리턴하면서 메모리 생성을 안하고 싶을 때
	static int add(int n1, int n2) {
		return n1+n2;
	}
	static int minus(int n1, int n2) {
		return n1-n2;
	}
	static int multiple(int n1, int n2) {
		return n1*n2;
	}
	static int division(int n1, int n2) {
		return n1/n2;
	}
	static int mod(int n1, int n2) {
		return n1%n2;
	}
	
	
	public static void main(String[] args) {
		// 빼기(printMinus, minus), 곱하기(printMultiple, multiple), 나누기(printDivision, division), 나머지(printMod, mod)
		int n1 = 1;
		int n2 = 2;
		printAdd(n1, n2);
		printMinus(n1, n2);
		printMultiple(n1, n2);
		printDivision(n1, n2);
		printMod(n1, n2);
		
		int result = add(n1, n2);
		System.out.println(result);
		result = minus(n1, n2);
		System.out.println(result);
		result = multiple(n1, n2);
		System.out.println(result);
		result = division(n1, n2);
		System.out.println(result);
		result = mod(n1, n2);
		System.out.println(result);
		
	}

}
