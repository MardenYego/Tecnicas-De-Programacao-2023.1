package questoes;

import java.util.Scanner;

public class Questao06 {

	
	public static void main(String[] args) {
		
		int[][] matriz = new int[3][3]; 
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe os valores para sua matriz 3x3:");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				matriz[i][j]=ler.nextInt();
			}
			System.out.println();
		}

		int contador=0;
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(matriz[i][j]==matriz[j][i])
					contador++;
			}	
		}
		
		if(contador==9)
			System.out.println("A matriz informada e simetrica !!!");
		else
			System.out.println("A matriz informada nao e simetrica !!!");	
	}
}
