import java.awt.*;
//import javaawt.event.*;
import javax.swing.*;

public class DrawingArea extends JPanel {

    int x = 0;
    int y = 0;
    int circles = 0;
    int circXAxis = 0;
    int circYAxis = 0;
    int circWidth = 0;
    int circHeight = 0;
    int circCol = 0;

    public DrawingArea (int xAxis,int yAxis,int numCircles) {
        x = xAxis;
        y = yAxis;
        circles = numCircles;
    }

    public void getCircleAttributes() {;
        circXAxis = (int) ((Math.random() * (x-50)) + 1);
        circYAxis = (int) ((Math.random() * (y-50)) + 1);
        circWidth = (int) ((Math.random() * (x - circXAxis)) + 1);
        circHeight = (int) ((Math.random() * (y-circYAxis)) + 1);
        circCol = (int) ((Math.random() * 65536) + 1);

        System.out.printf("circXAxis %s, circYAxis %s, circWidth %s, circHeight %s, circCol %s\n", circXAxis,circYAxis,circWidth,circHeight,circCol);
    }

    // You only need to edit the method below.
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        int i = 0;

        // You might want to introduce a loop somewhere here.

        for (i=0;i<circles;i++) {
            getCircleAttributes();
            Color c = new Color(circCol);
            g.setColor(c);
            g.drawOval(circXAxis,circYAxis,circWidth,circHeight);
        }

        System.out.println("");
        System.out.println("");
        
    }// the end of the method....
}