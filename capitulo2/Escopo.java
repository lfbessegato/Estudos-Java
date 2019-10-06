package course.capitulo2;

import java.util.Scanner;

public class Escopo {
	public static void main(String[] args) {
		/* Escopo de vari�vel
		 * 
		 * Para garantir que a variavel seja iniciada dentro do la�o
		 * pode utilizar o else para garantir que a vari�vel seja inicializada
		 * e compilador n�o interprete como erro 
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
