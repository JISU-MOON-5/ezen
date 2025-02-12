package p0207;

public class StringTest4 {
	
	public static void main(String[] args) {
		String str = "1,2,3,4,5,6,7,8";
		// replace를 사용하지 않고
		// ","를 모두 제거한 후에
		// str의 값을 출력해주세요
		String[] strs = str.split(",");
		str = "";
		for(int i=0; i<strs.length; i++) {
			str += strs[i];
		}
		System.out.println(str);
		// String tmpStr = "";
		// for(int i=0; i<strs.length; i++) {
		// String s = str.substring(i, i+1);
		// System.out.println(s);
	}
}
