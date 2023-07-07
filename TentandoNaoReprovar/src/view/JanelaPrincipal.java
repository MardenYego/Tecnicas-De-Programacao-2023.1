package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;

import control.Jogo;

public class JanelaPrincipal extends JFrame{
	

	private Telas tela1;
	private Telas tela2;
	private Telas tela3;
	private Telas tela4;
	private Jogo jogo;
	
	public JanelaPrincipal(Jogo jogo) {
		
		this.jogo=jogo;
		
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		this.setResizable(false);
		this.setTitle("Tentando Não Reprovar");
		this.setLocationRelativeTo(null);
		
		try {
			UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
			UIManager.put("nimbusBase", Color.BLACK);
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		tela1 = new Telas(jogo,1);
		tela2 = new Telas(jogo,2);
		tela3 = new Telas(jogo,3);
		tela4 = new Telas(jogo,4);
		
		this.setLayout(new GridLayout(2,2));
		this.add(tela1);
		this.add(tela2);
		this.add(tela3);
		this.add(tela4);
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}
	

}
