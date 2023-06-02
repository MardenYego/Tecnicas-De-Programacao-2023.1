package robos;

import interface_Jogo.Posicao;

public class Peao extends Robo {

	public Peao() {
		this.tipo="Peao";
		this.simbolo="&";
	}

	@Override
	public Posicao avancar(int numeroDeCelulas) {
		if(numeroDeCelulas==1) {
			posicao.setPosicaoX(posicao.getPosicaoX()+numeroDeCelulas);
			posicao.setValido(true);
		}
		return posicao;
	}

	@Override
	public Posicao retroceder(int numeroDeCelulas) {
		if(numeroDeCelulas==1) {
			posicao.setPosicaoX(posicao.getPosicaoX()-numeroDeCelulas);
			posicao.setValido(true);
		}
		return posicao;
	}

}
