package account_project;

public class CurrentAccount extends Account {
	
	public CurrentAccount(int a) {
		super(a);
		// TODO Auto-generated constructor stub
	}
    Account acc;
	 int overdraftLimit;
	
	public void AddOverdraftLimit(int odl)
	{
		this.overdraftLimit = odl;
	}
	
	public void deposit(double sum)
    {
//	if (sum>0) 
//	    bal+=sum;    
//	else
//	    System.err.println("Account.deposit(...): "
//			       +"cannot deposit negative amount.");    
		super.deposit(sum);
    }
    
    public void withdraw(double sum)
    {
     try {
    	if(super.getBalance()>=sum)
	    	
         	super.withdraw(sum);
    	
    	if(super.getBalance()==0&& sum>overdraftLimit)
    		throw new Exception("Insufficient balance and overdraft limit also less then the Withdraw amount");
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
