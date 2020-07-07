// File: Test_YorDate.java
/**
 * Test harness for YorDate class
 *
 * @author	Tommy Yuan
 * @version	24 January 2019 */
 
public class Test_YorDate
{
	
	public static void main(String args[])
	{
		//Create a reference to a YorDate object
		YorDate date1;
		YorDate date2;
			
	    // This creates an object which sets the date to the current date
		 date1 = new YorDate();
		 
		 System.out.println(date1.getDayOfWeek());
		 System.out.println(date1.toString());
		
		//Using the appropriate methods set, set date1 to your birthdate
	
		 date1 = new YorDate(9,2,2020);
		 date2 = date1.addOn(6);
		 
		//Using appropriate date1 method(s) display your birthday
		 
		 System.out.println(date1.getDayOfWeek());
		 System.out.println(date1.toString());		
		 System.out.println(date2.getDayOfWeek());
		 System.out.println(date2.toString());		 	
		 System.out.println(date2.isAfter(date1));
		 System.out.println(date1.isAfter(date2));
		 
		
		
	}
}