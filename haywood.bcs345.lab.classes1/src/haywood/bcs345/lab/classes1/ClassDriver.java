package haywood.bcs345.lab.classes1;

import java.io.FileReader;
import java.util.Scanner;

public class ClassDriver {

	public static void main(String[] args) {
		
		SalesPerson salesPerson = new SalesPerson();
		
		salesPerson.setName("Jeffrey");
		salesPerson.setSalesTotal(250.00);
		
		salesPerson.StatusMessage();
		
		/*try {	
			Scanner inputScanner = new Scanner(new FileReader("SalesNames.txt"));
		
			while(inputScanner.hasNextLine()) {
				
				System.out.printf("%f", salesPerson.QuotaDifference());
			}
		}
		catch(Exception e) {
			System.out.println("Could not open file.");
		}*/
	}
	

}
