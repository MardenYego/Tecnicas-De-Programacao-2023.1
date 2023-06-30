package view;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JButton;

public  class Botao extends JButton{
	
	public Botao(String nome,Color cor,int x,int y) {
		this.setText(nome);
		this.setBackground(cor);
		this.setPreferredSize(new Dimension(x,y));
	}
}
