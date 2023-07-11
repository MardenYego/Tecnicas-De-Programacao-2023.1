package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;

import control.Jogo;

public class Telas extends JPanel{

	private JPanel painelSuperior;
	private JPanel painelBotoes;
	private JPanel painelCartas;
	private JPanel painelGeral;
	private int id;
	private boolean status; 
	private Jogo jogo;
	private Telas proximaTela;
	private ArrayList<Botao>listaDeBotao=new ArrayList<>();
	
	public Telas(Jogo jogo,int id) {
		this.jogo=jogo;
		this.id=id;
		this.status=false;
		this.setBorder(BorderFactory.createLineBorder(Color.black));
		criarPainelSuperior();
		criarPainelCartas();
		criarPainelBotoes();
	}
	
	public void inserirProximaTela(Telas proximaTela) {
		this.proximaTela=proximaTela;
	}
	
	public void criarPainelSuperior() {
		painelSuperior = new JPanel();
		painelSuperior.setPreferredSize(new Dimension(620,38));
		painelSuperior.setBackground(Color.GRAY);		
		JLabel nomeJogador = new JLabel("Jogador: ");
		nomeJogador.setFont(new Font ("Calibri", Font.CENTER_BASELINE, 20));
		
		JTextField caixaNome = new JTextField(10);
		Botao salvar = new Botao("Salvar",Color.green,90,30);
		
		salvar.addActionListener(new AcaoSalvar(caixaNome,jogo,this));
		
		this.setLayout(new FlowLayout());
		painelSuperior.add(nomeJogador);
		painelSuperior.add(caixaNome);
		painelSuperior.add(salvar);
		this.add(painelSuperior, BorderLayout.NORTH);
	}
	
	
	public void criarPainelBotoes() {
		painelBotoes = new JPanel();
		painelBotoes.setPreferredSize(new Dimension(620,38));
		painelBotoes.setBackground(Color.gray);
	
		Botao proximo = new Botao("Próximo",Color.green,90,30);
		proximo.addActionListener(new AcaoProximo(jogo,this));
		Botao sair = new Botao("Sair",Color.green,90,30);
		Botao exibirCartas = new Botao("Exibir Cartas",Color.green,125,30);
		
		this.setLayout(new FlowLayout());
		painelBotoes.add(exibirCartas);
		painelBotoes.add(proximo);
		painelBotoes.add(sair);
		
		this.add(painelBotoes,BorderLayout.SOUTH);
	}
	
	public void criarPainelCartas() {
		painelCartas = new JPanel();
		painelCartas.setBackground(Color.WHITE);
		painelCartas.setPreferredSize(new Dimension(620,270));
		
		JPanel painelSecundario=new JPanel();
		painelSecundario.setPreferredSize(new Dimension(620,270));
		painelSecundario.setBackground(Color.black);
		
		Botao botao;
		painelCartas.setLayout(new GridLayout(2,3));
		for(int i=0;i<6;i++) {
			botao=new Botao(Color.blue,90,60);
			painelCartas.add(botao);
		}
		this.add(painelCartas,BorderLayout.CENTER);
	}
	
	public JPanel getPainelGeral() {
		return painelGeral;
	}

	public void setPainelGeral(JPanel painelGeral) {
		this.painelGeral = painelGeral;
	}

	public JPanel getPainelSuperior() {
		return painelSuperior;
	}

	public void setPainelSuperior(JPanel painelSuperior) {
		this.painelSuperior = painelSuperior;
	}

	public JPanel getPainelBotoes() {
		return painelBotoes;
	}

	public void setPainelBotoes(JPanel painelBotoes) {
		this.painelBotoes = painelBotoes;
	}

	public JPanel getPainelCartas() {
		return painelCartas;
	}

	public void setPainelCartas(JPanel painelCartas) {
		this.painelCartas = painelCartas;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Telas getProximaTela() {
		return proximaTela;
	}

	public void setProximaTela(Telas proximaTela) {
		this.proximaTela = proximaTela;
	}

	public class AcaoProximo implements ActionListener{
		private Jogo jogo;
		private Telas tela;
		public AcaoProximo(Jogo jogo,Telas tela) {
			this.jogo=jogo;
			this.tela=tela;
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
			for(Botao botao : listaDeBotao){
				botao.setVisible(false);
			}
			jogo.verificarPartidas(tela);
		}
	}
	
	public class ExibirCartas implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			for(Botao botao : listaDeBotao){
				botao.setVisible(true);
			}
		}
	}
	
	public class AcaoSalvar implements ActionListener {

		private JTextField caixaNome;
		private Jogo jogo;
		private Telas telas;
		public AcaoSalvar(JTextField caixaNome ,Jogo jogo,Telas telas) {
			this.caixaNome=caixaNome;
			this.jogo=jogo;
			this.telas=telas;
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			this.caixaNome.setEnabled(false);
			jogo.adicionarNome(telas,caixaNome.getText());
		}
	}
}

