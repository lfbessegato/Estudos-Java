package course.capitulo9.application;

import course.capitulo9.entities.Account;
import course.capitulo9.entities.SavingsAccount;

public class Exemplo_Polimorfismo01 {
	
	public static void main(String[] args) {
		
		Account x = new Account(1001,"Alex", 1000.0);
		Account y = new SavingsAccount(1002,"Maria", 1000.0, 0.01);
		
		x.withdraw(50.0);
		y.withdraw(50.0);
		System.out.println("X = " + x.getBalance());
		System.out.println("Y = " + y.getBalance());
	}
	

}
