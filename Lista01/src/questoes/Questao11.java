package questoes;

import java.util.Scanner;

public class Questao11 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int A=0,B=0;
		
		System.out.println("Digite o valor de A : ");
		A=ler.nextInt();
		
		System.out.println("Digite o valor de B : ");
		B=ler.nextInt();
		
		if(!(A>10))
			if(A+B==20)
				System.out.println("A+B==20");
			else
				System.out.println("Numero nao valido");
		
		

	}

}
