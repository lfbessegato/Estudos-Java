package course.capitulo14.application;

import java.util.LinkedHashSet;
import java.util.Set;

public class Exemplo05_RemoveIf {
	
public static void main(String[] args) {
		
		//Mantém a ordem que foi inserido
		Set<String> set = new LinkedHashSet<>();
		
		set.add("TV");
		set.add("Notebook");
		set.add("Tablet");
		
		//Remove com predicado
		set.removeIf(x -> x.length() >= 3);
		
		for(String p : set) {
			System.out.println(p);
		}
	}


}
