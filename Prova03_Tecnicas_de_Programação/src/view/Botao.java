package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;

public class Botao extends JButton{
	
	public Botao(String nome,Color cor,int x,int y) {
		this.setText(nome);
		this.setBackground(cor);
		this.setFont(new Font ("Times New Roman", Font.CENTER_BASELINE, 16));
		this.setPreferredSize(new Dimension(x,y));
	}
	
	public Botao(Color cor,int x,int y) {
		this.setBackground(cor);
		this.setFont(new Font ("Times New Roman", Font.CENTER_BASELINE, 16));
		this.setPreferredSize(new Dimension(x,y));
	}
}
