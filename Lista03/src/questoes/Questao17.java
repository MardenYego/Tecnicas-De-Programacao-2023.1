package questoes;

import java.util.Scanner;

public class Questao17 {

	
	public static String inverterString(String nome) {
		
		String novoNome=""; 
		char troca;
		
		for(int i=0;i<nome.length();i++) {
			troca=nome.charAt(nome.length()-1-i);
			novoNome+=troca;
		}
		return novoNome;
	}
	
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);

		System.out.println("Informe um nome : ");
		String nome=ler.next();
		
		System.out.println("o nome informado invertido eh:"+inverterString(nome));
	}

}
