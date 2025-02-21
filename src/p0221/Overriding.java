package p0221;

class Human {
	public void work() {
		System.out.println("일해라");
	}
}
class Me extends Human{
	public void work() {
		System.out.println("공부도 해라");
	}
}
class Moon extends Me{
	public void work() {
		System.out.println("산책도 해라");
	}
}

public class Overriding {
	 public static void main(String[] args) {
		 Human h = new Me();
		 Me m = new Me();
		 Moon mn = new Moon();
		 
		 h.work();
		 m.work();
		 mn.work();
		
	}
}

