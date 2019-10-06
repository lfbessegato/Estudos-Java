package course.capitulo2.exercicios.reforcos;

import java.util.Locale;
import java.util.Scanner;

public class exerc02 {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter glucose measure: ");
		double glucose = sc.nextDouble();
		
		if (glucose <= 100.0) {
			System.out.println("Normal");
		} else if (glucose <= 140.0) {
			System.out.println("High");
		} else {
			System.out.println("Diabetes");
		}
		
		sc.close();
	}
}
