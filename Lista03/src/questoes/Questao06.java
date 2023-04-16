package questoes;

import java.util.Arrays;
import java.util.Scanner;

public class Questao06 {

	public static int[] leituraArray(int arrayUsuario [],Scanner ler) {
		for(int i=0; i<arrayUsuario.length;i++)	{
			arrayUsuario[i]=ler.nextInt();
		}
		return arrayUsuario;
	}
	
	
	public static int[] ordenacao(int arrayUsuario[]) {
		
		int trocar=0;
		
		for(int i=0;i<arrayUsuario.length-1;i++) {
			for(int j=0;j<arrayUsuario.length-1;j++) {
				if(arrayUsuario[j]>arrayUsuario[j+1]) {
					trocar=arrayUsuario[j];
					arrayUsuario[j]=arrayUsuario[j+1];
					arrayUsuario[j+1]=trocar;
				}
			}
		}
		return arrayUsuario;
	}
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int[] arrayUsuario= new int[10];
		
		System.out.println("Informe os valores para o seu primeiro array de tamanho 10:");
		System.out.println("O array ordenado eh "+Arrays.toString(ordenacao(leituraArray(arrayUsuario,ler))));
	}

}
