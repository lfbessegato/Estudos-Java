package course.capitulo9.entities;

// Define uma herança da classe Account
public class BusinessAccount extends Account{
	
	private Double loanLimit;
	
	public BusinessAccount() {
	}
	
	// Criado o argumento com os argumentos da Classe Account
	public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance);
		this.loanLimit = loanLimit;
	}	

	public Double getLoanLimit() {
		return loanLimit;
	}

	
	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}
	
	public void loan(double amount) {
		if (amount <= loanLimit) {
			balance += amount - 10.0;
		}
	}
	
	
	@Override // Sobrescrevendo p método da classe Account
	public void withdraw(double amount) {
		super.withdraw(amount);
		balance -= 2.0;
	}

	

}
