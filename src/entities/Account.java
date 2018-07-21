package entities;

public class Account {
	
	private int accountNumber;
	private String name;
	private double balance;	
	
	// CONSTRUCTORS
	public Account(int accountNumber, String name) {
		this.accountNumber = accountNumber;
		this.name = name;
	}	
	
	public Account(int accountNumber, String name, double initDeposit) {
		this.accountNumber = accountNumber;
		this.name = name;
		addBalance(initDeposit);
	}
	
	//GETTERS AND SETTERS	
	public int getAccountNumber() {
		return accountNumber;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getBalance() {
		return balance;
	}
	
	// FUNCTIONS	
	public void addBalance(double value) {
		this.balance += value;
	}
	
	public void removeBalance(double value) {
		this.balance -= (value + 5);
	}
	
	public String toString() {
		return "Account "
				+ this.accountNumber
				+ ", Holder: "
				+ this.name
				+ ", Balance: $ "
				+ String.format("%.2f", this.balance);
	}
}
