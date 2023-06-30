package view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;

public class RoboAndador extends Robo {

	public RoboAndador(ImageIcon icone, Color cor, int x, int y) {
		super(icone, cor, x, y);
		setStatus(false);
		setJogadas(0);
	}
}

	
