package day05;

import java.util.*;
public class Test02 {
	public static void main(String[] args) {
		// ���ڸ� ����(10 ~ 59)�� �Է¹޾Ƽ� �� ���� ���Ǵ����� ��� ū������ �˾Ƴ�����.
		// ����
		// 1. �Է¹��� �غ��ϰ�
		Scanner sc = new Scanner(System.in);
		
		// 2. �޼��� ����ϰ�
		System.out.print("10 ~ 59 �� ���ڸ� �Է��ϼ���! : ");
		//      �� �̳��� ����
		
		// 3. �Է¹޾Ƽ� ������ ���
		int no = sc.nextInt();
		
		// 4. ���� �ڸ� ����ϰ�
		//  ���ǿ� ���� ���� ������ ���� �����

		int num = 0;
		// 5. ����ó���ϰ�
			if(no >= 10 && no < 60) {
			if(no >= 50) {
				num = 50;
			}else if(no >= 40) {
				num = 40;
			}else if(no >= 30) {
				num = 30;
			}else if(no >= 20) {
				num = 20;
			}else if(no >= 10) {
				num = 10;
			}else {
				num = 0;
			}
		// 6. ���
		System.out.println("�Էµ� ���� ["+ no + "] �� �����ڸ��� " + num + " �Դϴ�.");
			}
	}
}
