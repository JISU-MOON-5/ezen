package p0203;

public class Loop {
	
	public static void main(String[] args) {
		//반복문
		//for, while, do while
		
		for(int i=1; i<10; i++) {
			System.out.println(i);
		}
		int i=1;
		while(i++<10) {
			System.out.println(i); //후순연산자(<->전위연산자)이기 때문에 2~10 출력
		}
	}

}
