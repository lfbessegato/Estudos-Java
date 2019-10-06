package course.capitulo10;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Exemplo_Excecoes03 {
	public static void main(String[] args) {
		
		File file = new File ("D:\\temp\\in.txt");
		Scanner sc = null;
		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		} catch (IOException e){
			System.out.println("Error opening file: " + e.getMessage());
		} finally {
			if (sc != null) {
				sc.close();
			}
			System.out.println("Finally block executed.");
		}
	}
	

}
