package p0204;

public class MethodTest {

	int i;

	static void test() {
		System.out.println("첫번째 테스트");

	}

	static void test(int i) { // overloading- 같은 영역안에서 이루어져야. 같은 함수여도 매개변수가 다르면 다른 함수(메소드), 매개변수의 순서가 달라도 가능.
		System.out.println("두번째 테스트");
	}

	static void test(String i2) { // 매개변수의 데이터타입도 달라야 오류 안 남
		System.out.println("세번째 테스트");
	}

	static void test(int i, String i2) { // 매개변수 갯수가 다르면 오케이
		System.out.println("네번째 테스트");
	}

	static void test(String i2, int i) { // 매개변수 위치가 다르면 오케이
		System.out.println("다섯번째 테스트");
	}

	public static void main(String[] args) {
		test();

	}
}
