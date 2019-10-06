package course.capitulo15.util;

import java.util.function.Predicate;

import course.capitulo15.entities.Product;

public class ProductPredicate implements Predicate<Product> {

	@Override
	public boolean test(Product p) {
		return p.getPrice() >= 100.0;
	}
}