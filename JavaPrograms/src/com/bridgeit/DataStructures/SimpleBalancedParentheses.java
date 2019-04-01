package com.bridgeit.DataStructures;

/******************************************************************************
 *  Compilation:  javac -SimpleBalancedParentheses.java
 *  Execution:    java - com.bridgeit.DataStructures.SimpleBalancedParentheses
 *  
 *  Purpose: Checks the syntax of given statement  
 *
 *  @author  Srujan Madipeddi
 *  @version 1.0
 *  @Date   20-03-2019
 *
 ******************************************************************************/
import com.bridgeit.utilitypack.Utility;

public class SimpleBalancedParentheses
{
    public static void main(String[] args)
    {
        char search;
        Stack<Character> stack=new Stack<Character>();
        System.out.println("Enter Expression ");
        String expression =Utility.getString();
        //for loop is used  to push  and pop the parenthesis
        for(int i =0 ;i<expression.length();i++)
        {
        	// picking one on one element
            search=expression.charAt(i);
            if(search=='(')
            {
                stack.push(search);
            }
            else if (search ==')')
            {
                stack.pop();// removing the element from stack object
            }
        }
        // condition to check stack object is empty or not
        if (stack.isEmpty()) 
        {
            System.out.println("Arithmetic Expression balanced");
        }
        else
        {
            System.out.println("Arithmetic Expression is not balanced");
        }
       
    }
}

