package com.bridgeit.DataStructures;

public class Stack<T>
{
    Node top;
   
    public class Node
    {
        T data;
        Node next;
       
    }
    /**
     * @param char     :it takes character as command line arguments
     * @purpose        : This method is used to push character values to object
     * @return         : void
     ***/
        public void push(T ch)
        {
            Node node = new Node(); // creating object to node class
             node.data = ch; // adding data
            node.next = top;
            top = node;
        }
       
    /**
     * @purpose   : This method is used to display the elements in object     
     * @return    : void
     ***/
        public void peek()
       
        {
            if (top == null)
            {
                System.out.println("stack is empty");
            }
            else
            {
                Node n = top; 
                while (n.next!=null)
                {
                	// printing data
                    System.out.println(n.data); 
                    n =n.next; 
                }
                 // printing last element
                System.out.println(n.data); 
            }
           
        }
       
    /**
     * @purpose   : This method is used to check whether stack is empty or not 
     * @return    : boolean
     ***/
        public boolean isEmpty()      
        {          
            if (top== null)
            {
                return true;
            }
            return false;
        }
       
    /**
     * @purpose   : This method is used to pop the value from object     
     * @return    : void
     ***/
        public void pop()
        {
            if (top==null) // checking condition whether top is null are not
            {
                System.out.println("Arithmetic  Expression is not balanced");
                System.exit(0);
               
            }
           
            top= top.next; 
        }
}       
        
        
        
        
        
