package p0205;

public class StaticTest {
	int i1 = 1;
	int i2 = 2;
	static int i3 = 3;
	
	public static void main(String[] args) {
		StaticTest st = new StaticTest(); // 메모리 생성 //선언+초기화
		System.out.println(st.i1);
		System.out.println(i3);  // (StaticTest.i3)
	}

}
