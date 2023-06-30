package control;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JButton;
import view.Celulas;
import view.Janela;
import view.Robo;


public class Jogo {
	
	private Janela janela;
	private int numeroDePartidas;
	private boolean statusPartida;
	
	public Jogo() {
		janela=new Janela(this);
		gerarPersonagens();
	}
	
	public void gerarPersonagens() {
		
		Random random= new Random();
		int numeroAleatorio;
		int contadorBugs=0;
		int contadorAlunos=0;
		
		for(Celulas celula:janela.tabuleiro.getBotoes()){
			numeroAleatorio=random.nextInt(1);
			if(numeroAleatorio==1 && contadorAlunos<5) {
				celula.setPersonagem("aluno");
				contadorAlunos++;
			}else if(numeroAleatorio==0 && contadorBugs<5) {
				celula.setPersonagem("bug");;
				contadorBugs++;
			}
		}	
	}
		
	public void verificaMovimento() {
	
		if(getNumeroDePartida()>0 && isStatusPartida()) {
			setStatusPartida(false);
		}else {
			janela.verificacao();
		}	
	}

	public void verificarPartida() {
		
		if(janela.getRoboAndador().getJogadas()==1 &&
				janela.getRoboRei().getJogadas()==1 && 
				janela.getRoboRainha().getJogadas()==1) {
			setStatusPartida(true);
			janela.getRoboAndador().setJogadas(0);
			janela.getRoboRei().setJogadas(0);
			janela.getRoboRainha().setJogadas(0);
			numeroDePartidas++;	
		}
	}

	public int getNumeroDePartida() {
		return numeroDePartidas;
	}

	public void setNumeroDePartida(int numeroDePartida) {
		this.numeroDePartidas = numeroDePartida;
	}

	public boolean isStatusPartida() {
		return statusPartida;
	}

	public void setStatusPartida(boolean statusPartida) {
		this.statusPartida = statusPartida;
	}
}
