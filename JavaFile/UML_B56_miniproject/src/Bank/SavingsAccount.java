package Bank;

public class SavingsAccount extends Account{
	private double intRate; // annual interest rate for

	public SavingsAccount(int idNumber, double balance, double rate) {
		// Answer B
		super(idNumber,balance);
		intRate=rate;
	}

	public double monthlyInterest() {
		return (currentBalance() * (intRate / 12.0));
	}
	public void withdraw(double amount) {
		decreaseBalance(amount);
	}
}
