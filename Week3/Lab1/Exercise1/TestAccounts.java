
/**
 * class TestAccounts .
 * 
 */
public class TestAccounts
{
    public static void main (String args[])
    {
    //Create interestAccount object with initial balance of 1000 pence
    InterestAccount  ia1 = new InterestAccount (10000,0.25); 
    //Set its overdraft limit using method defined in interestAccount class
    //Display the attributes of the interestAccount object
    //The odl attribute is defined in the interestAccount sub class
    //The balance attribute is defined in the Account super class
     System.out.println("interest Account ia1 object's data after creation");
     System.out.println(ia1.toString());
     System.out.println();
     
     System.out.printf("Interest for current balance of %s is calculated as %s for an interest rate of %s\n",ia1.getBalance(),ia1.calcMonthlyInterest(),ia1.getMonthlyInterestRate());
     ia1.setMonthlyInterestRate(0.1);
     System.out.printf("Interest for current balance of %s is calculated as %s for an interest rate of %s\n",ia1.getBalance(),ia1.calcMonthlyInterest(),ia1.getMonthlyInterestRate());
     
    //Set the over draft limit 
     //ia1.setOdl(200);
    //Credit some cash to interestAccount object, using method defined in the Account super class 
     //ia1.credit(500);
    //Check balance is correct - should be 1500 & odl set correctly
     //System.out.println("Check Interest Account ia1 object's data after setting odl to 200 & credit of 500");
     //System.out.println(ia1.toString());
     //System.out.println();
     
    //Debit some cash from interestAccount object, using method defined in the Account super class 
     //System.out.println("interest Account ia1 object's balance after 800 debit should be 9700");
     //if   (ia1.debit(800))
           //System.out.println(" Debit of 800 Successful");
     //else  System.out.println(" Debit of 800 Failed"); 
    //Check balance is correct - should be 700 
     //System.out.println(ia1.toString());
     //System.out.println();
 
     //System.out.println("Interest Account ia1 object's balance after 800 debit should be -100"); 
     //System.out.println("As overdraft limit set to 200");      
    //Check overdraft allowed
     //if   (ia1.debit(800))
           //System.out.println(" Debit Successful");
     //else  System.out.println(" Debit Failed"); 
     //System.out.println();
    //Check balance
     //System.out.println(ia1.toString());
     //System.out.println();
     
     //System.out.println("Test overdraft limit.");
     //System.out.println("Debit 101 from interest Account object ia1, starting balance -100.");
     //System.out.println("Balance should remain unchanged at -100"); 
     //System.out.println("As overdraft limit set to 200");      
     //if   (ia1.debit(101))
           //System.out.println(" Debit Successful");
     //else  System.out.println(" Debit Failed"); 
     //System.out.println();
     
    //Check balance
     System.out.println(ia1.toString());
     System.out.println();
    }
}
