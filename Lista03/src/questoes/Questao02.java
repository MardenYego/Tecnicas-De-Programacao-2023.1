package questoes;

import java.util.Iterator;
import java.util.Scanner;

public class Questao02 {

	public static int[] leituraArray(int arrayUsuario [],Scanner ler) {
		for(int i=0; i<arrayUsuario.length;i++) {
			arrayUsuario[i]=ler.nextInt();
		}
		return arrayUsuario;
	}
	
	
	public static int mediaDosArrays(int arrayUsuario[]) {
		
		int media=0;
		
		for(int i=0;i<arrayUsuario.length;i++) {
			media+=arrayUsuario[i];
		}
		return media/arrayUsuario.length;
	}
	
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int[] primeiroArray= new int[10];
		int[] segundoArray = new int[10];
		
		System.out.println("Informe os valores do seu primeiro array de tamanho 10:");
		System.out.println("A media do primeiro array eh:"+mediaDosArrays(leituraArray(primeiroArray, ler)));
	
		System.out.println("Informe os valores do seu segundo array de tamanho 10:");
		System.out.println("A media do primeiro array eh:"+mediaDosArrays(leituraArray(segundoArray, ler)));
	}

}
