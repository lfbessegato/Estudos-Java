package course.capitulo2.exercicios.estruturaCondicional;

import java.util.Scanner;

public class Estrutura_Condicional_Resolvido03 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if (a < b && a < c) {
			System.out.println("MENOR = " + a);
		} 
		else if (b < c) {
			System.out.println("MENOR = " + b);
		} else {
			System.out.println("MENOR = " + c);
		}
		sc.close();
	}

}
