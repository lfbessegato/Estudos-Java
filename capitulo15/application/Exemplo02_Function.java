package course.capitulo15.application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import course.capitulo15.entities.Product;

public class Exemplo02_Function {
	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();

		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));

		List<String> names = list.stream().map(Product::staticUpperCaseName).collect(Collectors.toList());

		names.forEach(System.out::println);
	}
}
