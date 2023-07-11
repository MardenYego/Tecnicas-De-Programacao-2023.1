package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;

import control.Jogo;

public class JanelaPrincipal extends JFrame{
	
	private ArrayList<Cartas>ListaDeCartas;
	private Telas tela1;
	private Telas tela2;
	private Telas tela3;
	private Telas tela4;
	private Jogo jogo;
	public JanelaPrincipal(Jogo jogo) {
		this.jogo=jogo;
		ListaDeCartas= new ArrayList<>();
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
		tela1.inserirProximaTela(tela2);
		tela2.inserirProximaTela(tela3);
		tela3.inserirProximaTela(tela4);
		tela4.inserirProximaTela(tela1);
	
		this.setLayout(new GridLayout(2,2));
		this.add(tela1);
		this.add(tela2);
		this.add(tela3);
		this.add(tela4);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
		criarCartas();
	}

	public void criarCartas() {
		Cartas carta;
		ListaDeCartas.add(new Cartas("src/imagens/Monalisa.jpg"));
		ListaDeCartas.add(new Cartas("src/imagens/cabra.jpg"));
		ListaDeCartas.add(new Cartas("src/imagens/cachinbo.png"));
		ListaDeCartas.add(new Cartas("src/imagens/camera.png"));
		ListaDeCartas.add(new Cartas("src/imagens/caramelo.jpg"));
		ListaDeCartas.add(new Cartas("src/imagens/coelho.jpg"));
		ListaDeCartas.add(new Cartas("src/imagens/fogo.jpg"));
		ListaDeCartas.add(new Cartas("src/imagens/gatochorao.png"));
		ListaDeCartas.add(new Cartas("src/imagens/guardachua.png"));
		ListaDeCartas.add(new Cartas("src/imagens/hellokitty.png"));
		ListaDeCartas.add(new Cartas("src/imagens/horadeaventura.png"));
		ListaDeCartas.add(new Cartas("src/imagens/joysticker.jpg"));
		ListaDeCartas.add(new Cartas("src/imagens/lapis.png"));
		ListaDeCartas.add(new Cartas("src/imagens/laranja.jpg"));
		ListaDeCartas.add(new Cartas("src/imagens/olho.jpg"));
		ListaDeCartas.add(new Cartas("src/imagens/osso.jpg"));
		ListaDeCartas.add(new Cartas("src/imagens/passaro.jpg"));
		ListaDeCartas.add(new Cartas("src/imagens/patoironico.jpg"));
		ListaDeCartas.add(new Cartas("src/imagens/porco.png"));
		ListaDeCartas.add(new Cartas("src/imagens/puff.jpg"));
		ListaDeCartas.add(new Cartas("src/imagens/rosquinha.jpg"));
		ListaDeCartas.add(new Cartas("src/imagens/snoop.jpg"));
		ListaDeCartas.add(new Cartas("src/imagens/troll.jpg"));
	}
	
	
	public Telas getTela1() {
		return tela1;
	}

	public void setTela1(Telas tela1) {
		this.tela1 = tela1;
	}

	public Telas getTela2() {
		return tela2;
	}

	public void setTela2(Telas tela2) {
		this.tela2 = tela2;
	}

	public Telas getTela3() {
		return tela3;
	}

	public void setTela3(Telas tela3) {
		this.tela3 = tela3;
	}

	public Telas getTela4() {
		return tela4;
	}

	public void setTela4(Telas tela4) {
		this.tela4 = tela4;
	}

	public ArrayList<Cartas> getListaDeCartas() {
		return ListaDeCartas;
	}

	public void setListaDeCartas(ArrayList<Cartas> listaDeCartas) {
		ListaDeCartas = listaDeCartas;
	}
}
