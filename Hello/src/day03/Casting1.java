package day03;

public class Casting1 {
	public static void main(String[] args) {
		
		
		float num1 = 10;
		double num2 = 10.;
		
		/*
		 * float num2 = 10.;
		 * 
		 * 1. ��������ȯ
		 */
		float num3 = (float) 10.;
		// 2. ���ͷ� ����ȯ
		float num4 = 10.F;
		
		//float Ÿ���� ���� area�� �������� 5�� ���� ���̸� �����ϼ���.
		
		float area =  5 * 5 * 3.14F;
		float area1 = (float) (5*5*3.14);
		
		System.out.println("num1 :" + num1);
		System.out.println("num2 " + num2);
		System.out.println("area : " + area);
		System.out.println("area1 : "+ area1);
	}
}
