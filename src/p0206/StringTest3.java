package p0206;

public class StringTest3 {
	
	public static void main(String[] args) {
		int i = 1;
		double bl = 1;
		System.out.println(i==1);
		System.out.println(bl); //1.0
		System.out.println(bl+1); //2.0
		
		String str1 = new String("안녕");
		String str2 = new String("안녕");
		System.out.println(str1); //안녕
		System.out.println(str2); //안녕
		System.out.println(str1==str2); //false, 주소를 비교
		System.out.println(str1.equals(str2)); //true, 값을 비교 -> String에서는 값을 비교하기 위해 .equals()를 사용
		
		String str3 = "안녕";
		String str4 = "안녕";
		System.out.println(str3==str4); //true -> new String을 안 했기 때문에
	}

}
