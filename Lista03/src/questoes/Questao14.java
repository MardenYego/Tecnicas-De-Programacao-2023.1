package questoes;

import java.util.Arrays;
import java.util.Scanner;

public class Questao14 {

	public static int[] leituraArray(int arrayUsuario[] ,Scanner ler) {
		
		System.out.println();
		for(int i=0; i<arrayUsuario.length;i++) {
			arrayUsuario[i]=ler.nextInt();
		}
		return arrayUsuario;
	}
	
	
	public static int tamanhoNovoArray(int arrayUsuario[],int excluirValor) {
		
		int contador=0;
		
		for(int i=0;i<arrayUsuario.length;i++) {
			if(arrayUsuario[i]!=excluirValor)
				contador++;
		}
		return contador;
	}
	
	
	public static int[] removerValor(int arrayUsuario[] ,Scanner ler,int excluirValor) {
		
		leituraArray(arrayUsuario, ler);
		
		int novoTamanho=tamanhoNovoArray(arrayUsuario,excluirValor);
		int[] novoArray= new int[novoTamanho];
		
		int repetidor=0;
		
		for(int i=0;i<arrayUsuario.length;i++) {
			if(arrayUsuario[i]!=excluirValor) {
				novoArray[repetidor]=arrayUsuario[i];
				repetidor++;
			}
		}
		return novoArray;
	}
	
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int[] arrayUsuario= new int[10];
		
		System.out.println("Informe o valor a ser excluido e os valores para o seu array de tamanho 10 respectivamente :");
		int excluirValor=ler.nextInt();
		
		System.out.println("teste"+Arrays.toString(removerValor(arrayUsuario,ler,excluirValor)));
	}

}
