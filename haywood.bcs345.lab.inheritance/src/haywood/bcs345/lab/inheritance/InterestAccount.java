package haywood.bcs345.lab.inheritance;

public class InterestAccount extends BankAccount {
	private double m_interest = 0;
	
	public InterestAccount() {
		super(); // Calls base class constructor, must be first statement in a constructor
		m_interest = .1;
	}
	
	public InterestAccount(String name, double bal, double interest) {
		super(name, bal); // Calls two parameter base class constructor
		m_interest = interest;
	}
	
	public double GetInterest() { return m_interest; }
	public void SetInterest(double interest) { m_interest = interest; }
	
	public void ApplyInterest() {
		double appInterest = this.GetBal() * m_interest;
		appInterest += this.GetBal();
		this.SetBal(appInterest);
	}
	
	public void Show() {
		super.Show();
		
		System.out.printf("\nInt Pct: %.2f", m_interest);
	}
	

}
