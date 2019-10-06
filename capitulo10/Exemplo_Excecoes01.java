package course.capitulo10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exemplo_Excecoes01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vect[position]);
		} catch (ArrayIndexOutOfBoundsException e){
			System.out.println("Invalid Position");
		} catch (InputMismatchException e) {
			System.out.println("Input Error");
		}
		
		System.out.println("End of program");
		sc.close();
	}

}
