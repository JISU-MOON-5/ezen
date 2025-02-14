package p0214;

public class Switch {

	public static void main(String[] args) {
		int age = 20;
		if (age < 10) {
			System.out.println("유아");
		} else if (age < 20) {
			System.out.println("10대");
		}

		age /= 10;
		switch (age) {
		case 0:
			System.out.println("유아");
			break;
		case 1:
			System.out.println("10대");
			break;
		case 2:
			System.out.println("20대");
			break;
		default:
			System.out.println("노땅");
		}
	}

}
