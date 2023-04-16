package questoes;

import java.util.Scanner;

public class Questao15 {

	
	public static String verificacao(String nome) {
		
		char caracter;
		
		for(int i=0;i<nome.length();i++) {
			caracter=nome.charAt(i);
			if((caracter=nome.charAt(i))!=(caracter=nome.charAt(-i+nome.length()-1)))
				return "nao eh";
		}
		return "eh";
	}
	
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe a sua String na qual deseja verificar se ela eh um palindromo:");
		String nome=ler.next();
		System.out.println("a String informada :"+verificacao(nome)+" um palindromo");
	}
}
