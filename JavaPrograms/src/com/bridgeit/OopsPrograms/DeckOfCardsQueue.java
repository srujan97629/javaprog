package com.bridgeit.OopsPrograms;

/******************************************************************************
 *  Compilation:  javac -DeckOfCardsQueue.java
 *  Execution:    java - com.bridgeit.OopsPrograms.DeckOfCardsQueue
 *  
 *  Purpose: Distributing the cards to the person and printing which cards they got.
 *           by using queue
 *
 *  @author  Srujan Madipeddi
 *  @version 1.0
 *  @Date   26-03-2019
 *
 ******************************************************************************/
import com.bridgeit.DataStructures.utility.Queue;

public class DeckOfCardsQueue extends DeckOfCards
{
     public static void main(String[] args)
     {
    	 DeckOfCards refDeck=new DeckOfCards();
    	 refDeck.getCards();
    	 refDeck.shuffleCards();
    	 String[][] playerCards=refDeck.distribute(4,9);
    	 int i=1;
  	   for(String[] printCard:playerCards)
  	   {
  		   System.out.println();
  		   System.out.println("player "+i+" cards ");
  		   System.out.println(" ");
  		   i++;
  		   for(String showCard:printCard)
  		   {
  		      Queue<String> value=new Queue<String>(printCard.length);
  		      value.enQueue(showCard);
  		      value.show();
  		   }
  		   System.out.println("  ");
  	   }
	 }
}
