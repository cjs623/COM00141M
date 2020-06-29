/**
* To demonstrate boolean.
*
* @author (your name)
* @version (a version number or a date)
*/
public class Person {

    double cmHeight;
    double kgWeight;
    boolean smoker = true;
    int weeklyAlcholUnits; // 1 pint = 2 units, 1 short = 1 unit)
    final int RWAL = 21; //RWAL - Recommended Weekly Alcohol Limit
    int restPulse;

    public boolean checkPulse()    {
        boolean healthyPulse;
        healthyPulse = ((restPulse > 30) && (restPulse < 180));
        return healthyPulse;
    }



    public boolean checkAbuser(){
        boolean abuser ;
        abuser = ((weeklyAlcholUnits > RWAL) || (smoker) );
        return abuser;
    }

    public void displayProfile() {

        System.out.println("………Health Profile……");

        System.out.println("Healthy pulse check = " + checkPulse());
        System.out.print("Abusing Body = " + checkAbuser());

    }
    //Put curseAndSwear method here

    public void curseAndSwear() {
        int numCurse = (int)(Math.random()*(5)+1);

        System.out.println(numCurse);

        switch(numCurse) {
        case 1:
        System.out.println("Oh damn!! What a nuisance");
        break;
        case 2:
        System.out.println("Gosh darnit!!");
        break;
        case 3:
        System.out.println("heck!");
        break;
        case 4:
        System.out.println("here is a terrible swear word!!!!");
        break;
        case 5:
        System.out.println("what a load of...");
        break;
        default:
        System.out.println("Shouldnt get to here!!!");
        break;
        }

    }    


}