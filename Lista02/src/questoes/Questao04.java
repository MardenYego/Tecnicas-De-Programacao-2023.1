package questoes;

import java.util.Scanner;

public class Questao04 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe um numero para o qual deseja saber sua tabela de multiplicacao:");
		int numeroDoUsuario=ler.nextInt();
		
		int contador=1;
		while(contador<=10) {
			System.out.println(numeroDoUsuario+"x"+contador+"="+numeroDoUsuario*contador);
			contador++;
		}
	}
}
