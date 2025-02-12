package p0207;

import java.util.ArrayList;

public class ListTest { 
	// 장 : 순서대로 있는 것을 순서대로 꺼낼 때 가장 빠름
	// 단 : 삭제 시, 뒤에 것을 다 앞으로 당겨줘야 함
	
	public static void main(String[] args) {
		int[] nums = new int[3];
		ArrayList<Integer> list = new ArrayList<>();  //list의 데이터타입은 ArrayList<Integer>
		System.out.println(list.size());
		list.add(1); // 방을 하나 더함
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(10);
		System.out.println(list.size()); // 방 갯수
		list.remove(1); // 방 하나를 뺌
		System.out.println(list.size());
	}

}
