package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

public class ExibirJogo implements ActionListener {

	private Janela janela;
	public ExibirJogo(Janela janela) {
		this.janela=janela;
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		janela.painelPrincipal.setVisible(true);
	}
}
