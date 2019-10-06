package course.capitulo3.entities;

public class Employee {
	
	public String name;
	public double grossSalary;
	public double tax;
	
	public double netSalary() {
		return grossSalary - tax;
	}
	
	public void increasseSalary(double percentage) {
		grossSalary += grossSalary * percentage / 100.0;
	}
	
	public String toString() {
		return name + ", $ " + String.format("%.2f%n", netSalary());
	}
}
