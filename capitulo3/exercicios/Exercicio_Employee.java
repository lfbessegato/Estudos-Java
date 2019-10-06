package course.capitulo3.exercicios;

import java.util.Locale;
import java.util.Scanner;

import course.capitulo3.entities.Employee;

public class Exercicio_Employee {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee emp = new Employee();
		
		System.out.print("Name: ");
		emp.name = sc.nextLine();
		
		System.out.print("Gross Salary: ");
		emp.grossSalary = sc.nextDouble();
		
		System.out.print("Tax: ");
		emp.tax = sc.nextDouble();
		
		System.out.println();
		System.out.println("Employee: "+ emp);
				
		System.out.print("Which percentage to increase salary? ");
		double percentage = sc.nextDouble();
		emp.increasseSalary(percentage);
		
		System.out.println();
		System.out.println("Updated data: " + emp);
		sc.close();
	}

}
