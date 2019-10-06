package course.capitulo15.application;

import java.util.ArrayList;
import java.util.List;

import course.capitulo15.entities.Product;
import course.capitulo15.util.PriceUpdate;

public class Exemplo01_Consumer {
	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();

		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));

		list.forEach(new PriceUpdate());

		list.forEach(System.out::println);
	}
}
