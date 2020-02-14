package day05;

public class Test07 {
	public static void main(String [] args) {
		
		/*
		 *  배열
		 *  	: 같은 타입의 데이터를 여러게 동시에 관리하도록 해놓은 타입
		 *  
		 *  형식]
		 *  	데이터타입[] 변수이름 = new 데이터타입[관리할 갯수]; 
		 * 
		 * 	꺼내는 방법]
		 * 		변수이름[인덱스];
		 * 
		 */
		
		
		// 1 ~ 5 까지 숫자를 배열에 담아서 출력하세요.
		int[] num = new int[5];
		
		for(int i=0;i<5;i++) {	
		num[i] = i+1;
		
	}
		
		for(int i =0;i < num.length;i++) {
			System.out.println(num[i]);
			
		}
}
}