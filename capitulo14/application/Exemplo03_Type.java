package course.capitulo14.application;

import java.util.Scanner;

import course.capitulo14.services.PrintServiceType;

public class Exemplo03_Type {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		PrintServiceType<Integer> ps = new PrintServiceType<>();
		
		System.out.print("How many values? ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			Integer value = sc.nextInt();
			ps.addValue(value);
		}
		
		ps.print();
		System.out.println("First:  " + ps.first());
		sc.close();
	}

}
