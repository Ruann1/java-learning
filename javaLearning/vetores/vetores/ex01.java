package vetores;

import java.util.Locale;
import java.util.Scanner;

import entidades.Quartos;

public class ex01{

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos quartos serão alugados?");
		Integer n = sc.nextInt();
		sc.nextLine();
		
		Quartos [] vetor = new Quartos[10];
		
		for(int i = 0; i < n; i++) {

			System.out.println("Qual seu nome: ");
			String nome = sc.nextLine();
			
			System.out.println("Seu email: ");
			String email = sc.nextLine();
			
			System.out.println("Quarto escolhido: ");
			int quarto = sc.nextInt();
			vetor[quarto] = new Quartos(nome, email);
			sc.nextLine();
		}
		sc.close();
		System.out.println("Quartos Ocupados: ");
		for(int i = 0; i < 10; i++) {
			if(vetor[i] != null) {
			System.out.println(i + ":" +vetor[i].getNome() + ", " + vetor[i].getEmail());
			}
		}
	} 
}
