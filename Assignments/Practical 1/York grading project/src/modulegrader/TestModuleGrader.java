package modulegrader;

public class TestModuleGrader {
	
	private static boolean unittest = false;
	private static boolean mainprog = false;
	
	private static ModuleGrader mg = new ModuleGrader(11); // initialised with 11 modules as the total that can be graded
	
	public static void runTests(int i) {
		
		int returnInt;
		boolean returnBool;
		String returnString;
		int paramInt;
		
		switch(i) {
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
			returnInt = mg.getValidModuleMark();
			System.out.printf("Test 3:	Value returned: %s\n",returnInt);
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
			
			returnBool = mg.getResponseYesNo("Entering anything else other than yes or no will result in a prompt to re-enter the response:");	
			
			break;
			
		case 12:
			
			returnBool = mg.getResponseYesNo("Entering yes returns true:");
			System.out.printf("Test 12:	Value returned: %s\n",returnBool);
			
			returnBool = mg.getResponseYesNo("Entering no returns false:");
			System.out.printf("Test 12:	Value returned: %s\n",returnBool);	
			
			returnBool = mg.getResponseYesNo("Entering YES returns true:");
			System.out.printf("Test 12:	Value returned: %s\n",returnBool);
			
			returnBool = mg.getResponseYesNo("Entering NO returns false:");
			System.out.printf("Test 12:	Value returned: %s\n",returnBool);			
			
			break;
			
		case 13:
			
			returnInt = mg.getResponseInt("Entering an int will be accepted:");
			System.out.printf("Test 13:	Value returned: %s\n",returnInt);
			
			returnInt = mg.getResponseInt("Entering anything else will be rejected and looped:");
			
			break;
		case 14:
			
			returnBool = mg.promptContinueModuleGrading();
			System.out.printf("Test 14:	Value returned if yes: %s\n",returnBool);
			
			returnBool = mg.promptContinueModuleGrading();
			System.out.printf("Test 14:	Value returned if no: %s\n",returnBool);
						
			returnBool = mg.promptContinueModuleGrading();			
			
			break;
			
		default:
			//
			break;
		}
	}
	
	public static void promptUnitTest() {
		
		int runTestID = 0;
		boolean validTestID = false;
		
		do {
						
			do {
				
				validTestID = false;
				
				runTestID = mg.getResponseInt("Please enter the Unit Test you wish to run (1-14)");
				
				if(runTestID <1 || runTestID >14) {					
					System.out.println("Please enter a valid selection.");					
				}else {
					validTestID = true;
				}
				
			}while(!validTestID);
			
			runTests(runTestID);
			
			unittest = mg.getResponseYesNo("Do you want to do another unit test?");
			
		}while (unittest);			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		
		System.out.println("*********** Unit testing for Module Grading Program *********");
		
		unittest = mg.getResponseYesNo("Do you want to go through each individual test?");
		
		if (unittest) {
			promptUnitTest();
		}
		
		
		mainprog = mg.getResponseYesNo("Do you want to run the main program?");
		if(mainprog) {
			mg.startModuleGrading(); //initialised with 11 modules
		}else {
			System.out.println("Selected no so exiting");
		}			
				
		System.out.println("*********** Exiting Unit testing for Module Grading Program *********");
		
		//mg.closeScanner();


	}

}