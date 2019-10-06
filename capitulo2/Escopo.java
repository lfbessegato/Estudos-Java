package course.capitulo2;

import java.util.Scanner;

public class Escopo {
	public static void main(String[] args) {
		/* Escopo de variável
		 * 
		 * Para garantir que a variavel seja iniciada dentro do laço
		 * pode utilizar o else para garantir que a variável seja inicializada
		 * e compilador não interprete como erro 
		*/
		
		Scanner sc = new Scanner(System.in);
		
		double price = sc.nextDouble();
		
		double discount; 
		if (price > 100.0) {
			discount = price * 0.1;
		} else {
			discount = 0;
		}
	
		System.out.println(discount);
		sc.close();
	}  
		

}
