package course.capitulo5.application;

public class Exemplo_For_Each {
	public static void main(String[] args) {
		String[] vect = new String[] {"Maria", "Bob", "Alex"};
		
		for (int i = 0;i<vect.length;i++) {
			System.out.println(vect[i]);
		}
		
		System.out.println("---------------------");
		for (String obj: vect) {
			System.out.println(obj);
		}
	}

}
