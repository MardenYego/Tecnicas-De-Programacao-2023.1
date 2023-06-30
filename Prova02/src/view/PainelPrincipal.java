package view;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JPanel;

public class PainelPrincipal extends JPanel{

	public PainelPrincipal() {
		this.setBackground(Color.DARK_GRAY);
		this.setBorder(BorderFactory.createLineBorder(Color.red));
	}
}
