package interface_Jogo;

import java.util.Scanner;


import excecoes.ExcecaoMovimento;
import plano.Plano;
import robos.Andador;
import robos.Bispo;
import robos.Peao;
import robos.Rainha;
import robos.Rei;
import robos.Torre;


public class Menu {

	
	public static void main(String[] args) {
		
		Scanner ler=new Scanner(System.in);
		
		System.out.println("Informe o seu nome:");
		String nome=ler.next();
		
		System.out.println("Informe o tamanho de linhas e colunas respectivamente do seu tabuleiro:");
		int linhas=ler.nextInt();
		int colunas=ler.nextInt();
		Jogo jogo=new Jogo(linhas,colunas);
		
		int operacao=0;
		int robo;
		while(operacao!=-1) {
			robo=0;
		
			while(robo<jogo.getRobosDoJogo().size()) {
				
				System.out.println("====Tabuleiro====\n");
				System.out.println(jogo.imprimirPlano());
				
				System.out.println("Robo selecionado:"+jogo.imprimirRoboDajogada(robo));
				System.out.println("Informe a uma acao para o robo(Avancar(+)/Retroceder(-))");
				String acaoRobo=ler.next();
				
				System.out.println("Informe o numero desejado de celulas a percorrer:");
				int numeroDeCelulas=ler.nextInt();
				
				try {
					jogo.movimentoRobo(robo,acaoRobo,numeroDeCelulas);
				} catch(ExcecaoMovimento e) {
					e.printStackTrace();
				}
				robo++;
			}	
		}	
			System.out.println("***Digite-1 para sair***");
			operacao=ler.nextInt();
	}
}


