
/**
 * To demonstrate some methods found in the Math class.
 * 
  */
import java.util.*;
public class MathDemo
{
	
	int firstInt=0;
	int secondInt=0;
	int thirdInt=0;
	
	public double squareRoot(double rootIn)
	{
	 return  Math.sqrt(rootIn);
	}
	
	public void  rollDice()
	{
	   int score;
	   score = (int) (Math.random() * 6) + 1;
	   System.out.println("You rolled a " + score);
	}
	
	public int generateLottoNumber() {
		return (int) (Math.random() * 49) + 1;		
	}
	
	public int getHighestInt(int firstIntIn,int secondIntIn,int thirdIntIn) {
		if (firstIntIn >= secondIntIn && firstIntIn >= thirdIntIn) {
			return firstIntIn;
		}else if (secondIntIn >= thirdIntIn) {
			return secondIntIn;
		}else {
			return thirdIntIn;
		}			
	}
	
	public void bestOfThree() {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter first number and press return ");
		firstInt = sc.nextInt();
		System.out.println("First number set to: " + String.valueOf(firstInt));
		
		System.out.println("Enter second number and press return ");
		secondInt = sc.nextInt();
		System.out.println("Second number set to: " + String.valueOf(secondInt));
		
		System.out.println("Enter third number and press return ");
		thirdInt = sc.nextInt();
		System.out.println("Third number set to: " + String.valueOf(thirdInt));		
		
		
		System.out.println("Highest number provided: " + String.valueOf(getHighestInt(firstInt,secondInt,thirdInt)) + "\n\n");
		
		
	}
	
	public void displayHighestRandom() {
		
		firstInt = generateLottoNumber();
		System.out.println("First number set to: " + String.valueOf(firstInt));
		
		secondInt = generateLottoNumber();
		System.out.println("Second number set to: " + String.valueOf(secondInt));
		
		thirdInt = generateLottoNumber();
		System.out.println("Third number set to: " + String.valueOf(thirdInt));	
		
		System.out.println("Highest number provided: " + String.valueOf(getHighestInt(firstInt,secondInt,thirdInt)) + "\n\n");		
		
	}
	
	public void findThePower()
	{
	   double base, exponent;
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter a number you wish to raise to the power");
	   base = sc.nextDouble();
	   System.out.println("Enter the power you wish to raise the number to");
	   exponent = sc.nextDouble();
	   System.out.print("The number " + base + " raised to the power " + exponent + " = ");
	   System.out.println(Math.pow(base,exponent));
	}
	
}
