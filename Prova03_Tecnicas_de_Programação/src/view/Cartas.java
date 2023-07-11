package view;

import javax.swing.ImageIcon;

public class Cartas {
	
	private ImageIcon imagem;
	private String enderecoImagem;
	public Cartas(String enderecoImagem) {
		this.enderecoImagem=enderecoImagem;
		imagem=new ImageIcon(enderecoImagem);
		imagem.setImage(imagem.getImage().getScaledInstance(40,40,1));
	}

	public ImageIcon getImagem() {
		return imagem;
	}

	public void setImagem(ImageIcon imagem) {
		this.imagem = imagem;
	}

	public String getEnderecoImagem() {
		return enderecoImagem;
	}

	public void setEnderecoImagem(String enderecoImagem) {
		this.enderecoImagem = enderecoImagem;
	}
}
