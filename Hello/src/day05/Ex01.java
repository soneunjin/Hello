package day05;

import java.util.*;

public class Ex01 {
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
		if(no > 100 ) {
			System.out.print("ERROR");
		}else if (no >=90 && no <=100) {
			sub = "A";
		}else if(no >=80 && no < 89) {
			sub = "B";
		}else if(no >=70 && no < 79) {
			sub = "C";
		}else if(no >=60 && no < 69) {
			sub = "D";
		}else if(no >=50 && no < 59) {
			sub = "F";
			
		}else {
		}
		System.out.println( sub +" �Դϴ�.");
		
	}
}
