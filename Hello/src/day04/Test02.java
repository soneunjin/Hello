package day04;

import java.util.*;

public class Test02 {
	public static void main(String[] args) {
		
		
		/*
		 * 
		 * �ֿܼ��� ����(����) 2���� �Է¹޾� ����(no1,no2)�� ������ �ϰ�
		 * �μ��� ���ؼ� no1�� no2���� ũ�� "no1�� no2 ���� Ů�ϴ�."
		 * ������ "no1�� no2���� �۽��ϴ�." ��� �޼����� ��µǰ� �ϼ���.
		 * 
		 * 
		 * ����]
		 * 		�ܼ�ȯ�濡�� �����͸� �Է¹޴� ���
		 * 
		 * 
		 * 		Scanner sc = new Scanner(System.in); // �ֿܼ��� �ԷµǴ� �����͸� �����ϴ� Ŭ����

		 * 
		 * 		// �ԷµǾ� �ִ� �����ʹ� ������ Ÿ�Կ� �°� ������ ����ϸ� �ȴ�.
		 * 		int no1 = sc.nextInt(); // �Էµ� ������ ������ �Լ�
		 * 
		 * 	
		 */
		
			// Scanner �����
			Scanner sc = new Scanner(System.in);
			
			//�޼����� ����
			System.out.print("no1�� ���� ������ �Է��ϼ���! : ");
			
			// ���� ������ ���� ������ �����
			int no1,no2;
			
			//���ڸ� ������ no1�� ���
			
			no1 = sc.nextInt();
			System.out.println();
			// �޼��� ���
			System.out.print("no2�� ���� ������ �Է��ϼ���! : ");
			
			// no2�� ������ ������ ���
			no2 = sc.nextInt();
			System.out.println();
			// ��� �޼����� ���� ������ �����
			String msg = new String();
			
			
			// ���� �����ڷ� ���ڸ� ���ؼ� �޼����� ������ ���
			
			msg = (no1 > no2) ? (no1 + "��" + no2 + "���� Ů�ϴ�.") :(no1 + "��" + no2 + "���� �۽��ϴ�.");
			
			// �޼����� ����Ѵ�.
			
			System.out.println(msg);
			
			
	}
}
