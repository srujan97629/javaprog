package com.bridgeit.utilitypack;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Utility
{  
	//Scanner class receiving from user 
   public static Scanner sc= new Scanner(System.in);
   public static Random random=new Random();
   
   //======================  leap year  ======================================================
   
   public static boolean leapyear(int year)
   {
	  if((year%4==0)&&(year%100!=0)||(year%400==0))
     {	  
		  return true;
     }
	  else
	  {
		  return false; 
	  }    
   }
   
   //========================== year method =======================================================
   
   /**
    * 
    * @param syear
    */
   public static void year(String syear) 
	{
	   
	   if(syear.length()==4)
	   {	
		   //converting string to integer
	       int year=Integer.parseInt(syear);
	       //Checking here   
	       // using 100,400 because of Gregorian calendar 
	       // The years 1700,1800,1900,2100,2200,2300,2500,2600 are not leap years 
	       if((year%4==0)&&(year%100!=0)||(year%400==0))	
	       {		  
		      System.out.println(year+" is leap year"); 
	       }
	       else
	       {
		      System.out.println(year +" is not leap year");
	       }
	   }
	   else
	   {
		   System.err.println("please enter 4 digits only ");
	   }
	}
   
   ///=======================   Power of 2   ====================================================

   /**
    * @purpose Power of 2
    * @param n
    * @return
    */
   public static int powerOf2(int n)
   { 
	   System.out.println(""+n);
     	int power=1;
    	if((n>0)&&(n<31))
    	{
    	   for(int i=1;i<=n;i++)
        	{
   	    	  power=power*2;
   		      System.out.println(""+power);
   	        }
    	}
    	return power;
   }
   //=====================  Harmonic  value for Nth number  =================================
   
   /**
    * @purpose To get harmonic value
    * @param n
    * @return
    */
   public static float harmonicNumber(int n)
   {
	  float harmonicNumber=0;
	  for(int i=1;i<=n;i++)
	  {
		  harmonicNumber=harmonicNumber+(float)+1/i; 
	  }
	  
	   return harmonicNumber;
   }
   //========================  Prime factors of nth number  =====================================
   
   /**
    * @purpose Prime factors of nth number 
    * @param number
    * @return
    */
   public static int primeFactors(int number)
   {
	   for(int i=2;i<=number;i++)
		 {
			 while(number%i==0)
			 {
				 System.out.println(i+"   ");
				 number=number/i;
			 }
			 return number;
		 }
		 if (number>2)
		 {
			 System.out.println(number);
		 } 
	    return number;
   }
   //======================  Positive integer  ==================================
   
   /**
    * @purpose To get Positive integer 
    * @return
    */
   public static int getPositiveInt()
   {
	   int value=0;
	  
	   try
	   {
		   String start=sc.next();
		   value=Integer.parseInt(start);
		   if(value<0)
		   {
			   value=value*-1;
		   }
	   }
	   catch (NumberFormatException e)
	   {
		System.err.println("enter numbers only");
		getPositiveInt();
	   }
	   return value;
   }
   
   //======================  Random values for integers  ================================================
   
   /**
    * @purpose Random values for integers
    * @return
    */
   public static int getRandomInt()
   {
	   int values=random.nextInt(1000);
	   return values;
   }
   
   //======================  To get String using scanner class  =============================================
  
   /**
    * @purpose To get String using scanner class 
    * @return
    */
   public static String getString()
   {
	   String s2=sc.next();
	   return s2;
   }
   
   //======================  To get double values using scanner class  =======================================================
  
   /**
    * @purpose To get double values using scanner class
    * @return
    */
   public static double getDouble()
   {
	   double d2=sc.nextDouble();
	   return d2;
   }
   
   //======================  To get integer values using scanner class  ===================================
  
   /**
    * @purpose To get integer values using scanner class 
    * @return
    */
   public static int getInteger()
   {
	   int i2=sc.nextInt();
	   return i2;
   }  

   //======================  TWO Dimensional Array  ==================================================
   
   /**
    * @purpose TWO Dimensional Array
    * @param row
    * @param column
    */
   public static void getTwoDimensionalArray(int row,int column)
   {
	   int i,j;
       String arr[][] = new String[row][column];
	   
       // enter array elements
       System.out.println("Enter " +(row*column)+ " Array Elements : ");
       for(i=0; i<row; i++)
       {
           for(j=0; j<column; j++)
           {
               arr[i][j] = Utility.getString();
           }
       }
       System.out.println("Your Array is :");
       
       //Printing output on console
       for(i=0; i<row; i++)
       {
           for(j=0; j<column; j++)
           {
               System.out.print(arr[i][j]+ "  ");
           }
           System.out.println();
       } 
   }
   
   //========================  Print Time  ===================================
   
   /**
    * @purpose Print Time
    * @param time
    */
   public static void printTime(long time)
   {
	   int millis=(int)time%1000;
	   time=time/1000;
	   int sec=(int)time%60;
	   time=time/60;
	   int min=(int)time%60;
	   time=time/60;
	   System.out.println("Elasped time is "+min+":"+sec+":"+millis);
   }
   

   // =======================  Swap method for character ================================= 
   
   /**
    * @purpose Swap method for character
    * @param ch
    * @param i
    * @param j
    */
   public static void swapping(char[] ch,int i,int j)
   {
	   char temp=ch[i];
	   ch[i]=ch[j];
	   ch[j]=temp;
   }
   
   //========================  Anagram program  ================================
   
   /**
    * @purpose Anagram program 
    * @param frist
    * @param second
    * @return
    */
   public static boolean isAnagram(String frist,String second)
   {   	    
      char[] ch1=frist.toCharArray();
      char[] ch2=second.toCharArray();
      Arrays.sort(ch1);
      Arrays.sort(ch2);
      String s1=String.valueOf(ch1);
      String s2= String.valueOf(ch2);
      if(s1.equals(s2))
      {
      	//System.out.println("is anagram");
    	  return true;
      }
      else
      {
      	//System.out.println("is not anagram");
    	  return false;
      }
   }
   
   //=======================  Prime Numbers Program  =========================
   
   /**
    * @purpose Prime Numbers Program
    * @param number
    * @return
    */
   public static int printPrime(int number)
   {
  	int status=0;
  	int numb = 0 ;
  	for(int i=2;i<number;i++)
  	{
  		if(number%i==0)
  		{
  			status=1;
  			break;
  		}
  	}
  	if(status==0)
  	{
  		return numb=number;
  		//System.out.println(number+"is Prime Number");
  	}
	return numb;
   }
   
   
  //================ Prime Numbers Program return  in array type  =======================
 
/**
 * @purpose primeNumbers
 * @return
 */
   public static int[] primeNumber()
   {
	   int status=1;
	  	int number=2;
	  	// size of an array is 167 
	  	//from 2-1000 we have 167 prime numbers 
	  	int[] arr = new int[167]; 
	  	int i,j;
	   for( i=0;i<=166;)
	   {
		   for( j=2;j<=Math.sqrt(number) ;j++)
		  	{
		  		if(number%j==0)
		  		{
		  			status=0;
		  			break;
		  		}
		  	}
		  	if(status==1)
		  	{
		  		
		  	  arr[i]=number;
		  	  i++;
		  	}
		  	status=1;
		  	number++;
	   }
	  	
		return arr;
   }
   
   //===========================  Palindrome Program  ===================================
   
   /**
    * @purpose  To check given number is Palindrome or not
    * @param number
    * @return
    */
   public static boolean isPalindrome(int number)
   {
	   int temp=number;
	   int add=0;
	   while(number>0)
	   {
		 add=(add*10)+(number%10);
		
		 number=number/10;
	   }
	   if(add==temp)
	   {
		   return true;
	   }
	   else
	   {
	     return false;
	   }
   }
   
  
   //==================  Square root Program  ====================================
   
   /**
    * @purpose Square root Program 
    * @param c
    * @return
    */
   public static double squaroot(double c)
   {
	   double t=c;
	   double epsilon=1e-15;
	   while(Math.abs(t-c/t)>epsilon*t)
	   {
		   t=((c/t+t)/2);
	   }
	   return t;
   }
   
   //========================  Week Program  ===================================
  
   /**
    * @purpose gives the out put as week name  
    * @param m0
    * @param d0
    * @param y0
    * @return
    */
   public static int day(int m0,int d0,int y0)
   {
     
      y0 =y0-(14-m0)/12;
     int  x = y0+(y0/4)-y0/100+y0/400;
      m0 = m0+12*((14-m0) / 12)-2;
      d0= (d0+x+(31*m0)/12)%7;
      return d0;
   }
   

  //======================  Rate of interest  =================================== 
   
   /**
    * @purpose Gives the out put as rate of interest based on amount and interest and years  
    * @param p
    * @param y
    * @param rate
    * @return
    */
   public static int payment(int p,int y,double rate)
   {
     	int n=12*y;
        double r=rate/12;
     	int payment=(int) ((p*r)/(1-Math.pow(1+r, (-n))));
    	return payment;
   }
   
   //====================  Binary Search for integer  ==========================
   
   /**
    * @purpose Binary Search for integer
    * @param arr
    * @param value
    * @return
    */
   public static int binarySearchMethodInt(int[]arr,int value)
   {
	   int m=0;
	   int r=arr.length-1;
	   while(m<=r)
	   {
		   int n=(m+r)/2;
		   if(arr[n]==value)
		   {
			   return n;
		   }
		   else if(arr[n]>value)
		   {
			   r=n-1;
		   }
		   else
		   {
			   m=n+1;
		   }
		   
	   }
	return -1;
   }
 
   //====================  Binary search for String  =============================
   
   /**
    * @purpose Binary search for String
    * @param st
    * @param value
    * @return
    */
   public static int binarySearchMethodString(String[] st,String value)
   {
	   int l=0;
	   int r=st.length-1;
	  while(l<=r)
	   {
		   int m=(l+r)/2;
		   int result=value.compareTo(st[m]);
		   if(result==0)
		   {
			   return m;
		   }
		   else if(result>0)
		   {
			  l=m+1;
		   }
		   else
		   {
			   r=m-1;
		   }		   
	   }
	   return -1;
   }  
	
  //======================  Insertion Sort for integer  ===============================

   /**
    * @purpose Return the values in sorted order (Insertion Sort for integer)
    * @param arr
    * @return
    */
public static int[] insertion(int[] arr)
{
	int i,temp,j;
	for(i=1;i<=arr.length-1;i++)
	{
		temp=arr[i];
		j=i;		
		while(j>0 && arr[j-1]>temp)
		{
			arr[j]=arr[j-1];
			j=j-1;
			
		}
		arr[j]=temp;
	}
	
	return arr;
}

//==========================  Insertion sort for String  =======================

/**
 * purpose Return the values in sorted order for String Elements by using insertion sort technique
 * @param arr
 * @return
 */
public static String[] insertionString(String[] arr)
{
	int i,j;
	String temp;
	for(i=1;i<=arr.length-1;i++)
	{
		temp=arr[i];
		j=i;		
		while(j>0 &&arr[j-1].compareTo(temp)>0)
		{
			arr[j]=arr[j-1];
			j=j-1;
			
		}
		arr[j]=temp;
	}
	
	return arr;
}

   //========================  Bubble Sort for String  ================================== 
 
/**
 * @purpose Return the values in sorted order for String Element by using Bubble sort technique
 * @param arr
 * @return
 */
public static String[] bubbleString(String[] arr)
{
	
	for(int j=1;j<=arr.length-1;j++)
	{
		for(int i=0;i<=arr.length-2;i++)
		{
			if(arr[i].compareTo(arr[i+1])>0)
			{
				String temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
			}
		}
	}
	return arr;
}

//========================= Bubble sort for integer  ===========================

/**
 * @purpose Return the values in sorted order for integers by using Bubble sort technique
 * @param value
 * @return
 */
public static int[] bubbleInt(int[] value)
{
	for(int j=1;j<=value.length-1;j++)
	{
		for(int i=0;i<=value.length-2;i++)
		{
			if(value[i]>value[i+1])
			{
				int temp=value[i];
				value[i]=value[i+1];
				value[i+1]=temp;
			}
		}
	}
	
	return value;
}

///=========================   Sort Using  merge  ================================

/**
 * @purpose Return the values in sorted order for integers by using Merge sorting technique
 * @param arr
 * @param start
 * @param mid
 * @param length
 */
public static void mergeSort(int arr[], int start, int mid, int length) 
{ 
     
    int num1 = mid - start + 1; 
    int num2 = length - mid; 

    int L[] = new int [num1]; 
    int R[] = new int [num2]; 

    for (int i=0; i<num1; ++i)
    {
        L[i] = arr[start + i]; 
    }
    for (int j=0; j<num2; ++j)
    {
        R[j] = arr[mid + 1+ j]; 
    }
    int i = 0, j = 0; 
    int start2 = start; 
    
    while (i < num1 && j < num2) 
    { 
        if (L[i] <= R[j]) 
        { 
            arr[start2] = L[i]; 
            i++; 
        } 
        else
        { 
            arr[start2] = R[j]; 
            j++; 
        } 
        start2++; 
    } 

    while (i < num1) 
    { 
        arr[start2] = L[i]; 
        i++; 
        start2++; 
    } 

    while (j < num2) 
    { 
        arr[start2] = R[j]; 
        j++; 
        start2++; 
    } 
} 

//===========================  main sort  =====================================


public static void sort(int arr[], int start, int length) 
{ 
    if (start< length) 
    {         
        int mid = (start+length)/2;         
        sort(arr, start,mid); 
        sort(arr , mid+1, length); 
        mergeSort(arr, start, mid, length); 
    } 
}

//====================  Printing Integer Array Elements  ==============================

/**
 * @purpose Printing Integer Array Elements
 * @param arr
 */
public static void printArray(int arr[]) 
{ 
    int n = arr.length; 
    for (int i=0; i<n; ++i) 
    System.out.println("Sorted array is : "+arr[i]); 
    System.out.println(); 
	
} 

//=====================  Printing String Array Elements  =====================

/**
 * @purpose Printing String Array Elements
 * @param arr
 */
public static void printStringArray(String[] arr )
{
	 int arr2=arr.length-1;
	for(int i=0;i<=arr2;i++)
    {
    	System.out.println("elements are "+arr[i]);
    }
}

//=======================   Swap nibbles  ======================================

/**
 * @purpose  Swap nibbles
 * @param decimal
 * @return
 */
public static int swapNibbles(int decimal) 
{
	return ((decimal & 0x0F) <<4  | (decimal & 0xF0) >>4);
}

//======================  Power of 2  =========================================

/**
 * @purpose 
 * @param num
 * @return
 */
 public static boolean isPowerTwo(int num) 
{
	return (int) (Math.ceil((Math.log(num) / Math.log(2)))) == (int) (Math.floor(((Math.log(num) / Math.log(2)))));
}

//========================= Decimal to binary  ===========================================================
 
 /**
  * @purpose Converting 
  * @param number
  * @return
  */
 public static int[] toBinary(int number)
 {
	int[] binary=new int[1000];
	System.out.println("Binary degit of "+number+" is ");
	int i=0;
	while(number>0)
	{
		binary[i]=number%2;
		number=number/2;
		i++;
	}
	
	for(int j=i-1;j>0;j--)
	{
		System.out.print(+binary[j]);
	}
	return binary ; 
 }
//============================  Binary to char array  ==============================================
 
 /**
  * @purpose Binary to char array 
  * @param number
  * @return
  */
 public static char[] toBinaryChar(int number)
 {
	String  degits="";
	while(number>0) 
	{
		degits=degits+number%2;
		number=number/2;
	}
	 
	  return degits.toCharArray();
 }
 
 
 
 
 //=========================  Binary Search Integer ===========================================
 /**
  * @purpose Search the element in the given array 
  */
 public static void binarySearchInt()
 {
 	   System.out.println("Enter size of array ");
	        int number=Utility.getInteger();
	        int[] arr=new int[number];	        
	        System.out.println("Enter "+number +" elements");
	        
	        for(int i=0;i<number;i++)
	        {
	        	arr[i]=Utility.getInteger();
	        }	    
	        long starttime=System.nanoTime();
	        System.out.println("Enter number to search");
	        int search=Utility.getInteger();
	        int key= Utility.binarySearchMethodInt(arr,search);
	        if(key==-1)
	        {
	        	System.err.println("Element not found");
	        }
	        else
	        {
	        	System.out.println("Element"+search+" found at"+key);
	        }
	        long endtime=System.nanoTime();
	        double elapsedtime=(endtime-starttime)/1000.0;
	        
	        System.out.println("Elapse time is :"+elapsedtime);
	}

 //==========================  Binary search for String  ===================================================== 
 
 /**
  * @purpose Search the String in the given array 
  */
 public static void  binarySearchString()
 {
 	
 	   System.out.println("Enter size of array ");
	        int number=Utility.getInteger();
	        String[] arr=new String[number];	        
	        System.out.println("Enter "+number +" String elements");
	        
	        for(int i=0;i<number;i++)
	        {
	        	arr[i]=Utility.getString();
	        }
	        Arrays.sort(arr);
	        long starttime=System.nanoTime();
	        System.out.println("Enter String to search");
	        
	        String search=Utility.sc.next();
	        int key= Utility.binarySearchMethodString(arr,search);
	        if(key==-1)
	        {
	        	System.err.println("Element not found");
	        }
	        else
	        {
	        	System.out.println("Element "+search+" is found ");
	        }
	        long endtime=System.nanoTime();
	        double elapsedtime=(endtime-starttime)/1000.0;
	        
	        System.out.println("Elapse time is :"+elapsedtime);
	}
 
 //=================================== Insertion sort for integer ============================================ 
  
 /**
  * @purpose Print the values in sorted order for integer Elements by using insertion sort technique
  */
 public static void insertionSortInt() 
 {
 	//binary
 	   System.out.println("Enter size of array ");
	        int number=Utility.getInteger();
	        int [] arr=new int [number];	        
	        System.out.println("Enter "+number +" numbers");
	        
	        for(int i=0;i<number;i++)
	        {
	        	arr[i]=Utility.getInteger();
	        }
	        Arrays.sort(arr);
	        long starttime=System.nanoTime();
	        System.out.println("Sorted Elements are ");
	        System.out.println("  ");              //just for space
	        
	        int [] key= Utility.insertion(arr);
	        Utility.printArray(key);
	        long endtime=System.nanoTime();
	        double elapsedtime=(endtime-starttime)/1000.0;
	        System.out.println("    ");                  // just for space
	        System.out.println("Elapse time is :"+elapsedtime);
	}
 
//=================================  Insertion Sorting for String  =================================================== 
 
 /**
  * @purpose Print the values in sorted order for String Elements by using insertion sort technique
  */
 public static void insertionSortString()
 {
 	
 	   System.out.println("Enter size of array ");
	        int number=Utility.getInteger();
	        String[] arr=new String[number];	        
	        System.out.println("Enter "+number +" String elements");
	        
	        for(int i=0;i<number;i++)
	        {
	        	arr[i]=Utility.getString();
	        }
	        Arrays.sort(arr);
	        long starttime=System.nanoTime();
	        System.out.println("Sorted Elements are ");
	        System.out.println("  ");              //just for space
	        
	        String[] key= Utility.insertionString(arr);
	        Utility.printStringArray(key);
	        long endtime=System.nanoTime();
	        double elapsedtime=(endtime-starttime)/1000.0;
	        System.out.println("    ");                  // just for space
	        System.out.println("Elapse time is :"+elapsedtime);
	}
 
 //================================== Bubble sort for Integer  ====================================================
 
 /**
  * @purpose Print the values in sorted order for integers  by using Bubble sort technique
  */
 public static void bubbleSortInt()
 {
 	//binary
 	   System.out.println("Enter size of array ");
	        int number=Utility.getInteger();
	        int [] arr=new int [number];	        
	        System.out.println("Enter "+number +" numbers");
	        
	        for(int i=0;i<number;i++)
	        {
	        	arr[i]=Utility.getInteger();
	        }
	        Arrays.sort(arr);
	        long starttime=System.nanoTime();
	        System.out.println("Sorted Elements are ");
	        System.out.println("  ");              //just for space
	        
	        int [] key= Utility.bubbleInt(arr);
	        Utility.printArray(key);
	        long endtime=System.nanoTime();
	        double elapsedtime=(endtime-starttime)/1000.0;
	        System.out.println("    ");                  // just for space
	        System.out.println("Elapse time is :"+elapsedtime);
	} 
 
//======================================== Bubble sort for String ================================================= 

 /**
  * @purpose Print the values in sorted order for Strings  by using Bubble sort technique
  */
 public static void bubbleSortString()
 {
 	
 	        System.out.println("Enter size of array ");
	        int number=Utility.getInteger();
	        String[] arr=new String[number];	        
	        System.out.println("Enter "+number +" String elements");
	        
	        for(int i=0;i<number;i++)
	        {
	        	arr[i]=Utility.getString();
	        }
	        Arrays.sort(arr);
	        long starttime=System.nanoTime();
	        System.out.println("Sorted Elements are ");
	        System.out.println("  ");              //just for space
	        
	        String[] key= Utility.bubbleString(arr);
	        Utility.printStringArray(key);
	        long endtime=System.nanoTime();
	        double elapsedtime=(endtime-starttime)/1000.0;
	        System.out.println("    ");                  // just for space
	        System.out.println("Elapse time is :"+elapsedtime);
	}
 
 
//======================= String file reader  ======================================
/**
 * @purpose : Reads file data and returns in words  
 * @return : string
 **/
 public static String[] fileReadString(String path) throws Exception

 {
    String line;
    FileReader file = new FileReader(path);
    // reading data from file  
    BufferedReader bread = new BufferedReader(file);
    while((line = bread.readLine()) != null)
    {
        String word[] = line.split(" ");// adding word in file to word array
         return word;
    }
    bread.close();
    return null;
}
 
 //======================= Integer file reader ================================
 
 /**
  * 
  * @param path
  * @return
  * @throws IOException
  */
 public static int[] readFileInteger(String path) throws IOException
 {
	 String line;
	 // file reader is used to read the file data 
	 FileReader read=new FileReader(path);
	 BufferedReader bread=new BufferedReader(read);
	 while((line=bread.readLine())!=null)
	 {
		 String words[]=line.split("");
		 int size=words.length;
		 int[] array=new int[size];
		 for(int i=0;i<=array.length-1;i++)
		 {
			 //Converting string to integers 
			 array[i]=Integer.parseInt(words[i]);
		 }
		 return array;
	 }
	 //closing the bread connection  
	 bread.close();
	 return null;
 }
 
 //======================= Month year for stack ===========================
 
 /**
  * 
  * @param month
  * @param year
  * @return
  */
 public static int day(int month, int year)
 {
		int day = 1;
		int y = year - (14 - month) / 12;
		int x = y + y / 4 - y / 100 + y / 400;
		int m = month + 12 * ((14 - month) / 12) - 2;
		int d = ((day + x + (31 * m) / 12) % 7);
		return d;
	}
 
 //==================== Leap year for stack ===================================

 /**
  * 
  * @param year
  * @return
  */
	public static boolean isLeapYear(int year) 
	{
		if ((year % 4 == 0) && (year % 100 != 0))
			return true;
		if (year % 400 == 0)
			return true;
		return true;
	}
	
	
}

   
   
   
   
   
   
   
   
   
   
   
