package course.capitulo3.application;

import java.util.Locale;
import java.util.Scanner;

import course.capitulo3.entities.Triangule;

public class Exemplo03 {
	public static void main(String[] args) {
Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		Triangule x, y;
		x = new Triangule();
		y = new Triangule();
		
		System.out.println("Enter the measures of triangule X: ");
		//Dessa forma armazena em cada atributo do Objeto X
		x.a = sc.nextDouble();
		x.b= sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Enter the measures of triangule Y: ");
		//Dessa forma armazena em cada atributo do Objeto Y
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double areaX = x.area();
	
		double areaY = y.area();
		
		System.out.printf("Triangle X area: %.4f%n", areaX);
		System.out.printf("Triangle Y area: %.4f%n", areaY);
		
		if (areaX > areaY) {
			System.out.println("Larger area: X");
		}
		else {
			System.out.println("Larger area: Y");
		}
		
		sc.close();


	}

}
