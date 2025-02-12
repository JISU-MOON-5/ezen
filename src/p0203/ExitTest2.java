package p0203;

public class ExitTest2 {
	
	public static void main(String[] args) {
		for(int i=1; i<=10; i++) {
			for(int j=1; j<=10; j++) {
				System.out.println(i+j);
				if(i==1) {
					// i=10; //위의 큰 for문까지 나가게 하기 위해서
					// break;
					return;
				}
			}
		}
	}

}
