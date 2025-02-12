package p0203;

public class ExitTest {
	
	public static void main(String[] args) {
		for(int i=1; i<=10; i++) {
			System.out.println(i);
			if(i==5) {
				return; //return은 값을 만족하면 메인 메소드를 나감. 
						//break는 반복문에서만 사용하며 해당 반복문을 종료.
			}
		}
		System.out.println("반복문이 종료되었습니다.");
	}

}
