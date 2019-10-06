package course.capitulo4.application;

import java.util.Locale;
import java.util.Scanner;

import course.capitulo4.entities.ProductEncapsulamento;

public class Exemplo03 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		/* 
		 * Cria uma variavel auxiliar antes de 
		 * chamar o constructor
		 */
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		
		String name = sc.nextLine();
		
		System.out.print("Price: ");
		double price = sc.nextDouble();
				
		ProductEncapsulamento product = new ProductEncapsulamento(name, price);
		
		/* 
		 * Exemplo de utilização do encapsulamento 
		 */
		product.setName("Computer");
		System.out.println("Updated name: " + product.getName());
		
		product.setPrice(1200.00);
		System.out.println("Updated price: " + product.getPrice());
		
		/* 
		 * O atributo quantity só pode ser alterado através da chamada
		 * dos métodos Add ou remove, isso garante a integridade dos 
		 * dados.
		 */
			
		System.out.println();
		System.out.println("Product data: " + product);
		System.out.println();
		
		System.out.print("Enter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		product.addProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data: " + product);
		System.out.println();
		
		System.out.print("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data: " + product);
		sc.close();
	}

}
