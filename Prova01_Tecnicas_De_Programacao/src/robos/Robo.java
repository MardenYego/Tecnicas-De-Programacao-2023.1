package robos;

import interface_Jogo.Posicao;
import plano.Celulas;

public abstract class Robo implements Movimentacao{
	
	protected int posicaoX;
	protected int posicaoY;
	protected int pontuacao;
	protected String tipo;
	protected Posicao posicao;
	protected Celulas celulaDoRobo;
	
	///
	protected String simbolo;
	
	public Robo() {
		
		this.posicaoX=1;
		this.posicaoY=1;
		this.pontuacao=0;
		
		Posicao posicao = new Posicao();
		posicao.setPosicaoX(this.posicaoX);
		posicao.setPosicaoY(this.posicaoY);
		posicao.setValido(false);
		this.posicao=posicao;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Celulas getCelulaDoRobo() {
		return celulaDoRobo;
	}

	public void setCelulaDoRobo(Celulas celulaDoRobo) {
		this.celulaDoRobo = celulaDoRobo;
	}

	public String getSimbolo() {
		return simbolo;
	}

	public void setSimbolo(String simbolo) {
		this.simbolo = simbolo;
	}
	
}
