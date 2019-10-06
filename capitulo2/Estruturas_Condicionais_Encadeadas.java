package course.capitulo2;

import java.util.Scanner;

public class Estruturas_Condicionais_Encadeadas {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What time is it? ");
		int time = sc.nextInt();
		
		if (time < 12) {
			System.out.println("Good Morning!");
		} 
		else if (time < 18) {
			System.out.println("Good Afertnoon!");
		}
		else {
			System.out.println("Good Eveningh!");
		}
		
		sc.close();
	}

}
