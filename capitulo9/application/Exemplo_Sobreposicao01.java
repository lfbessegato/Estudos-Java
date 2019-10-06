package course.capitulo9.application;

import course.capitulo9.entities.Account;
import course.capitulo9.entities.BusinessAccount;
import course.capitulo9.entities.SavingsAccount;

public class Exemplo_Sobreposicao01 {
	
	public static void main(String[] args) {
		
		Account acc1 = new Account(1001, "Alex", 1000.0);
		acc1.withdraw(200.0);
		System.out.println(acc1.getBalance());
		
		Account acc2 = new SavingsAccount(1002, "Maria", 1000.0, 0.01);
		acc2.withdraw(200.0);
		System.out.println(acc2.getBalance());
		
		Account acc3 = new BusinessAccount(1003,"Bob", 1000.0, 500.0);
		acc3.withdraw(200.0);
		System.out.println(acc3.getBalance());
	}

}
