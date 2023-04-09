package questoes;

import java.util.Random;
import java.util.Scanner;

public class Questao03 {

	public static void main(String[] args) {
		
		Random random = new Random();
		Scanner ler = new Scanner(System.in);
		
		int numeroSorteado=random.nextInt(1,101);
		int numeroUsuario=0;		
		
		System.out.println("Tente adivinhar qual numero o sistema escolheu entre 1 e 100:");
		
		while(numeroUsuario!=numeroSorteado) {
			
			numeroUsuario=ler.nextInt();
			
			if(numeroUsuario>numeroSorteado) {
				System.out.println("Numero digitado maior do que o numero do sistema"
						+ "\nTente novamente ");
			}else if(numeroUsuario<numeroSorteado) {
				System.out.println("Numero digitado menor do que o numero do sistema"
						+ "\nTente novamente ");
			}
		}
		System.out.println("Parabens, voce adivinhou o numero sorteado ");
	}

}
