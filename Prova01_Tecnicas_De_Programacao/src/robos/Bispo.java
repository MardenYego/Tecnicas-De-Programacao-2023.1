package robos;

import interface_Jogo.Posicao;

public class Bispo extends Robo {

	public Bispo() {
		this.tipo="Bispo";
		this.simbolo="+";
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
