package com.bridgeit.FunctionalPrograms;

/******************************************************************************
 *  Compilation:  javac -StopWatch.java
 *  Execution:    java - com.bridgeit.AlgorithmPrograms.StopWatch
 *  
 *  Purpose: Printing elapsed time on console   
 *           
 *  @author  Srujan Madipeddi
 *  @version 1.0
 *  @Date   11-03-2019
 *
 ******************************************************************************/
import com.bridgeit.utilitypack.Utility;

public class StopWatch {
	static long startTime;
	static long endTime;

	public static void main(String[] args) {
		long time;
		int start, end;
		System.out.println("press 1 to start stopwatch ");
		// taking input from user to start and stop timer
		start = Utility.getPositiveInt();
		if (start == 1) {
			start();
		}
		System.out.println("press 2 to stop stopwatch");
		end = Utility.getPositiveInt();
		if (end == 2) {
			stop();
		}
		time = StopWatch.timeElapsed();
		// To print output in time manner
		Utility.printTime(time);

	}

	public static void start() {
		startTime = System.currentTimeMillis();
	}

	public static void stop() {
		endTime = System.currentTimeMillis();
	}

	public static long timeElapsed() {
		// returns the elapsed time
		return (endTime - startTime);
	}
}
