package com.aako;


abstract class BankAccount{
	public long ammount;
	
	abstract void calculateInterest(long ammt);
		
	
	public void SetBal(long amt) {
		this.ammount=amt;
	}
	public void showBalance() {
		System.out.println("Your Balance: "+ ammount);
	}
	
	
}
  
class SavingAccount extends BankAccount{

	
	 void calculateInterest(long ammt) {
		 System.out.println("Your payable interest is : 4%");
		 
		 System.out.println("Your interest will be : "+ (ammt*(0.04)));
		
	}
	 
	 

}

class FixedDepositAccount extends BankAccount{
	public void calculateInterest(long ammt) {
		 System.out.println("Your payable interest is : 7%");
		 
		 System.out.println("Your interest will be : "+ (ammt*(0.07)));
	}
}


public  class BankSimulation {
	
	public static void main(String[] args) {
		
		BankAccount acc1=new SavingAccount();
		BankAccount acc2=new FixedDepositAccount();
		
		acc1.SetBal(100000000);
		acc1.showBalance();
		acc1.calculateInterest(100000000);
		acc2.SetBal(100000000);
		acc2.showBalance();
		acc2.calculateInterest(100000000);
		
		
	}
}
