package Lotto;

import java.util.*;

public class Lotto {
	public static void main(String [] args) {
		
		int Lotto[] = new int[6];
	
		for(int i=0;i<Lotto.length;i++) {
			Lotto[i] =(int)(Math.random()*45)+1;
			
			for(int j=0;j<i;j++) {
				if(Lotto[i]==Lotto[j]) {
					i--;
					break;
				}
			}

	
		}
		
		for(int i=0;i<Lotto.length;i++) {
			Arrays.sort(Lotto);
			System.out.print(Lotto[i]+ " ");
		}

	}
}
