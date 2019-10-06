package course.capitulo14.application;

import java.util.Scanner;

import course.capitulo14.services.PrintServiceReuso;

public class Exemplo02_Reuso {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		PrintServiceReuso ps = new PrintServiceReuso();
		
		System.out.print("How many values? ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			String value = sc.next();
			ps.addValue(value);
		}
		
		ps.print();
		System.out.println("First:  " + ps.first());
		sc.close();
	}

}
