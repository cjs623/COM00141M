
public class SpecialInterestAccount extends InterestAccount {
	
	double ratePremium;
	int countTrans;

	public SpecialInterestAccount(double balanceIn,double rateStandardIn,double ratePremiumIn) {
		super(balanceIn,rateStandardIn);
		setPremiumRate(ratePremiumIn);
		countTrans = 0;
	}
	
	public void setPremiumRate(double ratePremiumIn) {
		ratePremium = ratePremiumIn;
	}
	
	public double getPremiumRate() {
		return ratePremium;
	}	
	
	public void credit(double amountIn) {
		countTrans++;
		super.credit(amountIn);
	}
	
	public boolean debit(double amountIn) {
		countTrans++;
		return super.debit(amountIn);
	}	
	
	public String toString() {		
		return super.toString()  + ", premium rate set at "+  getPremiumRate() + ", transaction count is " + countTrans + ", current interest is " + calcCurrentInterest();
	}
	
	public double calcCurrentInterest() {
		if(countTrans >4) {
			return super.calcMonthlyInterest();
		} else {		
			return getBalance() * getPremiumRate();
		}
	}
	
	public void addCurrentInterest() {
		if(countTrans >4) {
			super.addMonthlyInterest();
		} else {
			super.credit(calcCurrentInterest());			
		}
	}

}
