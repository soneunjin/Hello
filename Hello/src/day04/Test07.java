package day04;

import java.util.*;

public class Test07 {
	public static void main(String[] args) {

		/*
		   ������ �Է¹޾� �Էµ� ���� ¦������ Ȧ�� ���� �Ǻ��ϼ���.
		  
		 */
		
		// �Է¹��� �غ��ϰ�
		Scanner sc = new Scanner(System.in);
		
		//�޼����� ����ϰ�
		System.out.println("������ �Է��ϼ���! : ");
		
		//�Է°� �����ؼ� ������ ���
		int no = sc.nextInt();

		//�Ǻ��ϰ�
		if(no % 2 == 0) {
			System.out.println(no + " �� ¦���Դϴ�. ");
		}
			
		if(no % 2 != 0) {
				System.out.println(no + " �� Ȧ���Դϴ�.");
			
			
		}
		
		
		//------------------------------------------------
		
		String msg = "Ȧ��";
		if(no % 2 == 0) {
			msg = "¦��";
			
		}
		
		System.out.println(no + " �� "+ msg + " �Դϴ�.");
		
		
		if(no % 2 ==0) {
			System.out.println(no + " �� ¦���Դϴ�.");
			
	
		}
		
		
		
	}
}
