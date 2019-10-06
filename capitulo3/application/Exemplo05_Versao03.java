package course.capitulo3.application;

import java.util.Locale;
import java.util.Scanner;
import course.capitulo3.util.Calculator_Versao3;;


public class Exemplo05_Versao03 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();
		
		double c = Calculator_Versao3.circumference(radius);
		
		double v = Calculator_Versao3.volume(radius);
		
		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI Volume: %.2f%n", Calculator_Versao3.PI);
		sc.close();
	}

}
