package ProblemStatement;

public class TestBankAccount {

	public static void main(String[] args) throws Exception {
		BankAccount bankacc =new BankAccount(123,"neha","saving", 4254.4f);
		System.out.println(bankacc.getBlance());
		try {
			bankacc.deposit(6323.5f);
		} catch (Exception e) {
			System.out.println("invalid operation");
		}
		System.out.println(bankacc.getBlance());
		
		try {
			bankacc.withdraw(-6323.5f);
		} catch (Exception e) {
			System.out.println("invalid operation");
		}
		System.out.println(bankacc.getBlance());
		
	
		
	}

}
