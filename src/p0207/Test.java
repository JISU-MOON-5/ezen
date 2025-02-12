package p0207;

public class Test {
	int num;
	String str;
	static int num2;
	public static void main(String[] args) {
		System.out.println(num2); //0
		Test t = new Test();
		System.out.println(t.str); //null
		System.out.println(t.num); //0
		t.num = 10;
		System.out.println(t.num); //10
	}
}
