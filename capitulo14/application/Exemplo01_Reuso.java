package course.capitulo14.application;

import java.util.Scanner;

import course.capitulo14.services.PrintService;

public class Exemplo01_Reuso {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		PrintService ps = new PrintService();
		
		System.out.print("How many values? ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			int value = sc.nextInt();
			ps.addValue(value);
		}
		
		ps.print();
		System.out.println("First:  " + ps.first());
		sc.close();
	}

}
