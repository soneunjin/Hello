package day04;
import java.util.*;
public class Ex02 {
	public static void main(String[] args) {
		/*
		 *  ����2]
		 *  	���� 3���� �Է¹޾Ƽ�
		 *  	�� ���� ū ���ڸ� ��µǰ� �ϼ���.
		 */
		// �Է¹��� �غ��ϰ�
		Scanner sc = new Scanner(System.in);
		// �޼��� ����ϰ� �Է¹��� ���� ������ ����ϰ�(3��)
		System.out.print("ù��° ������ �Է��ϼ��� :");
		int no1 = sc.nextInt();
		System.out.print("�ι�° ������ �Է��ϼ��� :");
		int no2 = sc.nextInt();
		System.out.print("����° ������ �Է��ϼ��� :");
		int no3 = sc.nextInt();
		// ������ ���ϰ�
		int result = (no1 >= no2) ? ((no1 >= no3 ? no1 : no3)) : ((no2 > no3 ? no2 : no3));
		// ���� ū �� ����ϰ�
		System.out.println("�Է��� �� ��[" + no1 + ","+ no2 + ","+ no3 + "] �� ���� ū ���� ["+ result +"] �Դϴ�.");
		
		
		
	}
}
