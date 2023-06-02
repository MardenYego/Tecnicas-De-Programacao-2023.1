package robos;

import excecoes.ExcecaoMovimento;
import interface_Jogo.Posicao;

public class Torre extends Robo{

	public Torre() {
		this.tipo="Torre";
		this.simbolo="!";
	}

	@Override
	public Posicao avancar(int numeroDeCelulas) {
		
		if(numeroDeCelulas<=2) {
			posicao.setPosicaoX(posicao.getPosicaoX()+numeroDeCelulas);
			posicao.setValido(true);
		}
		return posicao;
	}

	@Override
	public Posicao retroceder(int numeroDeCelulas) {
		if(numeroDeCelulas<=2) {
			posicao.setPosicaoX(posicao.getPosicaoX()-numeroDeCelulas);
			posicao.setValido(true);
		}
		return posicao;
	}
}
