package Matrizes;

import java.util.Scanner;

public class Atividade01 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);

		int m [][]= new int [5][5];
		int  soma=0,  v;

		for (int i=0; i<5;i++) {
			for(int j=0; j<5; j++) {
				v= (int) Math.round(Math.random()*2);

				if (v % 2 ==0) {
				m[i] [j]=v;
				soma = soma + m[i] [j];
				}

			}
		}
		for (int i=0; i<5; i++) {
			for (int j=0; j<5; j++) {
				System.out.println ("Os valores são: " + m[i] [j]);

			}
		}
		System.out.println("O resultado da soma é igual: : " + soma);

		ler.close();

	}

}
