package p0205;

public class MethodTest {
	
	int test() {
		return 1;  //데이터타입 맞춰야 함
	}
	static void test2() {
		
	}
	
	public static void main(String[] args) {
		MethodTest mt = new MethodTest();  //non static이기 때문에 메모리 생성 후 호출
		int i = mt.test();
		test2();  //static이기 때문에 그냥 호출 가능  //void라는 데이터타입은 자바에 없기 때문에 저장은 안 되고 오로지 호출만 가능.
	}

}
