package p0210;

import java.util.ArrayList;
import java.util.Random;

public class FindMaxNum {

	public static void main(String[] args) {
	ArrayList<Integer> nums = new ArrayList<>();
	Random r = new Random();
	while(nums.size()<10) {
		int rNum = r.nextInt(50) + 1;
		if (nums.indexOf(rNum) == -1) {
			nums.add(rNum);
		}
	}
	System.out.println(nums);
	int max = 0;
	for(int i = 0;i<nums.size();i++)
	{
		if (max == 0) {
			max = nums.get(i);
		} else if (max < nums.get(i)) {
			max = nums.get(i);
			}
		}
		System.out.println("최대값 : "+ max);
	}
}
