package account_project;

public class SavingsAccount extends Account {

	 int interest;
	Account acc;
	
	public void addInterest(int interest)
	{
		this.interest = interest;
	}
	
	public int getInterest()
	{
		return this.interest;
	}
	
	public SavingsAccount(int a) {
		super(a);
		// TODO Auto-generated constructor stub
	}
	
	 public void deposit(double sum)
	    {		 
		super.deposit(sum);
		 
	    }
	    
	    public void withdraw(double sum)
	    {
	    	try {
	    	if(super.getBalance()>=sum)
	    	
	         	super.withdraw(sum);
	    	else
	    		throw new Exception("Insufficient balance");
	    	
	    	}
	    	catch(Exception e)
	    	{
	    		e.printStackTrace();
	    	}
	    	  
	    }
	    
	    public double getBalance()
	    {
	    	try {
	    		
	    		if(super.getBalance()<0)
	    			throw new Exception("Balance is less then zero");
	    	}
	    	catch(Exception e)
	    	{
	    		e.printStackTrace();
	    	}
		return super.getBalance();
	    }
	    
	    public double getAccountNumber()
	    {
		return super.getAccountNumber();
	    }
	    
	
	

}
