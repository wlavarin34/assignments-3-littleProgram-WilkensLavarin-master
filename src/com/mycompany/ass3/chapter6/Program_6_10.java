/**
 * 
 */
package com.mycompany.ass3.chapter6;
import java.util.Scanner;

/**
 * @author Miles
 * 
 * 6.10	(Rounding Numbers) To round numbers to specific decimal places, 
 * use a statement like: y = Math.floor(x * 10 + 0.5) / 10; which rounds 
 * x to the tenths position (i.e., the first position to the right of the
 * decimal point), or: y = Math.floor(x * 100 + 0.5) / 100; which rounds 
 * x to the hundredths position (i.e., the second position to the right 
 * of the decimal point). Write an application that defines four methods 
 * for rounding a number x in various ways: 
 * 
 * A.	roundToInteger(number) 
 * B.	roundToTenths(number) 
 * C.	roundToHundredths(number) 
 * D.	roundToThousandths(number) 
 * 
 * For each value read, your program should display the original value, 
 * the number rounded to the nearest integer, the number rounded to the 
 * nearest tenth, the number rounded to the nearest hundredth and the number 
 * rounded to the nearest thousandth.
 *
 */
public class Program_6_10 
{
	@SuppressWarnings("resource")
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		double number;
		System.out.print("Please eneter a double to be rounded: ");
		number = input.nextDouble();
		roundToInteger(number);
		roundToTenths(number);
		roundToHundreds(number);
		roundToThousandths(number);
		
		System.out.println("End of Class Program_6_10");
	}
	
	public static void roundToInteger(double number)
	{
		System.out.printf("%n Rounding %f to the %S place.%n", number, "ones");
		number = Math.floor(number * 1 + 0.5) / 1;
		System.out.printf("The rounded number: %.1f.%n", number);
	}
	
	public static void roundToTenths(double number)
	{
		System.out.printf("%n Rounding %f to the %S place.%n", number, "tenths");
		number = Math.floor(number * 10 + 0.5) / 10;
		System.out.printf("The rounded number: %.2f.%n", number);
	}
	
	public static void roundToHundreds(double number)
	{
		System.out.printf("%n Rounding %f to the %S place.%n", number, "hundreths");
		number = Math.floor(number * 100 + 0.5) / 100;
		System.out.printf("The rounded number: %.3f.%n", number);
	}
	
	public static void roundToThousandths(double number)
	{
		System.out.printf("%n Rounding %f to the %S place.%n", number, "thousandths");
		number = Math.floor(number * 1000 + 0.5) / 1000;
		System.out.printf("The rounded number: %.4f.%n", number);
	}
}
