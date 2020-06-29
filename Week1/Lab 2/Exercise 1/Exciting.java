/**
* The exciting class will populate several variables and display their values
*
* @author (Callum Saint)
* @version (v1)
*/
public class Exciting
{
//Put your declarations for a) beneath here
double z ;
int count = 0;
double cost = 3.45;
char choice = 'X';
boolean goodChoice = true;
short lowest = 5;

//Put your declarations and initialisations to b) beneath here

double tempCelcius = 34.5; //The temperature in a room. used celcius as unit
short numBonusBall = 34; //The number of the jackpot bonus ball.
int popChina = 1393000000; //The population of China. int works now, wont when its over 32bit signed int, double better?
boolean finGame = false; //To check whether a game is finished or not.
double lyInterPlan = 20.652342342534245; //To hold interplanetary distances. Used light year as unit
String gradeALevel = "A*"; //To hold an A-level grade.


public void doit()
{
    final double x = 3.0;
    final double y = 4.0;
    z = 2.0 * y + x/4.0 - (x + y ) ;
}

public void displayDetails()
{
System.out.print("z= ");
System.out.println (z);

//display the details for the variables you declared in a)


System.out.print("\nOut for 1 a)\n");
System.out.print("count= " + String.valueOf(count) + "\n");
System.out.print("cost= " + String.valueOf(cost) + "\n");
System.out.print("choice= " + String.valueOf(choice) + "\n");
System.out.print("goodChoice= " + String.valueOf(goodChoice) + "\n");
System.out.print("lowest= " + String.valueOf(lowest) + "\n");


//display the details for the variables you declared in b)

System.out.print("\nOut for 1 b)\n");
System.out.print("tempCelcius= " + String.valueOf(tempCelcius) + "\n");
System.out.print("numBonusBall= " + String.valueOf(numBonusBall) + "\n");
System.out.print("popChina= " + String.valueOf(popChina) + "\n");
System.out.print("finGame= " + String.valueOf(finGame) + "\n");
System.out.print("lyInterPlan= " + String.valueOf(lyInterPlan) + "\n");
System.out.print("gradeALevel= " + String.valueOf(gradeALevel) + "\n");


}

}