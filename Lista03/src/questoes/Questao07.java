package questoes;

import java.util.Arrays;
import java.util.Scanner;

public class Questao07 {

	public static int[] leituraArray(int arrayUsuario [],Scanner ler) {
		for(int i=0; i<arrayUsuario.length;i++)	{
			arrayUsuario[i]=ler.nextInt();
		}
		return arrayUsuario;
	}
	

	public static String ordenacao(int arrayUsuario[]) {
		
		String ordenacao= "ordenado!";
	
		for(int j=0;j<arrayUsuario.length-1;j++) {
			if(arrayUsuario[j]>arrayUsuario[j+1]) 
				ordenacao="nao ordenado!";
		}
		return ordenacao;
	}
	
	
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		int[] arrayUsuario= new int[10];
		
		System.out.println("Informe os valores para o seu array de tamanho 10 :");
		leituraArray(arrayUsuario,ler);
		System.out.println("O array informado esta "+ordenacao(arrayUsuario));
	}

}
