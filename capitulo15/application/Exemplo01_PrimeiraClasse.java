package course.capitulo15.application;

import java.util.ArrayList;
import java.util.List;

import course.capitulo15.entities.Product;

public class Exemplo01_PrimeiraClasse {
	
	public static int compareProducts(Product p1, Product p2) {
		return p1.getPrice().compareTo(p2.getPrice());
	}
	
	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();
		list.add(new Product("TV", 900.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Tablet", 450.00));
		
		// Utilizamos aqui "method references" operador :: 
		// sintaxe classe ::método
		
		list.sort(Exemplo01_PrimeiraClasse::compareProducts);
		list.forEach(System.out::println);
	}

}
