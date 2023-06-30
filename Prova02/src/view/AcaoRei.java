package view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class AcaoRei implements ActionListener{

	private Janela janela;
	private boolean status;
	
	public AcaoRei (Janela janela) {
		this.janela=janela;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		this.janela.roboRainha.setStatus(false);
		this.janela.roboAndador.setStatus(false);
		this.janela.roboRei.setStatus(true);
		
		this.janela.roboRei.setEnabled(true);
		this.janela.roboAndador.setEnabled(false);
		this.janela.roboRainha.setEnabled(false);
		
		for(Celulas celula:janela.tabuleiro.getBotoes()) {
			celula.setEnabled(true);
		}
	}

}
