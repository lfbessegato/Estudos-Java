package course.capitulo15.util;

import java.util.function.Function;

import course.capitulo15.entities.Product;

public class UpperCaseName implements Function<Product, String> {

	@Override
	public String apply(Product p) {
		return p.getName().toUpperCase();
	}
}