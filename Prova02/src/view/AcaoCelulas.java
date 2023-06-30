package view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

import control.Jogo;

public class AcaoCelulas implements ActionListener{
	
	private Janela janela;
	private Celulas celula;
	public Jogo jogo;
	
	public AcaoCelulas(Janela janela,Celulas celula,Jogo jogo) {
		this.janela=janela;
		this.celula=celula;
		this.jogo=jogo;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
	
		if(celula.isDisponivel()) {
			if(janela.roboAndador.isStatus() && janela.roboAndador.getJogadas()==0) {
				celula.setIcon(janela.roboAndador.getIcon());
				celula.setDisponivel(false);
				janela.roboAndador.setJogadas(1);
				jogo.verificarPartida();
			}else if(janela.roboRei.isStatus() && janela.roboRei.getJogadas()==0) {
				celula.setIcon(janela.roboRei.getIcon());
				celula.setDisponivel(false);
				janela.roboRei.setJogadas(1);
				jogo.verificarPartida();
			}else if(janela.roboRainha.isStatus() && janela.roboRainha.getJogadas()==0){
				celula.setIcon(janela.roboRainha.getIcon());
				celula.setDisponivel(false);
				janela.roboRainha.setJogadas(1);
				jogo.verificarPartida();
			}	
		
			this.janela.roboRainha.setStatus(false);
			this.janela.roboAndador.setStatus(false);
			this.janela.roboRei.setStatus(false);
		
			this.janela.roboRei.setEnabled(true);
			this.janela.roboAndador.setEnabled(true);
			this.janela.roboRainha.setEnabled(true);
		
			for(Celulas celulasTabuleiro:janela.tabuleiro.getBotoes()) {
				if(celulasTabuleiro.isDisponivel())
					celulasTabuleiro.setEnabled(false);
			}	
		}
	}
}
