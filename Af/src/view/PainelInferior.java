package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

import control.Jogador;

public class PainelInferior extends JPanel{
	
	private Jogador jogador;
	public PainelInferior(Jogador jogador) {
		this.jogador=jogador;
		this.setBackground(Color.DARK_GRAY);
		this.setBorder(BorderFactory.createLineBorder(Color.orange));
		this.setPreferredSize(new Dimension(895,510));
		this.setLayout(new FlowLayout());
		criarPainelEsquerdo();
		criarPainelDireito();
	}
	
	public void criarPainelEsquerdo() {
		
			JPanel painelEsquerdo = new JPanel();
			painelEsquerdo.setPreferredSize(new  Dimension(500,500));
			
			JPanel AuxiliarSuperior =new JPanel();
			AuxiliarSuperior.setBackground(Color.DARK_GRAY);
			JPanel AuxiliarInferior =new JPanel();
			AuxiliarInferior.setBackground(Color.DARK_GRAY);
			AuxiliarInferior.setPreferredSize(new Dimension(485,399));
			
			PainelCor painelAzul = new PainelCor(Color.BLUE);
			PainelCor painelVermelho = new PainelCor(Color.RED);
			PainelCor painelVerde = new PainelCor(Color.GREEN);
			PainelCor painelRosa = new PainelCor(Color.PINK);
			PainelCor painelRoxo = new PainelCor(Color.MAGENTA);
			PainelCor painelAmarelo = new PainelCor(Color.YELLOW);
			
			painelEsquerdo.add(AuxiliarSuperior,BorderLayout.NORTH);
			painelEsquerdo.add(AuxiliarInferior,BorderLayout.SOUTH);
			AuxiliarSuperior.add(painelAzul);
			AuxiliarSuperior.add(painelVermelho);
			AuxiliarSuperior.add(painelVerde);
			AuxiliarSuperior.add(painelRosa);
			AuxiliarSuperior.add(painelRoxo);
			AuxiliarSuperior.add(painelAmarelo);
			this.add(painelEsquerdo);
	}
	
	public void criarPainelDireito() {
		
		JPanel painelDireito = new JPanel();
		painelDireito.setBackground(Color.DARK_GRAY);
		painelDireito.setPreferredSize(new Dimension(350,500));
		JLabel ritmos = new JLabel("                 "
				+ "                                  "
				+ "Ritmos");
		Botao rock = new Botao("Rock",Color.green,25,20);
		rock.addActionListener(new AcaoBotao(rock));
		Botao reggae = new Botao("Reggae",Color.green,25,20);
		reggae.addActionListener(new AcaoBotao(reggae));
		Botao eletronico = new Botao("Eletrônico",Color.green,25,20);
		eletronico.addActionListener(new AcaoBotao(eletronico));
		
		JLabel intensidade = new JLabel("            "
				+ "                          Intensidade das cores");
		Botao corForte = new Botao("Cor forte",Color.green,25,20);
		Botao corFraca = new Botao("Cor fraca",Color.green,25,20);
		
		JLabel velocidade = new JLabel("             "
				+ "                                  Velocidade");
		Botao rapido = new Botao("Rápido",Color.green,25,20);
		Botao lento = new Botao("Lento",Color.green,25,20);
		
		JLabel espaço = new JLabel("     ");
		painelDireito.setLayout(new GridLayout(12,1));
		painelDireito.add(ritmos);
		painelDireito.add(rock);
		painelDireito.add(reggae);
		painelDireito.add(eletronico);
		painelDireito.add(espaço);
		painelDireito.add(intensidade);
		painelDireito.add(corForte);
		painelDireito.add(corFraca);
		painelDireito.add(espaço);
		painelDireito.add(velocidade);
		painelDireito.add(rapido);
		painelDireito.add(lento);
		this.add(painelDireito);
	}
	
	public class AcaoBotao implements ActionListener{
		
		private Botao botao;
		public AcaoBotao(Botao botao) {
			this.botao=botao;
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
//			String nomeBotao = e.getSource().getText();
//			jogador.getDados().concat();
		}
	}
}
