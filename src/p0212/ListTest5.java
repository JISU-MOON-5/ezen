package p0212;

import java.util.ArrayList;

public class ListTest5 {
	
	public static void main(String[] args) {
		
		Member m1 = new Member();
		m1.setName("최희재");
		m1.setGrade(46);
		m1.setAddress("서울");
		Member m2 = new Member();
		m2.setName("황예지");
		m2.setGrade(48);
		m2.setAddress("제주");
		Member m3 = new Member();
		m3.setName("지선욱");
		m3.setGrade(45);
		m3.setAddress("창원");
		Member m4 = new Member();
		m4.setName("고하영");
		m4.setGrade(49);
		m4.setAddress("경기");
		
		ArrayList<Member> memberList = new ArrayList<>();
		memberList.add(m1);
		memberList.add(m2);
		memberList.add(m3);
		memberList.add(m4);
		
		for(Member m : memberList) {
			System.out.println(m);
		}
	}
}
