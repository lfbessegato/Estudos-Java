package course.capitulo2.exercicios.reforcos;

import java.util.Locale;
import java.util.Scanner;

public class exerc01 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter three student scores: ");
		
		double score1 = sc.nextDouble();
		double score2 = sc.nextDouble();
		double score3 = sc.nextDouble();
		
		double finalScore = score1 + score2 + score3;
		
		System.out.printf("Final score: %.2f%n", finalScore);
		
		if (finalScore < 60.0) {
			System.out.println("FAILED");
		}
		
		sc.close();
	}
}
