package p0211;

import java.util.ArrayList;
import java.util.HashSet;

public class SetTest {
	
	public static void main(String[] args) {
		ArrayList<String> str = new ArrayList<>();
		str.add("1");
		str.add("1");
		str.add("1");
		str.add("1");
		System.out.println(str.size()); //4
		HashSet<String> set = new HashSet<>();
		set.add("1");
		set.add("1");
		set.add("1");
		set.add("1");
		System.out.println(set.size()); //1
	}

}
