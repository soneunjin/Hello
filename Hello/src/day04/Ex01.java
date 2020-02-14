package day04;

import java.util.*;

public class Ex01 {
	public static void main(String[] args) {
		
		/*
		 * 
		 * 	숙제 1]
		 * 		알파벳 문자 하나를 입력받아서
		 * 		소문자면 대문자로 대문자면 소문자로 변환해서 출력하세요
		 * 
		 *  'a' - 'A' ==> 32
		 *  
		 *  b - 32 ==> 'B'
		 * 
		 * 
		 *  숙제 2]
		 *  	정수 3개를 임의로 입력받아서
		 *  	세 수중 큰 숫자만 출력되게 하세요.
		 *  
		 *  
		 * 
		 */
		
		// 1. 입력받을 준비하고
		 Scanner sc = new Scanner(System.in);
		// 2. 메세지 출력
		 System.out.print("문자를 입력하세요 : ");
		// 3. 입력데이터 변수에 담고
		 String str = sc.nextLine();
		// 4. 변수에 담긴 문자열에서 문자 추출하고
		 char ch = str.charAt(0);
		// 5. 변환해서 변수에 담고
		 char ch1 = (ch >= 'a') ? (char)(ch - ('a' - 'A')) : (char)(ch + ('a' - 'A'));
		// 6. 출력해준다
		 System.out.println("입력한 문자 ["+ ch + "] 를 변환하며["+ ch1+"] 입니다." );
		
		
		
	}
}
