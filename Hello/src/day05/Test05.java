package day05;

public class Test05 {
	public static void main(String [] args) {
		
		/*
		 * 	�ݺ��� - do ~ while �ݺ���
		 * 		� ���� ��� �ѹ���  �����Ű�� �ݺ���
		 * 		����]
		 * 		do {
		 * 			���๮
		 *     }
		 *     	while(���ǽ�);
		 *     
		 *     	
		 */
		
		boolean boo1 = false;
		do {
			System.out.println("�ѹ��� �����մϴ�.");
		}while(boo1);
		
		
		
		
		
		int i = 0;
		do {
			System.out.println(++i);
			/*
			 * 		i		++i
			 * 		0		1
			 * 		1		2
			 * 		2		3
			 * 		3		4
			 * 		4		5
			 * 
			 */
		}while(i <5);
		
		
		
		
		
}
}