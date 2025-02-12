package p0212;

class Mother {
	final void test() {  // void 메소드 앞에 final이 붙으면 overriding이 안 됨
		System.out.println("난 엄마 테스트()");
	}
}
public class FinalMethod extends Mother {
	void test(int a) {
		System.out.println("그냥 테스트()");
	}
	public static void main(String[] args) {
		FinalMethod fm = new FinalMethod();
		fm.test(); //엄마 테스트
		Mother m = new FinalMethod();
		m.test(); //엄마 테스트
		Object o = new FinalMethod();
		// o.test(); 는 불가능
	}
	
}
