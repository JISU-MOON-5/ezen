package p0221;

class Test {
	public String toString() {
		return "1";
	}
}

public class Overloading extends Test{
	
	public static void main(String[] args) {
		Test t = new Test();
		Object o = new Test();
		System.out.println(o);
		}
}
