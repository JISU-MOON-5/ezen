package p0213;

public interface Action {
	// 메모리 생성 불가능
	// interface는 메소드의 선언만 가능하며, 구현(implements)은 불가능하다(바디를 만들 수 없음)
	// interface에서 메소드의 접근제어자는 public만 가능하다, 즉 안 쓰면 public
	void eat();
	void play();
	void work();
}
