/*
* TestDegreeGrader
*
* v1
*
* 12/07/2020
*
* Created by Callum Saint
* 
* This program provides the individual unit tests for the DegreeGrader class and also runs DegreeGrader for end-to-end testing. 
* 
*/


package modulegrader;


/**
 * The TestModuleGrader contains all of the code which drives the test type selections 
 */
public class TestDegreeGrader {
	
	private static boolean unittest = false;						//captures if user wants to unit test
	private static boolean mainprog = false;						//captures if user wants to run the main method	
	private static DegreeGrader dg = new DegreeGrader();			//created the degree grader object
		
	/**
	 * The runTests method allows to run the appropriate code for each unit test 
	 */
	public static void runTests(int i) throws Exception {
		
		boolean returnBool;				//to test method boolean return values
		String returnString;			//to test method string return values
		
		switch (i) {
		case 15:
			
			returnBool = dg.promptContinueDegreeGrading();
			System.out.printf("Test 15:	Value returned if yes: %s\n",returnBool);
			
			returnBool = dg.promptContinueDegreeGrading();
			System.out.printf("Test 15:	Value returned if no: %s\n",returnBool);
			
			returnBool = dg.promptContinueDegreeGrading();
			
			break;
			
		case 16:
			
			dg.promptDegreeMarks();
			
			break;
			
		case 17:
			
			returnString = dg.gradeDegree(50,50,0,0);			
			System.out.printf("Test 17:	Value returned: %s\n",returnString);
			
			break;
			
		case 18:
		
			
			returnString = dg.gradeDegree(70,70,0,0);			
			System.out.printf("Test 18:	Value returned: %s\n",returnString);
			returnString = dg.gradeDegree(70,70,15,0);			
			System.out.printf("Test 18:	Value returned: %s\n",returnString);
			returnString = dg.gradeDegree(70,70,15,1);			
			System.out.printf("Test 18:	Value returned: %s\n",returnString);				
			
			break;
			
		case 19:
			
			returnString = dg.gradeDegree(60,60,0,0);			
			System.out.printf("Test 19:	Value returned: %s\n",returnString);
			returnString = dg.gradeDegree(60,60,15,0);			
			System.out.printf("Test 19:	Value returned: %s\n",returnString);
			returnString = dg.gradeDegree(60,60,30,0);			
			System.out.printf("Test 19:	Value returned: %s\n",returnString);				
			
			break;
			
		case 20:
			
			returnString = dg.gradeDegree(50,50,0,0);			
			System.out.printf("Test 20:	Value returned: %s\n",returnString);			
			returnString = dg.gradeDegree(50,50,30,0);			
			System.out.printf("Test 20:	Value returned: %s\n",returnString);
			returnString = dg.gradeDegree(50,50,45,0);			
			System.out.printf("Test 20:	Value returned: %s\n",returnString);
			returnString = dg.gradeDegree(50,50,45,1);			
			System.out.printf("Test 20:	Value returned: %s\n",returnString);			
			
			break;		
			
		case 21:
			
			returnString = dg.gradeDegree(70,70,0,1);			
			System.out.printf("Test 21:	Value returned: %s\n",returnString);			
			returnString = dg.gradeDegree(60,60,0,1);			
			System.out.printf("Test 21:	Value returned: %s\n",returnString);
			returnString = dg.gradeDegree(50,50,0,1);			
			System.out.printf("Test 21:	Value returned: %s\n",returnString);
			returnString = dg.gradeDegree(40,40,0,0);			
			System.out.printf("Test 21:	Value returned: %s\n",returnString);			
			
			break;
			
		case 22:
			
			dg.promptTaughtMark();
			System.out.printf("Test 22:	Variable set to: %s\n",dg.getAvgTaughtMark());
			
			break;			
			
		case 23:
			
			dg.promptISMMark();
			System.out.printf("Test 23:	Variable set to: %s\n",dg.getAvgISMMark());
			
			break;
			
		case 24:
			
			dg.promptCompFailedCred();
			System.out.printf("Test 24:	Variable set to: %s\n",dg.getTotalCompFailCred());
			
			break;
			
		case 25:
			
			dg.promptModOutFail();
			System.out.printf("Test 25:	Variable set to: %s\n",dg.getTotalModOutFail());
			
			break;
						
		default:
			throw new Exception("Invalid parameters passed to validateIntBoundries");			//should never get here unless erroneous parameters passed
		}
	}
		
	/**
	 * The promptUnitTest method prompts the users for which test they wish to run code for 
	 */	
	public static void promptUnitTest() {
		
		int runTestID = 0;
		boolean validTestID = false;
		
		do {
						
			do {
				
				validTestID = false;
				
				runTestID = dg.promptInputInteger("Please enter the Unit Test you wish to run (15-25)");
				
				if (runTestID >= 15 && runTestID <=25) {
					validTestID = true;
				}else {
					System.out.println("Please enter a valid selection.");
				}		//if selection is not valid then ask for input again									
				
			} while (!validTestID);			//loop while the unit test id provided is not valid
			
			try {				
				runTests(runTestID);				
			} catch (Exception e){				
				System.out.println(e);				//Wrong parameters passed to runTests, print error				
			}
			
			unittest = dg.promptInputYesNo("Do you want to do another unit test?");
			
		} while (unittest);			//loop while unit test selection is true
		
	}
	
	/**
	 * The main method begins the program and contains calls to the other methods. 
	 */		
	public static void main(String[] args) {
		
		System.out.println("*********** Unit testing for Degree Grading Program *********");
		
		unittest = dg.promptInputYesNo("Do you want to go through each individual test?");
		
		if (unittest) {
			promptUnitTest();
		}			//if unittest is true then continue to unit test method	
		
		mainprog = dg.promptInputYesNo("Do you want to run the main program?");
		
		if (mainprog) {
			dg.startDegreeGrading(); //initialised with 11 modules
		} else {
			System.out.println("Selected no so exiting");
		}			//if mainprog is true then run primary method else exiting program			
				
		System.out.println("*********** Exiting Unit testing for Degree Grading Program *********");
		
		dg.closeScanner();


	}

}