/*
* @author Tommy Yuan
* The purpose is to practise the use of if statement.
*
* */


import java.util.*;

public class HiLo {

    int random;

    public void generateNumber() {
        //The following lines generate and output a random number between 1 and 10
        random = (int)(Math.random()*100)+1;
    }

    public void startGuessing() {

        boolean corGuess = false;
        int guesses = 0;

        while (corGuess != true) {

            corGuess = guess();
            guesses ++;
            System.out.printf("Guesses so far: %s\n",guesses);
        }

    }

    //Write the guess() method below
    public boolean guess() {
        //Use scanner to accept a user input
        //Create a new scanner object to receive user input
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter you guess ");
        int guess = sc.nextInt();
        sc.close();


        //write your code below
        if(guess==random) {
        System.out.println("Hit!!!!");
        return true;
        }
        if(guess<random) {
        System.out.println("Low");
        }
        if(guess>random) {
        System.out.println("High");
        }


        return false;

    }


}