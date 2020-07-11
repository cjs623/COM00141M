package modulegrader;

public class TestDegreeGrader {
	
	private static boolean unittest = false;
	private static boolean mainprog = false;
	
	private static DegreeGrader dg = new DegreeGrader();
	
	public static void runTests(int i) {
		
		int returnInt;
		boolean returnBool;
		String returnString;
		int paramInt;
		
		switch(i) {
		case 15:
			
			returnBool = dg.promptContinueDegreeGrading();
			System.out.printf("Test 15:	Value returned if yes: %s\n",returnBool);
			
			returnBool = dg.promptContinueDegreeGrading();
			System.out.printf("Test 15:	Value returned if no: %s\n",returnBool);
						
			returnBool = dg.promptContinueModuleGrading();					
			
			break;
		case 16:
			
			dg.promtDegreeMarks();
			
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
				
				runTestID = dg.getResponseInt("Please enter the Unit Test you wish to run (15-25)");
				
				if(runTestID <15 || runTestID >25) {					
					System.out.println("Please enter a valid selection.");
					
				}else {
					validTestID = true;
				}
				
			}while(!validTestID);
			
			runTests(runTestID);
			
			unittest = dg.getResponseYesNo("Do you want to do another unit test?");
			
		}while (unittest);			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		
		System.out.println("*********** Unit testing for Degree Grading Program *********");
		
		unittest = dg.getResponseYesNo("Do you want to go through each individual test?");
		
		if (unittest) {
			promptUnitTest();
		}
		
		
		mainprog = dg.getResponseYesNo("Do you want to run the main program?");
		if(mainprog) {
			dg.startModuleGrading(); //initialised with 11 modules
		}else {
			System.out.println("Selected no so exiting");
		}			
				
		System.out.println("*********** Exiting Unit testing for Degree Grading Program *********");
		
		//mg.closeScanner();


	}

}