package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

import control.Jogo;

public class AcaoAndador implements ActionListener{

		
	private Janela janela;

	public AcaoAndador(Janela janela) {
		this.janela=janela;
	}
	
	public void actionPerformed(ActionEvent e) {
		
			this.janela.roboRainha.setStatus(false);
			this.janela.roboAndador.setStatus(true);
			this.janela.roboRei.setStatus(false);
		
			this.janela.roboRei.setEnabled(false);
			this.janela.roboAndador.setEnabled(true);
			this.janela.roboRainha.setEnabled(false);
		
			for(Celulas celula:janela.tabuleiro.getBotoes()) {
				celula.setEnabled(true);
			}
	}
}
