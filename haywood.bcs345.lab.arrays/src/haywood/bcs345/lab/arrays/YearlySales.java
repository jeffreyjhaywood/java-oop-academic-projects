package haywood.bcs345.lab.arrays;

public class YearlySales 
{
	private double[] m_monthSales = new double[12]; // Class member variables are on the heap
	private String[] m_monthNames = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
	
	public double GetMonthlySales(int month)
	{ 
		return m_monthSales[month - 1]; // If not -1 and user enters 12 for December it will give an ArrayOutOfBounds Exception
	}
	
	public void SetMonthlySales(int month, double amt) 
	{  
		m_monthSales[month -1] = amt;
	}
	
	public double Average()
	{
		double average = 0;
		
		for (double sales : m_monthSales)
		{
			average += sales;
		}
		
		return average / m_monthSales.length;
	}
	
	public void ShowReport()
	{
		double total = 0;
		
		for (int i = 0; i < m_monthSales.length; i++)
		{
			System.out.printf("%10s %10.2f \n", m_monthNames[i], m_monthSales[i]);
			total += m_monthSales[i];
		}
		
		System.out.printf("%10s %10.2f\n", "Total", total);
		System.out.printf("%10s %10.2f\n", "Average: ", Average());
	}
	
}
