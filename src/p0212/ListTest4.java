package p0212;

import java.util.ArrayList;

public class ListTest4 {
	
	public static void main(String[] args) {
		
		Dog d1 = new Dog();
		d1.setName("뽀또");
		d1.setSpecies("믹스");
		d1.setAge(3);
		Dog d2 = new Dog();
		d2.setName("오댕");
		d2.setSpecies("시츄");
		d2.setAge(5);
		Dog d3 = new Dog();
		d3.setName("단풍");
		d3.setSpecies("말티푸");
		d3.setAge(3);
		Dog d4 = new Dog();
		d4.setName("레오");
		d4.setSpecies("포메라니안");
		d4.setAge(6);
		
		ArrayList<Dog> dogList = new ArrayList<>();
		dogList.add(d1);
		dogList.add(d2);
		dogList.add(d3);
		dogList.add(d4);
		
		for(Dog d:dogList) {
			String name = d.getName();
			if(d.getAge() > 3) {
			System.out.println(d);
			}
		}
	}
}
