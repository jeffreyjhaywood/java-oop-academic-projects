package haywood.bcs345.lab.classes2;

public class Main {

	public static void main(String[] args) {
		Person emp1 = new Person("Jeff", 40, 20.00, 25.00);
		System.out.printf("%s made %.2f.\n", emp1.GetName(), emp1.GetPay());
		//emp1.SalaryReport();
		
		Person emp2 = new Person("Mike", 50, 25.00, 30.00);
		System.out.printf("%s made %.2f.\n", emp2.GetName(), emp2.GetPay());
		//emp2.SalaryReport();
	}

}
