package haywood.bcs345.lab.inheritance;

public class Main {

	public static void main(String[] args) {
		//BankAccount b = new BankAccount("Jeffrey", 100);
		
		/*b.Deposit(50);
		b.Show();
		System.out.println("");
		b.Withdraw(25);
		b.Show();*/
		
		InterestAccount ia = new InterestAccount("Jeffrey", 100, .1);
		System.out.println("Starting Balance");
		ia.Show();
		System.out.println("");
		
		System.out.println("Deposit 500");
		ia.Deposit(500);
		ia.Show();
		System.out.println("");
		
		System.out.println("Withdraw 10000");
		ia.Withdraw(10000);
		ia.Show();
		System.out.println("");
		
		System.out.println("Apply Interest");
		ia.ApplyInterest();
		ia.Show();

	}

}
