package course.capitulo12.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Exemplo_File03 {
	public static void main(String[] args) {
		
		String path = "D:\\Treinamento\\Java\\course\\src\\course\\capitulo12\\in.txt";
				
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
					
			String line = br.readLine();
			
			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		}
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}