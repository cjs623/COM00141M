
/**
 * Class to demonstrate Arrays, using JTextArea and 
 * a review of running programs as stand-alone apps
 * 
 * 
 */
import java.util.*;
import javax.swing.*;

public class BirdTable {
	
	int enteredInt;
   // main method begins execution of Java application
   public static void main( String args[] )
   {
      //Declare and build an array interactively - see the Temperature Project
	   
	   String output = "Element\tValue\tHistogram";	   
	   
	   Scanner sc = new Scanner(System.in);
   
	   int[] birdArray = new int[7];
      
	   for ( int i = 0; i < birdArray.length; i++ ) {
		   
		   System.out.printf("Enter the number of Blue Tits seen on day %s:",i);
		   
		   birdArray[i] = sc.nextInt();
	   }
	   
	   sc.close();
      
	   //Display Output using a histogram of '*' - see Histogram Project
	   
	   // for each array element, output a bar in histogram
		for ( int i = 0; i < birdArray.length; i++ ) {
		   output += "\n" + i + "\t" + birdArray[ i ] + "\t";
		   //print bar of asterisks
		   for ( int stars = 0; stars < birdArray[ i ]; stars++ ) {
				output += "*";
			}
		}	   
		   
	      JTextArea outputArea = new JTextArea();
	      outputArea.setText( output );	   
	      JOptionPane.showMessageDialog( null, outputArea,"Histogram Printing Program",JOptionPane.INFORMATION_MESSAGE );      
   
   }
}