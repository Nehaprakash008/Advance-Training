package ProblemStatement;

public class BankAccount {
	private int accNo;
	private String custName;
	private String accType;
	private float balance;
	
	
	
	public BankAccount(int accNo, String custName, String accType, float balance) {
		super();
		this.accNo = accNo;
		this.custName = custName;
		this.accType = accType;
		this.balance = balance;
	}
	public void deposit(float amt) throws NegativeAmountException
	{
		float newBalance = amt+balance;
		
		if(newBalance<0)
		{
			throw new NegativeAmountException("You don't have sufficient fund ");
			
		}
		else
		{
			this.balance = newBalance;
		}
	}
	public void withdraw(float amt)throws InsufficientFundException
	{
		float newBalance = balance-amt;
		
		
		if((accType.equals("saving") && newBalance<1000)  || (accType.equals("current") && newBalance<5000))
		{
			
			throw new InsufficientFundException("You don't have sufficient fund ");
			
		}
		else
		{
			this.balance = newBalance;
		}
		
	}
	public float getBlance()throws LowBalanceException
	{
		if((accType.equals("saving") && balance<1000)  || (accType.equals("current") && balance<5000))
		{
			
			throw new LowBalanceException("You don't have sufficient fund ");
			
		}
		return balance;
		
	}

}
