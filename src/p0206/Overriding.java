package p0206;

class Father{
	void work() {
		System.out.println("아빠가 일합니다.");
	}
}

public class Overriding extends Father{
	
	public static void main(String[] args) {
		Overriding o = new Overriding();
		o.work();
		Father f = new Overriding();
		f.work();
		Object ob = new Overriding();
		// ob.work();는 오류 
		
	}

}
