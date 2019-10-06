package course.capitulo14.application;

import java.util.LinkedHashSet;
import java.util.Set;

public class Exemplo03_LinkedHashSet {
	public static void main(String[] args) {
		
		//Mantém a ordem que foi inserido
		Set<String> set = new LinkedHashSet<>();
		
		set.add("TV");
		set.add("Notebook");
		set.add("Tablet");
		
		System.out.println(set.contains("Notebook"));
		
		for(String p : set) {
			System.out.println(p);
		}
	}

}
