package day03;

public class Casting1 {
	public static void main(String[] args) {
		
		
		float num1 = 10;
		double num2 = 10.;
		
		/*
		 * float num2 = 10.;
		 * 
		 * 1. 강제형변환
		 */
		float num3 = (float) 10.;
		// 2. 리터럴 형변환
		float num4 = 10.F;
		
		//float 타이의 변수 area에 반지름이 5인 원의 넓이를 저장하세요.
		
		float area =  5 * 5 * 3.14F;
		float area1 = (float) (5*5*3.14);
		
		System.out.println("num1 :" + num1);
		System.out.println("num2 " + num2);
		System.out.println("area : " + area);
		System.out.println("area1 : "+ area1);
	}
}
