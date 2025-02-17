package p0217;


class Text{
	static {
		System.out.println("4");
	}
	
}
public class Scope {
	public Scope() {
		System.out.println("1");
	}
	{
	/*
	 * 초기화 블럭(initialization block) - 접근제어자/데이터타입/이름 없음
	 * 생성자가 실행되기 전에 실행됨, 메모리 없으면 실행 안 됨
	 * static이 들어가면 메인 메소드 전에 먼저 실행됨
	 */
		System.out.println("2");
	}
	public static void main(String[] args) {
		new Scope();
		System.out.println("3");
	}

}
