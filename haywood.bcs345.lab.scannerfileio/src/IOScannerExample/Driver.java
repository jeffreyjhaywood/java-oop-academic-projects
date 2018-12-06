package IOScannerExample;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintStream;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) throws FileNotFoundException {
		int num1, num2, result;
		
		/*
		Scanner keyboardScanner = new Scanner(System.in);
		
		System.out.printf("Enter first number\n");
		num1 = keyboardScanner.nextInt();
		
		System.out.printf("Enter second number\n");
		num2 = keyboardScanner.nextInt();
		*/
		
		//result = num1 * num2;
		//System.out.printf("Result is %d\n", result);
		
//*********************************************
		
		String filename = "num.txt";
		Scanner inputScanner = new Scanner(new FileReader(filename));
		
		num1 = inputScanner.nextInt();
		num2 = inputScanner.nextInt();

		result = num1 * num2;
		
		// Use to print to a file
		PrintStream ps = null;
		
		try
		{
			ps = new PrintStream("JeffreyOutput.txt");
		}
		catch (Exception e)
		{
			System.out.println("Error. Could not open file!");
		}
		
		ps.printf("%d %d\n", num1, num2);
		//ps.printf("%d\n", num2);
		ps.printf("The result is %d\n", result);
	}
}