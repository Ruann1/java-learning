package program;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;

import entities.Usuario;

public class Main {
	public static void main(String [] args) {
		
		Locale.setDefault(Locale.US);
		
		HashSet<Usuario> acessos = new HashSet<Usuario>();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos usuarios irao logar no sistema?");
		Integer qtd = sc.nextInt();
		sc.nextLine();
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		LocalDateTime d01 = LocalDateTime.now();
		
		for(int i = 0; i < qtd; i++) {	
		System.out.println("Escreva seu nome para logar: ");
		
		String usuario = sc.nextLine();	
		Usuario teste = new Usuario(usuario);
		acessos.add(teste);
		}
		
		System.out.println(acessos);
		sc.close();
	
		try{ 
			File file = new File("C:\\Users\\ruang\\OneDrive\\Documentos\\teste1.txt");
			if(file.createNewFile()) {
				System.out.println("File created: " + file);
			}else {
				System.out.println("O Arquivo ja existe");
			}
		}catch(IOException e) {
			System.out.println("An error occurredd.");
			e.printStackTrace();
		} 
		
		try (FileWriter escritor = new FileWriter("C:\\Users\\ruang\\OneDrive\\Documentos\\teste1.txt")){
	
				for(Usuario i : acessos) {
				acessos.contains(i);
				escritor.write("\n" + i + " " + d01.format(fmt1));
				}
			
		}catch(Exception e) {
			System.out.println("Error: " + e);
		}
		
		System.out.print("Temos " + acessos.size() + " Usuários Cadastrados");
		
	}
}


