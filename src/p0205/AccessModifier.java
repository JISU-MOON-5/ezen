package p0205;

class Test {
	static int num = 10;
}

public class AccessModifier {
	
	public static void main(String[] args) {
		// 접근제어자
		// public, protected, default(package-private), private
		// class에 사용 가능한 접근제어자 - public, default(같은 패키지 내에서만 접근 가능)
		System.out.println(Test.num);
	}
}
