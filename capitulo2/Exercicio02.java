package course.capitulo2;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your full name: ");
		String fullname = sc.nextLine();
		
		System.out.println("How many bedrooms are there in your house? ");
		int bedrooms = sc.nextInt();
		
		System.out.println("Enter product price: ");
		double price = sc.nextDouble();
		
		System.out.println("Enter your last name, age and height (same line): ");
		String lastname = sc.next();
		int age = sc.nextInt();
		double height = sc.nextDouble();
		
		System.out.println("-------------------------");
		System.out.println(fullname);
		System.out.println(bedrooms);
		System.out.printf("%.2f%n", price);
		System.out.println(lastname);
		System.out.println(age);
		System.out.printf("%.2f%n", height);
		
		sc.close();
		
	}

}
