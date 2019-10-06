package course.capitulo14.application;

import java.util.Set;
import java.util.TreeSet;

import course.capitulo14.entities.Product_Exemplo_TreeSet_Compara;

public class Exemplo08_TreeSet_Compara {
	public static void main(String[] args) {
		
		Set<Product_Exemplo_TreeSet_Compara> set = new TreeSet<>();
		
		set.add(new Product_Exemplo_TreeSet_Compara("Tv", 900.0));
		set.add(new Product_Exemplo_TreeSet_Compara("Notebook", 1200.0));
		set.add(new Product_Exemplo_TreeSet_Compara("Tablet", 400.0));
		
		for (Product_Exemplo_TreeSet_Compara p : set) {
			System.out.println(p);
		}
	}

}
