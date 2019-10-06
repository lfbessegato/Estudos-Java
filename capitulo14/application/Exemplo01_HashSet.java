package course.capitulo14.application;

import java.util.HashSet;
import java.util.Set;

public class Exemplo01_HashSet {
	public static void main(String[] args) {
		
		//Não garante a ordem
		Set<String> set = new HashSet<>();
		
		set.add("TV");
		set.add("Notebook");
		set.add("Tablet");
		
		System.out.println(set.contains("Notebook"));
		
		for(String p : set) {
			System.out.println(p);
		}
	}
}
