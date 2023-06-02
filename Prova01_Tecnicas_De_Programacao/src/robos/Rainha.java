package robos;

import interface_Jogo.Posicao;

public class Rainha extends Robo {

	public Rainha() {
		this.tipo="Rainha";
		this.simbolo="?";
	}

	@Override
	public Posicao avancar(int numeroDeCelulas) {
		
		if(numeroDeCelulas<=2) {
			posicao.setPosicaoX(posicao.getPosicaoX()+numeroDeCelulas);	
			posicao.setPosicaoY(posicao.getPosicaoY()+numeroDeCelulas);
			posicao.setValido(true);
		}
		return posicao;
	}

	@Override
	public Posicao retroceder(int numeroDeCelulas) {
		
		if(numeroDeCelulas<=4) {
			posicao.setPosicaoX(posicao.getPosicaoX()-numeroDeCelulas);	
			posicao.setPosicaoY(posicao.getPosicaoY()-numeroDeCelulas);
			posicao.setValido(true);
		}
		return posicao;
	}

	
}
