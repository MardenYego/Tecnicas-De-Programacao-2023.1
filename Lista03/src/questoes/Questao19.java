package questoes;

import java.util.Scanner;

public class Questao19 {

	
	public static boolean verificarNumeroPerfeito(int numeroVerificar,int verificador) {
		
		if(verificador==numeroVerificar) 
			return true;
		
		return false;
	}
	
	
	public static boolean quantidadeDeDivisores(int numeroVerificar) {
		
		int verificador=0;
		
		for(int i=1;i<numeroVerificar;i++) {
			if(numeroVerificar%i==0) 
				verificador+=i;
			
		}
		return verificarNumeroPerfeito(numeroVerificar,verificador);
	}

	
	public static void main(String[] args) {
		
		Scanner ler= new Scanner(System.in);
		
		System.out.println("Informe um valor para verificar se ele eh um numero perfeito:");
		int numeroVerificar=ler.nextInt();
		
		System.out.println(quantidadeDeDivisores(numeroVerificar));
	}
}
