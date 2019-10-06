package course.capitulo9.application;

import course.capitulo9.entities.BusinessAccount;

public class Exemplo_Herenca01 {
	public static void main(String[] args) {
		
		BusinessAccount account = new BusinessAccount(8010, "Bob Brown", 0.0, 500.0);

		System.out.println(account.getBalance());
	}

}
