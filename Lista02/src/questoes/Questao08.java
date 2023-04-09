package questoes;

import java.util.Scanner;

public class Questao08 {
	
	public static void verificacao(String expressao,char simb1,char simb2) {
		
		int contador=0;
		char caracter;
		
		for (int i=0;i<expressao.length();i++) {
			caracter=expressao.charAt(i);
				if(caracter==simb1 || caracter==simb2)
					contador++;
		}
		verificacaoDeQuantidade(contador,simb1);
	}
	
	
	public static void verificacaoDeQuantidade(int contador,char simb1) {
		
		String identificador=null;
		
		if(simb1=='(' && contador>0 )
			identificador="parenteses";
		else if(simb1=='{' && contador>0 )
			identificador="chaves";
		else if(contador>0 )
			identificador= "colchetes";
			
		
		if(contador%2==0 && contador>0)
			System.out.println("Os(As) "+identificador+" da sua expressao estao corretos(as) ");
		else if(contador>0)
			System.out.println("Os(As) "+identificador+" da sua expressao estao incorretos(as)");
	}
	
	

	
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe a sua expressao para a vereficacao:");
		String expressao=ler.nextLine();
		
		verificacao(expressao,'(',')');
		verificacao(expressao,'{','}');
		verificacao(expressao,'[',']');
	}

}
