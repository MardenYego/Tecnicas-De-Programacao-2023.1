package excecoes;

public class ExcecaoMovimento extends Exception{
	public ExcecaoMovimento() {
		super("Numero de celulas informado pelo usuario eh invalido"); 
	}
}
