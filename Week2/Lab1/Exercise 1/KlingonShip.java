
/**
 * AlienShip - Unit 4 exercise.
 * 
 * @author (Callum Saint) 
 * @version (v1)
 */
import java.util.*;

public class KlingonShip
{
	
	double photonPower = 45;
	int threatFactor = 7;
	double cosmicProximity = 20.6;
	double dangerLevel = 0;
	
	//Put the displayKlingonDetails()and getDangerLeve() methods below.
	
	public void displayKlingonDetails() {
		
		System.out.println("Photon power: " + String.valueOf(photonPower));
		System.out.println("Threat factor: " + String.valueOf(threatFactor));
		System.out.println("Cosmic Proximity: " + String.valueOf(cosmicProximity));
		System.out.println("Danger Level: " + String.valueOf(dangerLevel));
		
	}
	
	public double getDangerLevel() {
		return (photonPower * threatFactor)/cosmicProximity;
	}
	
	public void promptSettings() {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Photon power and press return ");
		threatFactor = sc.nextInt();
		System.out.println("Photon Power set to: " + String.valueOf(threatFactor));
		
		System.out.println("Enter Cosmic Proximity and press return ");
		cosmicProximity = sc.nextInt();
		System.out.println("Cosmic Proximity set to: " + String.valueOf(cosmicProximity));
		
		System.out.println("Enter Cosmic Proximity and press return ");
		photonPower = sc.nextInt();		
		System.out.println("Photon Power set to: " + String.valueOf(photonPower));
		
		dangerLevel = getDangerLevel();
		displayKlingonDetails();
	    
	}
	
	
}
