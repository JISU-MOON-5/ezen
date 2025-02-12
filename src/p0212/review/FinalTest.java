package p0212.review;

public class FinalTest {
	int I = 1;
	public static void main(String[] args) {
		final int i = 1;
		System.out.println(i);
		FinalTest ft = new FinalTest();
		System.out.println(ft.I);
	}

}
