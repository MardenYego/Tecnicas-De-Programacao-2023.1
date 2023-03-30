package questoes;

import java.util.Scanner;

public class Questao05 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int A=0,B=0;
		
		System.out.println("Digite o valor de A : ");
		A=ler.nextInt();
		
		System.out.println("Digite o valor de B : ");
		B=ler.nextInt();
		
		if(A>10 || A+B==20)
			System.out.println("Numero valido");
		else
			System.out.println("numero nao valido");
		
	}

}
