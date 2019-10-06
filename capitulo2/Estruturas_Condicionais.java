package course.capitulo2;

import java.util.Scanner;

public class Estruturas_Condicionais {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an integer number: ");
		int n = sc.nextInt();
		
		if ( n % 2 == 0) {
			System.out.println("Even! - PAR");
		} else {
			System.out.println("Odd! - Impar");
		}
		
		sc.close();
	}

}
