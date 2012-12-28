/*
 * mathFunctions.java
 * 
 * Copyright 2012 brian <brian@crunchbang>
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 * 
 * 
 * 
 */

import java.util.Scanner;

public class mathFunctions {
	
	public final static double PI = 3.14159265;
	public static double volume;
	
	// up to ten significant figures (the Babaylonian method)
	public static void printSqrt(double x)
	{ 
		if(x < 0)
		{
			throw new IllegalArgumentException ("Enter a non negative number");
		}
		else
		{	
		int sigFig = 1000;
		double squareRoot;
		double temp2 = (sigFig + x / sigFig) / 2;

		for(int i = 0; i < 10; i++)
		{
			temp2 = (temp2 + x / temp2) / 2; 
			System.out.println("At pass " + i + " the square Root is: " + temp2);
		}
		
		}
	}
	
	public static double sphereVolume(double radius)
	{
		double cubed;
		
		if(radius < 0)
		{
			throw new IllegalArgumentException ("Enter a real radius");
		
		}
		else
		{
			cubed = radius * radius * radius;
			volume = (4 * (PI * cubed)) / 3;
			System.out.println("The volume of your sphere is: " + volume);
		}
		return volume;
	} 
	
	
	public static void main (String args[]) {
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Welcome to fun Math Functions Menu:");
		System.out.println("1. SquareRoot.");
		System.out.println("2. Volume of a Sphere.");
		System.out.println("3. Java has printf????");
		System.out.println("4. Adding numbers");
		System.out.print("Enter the corresponding number for functionality:");
		
		int menuOption = userInput.nextInt();
		
		
		switch(menuOption)
		{
			case 1: System.out.println("You have chosen the Square root function.");
					System.out.print("Enter a number to find the Square Root of it:");
					double squareRoot = userInput.nextDouble();
					printSqrt(squareRoot);
					break;
			
			case 2: System.out.println("You have selected the volume of a sphere formula.");
					System.out.print("Enter the radius of your sphere:");
					double sphereRadius = userInput.nextDouble();
					sphereVolume(sphereRadius);
					break;
					
			case 3: System.out.println("You have selected printf?");
					System.out.print("Enter your age:");
					int age = userInput.nextInt();
					System.out.print("Enter your height");
					double height = userInput.nextDouble();
					System.out.printf("Your age: %10d\n", age);
					System.out.printf("Your height: %12.3f\n", height);
					
			case 4: System.out.println("You can add numbers:");
					int[] array =  {27,57,8,5,3,6,8,67,43,31,2,11,12,14,17};
					int sum = 0;
					for(int i = 0; i<array.length; i++)
					{
						sum = array[i] + sum;
					}
					System.out.println("This is the sum " + sum);
		}
	}
}

