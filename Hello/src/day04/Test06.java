package day04;

import java.util.*;
public class Test06 {
	public static void main(String[] args) {
		
		/*
		 *  ��� - ���α׷��� �帧�� �����ϴ� ����
		 *  	����
		 *  		1. ���ǹ� - ������ �ְ� ���ǿ� ������ �����ϴ� ����
		 *  			if, if~else, if~ else if ~ else switch ~ case
		 *  			
		 *  			1)if ��
		 *  				����]
		 *  					a)
		 *  					if(���ǽ�(b)) {
		 *  					      ���๮��(c)
		 *  					}
		 *  
		 *  					(d)
		 *  
		 *  					b�� ��(true)��     ��� : a - b - c - d
		 *  					b�� ����(false)�� ��� : a - b - d
		 *				2) ���� PDF ����
		 *
		 *  
		 *  		2. �ݺ��� - �ݺ��� �����ϴ� ����
		 *  			for, while, do ~ while, ���� for ��� 
		 * 
		 */
		
			//���� �ڵ带 ����� �ڵ带 �Է��ϸ� ������ ���������.
		
			int kor = 1001;
			int eng = 1002;
			int math = 1003;
			int sci = 1004;
			
			//���� �̸� ���� ���� ����
			String sub = "programming";
			
			// �Է¹��� �غ��ϰ�
			Scanner sc = new Scanner(System.in);
			// �޼����� ����ϰ�
			System.out.print("���� �ڵ带 �Է��ϼ���! : ");
			
			// �ڵ� �Է¹޾� �����ϰ�
			int code = sc.nextInt();
			sc.close();
			
			switch(code) {
			case 1001 :
				sub = "����";
				break;
		
			case 1002 :
				sub = "����";
				break;
			case 1003 :
				sub = "����";
				break;
			case 1004 :
				sub = "����";
				break;
				
				default:
					sub = "����";
				
				
			}
			System.out.println("�Էµ� �ڵ�� " + sub +"�����Դϴ�.");
			
			
	}


}
