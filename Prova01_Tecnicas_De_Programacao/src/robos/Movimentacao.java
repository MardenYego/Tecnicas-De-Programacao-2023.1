package robos;

import interface_Jogo.Posicao;


public interface Movimentacao {
	
	public Posicao avancar(int numeroDeCelulas) ;
	
	public Posicao retroceder(int numeroDeCelulas);

}
