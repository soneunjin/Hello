package day05;

import java.util.*;

public class Ex01_01 {
	public static void main(String[] args) {
		
		/*
		 * 점수를 입력받아서 학점을 출력해주는 프로그램을 작성하세요.
		 * 학점은
		 * 		A : 90 ~ 100
		 * 		B : 80 ~ 89
		 * 		C : 70 ~ 79
		 * 		D : 60 ~ 69
		 * 		F : 0 ~ 59
		 * 
		 * 
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요 : ");
		
		int no = sc.nextInt();
		String sub = "";
		int tmp = no / 10;
		switch(tmp) {
		case 10 :
			sub = "A";
			break;
		case 9 :
			sub = "A";
			break;
		case 8 :
			sub = "B";
			break;
		case 7 :
			sub = "C";
			break;
		case 6 :
			sub = "D";
			break;
		default :
			sub = "F";
		}
		System.out.println( sub +" 입니다.");
		
	}
}
