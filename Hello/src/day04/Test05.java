package day04;

import java.util.*;

public class Test05 {
	public static void main(String[] args) {
		
		/*
		 * ���ĺ��� �Է¹޾Ƽ� 
		 * �빮���̸� "�Է¹��� ���� O�� �빮���Դϴ�."
		 * �ҹ����̸� "�Է¹��� ���� o�� �ҹ����Դϴ�."
		 * �� ��µǰ� �ϼ���.
		 * 
		 * Scanner ������ ���ڸ� �������ִ� �Լ��� ���� ���� �ʴ´�.
		 * ���� ���ڿ��� ������ �Ŀ� ù��° �ڸ��� ���ڸ� �����ؼ� ����ؾ� �Ѵ�.
		 * 
		 * charAt(��ġ��) ==> ���ڿ��� ��ġ���� ����ִ� ���ڸ� �������ִ� �Լ�
		 * 		����]
		 * 			�ڹٿ��� ����ϴ� ��ġ���� index��� �θ��� 0���� �����Ѵ�.
		 * 
		 * 		 *
		 * indexOf(���� �Ǵ� ���ڿ�) ==> �ش� ���ڰ� ó�� �����ϴ� ��ġ���� ��ȯ���ش�.
		 * 
		 */
		
		
	
		String str = "class";
		
		// ù��° ���� �����ϱ�
		char ch = str.charAt(0);
		System.out.println("str�� ù��° ����: " + ch);
		
		//a �� ��ġ�� �˾Ƴ���
		int idx = str.indexOf('a');
		System.out.println("str �� a �� ��ġ�� : "+ idx);
		
		//�Է¹��� �غ�
		Scanner sc = new Scanner(System.in);
		
		// �޼��� ����ϰ�
		System.out.print("���ĺ��� �Է��ϼ���! : ");
		String str9 = sc.nextLine();
		
		// ���� ����
		char ch1 = str9.charAt(0);
		
		String str2 = (ch1 >= 'a') ? "��" : "��";
		String str3 = ("�Էµ� ����" + ch1 + "��" + str2 + "���� �Դϴ�.");
		
		// str3 ���
		System.out.println(str3);
		
		// 3�� ���� ������ ��ø ���
		String str4 = (ch1 >= 'a') ? ((ch1 <= 'z')? "��" : "Ư��") : "��";
		System.out.println("�Էµ� ����" + ch1 + "��" + str4 + "���� �Դϴ�.");
		
		/*
		 *  �ڹٿ��� �񱳴� �ѹ��� �Ѱ��� �� �� �ִ�.
		 *  	a > b > c = (x)
		 *  	a > b = (o)
		 *      c > b = (o)
		 */
		
		
		
	}
}
