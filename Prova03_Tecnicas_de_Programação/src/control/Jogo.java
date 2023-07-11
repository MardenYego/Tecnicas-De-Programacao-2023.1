package control;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.BorderFactory;

import view.Cartas;
import view.JanelaPrincipal;
import view.Telas;
import view.Telas.AcaoProximo;

public class Jogo {
	
	private ArrayList<Jogador>listaDeJogadores;
	private ArrayList<Cartas>cartasSelecionadas;
	private JanelaPrincipal janela;
	
	public Jogo() {
		listaDeJogadores=new ArrayList<>();
		criarJogadores();
	}
	
	public void criarJogadores() {
		Jogador jogador1 = new Jogador(1);
		Jogador jogador2 = new Jogador(2);
		Jogador jogador3 = new Jogador(3);
		Jogador jogador4 = new Jogador(4);
		
		listaDeJogadores.add(jogador1);
		listaDeJogadores.add(jogador2);
		listaDeJogadores.add(jogador3);
		listaDeJogadores.add(jogador4);	
	}
	
	public void adicionarNome(Telas telas,String nome ){
		for(Jogador jogador : listaDeJogadores) {
			if(jogador.getId()==telas.getId()) {
				jogador.setNome(nome);
				System.out.println(jogador.getNome());
			}
		}
	}
	
	public void verificarPartidas(Telas tela) {
		tela.setBackground(Color.lightGray);
		tela.getProximaTela().setBackground(Color.RED);
	}
	
	public void definirHost() {
		int numJogadores = listaDeJogadores.size();
		for (int i = 0; i < numJogadores; i++) {
			Jogador jogador = listaDeJogadores.get(i);
			int jogada = (i % 4) + 1;
			if (jogador.getId() == jogada) {
				jogador.setHost(true);
			}else{
				jogador.setHost(false);
			}
		}
	}
	
	public ArrayList sorteioCartas() {
		Random random = new Random();
		for (int i = 0; i < 6; i++) {
			int rand= random.nextInt(cartasSelecionadas.size());  
			Cartas cartaSelecionadas = cartasSelecionadas.get(rand);  
			cartasSelecionadas.add(cartaSelecionadas); 
		}
		return cartasSelecionadas;
	}

	public int verificapontos() {
		int pontuacaoAtual=0;
		int maiorPontuacao=0;
		for (Jogador jogador : listaDeJogadores) {
			pontuacaoAtual= jogador.getPontuacao();
			if (pontuacaoAtual>maiorPontuacao)
				maiorPontuacao=pontuacaoAtual;
		}
		return maiorPontuacao;
	}

	public void jogadas(){
		while (verificapontos()<20) {			
		}
	}
	
	public void adicionar(JanelaPrincipal janela) {
		this.janela=janela;
	}
	
	public ArrayList<Jogador> getListaDeJogadores() {
		return listaDeJogadores;
	}

	public void setListaDeJogadores(ArrayList<Jogador> listaDeJogadores) {
		this.listaDeJogadores = listaDeJogadores;
	}

	public ArrayList<Cartas> getCartasSelecionadas() {
		return cartasSelecionadas;
	}

	public void setCartasSelecionadas(ArrayList<Cartas> cartasSelecionadas) {
		this.cartasSelecionadas = cartasSelecionadas;
	}
}
