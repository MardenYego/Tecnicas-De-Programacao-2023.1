package view;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Robo extends JButton{
	
	protected boolean status;
	protected int pontuacao;
	protected String tipo;
	protected int jogadas;
	
	protected ImageIcon icone;
	
	public Robo(ImageIcon icone,Color cor,int x,int y) {
		
		this.setIcon(icone);
		this.setBackground(cor);
		this.setPreferredSize(new Dimension(x,y));
		this.setPontuacao(0);
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public int getPontuacao() {
		return pontuacao;
	}

	public void setPontuacao(int pontuacao) {
		this.pontuacao = pontuacao;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getJogadas() {
		return jogadas;
	}

	public void setJogadas(int jogadas) {
		this.jogadas = jogadas;
	}

	
	
	
}
