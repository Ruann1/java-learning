package arquivos;

import java.io.File;
import java.util.Scanner;

//Trabalhando com arquivos

/*
 * Files
 * Scanner
 * IOException */

public class ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("C:\\Arquivos de Programas\\Notepad++\\readme.txt");
		Scanner sc = null;

		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
			if (sc != null) {
				sc.close();
			}
		}
	}

}
