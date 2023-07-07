package control;

import java.util.ArrayList;

import view.Telas;

public class Jogo {
	
	private ArrayList<Jogador>listaDeJogadores;
	private ArrayList<Cartas>listaDeCarta;
	
	
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


	public ArrayList<Jogador> getListaDeJogadores() {
		return listaDeJogadores;
	}


	public void setListaDeJogadores(ArrayList<Jogador> listaDeJogadores) {
		this.listaDeJogadores = listaDeJogadores;
	}
	
	
	
	
}
