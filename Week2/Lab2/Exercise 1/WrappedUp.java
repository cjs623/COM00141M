import java.util.*;
/**
 * Favourite class to test a string object and it's methods.
 * 
 * @version (a version number or a date)
 */

public class WrappedUp
{
	
	public void guessMyFavouriteThing()
	{
	   //Create a string object with your favourite animal, car ..whatever
	   //e.g String favMotorBikeManufacturer = "bmw"
		
		String favCarModel = new String("Civic");
		int favCarModelStrLen = favCarModel.length();
		String favCarModelFstChar = favCarModel.substring(0,1);
		String enteredAns = "";
		boolean guessedCorrect = false;
		
		
	   
	   /* Now prompt for a guess - using the Scanner class
	   ** Using String methods, you should give the length 
	   ** and first letter of your favourite thing in the prompt.
	   */
		
		Scanner sc=new Scanner(System.in);
		
		System.out.printf("Item to guess is a car model which is %s letters long and begins with %s \n",favCarModelStrLen,favCarModelFstChar);		
		
		  // Now test if the guess was correct - ignore case 		
		
		do {
		
			System.out.println("Enter your guess: ");
			enteredAns = sc.next();		
			
			if (favCarModel.equalsIgnoreCase(enteredAns)){
				guessedCorrect = true;
				System.out.println("You guessed correctly, congrats!");
			}else {				
				System.out.println("Sorry thats wrong, try again :(");				
			}
		}while (!guessedCorrect);
		
		sc.close();	
	  
	  

	 
	
	
	
	}//end guessing


	
	public static void main(String args[]) { //Create WrappedUp object and test the methods
		
	}
	
}
