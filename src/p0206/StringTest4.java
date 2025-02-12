package p0206;

public class StringTest4 {
	
	public static void main(String[] args) {
		String str = "안녕하세요";
		int idx = str.indexOf("세");
		System.out.println(idx); //3
		idx = str.indexOf("안");
		System.out.println(idx); //0
		
		idx = str.indexOf("안녕"); 
		System.out.println(idx); //0
	
		idx = str.indexOf("하세요"); 
		System.out.println(idx); //2
		idx = str.indexOf("히세요.");
		System.out.println(idx); //-1
		idx = str.indexOf("ㅎ"); 
		System.out.println(idx); //-1
		
		System.out.println(str.replace("안", "an")); // an녕하세요 // replace -> 앞의 것을 뒤로 바꿈
		System.out.println(str);
		
		str = str.replace("안", "an");
		str = str.replace("하", "ha");
		System.out.println(str); // an녕ha세요
		
		str = "안녕하세요";
		System.out.println(str.substring(0,2)); //안녕
		System.out.println(str.substring(2,3)); //하
		System.out.println(str.substring(2,2)); //""
	}

}
