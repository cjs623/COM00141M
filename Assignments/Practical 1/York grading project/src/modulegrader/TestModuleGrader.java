/*
* TestModuleGrader
*
* v1
*
* 12/07/2020
*
* Created by Callum Saint
* 
* This program provides the individual unit tests for the ModuleGrader class and also runs ModuleGrader for end-to-end testing.
* 
*/


package modulegrader;


/**
 * The TestModuleGrader contains all of the code which drives the test type selections 
 */
public class TestModuleGrader {
	
	private static boolean unittest = false;						//captures if user wants to unit test
	private static boolean mainprog = false;						//captures if user wants to run the main method	
	private static ModuleGrader mg = new ModuleGrader(11); 			// initialised with 11 modules as the total that can be graded
			
	/**
	 * The runTests method allows to run the appropriate code for each unit test  
	 */	
	public static void runTests(int i) throws Exception {
		
		int paramInt;					//pass int values to the methods for testing
		int returnInt;					//to test method int return values
		boolean returnBool;				//to test method boolean return values
		String returnString;			//to test method string return values				
				
		/**
		 * The runTests method allows to run the appropriate code for each unit test 
		 */		
		switch (i) {
		case 1:
			
			paramInt = 0;
			returnBool = mg.validModuleSelection(paramInt);
			System.out.printf("Test 1:	Value returned when parameter set to %s: %s\n",paramInt,returnBool);
			
			paramInt = 1;
			returnBool = mg.validModuleSelection(paramInt);
			System.out.printf("Test 1:	Value returned when parameter set to %s: %s\n",paramInt,returnBool);		
			
			paramInt = 5;
			returnBool = mg.validModuleSelection(paramInt);
			System.out.printf("Test 1:	Value returned when parameter set to %s: %s\n",paramInt,returnBool);
			
			paramInt = 11;
			returnBool = mg.validModuleSelection(paramInt);
			System.out.printf("Test 1:	Value returned when parameter set to %s: %s\n",paramInt,returnBool);
			
			paramInt = 12;
			returnBool = mg.validModuleSelection(paramInt);
			System.out.printf("Test 1:	Value returned when parameter set to %s: %s\n",paramInt,returnBool);
			
			break;
		case 2:
			
			mg.startModuleGrading();
			
			break;
			
		case 3:
			//will run code under 4
		case 4:
			
			returnInt = mg.promptValidModuleMark();
			System.out.printf("Test 3/4:	Value returned: %s\n",returnInt);
			
			break;
			
		case 5:
			
			paramInt = -1;
			returnString = mg.gradeModule(paramInt);
			System.out.printf("Test 5:	Value returned when parameter set to %s: %s\n",paramInt,returnString);
			
			paramInt = 101;
			returnString = mg.gradeModule(paramInt);
			System.out.printf("Test 5:	Value returned when parameter set to %s: %s\n",paramInt,returnString);
			
			break;
			
		case 6:
			
			paramInt = 0;
			returnString = mg.gradeModule(paramInt);
			System.out.printf("Test 6:	Value returned when parameter set to %s: %s\n",paramInt,returnString);
			
			paramInt = 39;
			returnString = mg.gradeModule(paramInt);
			System.out.printf("Test 6:	Value returned when parameter set to %s: %s\n",paramInt,returnString);			
			
			break;
			
		case 7:
			
			paramInt = 40;
			returnString = mg.gradeModule(paramInt);
			System.out.printf("Test 7:	Value returned when parameter set to %s: %s\n",paramInt,returnString);
			
			paramInt = 49;
			returnString = mg.gradeModule(paramInt);
			System.out.printf("Test 7:	Value returned when parameter set to %s: %s\n",paramInt,returnString);			
			
			break;
			
		case 8:
			
			paramInt = 50;
			returnString = mg.gradeModule(paramInt);
			System.out.printf("Test 8:	Value returned when parameter set to %s: %s\n",paramInt,returnString);
			
			paramInt = 59;
			returnString = mg.gradeModule(paramInt);
			System.out.printf("Test 8:	Value returned when parameter set to %s: %s\n",paramInt,returnString);			
			
			break;		
			
		case 9:
			
			paramInt = 60;
			returnString = mg.gradeModule(paramInt);
			System.out.printf("Test 9:	Value returned when parameter set to %s: %s\n",paramInt,returnString);
			
			paramInt = 69;
			returnString = mg.gradeModule(paramInt);
			System.out.printf("Test 9:	Value returned when parameter set to %s: %s\n",paramInt,returnString);			
			
			break;					
			
		case 10:
			
			paramInt = 70;
			returnString = mg.gradeModule(paramInt);
			System.out.printf("Test 10:	Value returned when parameter set to %s: %s\n",paramInt,returnString);
			
			paramInt = 100;
			returnString = mg.gradeModule(paramInt);
			System.out.printf("Test 10:	Value returned when parameter set to %s: %s\n",paramInt,returnString);			
			
			break;					
		
		case 11:
			
			returnBool = mg.promptInputYesNo("Entering anything else other than yes or no will result in a prompt to re-enter the response:");	
			
			break;
			
		case 12:
			
			returnBool = mg.promptInputYesNo("Entering yes returns true:");
			System.out.printf("Test 12:	Value returned: %s\n",returnBool);
			
			returnBool = mg.promptInputYesNo("Entering no returns false:");
			System.out.printf("Test 12:	Value returned: %s\n",returnBool);	
			
			returnBool = mg.promptInputYesNo("Entering YES returns true:");
			System.out.printf("Test 12:	Value returned: %s\n",returnBool);
			
			returnBool = mg.promptInputYesNo("Entering NO returns false:");
			System.out.printf("Test 12:	Value returned: %s\n",returnBool);			
			
			break;
			
		case 13:
			
			returnInt = mg.promptInputInteger("Entering an int will be accepted:");
			System.out.printf("Test 13:	Value returned: %s\n",returnInt);
			
			returnInt = mg.promptInputInteger("Entering anything else will be rejected and looped:");
			
			break;
			
		case 14:
			
			returnBool = mg.promptContinueModuleGrading();
			System.out.printf("Test 14:	Value returned if yes: %s\n",returnBool);
			
			returnBool = mg.promptContinueModuleGrading();
			System.out.printf("Test 14:	Value returned if no: %s\n",returnBool);
						
			returnBool = mg.promptContinueModuleGrading();			
			
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
				
				runTestID = mg.promptInputInteger("Please enter the Unit Test you wish to run (1-14)");
				
				if (runTestID >= 1 && runTestID <=14) {
					validTestID = true;
				}else {
					System.out.println("Please enter a valid selection.");
				}		//if selection is not valid then ask for input again		
				
				if (!validTestID) {
					System.out.println("Please enter a valid selection.");
				} //if selection is not valid then ask for input again
				
			} while (!validTestID);			//loop while the unit test id provided is not valid
			
			try {				
				runTests(runTestID);				
			} catch (Exception e){				
				System.out.println(e);				//Wrong parameters passed to runTests, print error				
			}
			
			unittest = mg.promptInputYesNo("Do you want to do another unit test?");
			
		} while (unittest);			//loop while unit test selection is true
		
	}

	
	/**
	 * The main method begins the program and contains calls to the other methods. 
	 */			
	public static void main(String[] args) {
		
		System.out.println("*********** Unit testing for Module Grading Program *********");
		
		unittest = mg.promptInputYesNo("Do you want to go through each individual test?");
		
		if (unittest) {
			promptUnitTest();			
		}			//if unittest is true then continue to unit test method
		
		mainprog = mg.promptInputYesNo("Do you want to run the main program?");
		
		if (mainprog) {			
			mg.startModuleGrading();			
		} else {			
			System.out.println("Selected no so exiting");			
		}			//if mainprog is true then run primary method else exiting program
		
		mg.closeScanner();
				
		System.out.println("*********** Exiting Unit testing for Module Grading Program *********");

	}

}