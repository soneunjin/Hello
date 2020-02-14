package day05;

public class Test09 {
	public static void main(String [] args) {
		
		/*
		 *  1 ~ 9 까지 숫자를 랜덤하게 5개를 발생시켜서 배열에 넣어서 출력하세요.
		 * 
		 */
		int[] num = new int [5];
				
		lotto: //label이 붙은 for 명령
			for(int i=0;i<5;i++) {
	 
	    	int tmp = (int)(Math.random()*9) + 1;
	    	for(int j = 0; j < i; j++) {
	    		if(tmp == num[j]) {
	    			i--;
	    			continue lotto;
	    			
	    			
	    			
	    		}
	    	}
	    	num[i] = tmp;
	    }
		// 출력
		for(int no : num) { // 향상된 for 명령
			System.out.println(no);
		}
		
	}
}
