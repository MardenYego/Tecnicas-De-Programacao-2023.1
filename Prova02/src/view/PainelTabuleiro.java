package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;

import control.Jogo;

public class PainelTabuleiro extends JPanel{
	
	private ArrayList<Celulas>botoes;
	private Janela janela;
	
	PainelTabuleiro(Janela janela){
		
		this.janela=janela;
		botoes=new ArrayList();
		this.setBackground(Color.white);
		this.setBorder(BorderFactory.createLineBorder(Color.red));
		criarBotoes();
	}
	
	
	public void criarBotoes() {
		
		int id=0;
		Celulas celula;
		this.setLayout(new GridLayout(9,9));
		for(int i=0;i<81;i++) {
			if(id%2==0) {
				this.add(celula=new Celulas(null,Color.black,55,55));
				celula.setEnabled(false);
				celula.addActionListener(new AcaoCelulas(janela,celula,janela.getJogo()));
				botoes.add(celula);
			}else {
				this.add(celula=new Celulas(null,Color.white,55,55));
				celula.setEnabled(false);
				celula.addActionListener(new AcaoCelulas(janela,celula,janela.getJogo()));
				botoes.add(celula);
			}
			id++;
		}
	}

	public ArrayList<Celulas> getBotoes() {
		return botoes;
	}

	public void setBotoes(ArrayList<Celulas> botoes) {
		this.botoes = botoes;
	}
	
}
