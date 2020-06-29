/**
* Class which generates 6 unique numbers to use for a lucky dip lotto
*
* @author (Callum Saint)
* @version (v1)
*/
public class Lotto{
    int i = 0;
    int ballOne = 0;
    int ballTwo = 0;
    int ballThree = 0;
    int ballFour = 0;
    int ballFive = 0;
    int ballSix = 0;
    //Put the luckyDip() method here
    public int rndNumber() {
        int random = 0;
        boolean duplicate = true;

        while(duplicate) {

            random = (int)(Math.random()*49)+1;

            if (random != ballOne && random != ballTwo && random != ballThree && random != ballFour && random != ballFive && random != ballSix) {
            duplicate = false;
            }
        }

        return random;
    }

    public void luckyDip() {

        for(i=0;i<6;i++) {

            if (i == 0) {
            ballOne = rndNumber();
            }else if(i == 1) {
            ballTwo = rndNumber();
            }else if(i == 2) {
            ballThree = rndNumber();
            }else if(i == 3) {
            ballFour = rndNumber();
            }else if(i == 4) {
            ballFive = rndNumber();
            }else if(i == 5) {
            ballSix = rndNumber();
            }

        }

        System.out.printf("Lucky dip numbers: %s,%s,%s,%s,%s,%s", ballOne,ballTwo,ballThree,ballFour,ballFive,ballSix);
    }

    //Test
    public static void main (String args[]) {

        Lotto l=new Lotto();
        l.luckyDip();
    }


}