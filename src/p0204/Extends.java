package p0204;

class Mother {
	int money = 100000;
	int age;
	void test() {
		System.out.println("난 엄마 테스트");
	}
}

public class Extends extends Mother { //Mother의 내용을 상속받음. 'extends(확장)'사용 
										//상속 받아도 private은 같은 영역이 아니면 절대 안 됨.
	
	public static void main(String[] args) {
		Extends e = new Extends();
		e.test();
		System.out.println(e.age);
		System.out.println(e.money);
		
	}

}
