package p0204;

public class StaticTest {
	int num; //멤버변수-다른 클래스 안에는 없음, 메모리 생성 필수
	String str;
	static int num2;
	public static void main(String[] args) {
		System.out.println(num2);  //0
		StaticTest st = new StaticTest();
		System.out.println(st.str);  //null
		System.out.println(st.num);  //0
		st.num = 10;
		System.out.println(st.num);  //10
	}

}
