
public class TestSpecialInterestAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpecialInterestAccount sia = new SpecialInterestAccount(50000,0.15,0.24);		
		System.out.printf("Current monthly interest is %s\n",sia.toString());
		sia.addCurrentInterest();
		System.out.printf("Current monthly interest is %s\n",sia.toString());
		sia.debit(1000);
		sia.credit(5000);
		System.out.printf("Current monthly interest is %s\n",sia.toString());
		sia.debit(1000);
		sia.debit(4000);
		sia.credit(5000);
		System.out.printf("Current monthly interest is %s\n",sia.toString());

	}

}
