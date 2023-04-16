package questoes;

import java.util.Scanner;

public class Questao04 {

	public static int[] leituraArray(int arrayUsuario [],Scanner ler) {
		for(int i=0; i<arrayUsuario.length;i++) {
			arrayUsuario[i]=ler.nextInt();
		}
		return arrayUsuario;
	}
	
	
	public static void contagem(int arrayUsuario[],int elementoContador) {
		
		int contador=0;
		
		for(int i=0;i<arrayUsuario.length;i++) {
			if(elementoContador==arrayUsuario[i])
				contador++;
		}
		System.out.println(elementoContador+"->"+contador);
		contador=0;
	} 
	
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int[] primeiroArray= new int[10];
		int[] segundoArray = new int[10];
		int elementoContador=0;
		
		
		System.out.println("Informe o elemento para a verificacao da sua contagem:");
		elementoContador=ler.nextInt();
		
		System.out.println("Informe os valores para o seu primeiro array de tamanho 10:");
		contagem(leituraArray(primeiroArray, ler),elementoContador);
		
		System.out.println("Informe os valores para o seu segundo array de tamanho 10:");
		contagem(leituraArray(segundoArray, ler),elementoContador);
	}

}
