package day05;
/*
 *	반복문 - for 반복문
 *		형식]
 *			for(카운터 변수 선언;조건식;증감식){
 *				실행문
 * 			}
 */
public class Test03 {
	public static void main(String[] args) {
			// 1부터 10까지 출력하세요
		int i;
		for(i=0;i<10;i++) {
			System.out.println(i+1);
		}
		
		System.out.println("#####################");
		for(i = 1; i<=10; i++) {
			System.out.println(i);
		}
	}
}
