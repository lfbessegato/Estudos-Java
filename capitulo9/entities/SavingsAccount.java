package course.capitulo9.entities;

/* 
 * Dessa forma n�o permite herdar a classe SavingsAccount para outras subclasses
 * 
public final class SavingsAccount extends Account { */

public class SavingsAccount extends Account {
	
	private Double interestRate;
	
	public SavingsAccount() {
		super();
	}

	public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
	
	public void updateBalance() {
		balance += balance * interestRate;
	}
	
	@Override // Sobrescrevendo p m�todo da classe Account
	/* 
	 * Se acrescentar a palavra final, n�o � poss�vel 
	 * sobrepropor o m�todo com a palavra @Override
	 * public final void withdraw(double amount) { */
	
	public void withdraw(double amount) {
		balance -= amount;
	}

}
