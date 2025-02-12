package p0205;

public class Constructor {  
	//생성자- 데이터타입 없음, 메모리를 생설할 때 호출해야해서 필요함
	//클래스명과 대문자까지 완벽하게 적혀야 함
	//오버로딩 가능-매개변수가 다르면 다른 컨럭
	public Constructor() {
		System.out.println("컨스트럭쳐 클래스 메모리를 생성했으니");
		System.out.println("ㅁㄴㅇㄹ");
		System.out.println("ㅁㄴㅇㄹ");
		System.out.println("ㅁㄴㅇㄹ");
		System.out.println("내 할일 다해야 다음으로 넘어감");
	}
	public static void main(String[] args) {
		Constructor c = new Constructor();
		System.out.println(c);
	}

}
