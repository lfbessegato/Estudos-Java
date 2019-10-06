package course.capitulo2;

public class Operadores_Logicos {
	public static void main(String[] args) {
		boolean c1 = 2 > 3 || 4 != 5; //TRUE
		boolean c2 = !(2>3) && 4 != 5; // TRUE
		System.out.println(c1);
		System.out.println(c2);
		System.out.println("------------------");
		
		boolean c3 = 10 < 5; //FALSE
		boolean c4 = c1 || c2 && c3; // TRUE
		System.out.println(c4);
	}

}
