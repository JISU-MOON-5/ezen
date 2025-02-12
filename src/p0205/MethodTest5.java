package p0205;

public class MethodTest5 {
	static int money = 100;
	
	static void saveMoney(int money) {
		MethodTest5.money += money;  //static에서 같은 이름을 구분하려면 클래스명을 붙여줘야해
	}
	
	int num = 1000;
	void addNum(int num) {
		this.num += num;  //non static에서 같은 이름을 구분하려면 this.을 붙여줘야해
	}
	public static void main(String[] args) {
		saveMoney(10);
		System.out.println(money);  //(MethodTest5.money)가 풀네임
		MethodTest5 mt = new MethodTest5();
		mt.addNum(10);
		System.out.println(mt.num);
	}
}
