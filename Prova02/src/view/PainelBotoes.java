package view;

import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;



public class PainelBotoes extends JPanel {
	
	private Janela janela;
	 
	public PainelBotoes(Janela janela) {
		
		this.janela=janela;
		this.setBackground(Color.DARK_GRAY);
		this.setBorder(BorderFactory.createLineBorder(Color.red));
		criarBotoes();
	}

	public void criarBotoes() {
		
		JLabel nome = new JLabel("Nome Do Jogador:");
		nome.setForeground(Color.white);
		
		JTextField caixaNome = new JTextField(9);
		JLabel espaco = new JLabel("                    ");
		
		Botao jogar = new Botao("Jogar",Color.white,70,30);
		jogar.addActionListener(new ExibirJogo(janela));
		
		Botao relatorio = new Botao("Relatório",Color.white,90,30);
		
		this.setLayout(new FlowLayout());
		this.add(nome);
		this.add(caixaNome);
		this.add(espaco);
		this.add(jogar);
		this.add(relatorio);
	}	
}
