package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import control.Jogador;

public class PainelSuperior extends JPanel{
	
	private Jogador jogador;
	public PainelSuperior(Jogador jogador) {
		this.jogador=jogador;
		this.setBackground(Color.DARK_GRAY);
		this.setBorder(BorderFactory.createLineBorder(Color.orange));
		criarComponetes();
	}
	
	public void criarComponetes() {
		JLabel tecnico= new JLabel("Técnico de Palco");
		tecnico.setForeground(Color.white);
		JTextField caixaTecnico= new JTextField(9);
		
		Botao iniciar = new Botao("Iniciar",Color.green,80,30);
		Botao relatorio = new Botao("Relatório",Color.green,98,30);
		Botao sair = new Botao("Sair",Color.green,70,30);
		sair.addActionListener(new AcaoSair());
		 
		this.setLayout(new FlowLayout());
		this.add(tecnico);
		this.add(caixaTecnico);
		this.add(relatorio);
		this.add(iniciar);
		this.add(relatorio);
		this.add(sair);
	}
	
	public class AcaoSair implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			
		}
	}
}
