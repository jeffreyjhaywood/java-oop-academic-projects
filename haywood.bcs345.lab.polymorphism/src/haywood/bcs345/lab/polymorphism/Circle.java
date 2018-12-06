package haywood.bcs345.lab.polymorphism;

public class Circle extends Shape {
	
	protected double m_radius;
	
	public Circle(double radius) {
		m_radius = radius;
	}
	
	@Override public void CalculateArea() {
		m_area = 3.14 * (m_radius * m_radius);
	}
	
	@Override public void CalculateCircum() {
		m_circum = (2 * 3.14) * m_radius;
	}
	
	public void Display() {
		System.out.println("Area for Circle: " +m_area);
		System.out.println("Circumference for Circle: " + m_circum);
	}

}
