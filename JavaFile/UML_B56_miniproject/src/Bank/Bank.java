package Bank;

public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
SavingsAccount sv = new SavingsAccount(1111, 1000.0, 7);
CurrentAccount ca = new CurrentAccount(2222, 2000.0, 1.2);
CurrentPlusAccount cp =
          new CurrentPlusAccount(3333, 3000.0, 1, 200, 2.5);
System.out.println( "CurrentPlusAccountBalance:>>>>>>>>>>>"
                         + cp.currentBalance());
System.out.println( "Savings Account Balance : >>>>>>>>>>>"
                         + sv.currentBalance());
System.out.println( "Current Account Balance : >>>>>>>>>>>"
                         + ca.currentBalance());
System.out.println( "CurrentPlusAccountInterest:>>>>>>>>>>>"
                         + cp.monthlyInterest());
System.out.println( "Savings Account Interest : >>>>>>>>>>>"
                         + sv.monthlyInterest());
System.out.println( "Current Account Interest : >>>>>>>>>>>"
                         + ca.monthlyInterest());
	}

}
