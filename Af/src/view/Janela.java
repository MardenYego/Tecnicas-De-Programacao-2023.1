package view;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.UIManager;

import control.Jogador;

public class Janela extends JFrame{

	private PainelSuperior painelSuperior;
	private PainelInferior painelInferior;
	private Jogador jogador;
	
	
	public Janela(Jogador jogador) {
		this.jogador=jogador;
		this.setSize(895,592);
		this.setResizable(false);
		this.setTitle("Aprovação");
		this.setLocationRelativeTo(null);
		
		try {
			UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
			UIManager.put("nimbusBase", Color.BLACK);
		} catch(Exception e) {
			e.printStackTrace();
		}
		criarPainelSuperior();
		criarPainelInferior();
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	public void criarPainelSuperior() {
		painelSuperior=new PainelSuperior(jogador); 
		this.add(painelSuperior,BorderLayout.NORTH);
	}
	
	public void criarPainelInferior() {
		painelInferior=new PainelInferior(jogador);
		this.add(painelInferior,BorderLayout.SOUTH);
	}
}
