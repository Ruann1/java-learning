package arquivos;

import java.io.BufferedReader;
import java.io.FileReader;

//Bloco try - with - resources

/* E um bloco try que declara um ou mais recursos, e garante
 * que esses recursos serao fechados ao final do bloco*/

/* FileReader (stream de leitura de caracteres a partir de arquivos) */

/* BufferedReader (mais rápido) */

public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = "C:\\temp\\in.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String line = br.readLine();
			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

}
