package course.capitulo9.entities;

/* 
 * Não permite criar a subclasse herdada da classe SavingsAccount, pois 
 * na criação da classe SavingsAccount foi adicionada a palavra final 
 * ao criar a classe
 * */

/* public class SavingsAccountPlus extends SavingsAccount{

} */

public class SavingsAccountPlus extends SavingsAccount {
	
	@Override // Sobrescrevendo p método da classe Account
	public void withdraw(double amount) {
		balance -= amount + 2.0;
	}

}
