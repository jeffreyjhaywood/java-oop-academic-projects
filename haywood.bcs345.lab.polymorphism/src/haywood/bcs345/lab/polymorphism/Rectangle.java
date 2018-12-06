package haywood.bcs345.lab.polymorphism;

public class Rectangle extends Shape {
	
	protected double m_length, m_width;
	
	public Rectangle(double length, double width) {
		m_length = length;
		m_width = width;
	}
	
	@Override public void CalculateArea() {
		m_area = m_length * m_width;
	}
	
	@Override public void CalculateCircum() {
		m_circum = (2 * m_length) + (2 * m_width);
	}
	
	public void Display(){
		System.out.println("Area for Rectangle: " + m_area);
		System.out.println("Circumference for Rectangle: " + m_circum);
	}
}
