package Bank;

public class CurrentAccount extends Account {
	private double checkCharge;
	public CurrentAccount(int idNumber, double startBal, double chkCharge){ 
		super(idNumber, startBal);
		checkCharge = chkCharge;
	}
	
	public void clearCheck(double amount) {
		//Answer C
		super.decreaseBalance(amount);
	}
	
	public double monthlyInterest() {
		return 0.0;
	}
}
