package arquivos;

import java.io.File;
import java.util.Scanner;

//Manipulando pastas com File

public class ex04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o caminho da pasta: ");
		String strPath = sc.nextLine();

		File path = new File(strPath);

		File[] pastas = path.listFiles(File::isDirectory);
		System.out.println("Pastas: ");
		for (File folder : pastas) {
			System.out.println(folder);
		}

		File[] arquivos = path.listFiles(File::isFile);
		System.out.println("Arquivos: ");
		for (File file : arquivos) {
			System.out.println(file);
		}

		boolean success = new File(strPath + "\\subdir").mkdir();
		System.out.println("Directory created succefully " + success);
		sc.close();
	}
}
