package haywood.bcs345.lab.polymorphism;

public abstract class Shape implements IDisplayable {
	
	protected double m_area;
	protected double m_circum;
	
	public abstract void CalculateArea();
	public abstract void CalculateCircum();

}
