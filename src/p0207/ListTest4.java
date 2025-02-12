package p0207;

import java.util.ArrayList;
import java.util.Random;

public class ListTest4 {

	public static void main(String[] args) {
		// nums에 1~10까지의 난수를 10개 추가하고
		// nums의 각 index에 어떤 값이 있는지 출력하세요
		// ex) nums에 [1,3,4,5,6,8]이 저장되어 있다면
		// 출력은 "nums[0] = 1"
		// "nums[1] = 3"
		// ...
		// "nums[5] = 8" 이런식으로 출력되어야 한다.
		ArrayList<Integer> nums = new ArrayList<>();
		Random r = new Random();
		
		// 1) while(nums.size()<10) {  //for문 없애고
		//    int rNum  ~~~~ 과 같다
		// 2) if(nums.indexOf(rNum) != -1) {
		//    i--;
		//    continue; 
		//    } nums.add(rNum);  ~~~~과 같다
		for (int i = 1; i <= 10; i++) {
			int rNum = r.nextInt(10)+1; //1~10
			if(nums.indexOf(rNum) == -1) {
				nums.add(rNum);
			}else { //중복방지
				i--;
			}
		}
		for (int i = 0; i < 10; i++) {
			System.out.println("nums[" + i + "] = " + nums.get(i));
		}
	}
}
