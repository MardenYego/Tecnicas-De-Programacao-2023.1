package questoes;

import java.util.Scanner;

public class Questao07 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe um numero:");
		int numeroDoUsuario=ler.nextInt();
		int numeroPrimo=0;
		
		int i=1,j=1;
	
		int identificador=0;
		while(i<numeroDoUsuario) {
			while(j<numeroDoUsuario) {
				if(i%j==0)
					identificador++;
				j++;
			}
			j=1;
			
			if(identificador==2) 
				numeroPrimo=i;
			identificador=0;
			i++;
		}
		System.out.println("o menor numero primo eh:"+numeroPrimo);
	}
}
