package p0204;

public class Array {

	public static void main(String[] args) {
		// 배열
		// 배열은 반드시 사이즈(방 갯수)를 정해줘야 함.
		int[] nums = new int[3];

		nums[0] = 10;
		nums[1] = 20;
		nums[2] = 30;
		// 사이즈를 늘리거나 줄일 수가 없음.
		// 사이즈를 늘리려면 아래의 swap 과정이 필요
		int[] tmps = nums;
		nums = new int[4];
		for (int i = 0; i < tmps.length; i++) {
			nums[i] = tmps[i];
		}
		System.out.println(nums[0]);

		// 줄이기
		tmps = nums;
		nums = new int[3];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = tmps[i];
		}
	}

}
