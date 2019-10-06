package course.capitulo3.application;

import java.util.Locale;
import java.util.Scanner;

import course.capitulo3.util.Calculator;

public class Exemplo05_Versao02 {
	
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Calculator calc = new Calculator();
		
		
		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();
		
		double c = calc.circumference(radius);
		
		double v = calc.volume(radius);
		
		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI Volume: %.2f%n", calc.PI);
		sc.close();	
	}
}
