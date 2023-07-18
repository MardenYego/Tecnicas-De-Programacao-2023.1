package view;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

public class PainelCor extends JPanel{
	
	public PainelCor(Color cor) {
		this.setBackground(cor);
		this.setPreferredSize(new Dimension(75,75));
		this.setBorder(BorderFactory.createLineBorder(Color.black));
	}
}
