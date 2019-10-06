package course.capitulo14.application;

import java.util.Map;
import java.util.TreeMap;

public class Exemplo01_Map {
	
	public static void main(String[] args) {
		Map<String, String> cookies = new TreeMap<>();
		
		cookies.put("username", "Maria");
		cookies.put("email", "maria@gmail.com");
		cookies.put("phone", "99711122");
		
		System.out.println("Phone Number: " + cookies.get("phone"));
		
		cookies.remove("email");
		cookies.put("phone","99711133");
		
		System.out.println("Contains 'phone' key: " + cookies.containsKey("phone"));
		System.out.println("Email: " + cookies.get("email"));
		System.out.println("Size: " + cookies.size());
		
		System.out.println("ALL COOKIES:");
		for (String key : cookies.keySet()) {
			System.out.println(key + ": " + cookies.get(key));
		}
	}
}
