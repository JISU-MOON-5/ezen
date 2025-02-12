package p0204;

public class Food extends Object{ //extends Object 원래 생략되어있음. //food는 food와 object(객체) 2가지로 부를 수 있다
	
	int price;
	String name;
	public String toString() {
		return "가격 : " + price + ", 이름 : " + name;
	}
	
	public static void main(String[] args) {
		Food f = new Food();
		f.name = "참치김밥";
		f.price = 5000;
		System.out.println(f);
	}
}