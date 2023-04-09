package questoes;

import java.util.Scanner;

public class Questao05 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe o limite desejado de sua sequencia: ");
		int limite=ler.nextInt();
		
		for(int j=0;j<=limite;j++) {
			for(int i=0;i<=limite;i++) {
				System.out.println(j+"-"+i);
			}	
		}
	}
	
}
