package course.capitulo4.entities;


public class Account {
	private double TAXA_SAQUE = 5.00;	
	private int number;
	private String holder;
	private double balance;
	
	public Account(int number, String holder) {
		this.number = number;
		this.holder = holder;
	}

	public Account(int number, String holder, double initialDeposit) {
		this.number = number;
		this.holder = holder;
		deposit(initialDeposit);
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public int getNumber() {
		return number;
	}

	public double getBalance() {
		return balance;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw (double amount) {
		balance -= amount + TAXA_SAQUE;
	}
	
	public String toString() {
		return "Account " 
				+ number
				+ ", Holder: "
				+ holder
				+ ", Balance $ "
				+ String.format("%.2f%n",balance);
	}

}
