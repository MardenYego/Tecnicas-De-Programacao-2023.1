package questoes;

import java.util.Scanner;

public class Questao11 {

	public static int potenciacao(int base,int expoente) {
	
		int resultado=1;
		
		for(int i=0;i<expoente;i++) {
			resultado*=base;
		}
		return resultado;
	}
	
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe a base e o expoente da sua potencia respectivamente:");
		int base=ler.nextInt();
		int expoente=ler.nextInt();
		
		System.out.println("O valor da sua potencia eh: "+potenciacao(base,expoente));
	}

}
