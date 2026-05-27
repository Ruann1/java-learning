package arquivos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class FolderCreate {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o caminho da pasta: ");
		String strPath = sc.nextLine();
		
		System.out.println("Agora o nome da pasta: ");
		String nomePasta = sc.nextLine();
		String caminho = "\\" + nomePasta;
		
		boolean success = new File(strPath + caminho).mkdir();
		System.out.println("Uma pasta foi criada com sucesso, verificar " + success);
		
		System.out.println("Nome do arquivo: ");
		String nomeArquivo = sc.nextLine();
		sc.close();
		
		try{
			File arquivo = new File("C:\\Users\\Trabalho\\Documents\\folderex\\out\\" + nomeArquivo + ".csv");
			if(arquivo.createNewFile()) {
				System.out.println("Arquivo criado " + arquivo.getName());
			}
			else{
				System.out.println("Erro na requisição");
			}
		}
		catch(Exception e){
			System.out.println("Error " + e.getMessage());
			e.printStackTrace();
		}
		
		String caminhoArquivo = "C:\\Users\\Trabalho\\Documents\\folderex\\out\\Summary.csv";
		String lines[] = new String[] {"TV Led, 1290.90", "Video Game Chair, 350.50, 3", "Iphone X, 900.00, 2", "Samsung Galaxy 9, 850.00, 2" };
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(caminhoArquivo, true))){
			for (String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		}
		catch(Exception e){
			System.out.println("Erro ao escrever no arquivo " + e.getMessage());
		}
		
		try(BufferedReader br = new BufferedReader(new FileReader(caminhoArquivo))) {
			String line = br.readLine();
			while(line != null) {
				System.out.println(line);
				line = br.readLine();
				}
		}catch(Exception e) {
			
		}
			
	}

}


