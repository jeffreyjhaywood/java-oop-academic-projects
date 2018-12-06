package haywood.bcs345.lab.inheritance;

public class Customer {
	private String m_name = "";
	private InterestAccount m_savings = new InterestAccount();
	private InterestAccount m_checking = new InterestAccount();
	
	public String GetName() { return m_name; }
	public void SetName(String name) { m_name = name; }
	
	public void DepositSavings(double amt) {
		m_savings.Deposit(amt);
	}
	
	public void DepositChecking(double amt) {
		m_checking.Deposit(amt);
	}
	
	public void WithdrawSavings(double amt) {
		m_savings.Withdraw(amt);
	}
	
	public void WithdrawChecking(double amt) {
		m_checking.Withdraw(amt);
	}

}
