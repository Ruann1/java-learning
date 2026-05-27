package vetores;

import java.util.Locale;
import java.util.Scanner;

public class ex02 {
	public static void main(String[] args) {
	
	Locale.setDefault(Locale.US);	
	Scanner sc = new Scanner(System.in);
	
	System.out.printf("Quantos números você vai digitar? ");
	int n = sc.nextInt();
	
	int [] vetor = new int[10];
	
	for(int i = 0; i < n; i++) {
		System.out.printf("Digite um número: ");
		int num = sc.nextInt();
		vetor[i] += num;
		
	}
	System.out.println("Números Negativos: ");
	for(int num : vetor) {
		if(num < 0) {
		System.out.println(num);
		}
	}
	
}
}
