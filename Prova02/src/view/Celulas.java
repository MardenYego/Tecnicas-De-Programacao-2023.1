package view;

import java.awt.Color;
import javax.swing.JButton;

public class Celulas extends Botao{

	private String personagem;
	private boolean disponivel;
	
	public Celulas(String nome, Color cor, int x, int y) {
		super(nome, cor, x, y);
		setDisponivel(true);
	}

	public boolean isDisponivel() {
		return disponivel;
	}

	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}

	public String getPersonagem() {
		return personagem;
	}

	public void setPersonagem(String personagem) {
		this.personagem = personagem;
	}
}
