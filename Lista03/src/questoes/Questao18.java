package questoes;

import java.util.Scanner;

public class Questao18 {

	public static double calcularJuros(double capital,double taxa,double periodo) {
		
		double montante=capital*Math.pow((1+taxa),periodo);
	
		return montante;
	}
	
	public static void main(String[] args) {
		
		Scanner ler= new Scanner(System.in);
		double capital=0,taxa=0,periodo=0;
		
		System.out.println("informe o capital, a taxa e o periodo respectivamente:"
				+ "!!Obs; a taxa deve esta em decimal, e o periodo deve estar de acordo com a taxa!! ");
		capital=ler.nextDouble();
		taxa=ler.nextDouble();
		periodo=ler.nextDouble();
		
		System.out.printf("O valor da sua aplicacao com juros compostos eh:%.2f",calcularJuros(capital, taxa, periodo));
	}

}
