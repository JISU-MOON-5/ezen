package p0206;

class Mother {  //extends Object가 생략되어있음
	void work() {
		System.out.println("어머님이 일하신다.");
	}
}

public class Overriding2 extends Mother {
	void work() {
		System.out.println("내가 일한다.");
	}
	// 홍길동은 사람으로 부를 수 있다.
	// 즉, 사람 s = new 홍길동()이 가능하지만
	// 사람은 홍길동이라고 부를 수 없으니
	// 홍길동 h = new 사람()은 불가능!
	public static void main(String[] args) {
		Overriding2 o = new Overriding2();
		// Overriding2 o2 = new Mother();
		String str = o.toString();
		o.work(); //오버라이딩의 work(); 실행
		
		Mother m = new Overriding2();
		m.work(); //오버라이딩의 work(); 실행
	}

}
