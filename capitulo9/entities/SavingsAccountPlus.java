package course.capitulo9.entities;

/* 
 * N�o permite criar a subclasse herdada da classe SavingsAccount, pois 
 * na cria��o da classe SavingsAccount foi adicionada a palavra final 
 * ao criar a classe
 * */

/* public class SavingsAccountPlus extends SavingsAccount{

} */

public class SavingsAccountPlus extends SavingsAccount {
	
	@Override // Sobrescrevendo p m�todo da classe Account
	public void withdraw(double amount) {
		balance -= amount + 2.0;
	}

}
