package day05;

public class Test07 {
	public static void main(String [] args) {
		
		/*
		 *  �迭
		 *  	: ���� Ÿ���� �����͸� ������ ���ÿ� �����ϵ��� �س��� Ÿ��
		 *  
		 *  ����]
		 *  	������Ÿ��[] �����̸� = new ������Ÿ��[������ ����]; 
		 * 
		 * 	������ ���]
		 * 		�����̸�[�ε���];
		 * 
		 */
		
		
		// 1 ~ 5 ���� ���ڸ� �迭�� ��Ƽ� ����ϼ���.
		int[] num = new int[5];
		
		for(int i=0;i<5;i++) {	
		num[i] = i+1;
		
	}
		
		for(int i =0;i < num.length;i++) {
			System.out.println(num[i]);
			
		}
}
}