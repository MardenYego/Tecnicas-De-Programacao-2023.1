package interface_Jogo;

import robos.Robo;
import java.util.ArrayList;


import excecoes.ExcecaoMovimento;
import plano.Celulas;
import plano.Plano;
import robos.Andador;
import robos.Bispo;
import robos.Peao;
import robos.Rainha;
import robos.Rei;
import robos.Torre;

public class Jogo {
	
	//private String Jogador;
	private Plano plano;
	private ArrayList<Robo>robosDoJogo;
	private int numeroRobo;
	
	
	public Jogo(int linhas,int colunas) {
		
		robosDoJogo=new ArrayList();
		Plano plano = new Plano(linhas,colunas);
		this.plano=plano;
		inserirRobos();	
	}
	
	public void inserirRobos() {
		
		Andador andador=new Andador();
		Peao peao=new Peao();
		Torre torre=new Torre();
		Bispo bispo=new Bispo();
		Rei rei=new Rei();
		Rainha rainha=new Rainha();
		
		robosDoJogo.add(torre);
		robosDoJogo.add(andador);
		robosDoJogo.add(peao);
		robosDoJogo.add(bispo);
		robosDoJogo.add(rei);
		robosDoJogo.add(rainha);
		
		inserirRobosPlano();
	}
	
	
	public void inserirRobosPlano() {
		for(Robo robo:robosDoJogo) {
			plano.inserirRobos(robo);
		}
	}
		
	
	public String imprimirRoboDajogada(int numeroRobo) {
		
		String informacao=""+robosDoJogo.get(numeroRobo).getTipo();
		return informacao;
	}
	

	public void movimentoRobo(int robo,String acaoRobo,int numeroDeCelulas) throws ExcecaoMovimento{
		
		this.numeroRobo=robo;
		if(acaoRobo.equals("+"))
			verificarCelula(robosDoJogo.get(robo).avancar(numeroDeCelulas));
		else
			verificarCelula(robosDoJogo.get(robo).retroceder(numeroDeCelulas));	
	}
	
	
	public void verificarCelula(Posicao posicao) throws ExcecaoMovimento {
		
		if(posicao.isValido()==true) {
			if((posicao.getPosicaoX()>=1 && posicao.getPosicaoX()<=plano.getTamanhoX()) && (posicao.getPosicaoY()>=1 && posicao.getPosicaoY()<=plano.getTamanhoY())) 
					alterarCelula(posicao,this.numeroRobo);
			else
				throw new ExcecaoMovimento();	
		}else{
			throw new ExcecaoMovimento();	
		} 	
	}
	
	public void alterarCelula(Posicao posicao,int robo) {

		for(Celulas celula :plano.getCelulasDoPlano()) {
			
			if(celula.getPosicaoX()==posicao.getPosicaoX() && celula.getPosicaoY()==posicao.getPosicaoY())
				celula.adicionarRobos(this.robosDoJogo.get(robo));	
		}
		this.robosDoJogo.get(robo).getCelulaDoRobo().removerRobos(robo);
		
	}
	
	
	public String imprimirPlano() {
		
		return plano.imprimirPlano();
	}

	public ArrayList<Robo> getRobosDoJogo() {
		return robosDoJogo;
	}

	public void setRobosDoJogo(ArrayList<Robo> robosDoJogo) {
		this.robosDoJogo = robosDoJogo;
	}

}
