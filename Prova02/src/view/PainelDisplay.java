package view;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

public class PainelDisplay extends JPanel{
	
	public PainelDisplay() {
		this.setBackground(Color.DARK_GRAY);
		this.setBorder(BorderFactory.createLineBorder(Color.red));
		this.setPreferredSize(new Dimension(368,496));
	}
}
