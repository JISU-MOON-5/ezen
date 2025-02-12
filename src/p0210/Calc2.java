package p0210;

import java.util.Scanner;

public class Calc2 {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		while(true) {
			System.out.print("계산할 값을 숫자, 연산자, 숫자 : ");
			String calcStr = s.nextLine();
			System.out.println("네가 입력한 값 : " + calcStr);
			if("q".equals(calcStr.toLowerCase())) {
				break;
			}
			String[] strs = calcStr.split(",");
			
			int n1 = Integer.parseInt(strs[0]);
			int n2 = Integer.parseInt(strs[2]);
			String operator = strs[1];
			
			if("+".equals(strs[1])) {
				System.out.println(n1 + " + " + n2 + " = " + (n1+n2));
			}else if("-".equals(strs[1])) {
				System.out.println(n1 + " - " + n2 + " = " + (n1-n2));
			}else if("*".equals(strs[1])) {
				System.out.println(n1 + " * " + n2 + " = " + (n1*n2));
			}else if("/".equals(strs[1])) {
				System.out.println(n1 + " / " + n2 + " = " + (n1/n2));
			}else if("%".equals(strs[1])) {
				System.out.println(n1 + " % " + n2 + " = " + (n1%n2));
			}else {
				System.out.println("알 수 없는 연산자입니다.");
			
		}
		System.out.println("계산기가 종료되었습니다.");
		}
	}
}
