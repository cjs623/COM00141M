/**
* To demonstrate boolean.
*
* @author (Callum Saint)
* @version (v1)
*/
public class Person
{
double cmHeight = 180;
double kgWeight = 90;
boolean smoker = true;
int weeklyAlcholUnits = 10;
final int RWAL = 21; //RWAL - Recommended Weekly Alcohol Limit
int restPulse = 60;
char genderAtBirth = 'M';


public void checkPulse()
{
boolean healthyPulse;
healthyPulse = ((restPulse > 30) && (restPulse < 180));
System.out.print("Healthy pulse = ");
System.out.println(healthyPulse);
}

public void checkForAbuse()
{
boolean abuser ;
abuser = ((weeklyAlcholUnits > RWAL) || (smoker) );
System.out.print("Checking for abuse -- ");
System.out.println(abuser);

}

public void displayDetails()
{

System.out.print("Height in cm = " + String.valueOf(cmHeight) + "\n");
System.out.print("Weight in kg = " + String.valueOf(kgWeight) + "\n");
System.out.print("Are they a smoker? = " + String.valueOf(smoker) + "\n");
System.out.print("Weekly Alcohol Units = " + String.valueOf(weeklyAlcholUnits) + "\n");
System.out.print("Recommended Weekly Alcohol Limit = " + String.valueOf(RWAL) + "\n");
System.out.print("Resting pulse rate = " + String.valueOf(restPulse) + "\n");
System.out.print("Assigned gender at birth = " + String.valueOf(genderAtBirth) + "\n");
System.out.print("\n");

}

}