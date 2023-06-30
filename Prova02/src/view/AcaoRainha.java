package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class AcaoRainha implements ActionListener {

	private Janela janela;
	
	public AcaoRainha (Janela janela) {
		this.janela=janela;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		this.janela.roboRainha.setStatus(true);
		this.janela.roboAndador.setStatus(false);
		this.janela.roboRei.setStatus(false);
		
		this.janela.roboRei.setEnabled(false);
		this.janela.roboAndador.setEnabled(false);
		this.janela.roboRainha.setEnabled(true);
		
		for(Celulas robo:janela.tabuleiro.getBotoes()) {
			robo.setEnabled(true);
		}
	}
}
