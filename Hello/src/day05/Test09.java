package day05;

public class Test09 {
	public static void main(String [] args) {
		
		/*
		 *  1 ~ 9 ���� ���ڸ� �����ϰ� 5���� �߻����Ѽ� �迭�� �־ ����ϼ���.
		 * 
		 */
		int[] num = new int [5];
				
		lotto: //label�� ���� for ���
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
		// ���
		for(int no : num) { // ���� for ���
			System.out.println(no);
		}
		
	}
}
