package p0207;

public class StringTest {
	
	public static void main(String[] args) {
		String str1 = "안녕";
		String str2 = "안녕";
		System.out.println(str1==str2); //true
		
		String str3 = null;
		System.out.println(str1==str3); //false
		System.out.println(str2==str3); //false
		
		System.out.println(str1.equals(str3)); //false
		System.out.println(str2.equals(str3)); //false
		
		System.out.println(str3!=null && str3.equals("안녕")); //false  -> str3=null 일때 값을 비교하는 방법
		System.out.println("안녕".equals(str3)); //false  -> 비교하는 값을 앞에다 먼저 써주면 편함
	}
}
