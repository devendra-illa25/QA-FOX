package oops;

public class DemoX {
	
	public static void main(String [] args) {
	
		HDFC h=new HDFC();
			
		h.depositMoney();
		h.InterestDeposit();
		h.openFixedDeposit();
		h.transferMoney();
		h.viewBalance();
		
		
		Bank b=h;
		b.depositMoney();
		b.openFixedDeposit();
		b.transferMoney();
		b.viewBalance();
	}

}
