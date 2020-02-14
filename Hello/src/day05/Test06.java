package day05;

public class Test06 {
	public static void main(String [] args) {
		
		/*
		 *  랜덤한 숫자를 발생시크는 함수
		 *  	Math.Random() ==> double 타입의 데이터를 0 ~ 0.99999999......
		 *  
		 * 
		 */
		
		// 0 ~ 10 까지의 숫자를 랜덤하게 발생하세요.
		
		//(int)(Math.Random() * (최대숫자 +1));
		int no = (int)(Math.random() * (10+1));
		System.out.println(no);

		// 1 ~ 10 까지의 숫자를 랜덤하게 발생하세요.
		int no1 = (int)(Math.random()*10)+1;
		//(int) Math.Random() * ((최대숫자 - 최소숫자) +1)) + 최소숫자
		System.out.println(no1);
		
		
		
	}
		
}
