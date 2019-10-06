package course.capitulo5.exercicios;

import java.util.Locale;
import java.util.Scanner;

import course.capitulo5.entities.Rent;

public class Exer01 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rent[] vect = new Rent[10];
		
		System.out.println("How many rooms will be rentered? ");
		int n = sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			System.out.println();
			System.out.println("Rent #" + i + ":");
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.print("E-Mail: ");
			String email = sc.nextLine();
			
			System.out.print("Room: ");
			int room = sc.nextInt();
			vect[room] = new Rent (name,email); 
		}
			
		System.out.println();
		System.out.println("Busy rooms: ");
		for (int i=0;i<10;i++) {
			if (vect[i] != null){
				System.out.println(i + ": " + vect[i]);
			}
		}
		
		sc.close();
	}

}
