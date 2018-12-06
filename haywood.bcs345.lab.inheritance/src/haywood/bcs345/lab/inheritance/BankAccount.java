package haywood.bcs345.lab.inheritance;

public class BankAccount {
	private String m_name = "";
	private double m_bal = 0;
	
	public BankAccount() {
		m_name = "";
		m_bal = 0;
	}
	
	public BankAccount(String name, double bal) {
		m_name = name;
		m_bal = bal;
	}
	
	public String GetName() { return m_name; }
	public double GetBal() { return m_bal; }
	public void SetName(String name) { m_name = name; }
	public void SetBal(double bal) { m_bal = bal; }
	
	public void Deposit(double amt) {
		m_bal += amt;
	}
	
	public void Withdraw(double amt) {
		if (amt <= m_bal)
		{
			m_bal -= amt;
		}
		
		else
		{
			System.out.println("Invalid operation, balance too low.");
		}
	}
	
	public void Show() {
		System.out.printf("Account Name: %s\nBalance: $%.2f", m_name, m_bal);
	}

}
