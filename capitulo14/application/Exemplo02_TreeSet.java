package course.capitulo14.application;

import java.util.Set;
import java.util.TreeSet;

public class Exemplo02_TreeSet {
	public static void main(String[] args) {
		
		//Ordena a ordena
		Set<String> set = new TreeSet<>();
		
		set.add("TV");
		set.add("Notebook");
		set.add("Tablet");
		
		System.out.println(set.contains("Notebook"));
		
		for(String p : set) {
			System.out.println(p);
		}
	}

}
