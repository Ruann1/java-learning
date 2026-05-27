package vetores;

import java.util.Locale;
import java.util.Scanner;

import entidades.Pessoas;

public class ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantas pessoas serão digitadas? ");
		int num = sc.nextInt();

		Pessoas[] vetorPessoas = new Pessoas[num];

		for(int i = 0; i < vetorPessoas.length; i++) {
			sc.nextLine();
			int teste = 1 + i;
			System.out.println("Dados da " + teste + "a " + "pessoa:");
			
			System.out.print("Nome: ");
			String nome = sc.nextLine();

			System.out.print("Idade: ");
			int idade = sc.nextInt();
			sc.nextLine();

			System.out.print("Altura: ");
			double altura = sc.nextDouble();

			vetorPessoas[i] = new Pessoas(nome, idade, altura);
		}
		System.out.println(" ");
			double alturaTotal = 0.0;
			for(Pessoas p : vetorPessoas) {
				alturaTotal += p.getAltura();
		}
		double media = alturaTotal / vetorPessoas.length;

			System.out.print("Altura média: ");
			System.out.printf("%.2f m%n",  media);

			int verificarIdade = 0;
			String getName;
			double menorIdade = 0.0;
			
			System.out.print("Pessoas com menos de 16 anos: ");

			int pIdade = 0;
			double contador = 0.0;
			for(Pessoas p : vetorPessoas) {
				pIdade = p.getIdade();
				if(pIdade < 16) {
					contador++;
				}
			}
			double porcentagem = (contador / num) * 100;
			System.out.print(porcentagem + "% ");
			System.out.println(" ");
			
			for(int i = 0; i < vetorPessoas.length; i++) {
				verificarIdade = vetorPessoas[i].getIdade();
				getName = vetorPessoas[i].getNome();
				
				if(verificarIdade < 16) {
					System.out.println("" + getName);
				}
			}
		} 
	}	

