package vetores;

import java.util.Locale;
import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Quantos números você vai digitar? ");
		int num = sc.nextInt();
		
		int[] vetor = new int[num];
		
		for(int i = 0; i < vetor.length; i++) {
			System.out.printf("Digite um número: ");
			int numero = sc.nextInt();
			vetor[i] += numero;
		}
		System.out.print("VALORES = ");
		for(int numero : vetor) {
			System.out.print(" " + numero + " ");
		}
		System.out.println("");
		System.out.printf("SOMA = " );
		
		int soma = 0;
		for(int i = 0; i < num; i++) {
			soma += vetor[i]; 	
		}
		System.out.println(soma);
		
		int media = 0;
		for(int numero : vetor) {
			media = soma / num;
		}
		System.out.println("Media = " + media);
	}

}
