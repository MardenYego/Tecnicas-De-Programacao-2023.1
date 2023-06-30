package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import control.Jogo;

	public class Janela extends JFrame  {
		
	protected JPanel painelPrincipal;
	public PainelTabuleiro tabuleiro;
	protected PainelDisplay display;
	protected JPanel quartoPainel;
	
	protected RoboAndador roboAndador;
	protected RoboRei roboRei;
	protected RoboRainha roboRainha;
	
	private ImageIcon iconeAndador;
	private ImageIcon iconeRei;
	private ImageIcon iconeRainha;
	
	private Jogo jogo;
		
		public Janela(Jogo jogo) {

			this.jogo=jogo;
			this.setTitle("Prova_02");
			this.setDefaultCloseOperation(EXIT_ON_CLOSE);
			this.setSize(895,592);
			this.setLocationRelativeTo(null);
			
			PainelBotoes painelBotoes = new PainelBotoes(this);
			this.add(painelBotoes,BorderLayout.NORTH);
			
			PainelPrincipal painelPrincipal = new PainelPrincipal();
			this.add(painelPrincipal,BorderLayout.CENTER);
			this.painelPrincipal=painelPrincipal;
			this.painelPrincipal.setVisible(false);
			
			tabuleiro = new PainelTabuleiro(this);
			painelPrincipal.add(tabuleiro,new FlowLayout());
			
			display = new PainelDisplay();
			painelPrincipal.add(display,new FlowLayout());
			
			primeiroPainel(display);
			segundoPainel(display);
			terceiroPainel(display);
			quartoPainel(display);
			quintoPainel(display);
			
			this.setVisible(true);
		}
		
		public void primeiroPainel(JPanel display){
			
			JPanel primeiroPainel = new JPanel();
			primeiroPainel.setBackground(Color.black);
			primeiroPainel.setPreferredSize(new Dimension(310,30));
			primeiroPainel.setBorder(BorderFactory.createLineBorder(Color.red));
			display.add(primeiroPainel);
			
			JLabel pontuacao= new JLabel("Pontuação:");
			pontuacao.setForeground(Color.white);
			int totalPontuacao=0;
			JLabel pontos = new JLabel(totalPontuacao+"");
			pontos.setForeground(Color.white);
			
			primeiroPainel.add(pontuacao,new FlowLayout());
			primeiroPainel.add(pontos,new FlowLayout());
		}
		
		
		public void segundoPainel(JPanel display) {
			
			JPanel segundoPainel = new JPanel();
			segundoPainel.setBackground(Color.black);
			segundoPainel.setPreferredSize(new Dimension(310,55));
			segundoPainel.setBorder(BorderFactory.createLineBorder(Color.red));
			display.add(segundoPainel);
			
			JLabel total = new JLabel("Total:");
			total.setForeground(Color.white);
			
			ImageIcon iconeAlunos=new ImageIcon("src/view/pessoas.png");
			iconeAlunos.setImage(iconeAlunos.getImage().getScaledInstance(38, 38,1));
			JLabel boneco1 = new JLabel(iconeAlunos);
			JLabel boneco1Num = new JLabel("0");
			boneco1Num.setForeground(Color.white);
			
			JLabel espaco = new JLabel("       ");
			
			ImageIcon iconeBugs=new ImageIcon("src/view/bug.png");
			iconeBugs.setImage(iconeBugs.getImage().getScaledInstance(38, 38,1));
			JLabel boneco2 = new JLabel(iconeBugs);
			JLabel boneco2Num = new JLabel("0");
			boneco2Num.setForeground(Color.white);
			
			segundoPainel.setLayout( new FlowLayout());
			segundoPainel.add(total);
			segundoPainel.add(boneco1);
			segundoPainel.add(boneco1Num);
			segundoPainel.add(espaco);
			segundoPainel.add(boneco2);
			segundoPainel.add(boneco2Num);
		}
		
		
		public void terceiroPainel(JPanel display) {
			
			JPanel painelTerciario = new JPanel();
			painelTerciario.setBackground(Color.black);
			painelTerciario.setPreferredSize(new Dimension(310,50));
			painelTerciario.setBorder(BorderFactory.createLineBorder(Color.red));
			display.add(painelTerciario);
			
			iconeAndador=new ImageIcon("src/view/robo.png");
			iconeAndador.setImage(iconeAndador.getImage().getScaledInstance(38, 38,1));
			JLabel roboAndador = new JLabel(iconeAndador);
			JLabel robo1Pont = new JLabel("0");
			robo1Pont.setForeground(Color.white);
			
			iconeRei=new ImageIcon("src/view/robo6.png");
			iconeRei.setImage(iconeRei.getImage().getScaledInstance(38, 38,1));
			JLabel roboRei = new JLabel(iconeRei);
			JLabel robo2Pont = new JLabel("0");
			robo2Pont.setForeground(Color.white);
			
			iconeRainha=new ImageIcon("src/view/robo1.png");
			iconeRainha.setImage(iconeRainha.getImage().getScaledInstance(38, 38,1));
			JLabel roboRainha = new JLabel(iconeRainha);
			JLabel robo3Pont = new JLabel("0");
			robo3Pont.setForeground(Color.white);
			
			painelTerciario.setLayout( new FlowLayout());
			painelTerciario.add(roboAndador);
			painelTerciario.add(robo1Pont);
			painelTerciario.add(roboRei);
			painelTerciario.add(robo2Pont);
			painelTerciario.add(roboRainha);
			painelTerciario.add(robo3Pont);
			
		}
		
		public void quartoPainel(JPanel display) {
			
			quartoPainel = new JPanel();
			quartoPainel.setBackground(Color.black);
			quartoPainel.setPreferredSize(new Dimension(310,60));
			quartoPainel.setBorder(BorderFactory.createLineBorder(Color.red));
			display.add(quartoPainel);
			
			roboAndador = new RoboAndador(iconeAndador,Color.white,80,50);
			roboAndador.addActionListener(new AcaoAndador(this));
			
			roboRei = new RoboRei(iconeRei,Color.white,80,50);
			roboRei.addActionListener(new AcaoRei(this));
			
			roboRainha = new RoboRainha(iconeRainha,Color.white,80,50); 
			roboRainha.addActionListener(new AcaoRainha(this));
			
			quartoPainel.setLayout(new FlowLayout());
			quartoPainel.add(roboAndador);
			quartoPainel.add(roboRei);
			quartoPainel.add(roboRainha);
		}
		
		public void quintoPainel(JPanel display) {
		
			JPanel quintoPainel = new JPanel();
			quintoPainel.setBackground(Color.black);
			quintoPainel.setPreferredSize(new Dimension(310,215));
			quintoPainel.setBorder(BorderFactory.createLineBorder(Color.red));
			display.add(quintoPainel);
			
			Botao  verificar = new Botao("Verificar",Color.white,110,70);
			verificar.addActionListener(new Verificar(jogo));
		
			Botao  proxima = new Botao("Próxima Jogada",Color.white,110,70);
			Botao  sair = new Botao("Sair",Color.white,110,70);
			
			quintoPainel.setLayout(new GridLayout(3,1));
			quintoPainel.add(verificar);
			quintoPainel.add(proxima);
			quintoPainel.add(sair);
		}

		public void verificacao() {
			JOptionPane.showMessageDialog(null,"Movimento inválido!!!\nMova todos os robôs antes de verificar");
		}
		
		public Jogo getJogo() {
			return jogo;
		}
		
		public void setJogo(Jogo jogo) {
			this.jogo = jogo;
		}

		public RoboAndador getRoboAndador() {
			return roboAndador;
		}

		public void setRoboAndador(RoboAndador roboAndador) {
			this.roboAndador = roboAndador;
		}

		public RoboRei getRoboRei() {
			return roboRei;
		}

		public void setRoboRei(RoboRei roboRei) {
			this.roboRei = roboRei;
		}

		public RoboRainha getRoboRainha() {
			return roboRainha;
		}

		public void setRoboRainha(RoboRainha roboRainha) {
			this.roboRainha = roboRainha;
		}
}
