package day05;

import java.util.*;

public class Ex01_01 {
	public static void main(String[] args) {
		
		/*
		 * ������ �Է¹޾Ƽ� ������ ������ִ� ���α׷��� �ۼ��ϼ���.
		 * ������
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
		
		System.out.print("������ �Է��ϼ��� : ");
		
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
		System.out.println( sub +" �Դϴ�.");
		
	}
}
