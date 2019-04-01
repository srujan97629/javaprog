package com.bridgeit.AlgorithmPrograms;

/******************************************************************************
 *  Compilation:  javac -d bin TemperatureConversion.java
 *  Execution:    java -cp bin com.bridgeit.AlgorithmPrograms.TemperatureConversion
 *  
 *  Purpose: Converting the temperatures from celcius to Fahrenheit and vice versa
 *
 *  @author  Srujan Madipeddi
 *  @version 1.0
 *  @Date   13-03-2019
 *
 ******************************************************************************/
import java.util.InputMismatchException;

import com.bridgeit.utilitypack.Utility;

public class TemperatureConversion {
	public static void main(String[] args) {
		System.out.println("press 1 to convert celcius to Fahrenheit  ");
		System.out.println("press 2 to convert Fahrenheit to celcius  ");
		try {
			// Taking input from user
			int num = Utility.getInteger();
			// By using temperature conversion method converting the temperature
			temperatureConversion(num);
		} catch (InputMismatchException e) {
			System.err.println("Enter 1 or 2 only");
		}
	}

	public static void temperatureConversion(int num) {
		switch (num) {
		case 1:
			System.out.println("Enter celcius ");
			double celsius = Utility.getDouble();
			double Fahrenheit = ((celsius) * (9 / 5)) + 32;
			System.out.println(celsius + " celsius is equal to " + Fahrenheit + " Fahrenhei");
			break;
		case 2:
			System.out.println("Enter Fahrenheits");
			double Fahrenheit2 = Utility.getDouble();
			double celsius1 = (Fahrenheit2 - 32) * 5 / 9;
			System.out.println(Fahrenheit2 + " Fahrenheit is equal to" + celsius1 + " celsiu");
			break;
		default:
			System.out.println("Enter 1 or 2 only ");
		}
	}

}
