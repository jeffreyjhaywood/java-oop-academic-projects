package haywood.bcs345.lab.classes2;

public class Person {
	
	private String m_name;
	private int m_hoursWorked;
	private double m_hourlyRate;
	private double m_overtimeHourlyRate;
	
	public Person() {
		m_name = "";
		m_hoursWorked = 0;
		m_hourlyRate = 0;
		m_overtimeHourlyRate = 0;
	}
	
	public Person(String name, int hoursWorked, double hourlyRate, double overtimeHourlyRate) {
		m_name = name;
		m_hoursWorked = hoursWorked;
		m_hourlyRate = hourlyRate;
		m_overtimeHourlyRate = overtimeHourlyRate;
	}
	
	public String GetName() { return m_name; }
	public int GetHoursWorked() { return m_hoursWorked; }
	public double GetHourlyRate() { return m_hourlyRate; }
	public double GetOvertimeHourlyRate() { return m_overtimeHourlyRate; }
	
	public void SetName(String name) { m_name = name; }
	public void SetHoursWorked(int hoursWorked) { m_hoursWorked = hoursWorked; }
	public void SetHourlyRate(double hourlyRate) { m_hourlyRate = hourlyRate; }
	public void SetOvertimeHourlyRate(double overtimeHourlyRate) { m_hourlyRate = overtimeHourlyRate; }
	
	public double GetPay() {
		double moneyEarned = 0;
		int numOvertimeHours = 0;
		
		if(m_hoursWorked > 40)
		{
			numOvertimeHours = m_hoursWorked - 40;
			moneyEarned = m_hourlyRate * 40;
			moneyEarned += numOvertimeHours * m_overtimeHourlyRate;
			return moneyEarned;
		}
		
		else
		{
			moneyEarned = m_hoursWorked * m_hourlyRate;
			return moneyEarned;
		}
		
	}
	
	/*public void SalaryReport() {
		int numOvertimeHours = m_hoursWorked - 40;
		double moneyEarned = m_hoursWorked * m_hourlyRate;
		System.out.printf("Pay          Hrs  Rate  Type\n");
		System.out.printf("%7.2f %7d %7.2f %7s\n", moneyEarned, m_hoursWorked, m_hourlyRate, "Normal");
		moneyEarned = numOvertimeHours * m_overtimeHourlyRate;
		System.out.printf("%7.2f %7d %7.2f %7s\n", moneyEarned, numOvertimeHours, m_overtimeHourlyRate, "Overtime");
	}*/

}
