package questoes;

import java.util.Scanner;

public class Questao10 {

	public static char[][] preencherMatriz(char matrizUsuario[][]) {
		
		
		for (int i = 0; i < matrizUsuario.length; i++) {
			for (int j = 0; j < matrizUsuario.length; j++) {
				matrizUsuario[i][j]='*';
			}
		}	
		return matrizUsuario;
	} 
	
	
	public static void imprimirMatriz(char matrizUsuario[][]) {

		for (int i = 0; i < matrizUsuario.length; i++) {
			for (int j = 0; j < matrizUsuario.length; j++) {
					System.out.print(" "+matrizUsuario[i][j]);
			}
			System.out.println();
		}
	}
	
	public static void alternativaA(char matrizUsuario[][]) {
		
		for (int i = 0; i < matrizUsuario.length; i++) {
			for (int j = 0; j < matrizUsuario.length; j++) {
				if(i>=j) 
					matrizUsuario[i][j]='+';
			}
		}
		
		imprimirMatriz(matrizUsuario);
	}
	
	
	public static void alternativaB(char matrizUsuario[][]) {
		System.out.println();
		
		for (int i = 0; i < matrizUsuario.length; i++) {
			for (int j = 0; j < matrizUsuario.length; j++) {
				if((i%2==0 && j%2==0)||(i%2!=0 && j%2!=0)) 
					matrizUsuario[i][j]='@';				
			}
		}
		imprimirMatriz(matrizUsuario);
	}
	
	
	public static void alternativaC(char matrizUsuario[][]) {
		System.out.println();
		
		for (int i = 0; i < matrizUsuario.length; i++) {
			for (int j = 0; j < matrizUsuario.length; j++) {
				if(i==matrizUsuario.length/2 || j==matrizUsuario.length/2)
					matrizUsuario[i][j]='@';
			}
		}
		imprimirMatriz(matrizUsuario);
	}
	
	
	public static void alternativaD(char matrizUsuario[][]) {
		System.out.println();
		
		for (int i = 0; i < matrizUsuario.length; i++) {
			for (int j = 0; j < matrizUsuario.length; j++) {
				if((i>=1 && i<=matrizUsuario.length-2) && (j>=1 && j<=matrizUsuario.length-2))
					matrizUsuario[i][j]='#';
			}
		}
		imprimirMatriz(matrizUsuario);
	}
	
	public static void alternativaE(char matrizUsuario[][]) {
		System.out.println();
		
		for (int i = 0; i < matrizUsuario.length; i++) {
			for (int j = 0; j < matrizUsuario.length; j++) {
				
				if(i==matrizUsuario.length/2 || j==matrizUsuario.length/2)
					matrizUsuario[i][j]='=';
				
				if(i<matrizUsuario.length/2 && j<matrizUsuario.length/2 )
					matrizUsuario[i][j]='#';
				
				if(i>matrizUsuario.length/2 && j<matrizUsuario.length/2)
					matrizUsuario[i][j]='-';
				
				if(i<matrizUsuario.length/2 && j>matrizUsuario.length/2)
					matrizUsuario[i][j]='!';
				
				if(i>matrizUsuario.length/2 && j>matrizUsuario.length/2)
					matrizUsuario[i][j]='%';	
			}
		}
		imprimirMatriz(matrizUsuario);
	}

	
	public static void alternativaF(char matrizUsuario[][]) {
		System.out.println();
		
		for (int i = 0; i < matrizUsuario.length; i++) {
			for (int j = 0; j < matrizUsuario.length; j++) {
				if(i==j || j==matrizUsuario.length-1-i)
					matrizUsuario[i][j]='0';
			}
		}
		imprimirMatriz(matrizUsuario);
	}
	
	
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe o tamanho de linhas e colunas respectivamente da sua matriz quadrática:");
		
		int linha=ler.nextInt();
		int coluna= ler.nextInt();
		char[][] matrizUsuario = new char[linha][coluna];
		
		alternativaA(preencherMatriz(matrizUsuario));
		alternativaB(preencherMatriz(matrizUsuario));
		alternativaC(preencherMatriz(matrizUsuario));
		alternativaD(preencherMatriz(matrizUsuario));
		alternativaE(preencherMatriz(matrizUsuario));
		alternativaF(preencherMatriz(matrizUsuario));

	}

}
