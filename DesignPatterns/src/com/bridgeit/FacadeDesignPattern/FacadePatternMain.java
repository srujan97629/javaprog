package com.bridgeit.FacadeDesignPattern;

public class FacadePatternMain 
{
	   public static void main(String[] args)
	   {
	      ShapeMarker shapeMaker = new ShapeMarker();

	      shapeMaker.drawCircle();
	      shapeMaker.drawRectangle();
	      shapeMaker.drawSquare();		
	   }
	}
