package course.capitulo12.application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Exemplo_File01 {
	public static void main(String[] args) {
		
		File file = new File("D:\\Treinamento\\Java\\course\\src\\course\\capitulo12\\in.txt");
		Scanner sc = null;
		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()){
				System.out.println(sc.nextLine());
			}
		}
		catch (IOException e){
			System.out.println("Error: " + e.getMessage());
		}
		finally {
			if (sc != null) {
				sc.close();
			}
		}
	}
}
