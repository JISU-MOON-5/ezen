package p0212;

import java.util.ArrayList;

public class ListTest6 {
	
	public static void main(String[] args) {
		
		Coffee c1 = new Coffee();
		c1.setName("아메리카노");
		c1.setPrice(2000);
		c1.setCountry("콜롬비아");
		Coffee c2 = new Coffee();
		c2.setName("콜드브루");
		c2.setPrice(5000);
		c2.setCountry("브라질");
		Coffee c3 = new Coffee();
		c3.setName("핸드드립");
		c3.setPrice(6000);
		c3.setCountry("에티오피아 + 브라질");
		
		ArrayList<Coffee> list = new ArrayList<>();
		list.add(c1);
		list.add(c2);
		list.add(c3);
		
		for(Coffee c : list) {
			if(c.getCountry().contains("브라질") && c.getPrice() < 6000) {
			System.out.println(c);
			}
		}
	}
}
