package course.capitulo15.application;

import java.util.ArrayList;
import java.util.List;

import course.capitulo15.entities.Product;

public class Exemplo01_TipagemDinamica {
	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();
		list.add(new Product("TV", 900.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Tablet", 450.00));
		list.sort((p1, p2) -> p1.getPrice().compareTo(p2.getPrice()));
		list.forEach(System.out::println);
	}

}
