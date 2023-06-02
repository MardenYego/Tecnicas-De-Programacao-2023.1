package robos;

import interface_Jogo.Posicao;

public class Cavalo extends Robo {

	public Cavalo() {
		this.tipo="Cavalo";
		this.simbolo="L";
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
		
		if(numeroDeCelulas<=2) {
			posicao.setPosicaoX(posicao.getPosicaoX()-numeroDeCelulas);	
			posicao.setPosicaoY(posicao.getPosicaoY()-numeroDeCelulas);
			posicao.setValido(true);
		}
		return posicao;
	}

}
