package questoes;

import java.util.Arrays;
import java.util.Scanner;

public class Questao13 {

	
	public static int[] leituraArray(int arrayUsuario[] ,Scanner ler) {
		for(int i=0; i<arrayUsuario.length;i++) {
			arrayUsuario[i]=ler.nextInt();
		}
		return arrayUsuario;
	}
	
	
	public static int[] unirArrays(int primeiroArray[], int segundoArray[]) {
		
		int tamanho=primeiroArray.length+segundoArray.length;
		int[] arrayCompleto=new int[tamanho]; 
		
		System.out.println("tamanho:"+tamanho);
		
		for(int i=0;i<primeiroArray.length;i++) {
			arrayCompleto[i]=primeiroArray[i];
		}
		
		for(int i=0;i<segundoArray.length;i++) {
			arrayCompleto[primeiroArray.length+i]=segundoArray[i];
		}
		return arrayCompleto;
	}
	

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Defina os tamanhos do primeiro e segundo array respectivamente:");
		
		int tamPrimeiro=ler.nextInt();
		int tamSegundo=ler.nextInt();
	
		int[] primeiroArray= new int[tamPrimeiro];
		int[] segundoArray = new int[tamSegundo];
		int[] arrayCompleto=new int[tamPrimeiro+tamSegundo]; 
	
		System.out.println("Informe os valores para o seu primeiro array de tamanho 10:");
		leituraArray(primeiroArray,ler);
		
		System.out.println("Informe os valores para o seu segundo array de tamanho 10:");
		leituraArray(segundoArray, ler);
		
		System.out.println("A uniao dos dois arrays informados eh: "+Arrays.toString(unirArrays(primeiroArray,segundoArray))); 
	}

}
