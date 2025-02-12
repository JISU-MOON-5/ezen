package p0210;

import java.util.ArrayList;
import java.util.Random;

public class FindMinNum {

	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<>();
		Random r = new Random();
		while (nums.size() < 10) { // while(nums.size()<2)을 하면 100% 값이 2가 나오게 할 수 있음
			int rNum = r.nextInt(50) + 1;
			if (nums.indexOf(rNum) == -1) {
				nums.add(rNum);
			}
		}
		System.out.println(nums);
		int min = 0;
		for (int i = 0; i < nums.size(); i++) {
			if (min == 0) {
				min = nums.get(i);
			} else if (min > nums.get(i)) {
				min = nums.get(i);
			}
		}
		System.out.println("최소값 : " + min);
	}
}
