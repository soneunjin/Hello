package day05;

/*
 * �ݺ��� - while ���
 * 		����]
 * 			while(���ǽ�){
 * 				���๮ 
 * 			}
 */
public class Test04 {
	public static void main(String [] args) {
		
		/*
		 *  ����] while ������� ó���ϼ���.
		 * 		���ĺ� 'O' ���� ���������� ���ڸ� 5���� ���� ����ϼ���. 
		 *
		 *		while �ݺ����� ��ɹ� ���ο� ������ ������ ���� ������ ������ ������ ������ְ�
		 *		�����ĵ� ������ ó���ؾ� �Ѵ�.
		 */	
		int i = 0;
		char ch = 'O';
		
		while(i<5) {
			System.out.println((char)(ch +i));
			i++;
		}
		
		
	}
}
