package haywood.bcs345.lab.arrays;

public class Main {

	public static void main(String[] args) 
	{
		YearlySales ys = new YearlySales();
		
		ys.SetMonthlySales(1, 100);
		ys.SetMonthlySales(2, 50);
		ys.SetMonthlySales(3, 100);
		ys.SetMonthlySales(4, 50);
		ys.SetMonthlySales(5, 100);
		ys.SetMonthlySales(6, 50);
		ys.SetMonthlySales(7, 100);
		ys.SetMonthlySales(8, 50);
		ys.SetMonthlySales(9, 100);
		ys.SetMonthlySales(10, 50);
		ys.SetMonthlySales(11, 100);
		ys.SetMonthlySales(12, 50);
		
		//System.out.println("Average: " + ys.Average() + "\n");
		
		ys.ShowReport();

	}

}
