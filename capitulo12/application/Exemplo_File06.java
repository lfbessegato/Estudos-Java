package course.capitulo12.application;

import java.io.File;
import java.util.Scanner;

public class Exemplo_File06 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a file path: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		// Obter somente o nome do arquivo, desprezando o caminho
		System.out.println("getName: " + path.getName());
		
		// Obter somente o caminho
		System.out.println("getParent: " + path.getParent());
		
		// Obter o caminho completo incluindo o nome do arquivo
		System.out.println("getPath: " + path.getPath());
		
		
		
		
		sc.close();
	}

}
