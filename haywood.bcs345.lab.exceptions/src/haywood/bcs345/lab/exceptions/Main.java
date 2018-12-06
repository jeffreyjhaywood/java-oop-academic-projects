package haywood.bcs345.lab.exceptions;

import java.io.FileReader;
import java.io.PrintStream;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int num1 = 0, num2 = 0, i = 0, result = 0;
		Scanner inFile = null;
		PrintStream outFile = null;
		
		try
		{
			inFile = new Scanner(new FileReader("input.txt"));
		}
		catch(Exception e)
		{
			System.out.println("Could not open file");
		}
		
		try
		{
			outFile = new PrintStream("output.txt");
		}
		catch(Exception e)
		{
			System.out.println("Could not open file");
		}
		
		// Keep processing while there is int data left
		// in the input stream
		while (inFile.hasNextInt())
		{
			try
			{
			num1 = inFile.nextInt();
			num2 = inFile.nextInt();
			result = num1 / num2;
			outFile.printf("%d " + "/" + "%d " + "is " + "%d\n", num1, num2, result);
			}
			
			catch(ArithmeticException ae)
			{
				outFile.printf("Divide by 0\n");
			}
			catch(InputMismatchException ime)
			{
				inFile.nextLine();
				outFile.printf("Error: Not int type data in input stream.\n");
			}
		}

	}

}
