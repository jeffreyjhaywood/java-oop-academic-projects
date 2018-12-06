package haywood.bcs345.lab.polymorphism;

public class Driver {
	
	public static void ShowAllData(IDisplayable[] idArr) {
		for(IDisplayable var : idArr)
		{
			var.Display();
		}
	}

	public static void main(String[] args) {
		
		Shape[] shapeArr = new Shape[4];
		
		shapeArr[0] = new Circle(3);
		shapeArr[1] = new Circle(2);
		shapeArr[2] = new Rectangle(5, 5);
		shapeArr[3] = new Rectangle(10, 10);
		
		for(Shape var : shapeArr )
		{
			var.CalculateArea();
			var.CalculateCircum();
		}
		
		ShowAllData(shapeArr);
		
		/*IDisplayable[] idArr = new IDisplayable[4];
		
		idArr[0] = new Circle(3);
		idArr[0] = shapeArr[0];
		
		idArr[1] = new Circle(2);
		idArr[1] = shapeArr[1];
		
		idArr[2] = new Rectangle(5, 5);
		idArr[2] = shapeArr[2];
		
		idArr[3] = new Rectangle(10, 10);
		idArr[3] = shapeArr[3];
		
		ShowAllData(idArr);*/

	}

}
