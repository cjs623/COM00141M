import java.util.*;

public class TestPerson {
	
	static int day;
	static int month;
	static int year;
	static String firstName;
	static String secondName;
	
	public static void setPersonDetails() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your first name");
		firstName = sc.next();
		System.out.println("Enter your second name");
		secondName = sc.next();
		System.out.println("Enter your numerical day of birth");
		day = sc.nextInt();
		System.out.println("Enter your numerical month of birth");
		month = sc.nextInt();
		System.out.println("Enter your numerical year of birth");
		year = sc.nextInt();		
		
		sc.close();
		
		
	}

	public static void main(String[] args) {
		// Create Person object and test the methods
		setPersonDetails();
		Person per = new Person(firstName,secondName,day,month,year);
		per.displayPersonDetails();

	}

}
