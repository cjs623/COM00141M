
public class InterestAccount extends Account {
	
	double monthlyInterestRate = 0.25;
	
    public InterestAccount(double balanceIn,double monthlyInterestRateIn) {
    	super(balanceIn); //call super class (Account) constructor
    	setMonthlyInterestRate(monthlyInterestRateIn);                
    }
    
    public double getMonthlyInterestRate() {
    	return monthlyInterestRate;
    }
    
    public void setMonthlyInterestRate(double monthlyInterestRateIn) {
    	monthlyInterestRate = monthlyInterestRateIn;
    }    
    
    public double calcMonthlyInterest() {
    	return getBalance() * monthlyInterestRate;
    }
    
    public void addMonthlyInterest() {
    	super.credit(calcMonthlyInterest());
    }
    
    public String toString(){
    	return  super.toString() + " Interest Rate: " + monthlyInterestRate;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
