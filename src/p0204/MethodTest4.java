package p0204;

public class MethodTest4 {
	int money = 1000;

	void saveMoney(int money) {
		this.money += money; // this. 는 같은 변수명일 때, 위에 있는 멤버변수명을 가리키기 위해 사용.

	}

	public static void main(String[] args) {
		MethodTest4 mt = new MethodTest4();
		mt.saveMoney(1000);
		System.out.println(mt.money); // 2000
		
		MethodTest4 mt1 = new MethodTest4();
		mt1.saveMoney(3000);
		System.out.println(mt1.money); // 4000
	}

}
