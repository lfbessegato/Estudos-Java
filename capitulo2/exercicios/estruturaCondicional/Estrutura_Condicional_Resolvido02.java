package course.capitulo2.exercicios.estruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class Estrutura_Condicional_Resolvido02 {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		
		double delta = b * b - 4.0 * a * c;
		
		if (a == 0 || delta < 0.0) {
			System.out.println("Impossível Calcular");
		} 
		else {
			double r1 = (-b + Math.sqrt(delta)) / (2.0 * a);
			double r2 = (-b - Math.sqrt(delta)) / (2.0 * a);
			
			System.out.printf("R1 = %.5f%n", r1);
			System.out.printf("R2 = %.5f%n", r2);
		}
		
		sc.close();
	}

}
