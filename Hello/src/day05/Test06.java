package day05;

public class Test06 {
	public static void main(String [] args) {
		
		/*
		 *  ������ ���ڸ� �߻���ũ�� �Լ�
		 *  	Math.Random() ==> double Ÿ���� �����͸� 0 ~ 0.99999999......
		 *  
		 * 
		 */
		
		// 0 ~ 10 ������ ���ڸ� �����ϰ� �߻��ϼ���.
		
		//(int)(Math.Random() * (�ִ���� +1));
		int no = (int)(Math.random() * (10+1));
		System.out.println(no);

		// 1 ~ 10 ������ ���ڸ� �����ϰ� �߻��ϼ���.
		int no1 = (int)(Math.random()*10)+1;
		//(int) Math.Random() * ((�ִ���� - �ּҼ���) +1)) + �ּҼ���
		System.out.println(no1);
		
		
		
	}
		
}
