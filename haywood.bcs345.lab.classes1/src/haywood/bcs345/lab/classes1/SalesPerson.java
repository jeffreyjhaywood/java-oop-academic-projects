package haywood.bcs345.lab.classes1;

public class SalesPerson {

	private String m_name;
	private double m_salesTotal;
	
	public String getName() { return m_name; }
	public double getSalesTotal() { return m_salesTotal; }
	
	public void setName(String name) { m_name = name; }
	public void setSalesTotal(double salesTotal) { m_salesTotal = salesTotal; }
	
	
	public void StatusMessage() {
		if(m_salesTotal >= 100)
		{
			System.out.println("Performing well");
		}
		
		else
		{
			System.out.println("Not Performing well");
		}
	}
	
	public double QuotaDifference() {
		return m_salesTotal - 100;
	}
}
