package day04;

import java.util.*;

public class Ex01 {
	public static void main(String[] args) {
		
		/*
		 * 
		 * 	���� 1]
		 * 		���ĺ� ���� �ϳ��� �Է¹޾Ƽ�
		 * 		�ҹ��ڸ� �빮�ڷ� �빮�ڸ� �ҹ��ڷ� ��ȯ�ؼ� ����ϼ���
		 * 
		 *  'a' - 'A' ==> 32
		 *  
		 *  b - 32 ==> 'B'
		 * 
		 * 
		 *  ���� 2]
		 *  	���� 3���� ���Ƿ� �Է¹޾Ƽ�
		 *  	�� ���� ū ���ڸ� ��µǰ� �ϼ���.
		 *  
		 *  
		 * 
		 */
		
		// 1. �Է¹��� �غ��ϰ�
		 Scanner sc = new Scanner(System.in);
		// 2. �޼��� ���
		 System.out.print("���ڸ� �Է��ϼ��� : ");
		// 3. �Էµ����� ������ ���
		 String str = sc.nextLine();
		// 4. ������ ��� ���ڿ����� ���� �����ϰ�
		 char ch = str.charAt(0);
		// 5. ��ȯ�ؼ� ������ ���
		 char ch1 = (ch >= 'a') ? (char)(ch - ('a' - 'A')) : (char)(ch + ('a' - 'A'));
		// 6. ������ش�
		 System.out.println("�Է��� ���� ["+ ch + "] �� ��ȯ�ϸ�["+ ch1+"] �Դϴ�." );
		
		
		
	}
}
