package plano;

import java.util.ArrayList;
import outros.Aluno;
import outros.Bug;
import robos.Robo;

public class Celulas {
	
	private int posicaoX;
	private int posicaoY;
	private int id;
	private Aluno aluno;
	private Bug bug;
	private ArrayList<Robo>robosDoPlano;
	
	
	public Celulas(int id,int posicaoX,int posicaoY) {
		this.posicaoX=posicaoX;
		this.posicaoY=posicaoY;
		this.id=id;
	
		robosDoPlano=new ArrayList();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
	public int getPosicaoX() {
		return posicaoX;
	}

	public void setPosicaoX(int posicaoX) {
		this.posicaoX = posicaoX;
	}

	public int getPosicaoY() {
		return posicaoY;
	}

	public void setPosicaoY(int posicaoY) {
		this.posicaoY = posicaoY;
	}

	public void adicionarRobos(Robo robo) {
		robosDoPlano.add(robo);
	}
	
	public void removerRobos(int robo) {
		robosDoPlano.remove(robo);
	}
	

	public String visualizarComponetes() {
		
		String simbolo="";
		if(robosDoPlano.size()==1) {
			simbolo=robosDoPlano.get(0).getSimbolo();
		} else if(robosDoPlano.size()>1){
			simbolo="@";
		}else {
			simbolo="*";
		}		
		
		return simbolo;
	}
	
	
	public ArrayList<Robo> getRobosDoPlano() {
		return robosDoPlano;
	}

	public void setRobosDoPlano(ArrayList<Robo> robosDoPlano) {
		this.robosDoPlano = robosDoPlano;
	}

}
