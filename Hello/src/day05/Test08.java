package day05;

/*
 * 	break 	 : 현재 실행되고 있는 반복문이나 switch 문을 즉시 종료하세요. 라는 의미의 명령어
 * 	continue : 현재 실행되는 반복문을 다음 회차로 계속 진행하세요 라는 명령 
 * 
 */


public class Test08 {
	public static void main(String[] args) {
		
		//1부터 5까지 출력하는데 3은 제외하세요.
		
		for(int i=1;i<=5;i++) {
			
			if(i == 3) {
				
				continue;
			}
			
			System.out.println(i);
			
			
		}
	}
}
