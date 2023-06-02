package plano;

import java.util.ArrayList;

import robos.Robo;

public class Plano {
	
	private int tamanhoX;
	private int tamanhoY;
	private ArrayList<Celulas>celulasDoPlano;
	

	public Plano(int tamanhoX, int tamanhoY) {
		this.tamanhoX=tamanhoX;
		this.tamanhoY=tamanhoY;
		celulasDoPlano=new ArrayList();		
		gerarPlano();
	}
	
	
	public void gerarPlano() {
		Celulas celula;
		int id=this.tamanhoX*this.tamanhoY;
		for(int linhas=this.tamanhoX;linhas>=1;linhas--) {
			for(int colunas=this.tamanhoY;colunas>=1;colunas--) {
				celulasDoPlano.add(new Celulas(id,linhas,colunas));
				id--;
			}
 		}
	}
	
	
	public void inserirRobos(Robo robo) {
		
		for(Celulas celula:celulasDoPlano) {
			if(celula.getPosicaoX()==1 && celula.getPosicaoY()==1) {
				celula.adicionarRobos(robo);
				robo.setCelulaDoRobo(celula);
			}
		}
	}
	
	
	public String imprimirPlano() {
		
		String planoImpresso="";
		
		for(Celulas celula:celulasDoPlano) {

			if(celula.getPosicaoY()==1)
				planoImpresso+=" "+celula.visualizarComponetes()+"\n";
			else
				planoImpresso+=" "+celula.visualizarComponetes()+"";
		}
		return planoImpresso;	
	}


	public ArrayList<Celulas> getCelulasDoPlano() {
		return celulasDoPlano;
	}


	public void setCelulasDoPlano(ArrayList<Celulas> celulasDoPlano) {
		this.celulasDoPlano = celulasDoPlano;
	}


	public int getTamanhoX() {
		return tamanhoX;
	}


	public void setTamanhoX(int tamanhoX) {
		this.tamanhoX = tamanhoX;
	}


	public int getTamanhoY() {
		return tamanhoY;
	}


	public void setTamanhoY(int tamanhoY) {
		this.tamanhoY = tamanhoY;
	} 
}






