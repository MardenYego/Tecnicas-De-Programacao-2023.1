package robos;

import interface_Jogo.Posicao;

public class Andador extends Robo {

	public Andador() {
		this.tipo="Andador";
		this.simbolo="%";
	}

	@Override
	public Posicao avancar(int numeroDeCelulas) {
		
		posicao.setValido(true);
		return posicao;
	}

	@Override
	public Posicao retroceder(int numeroDeCelulas) {
		
		posicao.setValido(true);
		return posicao;
	}

	

}
