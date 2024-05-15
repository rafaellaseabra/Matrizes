package Matrizes;

import java.util.Scanner;

public class Atividade03 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
        int m [][]= new int [4][4];
		int v;
		for (int i=0; i<4;i++) {
			for(int j=0; j<4; j++) {
		v= (int) Math.round(Math.random()*4);
			
			if ( i==j) {
				m[i] [j]=v;
				
			}
		}
	}
		for (int i=0; i<4; i++) {
			for (int j=0; j<4; j++) {
				
				System.out.print ("| " + m[i] [j]+ "| " + "|*");
				
			}
			System.out.println();
		}
		
		
		
		
		
		
	}

}
