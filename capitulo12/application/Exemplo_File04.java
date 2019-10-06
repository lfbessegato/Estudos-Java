package course.capitulo12.application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Exemplo_File04 {
	public static void main(String[] args) {
		
		String[] lines = new String[] {"Good Mornig", "Good Afternoon", "Good Night"};
		String path = "D:\\Treinamento\\Java\\course\\src\\course\\capitulo12\\out.txt";
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
			for (String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	

}
