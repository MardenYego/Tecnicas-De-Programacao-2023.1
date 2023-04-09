package questoes;

import java.util.Scanner;

public class Questao02 {

	public static void main(String[] args) {
		
		
		int numeroDeParada=0;
		
		Scanner ler= new Scanner(System.in);
		
		System.out.println("Digite sua sequencia :");
		
		while(numeroDeParada>=0) {
			numeroDeParada=ler.nextInt();
		}
		System.out.println("Sequencia finalizada!!!");

	}

}
