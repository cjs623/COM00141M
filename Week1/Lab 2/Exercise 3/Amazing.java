/**
* A class to hold the declarations and Expressions
*
* @author (Callum Saint)
* @version (v1)
*/
public class Amazing{

    //Put your data type declarations below. Here is an example
    int n = 4;
    float x = (float) 2.5;
    float y = (float) -1.5;
    int m = 18;
    
    //Put the code for your calculations in this method.
    void doCalculations(){
    double out1;
    double out2;
    double out3;
    
    out1 = x + n * y - (x + n) * y;
    System.out.printf("If x=%s, n=%s, y=%s, then out1 = \n",x,n,y);
    System.out.println(out1 + "\n");
    
    out2 = m / n + m % n;
    System.out.printf("If m=%s, n=%s, then out2 = \n",m,n);
    System.out.println(out2 + "\n");
    
    out3 = 5 * x - n / 5;
    System.out.printf("If x=%s, n=%s, then out3 = \n",x,n);
    System.out.println(out3 + "\n");
    
    
    }//End of doCalculations
    }