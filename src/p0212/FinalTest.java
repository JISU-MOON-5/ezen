package p0212;

public class FinalTest {
	final int I = 1;
	public static void main(String[] args) {
		final int i = 1;
		// i = 2;
		System.out.println(i);
		FinalTest ft = new FinalTest();
		System.out.println(ft.I);
	}

}
