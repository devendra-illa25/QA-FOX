package oops;

public interface Bank {

	String accountType1= "Saviings";
	String accountType2= "Current";	//fnal and statc type and values cnt be changed
	
	public void depositMoney();
	public void viewBalance();	//remove body {	}  only defntons
	public void transferMoney();
	public void openFixedDeposit(); //100% abstractons
	
	
	
}


class HDFC implements Bank{

	
	public void depositMoney() {
		System.out.println("Money deposited in HDFC Bank");
		
	}


	
	public void viewBalance() {
		System.out.println("Balance viewed in HDFC Bank");
		
	}

	
	public void transferMoney() {
		System.out.println("Money transfered from HDFC Bank");
		
	}

	
	public void openFixedDeposit() {
		System.out.println("Fixed deposit opened in HDFC bank");
		
	}
	
	public void InterestDeposit() { 
		System.out.println("Interest amount Deposied in HDFC bank");
		
	}
	
}
