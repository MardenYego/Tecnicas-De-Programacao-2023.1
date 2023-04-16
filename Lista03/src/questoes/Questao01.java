package questoes;

import java.util.Scanner;

public class Questao01 {

	public static int[] leituraArray(int arrayUsuario [],Scanner ler) {
		for(int i=0; i<arrayUsuario.length;i++) {
			arrayUsuario[i]=ler.nextInt();
		}
		return arrayUsuario;
	}
	
	public static int somatorio(int arrayUsuario[]) {
		
		int soma=0;
		for(int i=2;i<arrayUsuario.length-2;i++) {
			soma+=arrayUsuario[i];
		}
		return soma;
	}
	
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int[] arrayUsuario = new int[10];
		
		System.out.println("Informe os valores dos elementos do seu array de tamanho 10: ");
		System.out.println("o somatorio dos elementos do array informado e :"+somatorio(leituraArray(arrayUsuario,ler)));
	}

}
