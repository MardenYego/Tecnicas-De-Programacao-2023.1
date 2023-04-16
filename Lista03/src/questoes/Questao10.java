package questoes;

import java.util.Scanner;

public class Questao10 {

	public static int[] leituraArray(int arrayUsuario [],Scanner ler) {
		for(int i=0; i<arrayUsuario.length;i++) {
			arrayUsuario[i]=ler.nextInt();
		}
		return arrayUsuario;
	}
	
	
	public static String verificacao(int primeiroArray[],int segundoArray[]) {
		for(int i=0;i<primeiroArray.length;i++) {
			if(primeiroArray[i]!=segundoArray[i]) {
				return "diferentes";
			}
		}
		return "iguais";
	}
	
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int[] primeiroArray= new int[10];
		int[] segundoArray = new int[10];
		
		System.out.println("Informe os valores para o seu primeiro array de tamanho 10:");
		leituraArray(primeiroArray,ler);
		
		System.out.println("Informe os valores para o seu segundo array de tamanho 10:");
		leituraArray(segundoArray, ler);
		
		System.out.println("Os arrays informados sao "+verificacao(primeiroArray,segundoArray));
	}

}
