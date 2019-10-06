package course.capitulo2.exercicios.reforcos;

import java.util.Scanner;

public class exerc04 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an integer value: ");
		int n = sc.nextInt();
		
		while ( n != 0) {
			int square = n * n;
			System.out.println(square);
			System.out.print("Enter an integer value: ");
			n = sc.nextInt();
		}
		
		sc.close();
	}
}
