package view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import control.Jogo;

public class Verificar implements ActionListener {

	private Jogo jogo;
	
	public Verificar(Jogo jogo) {
		this.jogo=jogo;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		jogo.verificaMovimento();
	}
}
