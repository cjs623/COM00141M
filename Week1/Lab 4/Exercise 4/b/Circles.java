/*
* @(#)Circles.java 1.0 02/07/11
*
*/

import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;

import javax.swing.*;

class Circles extends JFrame {

    int numCircles = 0;
    int x = 0;
    int y = 0;

    private Container c;
    //private DrawingArea p = new DrawingArea(x,y,numCircles);


    public void selCircles() {
        Scanner sc=new Scanner(System.in);
        while(numCircles<1 || numCircles> 100) {
            System.out.println ("Enter the number of circles you want (range 1 to 100)");
            numCircles = sc.nextInt();
        }
        //sc.close();
    }

    public void selSize() {
        Scanner sc=new Scanner(System.in);
        while(x<200 || x> 1000) {
            System.out.println ("Enter the window x axis length (range 200 to 1000)");
            x = sc.nextInt();
        }
        while(y<200 || y> 1000) {
            System.out.println ("Enter the window y axis length (range 200 to 1000)");
            y = sc.nextInt();
        }
        //sc.close();
    }

    public Circles() {
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
                System.exit(0);
            }
        });
        
        c = getContentPane();
        selCircles();
        selSize();
        DrawingArea p = new DrawingArea(x,y,numCircles);
        c.add(p);
    }

    public void startCircles() {


    setSize(x+50, y+50);
    setTitle("Circles");
    setVisible(true);
    }
}