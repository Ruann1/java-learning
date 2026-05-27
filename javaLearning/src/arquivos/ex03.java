package arquivos;

import java.io.BufferedWriter;
import java.io.FileWriter;

//FileWriter(Stream de escrita de caracteres em arquivos)

//Stream = esteira (fluxo) de dados em sequencia 

/* 	Cria / Recria o arquivo: new FileWriter(path)
	Acrescenta ao arquivo existente:newFileWriter(path, true)
	BufferedWriter(mais rapido)
*/

public class ex03 {
	public static void main(String[] args) {
		String[] lines = new String[] { "Bom dia", "Boa tarde", "Boa noite" };

		String path = "C:\\temp\\out.txt";

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
			for (String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
