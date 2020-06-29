public class TestHilo {

    public static void main(String[] args) {
    
        boolean corGuess = false;
        
        HiLo h=new HiLo();
        h.generateNumber();
        
        while (corGuess != true) {
            corGuess = h.guess();
        }
    }
    
}