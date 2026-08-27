package program;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;

public class Main {

	public static void main (String [] args) throws FileNotFoundException {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o caminho do arquivo que sera lido: ");
		String caminho = sc.nextLine();
		
		 try (BufferedReader br = new BufferedReader(new FileReader(caminho))) {
			 Map<Integer, String> candidatos = new HashMap<>(); 
			 String line = br.readLine();
			 
		      while (line != null) {
		        line = br.readLine();
		        candidatos.put(line.indexOf(0), line);
		      }
		      
		      for (Integer i : candidatos.keySet()) {
		    	  System.out.println("teste" + i + candidatos.get(i));
		      }
		
		    }catch(Exception e) {
		    	
		    }
		 
		 sc.close();
	
	}
}