
/**
 * To demonstrate boolean.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class Person
{
	double cmHeight;
	double kgWeight;
	double valBMI;
	boolean smoker = true;
	int weeklyAlcholUnits; // 1 pint = 2 units, 1 short = 1 unit)
	final int RWAL = 21;   //RWAL - Recommended Weekly Alcohol Limit
	int restPulse;

    public void setHeight(double heightIn)
    {
        cmHeight= heightIn;
    }
       
    public void setWeight(double weightIn)
    {
       kgWeight= weightIn;
    }
    
    public void setRestPulse(int pulseIn)
    {
        restPulse = pulseIn;
    }
    
    public void setAlcoUnits(int unitsIn)
    {
    	weeklyAlcholUnits = unitsIn;
    }    
    
    
	public boolean checkPulse()
	{
	   boolean healthyPulse;
	   healthyPulse = ((restPulse > 30) && (restPulse < 180));
	   return healthyPulse;
	}
	
	public boolean checkAbuser()
	{
	      boolean abuser ;
	      abuser = ((weeklyAlcholUnits > RWAL) || (smoker) );
	      return abuser;
	}
	
	public double getBMI() {
		
		return ((kgWeight/(cmHeight * cmHeight)) * 10000);
		
	}
	
	public void promptSettings() {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your weight in kg and press return ");
		setWeight(sc.nextDouble());
		System.out.println("Weight set to: " + String.valueOf(kgWeight) + "kg");
		
		System.out.println("Enter your height in cm and press return ");
		setHeight(sc.nextDouble());
		System.out.println("Height set to: " + String.valueOf(cmHeight) + "cm");
		
		System.out.println("Enter your resting pulse and press return ");
		setRestPulse(sc.nextInt());		
		System.out.println("Resting pulse set to: " + String.valueOf(restPulse));	    
	}	
	
	public void displayProfile()
	{
	   System.out.println("………Health Profile……");
	   
	   System.out.println("Healthy pulse check = " + checkPulse());
	   System.out.println("Abusing Body = " + checkAbuser());
	   System.out.println("BMI = " + getBMI());
	   
	}
	
	
}
