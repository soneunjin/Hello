package day04;

public class Test04 {
	public static void main(String[] args) {
		
		char ch1 = 'a'; //97
		char ch2 = 'Z'; //90
		
		System.out.println("ch1 < ch2 : " + (ch1 < ch2));
		
		System.out.println("abcd" == "abcd"); // �� ���� ���ڿ��� �ּҰ��� ���Ѵ�.
		
		String str1 = "�����ٶ�";
		String str2 = new String("�����ٶ�");
		
		System.out.println("str1 : " + str1);
		System.out.println("str2 : " + str2);
		
		System.out.println("str1 == str2 : " + (str1 == str2));
		
		// ���ڿ��� �������� �񱳴� equals() �Լ��� ����ؼ� ���Ѵ�.
		System.out.println("str1.equals(str2) : "+ str1.contentEquals(str2));
		
	}
}
