import java.awt.*;
//import java.awt.event.*;
import javax.swing.*;
public class DiceRoll extends JPanel{

    private int firstDice; // to hold the value for the first dice
    private int secondDice; // to hold the value for the second dice
    public void paintComponent(Graphics g)    {

        super.paintComponent(g);
        firstDice = (int) (Math.random() * 6) + 1; // get a value for the first dice
        secondDice = (int) (Math.random() * 6) + 1; //get a value for the second dice
        // draw the dice squares
        g.setColor(Color.blue);
        g.fillRect(20, 20, 60, 60);
        g.setColor(Color.magenta);
        g.fillRect(120, 20, 60, 60);
        // put the values on the dice
        g.setColor(Color.white);
        g.drawString(" " + firstDice, 43, 54);
        g.drawString(" " + secondDice, 143, 54);
        // write the values under the dice
        g.setColor(Color.black);
        g.drawString("First dice = " + firstDice, 20, 100);
        g.drawString("Second Dice = " + secondDice, 120, 100); // print out the dice values

        g.drawString("Are the dice the same number:", 20, 120);
        if(firstDice==secondDice){
            g.drawString("You are winner!", 20, 130);
        } else {
            g.drawString("Sorry, try again :(", 20, 130);
        }

        g.drawString("Are both dice greater than 3:", 20, 150);
        if(firstDice >3 && secondDice > 3){
            g.drawString("You are winner!", 20, 160);
        } else {
            g.drawString("Sorry, try again :(", 20, 160);
        }

        g.drawString("Is at least one die a 6::", 20, 180);
        if(firstDice == 6 || secondDice == 6){
            g.drawString("You are winner!", 20, 190);
        } else {
            g.drawString("Sorry, try again :(", 20, 190);
        }

        g.drawString("Do both dice add up to 7::", 20, 210);
        if(firstDice + secondDice == 7){
            g.drawString("You are winner!", 20, 220);
        } else {
            g.drawString("Sorry, try again :(", 20, 220);
        }


    }
}