package day05;


import java.util.*;
public class Test01 {
	/*
	 *  ���� ���� ó�� ���ǹ�
	 *  	����] 
	 *  		1)
	 *  		if(���ǽ�1){
	 *  			����1
	 *  		} else if(���ǽ�2){
	 *  			����2
	 *  		} else if(���ǽ�3){
	 *  			����3
	 *  		} ...
	 *  
	 *  		} else {
	 *  			����n
	 *  		}
	 *  		2)
	 *  
	 *  		// ���ǽ� 2�� ���ΰ�� �������
	 *  		
	 *  		1) --> ���ǽ�1 --> ���ǽ�2 --> ����2 --> 2)
	 */	
	
	// ���� ] ���� �ڵ带 �Է¹޾� �����̸��� �˷��ִ� ���α׷��� �ۼ��ϼ���.
	public static void main(String[] args) {
		// ������ ������ ������ ����� ����
		int kor = 1001;
		int eng = 1002;
		int math = 1003;
		int sci = 1004;
		
		// �Է� ���� �غ��ϰ�
		Scanner sc = new Scanner(System.in); //System.in �� �ý����̶�� �𷡽��� ������ �ִ� ����in
		
		// �޼��� ����ϰ�
		System.out.print("���� �ڵ带 �Է��ϼ���! : ");
		
		// �Է¹޾� ������ ���
		int code = sc.nextInt();
		
		// 5. ���� ó���ϰ�(if ~ else if ~ else)
		// 5.1 ����Ҷ� ����� ���ڿ� ������ ����� 
		String sub = ""; // ���� �̸� ������ ����
		if(code == kor) {
			sub = "����";
		} else if(code == eng) {
			sub = "����";
		} else if(code == math) {
			sub = "����";
		} else if(code == sci) {
			sub = "����";
		} else {
			sub = "���� ����";
		}
		
		// 6.���
		System.out.println("�Է��� �ڵ� [" + code + "] �� �ش��ϴ� ������ [" + sub + "] �Դϴ�.");
	
	}
}
