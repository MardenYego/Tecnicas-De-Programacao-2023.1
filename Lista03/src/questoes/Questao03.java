package questoes;

import java.util.Scanner;

public class Questao03 {
	
	public static float[] leituraArray(float arrayUsuario [],Scanner ler) {
		for(int i=0; i<arrayUsuario.length;i++) {
			arrayUsuario[i]=ler.nextFloat();
		}
		return arrayUsuario;
	}
	
	
	public static float mediaDosArrays(float arrayUsuario[],float arrayPesos[]) {
		
		float media=0.0f;
		float somatorioPesos=0.0f;
		
		for(int i=0;i<arrayUsuario.length;i++) {
			somatorioPesos+=arrayPesos[i];
			media+=arrayUsuario[i]*arrayPesos[i];
		}
		return media/somatorioPesos;
	}
	
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		float[] arrayUsuario= new float[10];
		float[] arrayPesos = new float[10];
		
		System.out.println("Informe os valores das notas para o seu array de tamanho 10:");
		leituraArray(arrayUsuario, ler);
		
		System.out.println("informe os pesos para o seu array:");
		leituraArray(arrayPesos, ler);
		
		System.out.printf("A media ponderada das notas eh: %.2f \n",mediaDosArrays(arrayUsuario, arrayPesos));
	}
}
