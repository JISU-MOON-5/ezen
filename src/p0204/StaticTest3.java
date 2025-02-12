package p0204;

class Test {
	static int num1 = 1;  
	int num2 = 2;  //접근제어자 없으면 default(package private), private은 같은 영역에서만 사용가능
}
public class StaticTest3 {
	public static void main(String[] args) {
		System.out.println(Test.num1);  //클래스 영역이 다르기 때문에 어느 클래스의 변수명인지 알려줘야 함.
		Test t = new Test();  
		System.out.println(t.num2); //non static이기 때문에 메모리 생성 필수(위에서 생성)
	}

}
