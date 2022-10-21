package account_project;

public class Bank {
	
	public static void update(SavingsAccount acc1, int sum)
	{
		acc1.addInterest(sum);
	}
	
	public static void main(String[] args) 
	{
		
		SavingsAccount sa[] = new SavingsAccount[5];
		
		sa[0] = new SavingsAccount(1);
		//acc[2] = new SavingsAccount(500);
		sa[0].deposit(300);
		System.out.println("Balance in  saving account"+sa[0].getBalance());
		update(sa[0], 400);
		
		System.out.println("Interest in saving account "+sa[0].getInterest());
		CurrentAccount ca[] = new CurrentAccount[5];
		
		 ca[0] = new CurrentAccount(2);
		
		ca[0].deposit(0);
		ca[0].AddOverdraftLimit(300);
        ca[0].withdraw(400);
        
		System.out.println(ca[0].getBalance());
		
		System.out.println(sa[0].getAccountNumber());
	    System.err.println(ca[0].getAccountNumber());

		  
		
		
		
		
		

	}

}
