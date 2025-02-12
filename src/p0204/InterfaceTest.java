package p0204;

interface Action {  //interface(표준)는 method body를 만들 수 없고, 선언만 가능
	void run();     //무조건 override 해줘야 함
	void sleep();
	void work();
}

public class InterfaceTest implements Action{   //implements : 구현

	public static void main(String[] args) {
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void work() {
		// TODO Auto-generated method stub
		
	}
}
