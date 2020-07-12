/*
* ModuleGrader
*
* v1
*
* 12/07/2020
*
* Created by Callum Saint
* 
* This program is an algorithm which calculates and displays the grade for a given MSc module.
* 
*/

package modulegrader;

import java.util.Scanner;

public class ModuleGrader {
		
	private Scanner sc = new Scanner(System.in);		//scanner in scope for all functions
	private int moduleMark = 0;							//mark of the module
	private int totalModules = 0; 						//if running the main function the object needs to be initialised with an int of the total modules;
	private int module = 0;								//module number that is in scope
	private String moduleGraded = "";					//the grade the module received
	private String[][] gradeCriteria = new String[][] 	{
												{"0","39","Outright fail"}
												,{"40","49","Compensatable fail"}
												,{"50","59","Satisfactory"}
												,{"60","69","Good"}
												,{"70","100","Excellent"}
												}; 		//String array of string arrays for each grade criteria: lowest mark, highest mark, string description
													
	/*
	 * Constructor that accepts no parameters if module counting function not needed 												
	 */
	public ModuleGrader() {		
		
	}												
												
	/*
	 * Constructor that accepts total number of modules in focus for input messages 												
	 */	
	public ModuleGrader(int totalModulesIn) {
		
		totalModules = totalModulesIn;
		
	}
	
	/*
	 * getResponseInt returns an integer value from user input									
	 */		
	public int promptInputInteger(String questionIn) {
		
		int providedInt = 0;				//integer from the user input
		boolean validAnswer = false;		//whether the input is valid
		String providedAnswer;				//stores the user input
		
		System.out.println(questionIn);
		
		do {
			
			providedAnswer = sc.next();
			
			try{
				
				providedInt = Integer.parseInt(providedAnswer); //assign the integer, if valid wont throw but if invalid will throw
				
				validAnswer = true;
				
			}catch(Exception e){
				
				System.out.printf("%s is not an integer, please enter a value between the limits given above:\n",providedAnswer);		//throws an error if not valid
				
			}
		}while (!validAnswer);		//while no valid answer provided keep looping for an input
		
		return providedInt;
		
	}
	
	/*
	 * closeScanner closes the class scanner											
	 */		
	public void closeScanner() {
		sc.close();
	}
	
	/*
	 * promptInputYesNo returns a boolean depending on a yes / no input and will loop until valid response											
	 */		
	public boolean promptInputYesNo(String prompt) {
		
		String providedAnswer = "";				//stores the user input
		boolean validAnswer = false;			//if the answer provided was valid or not
		
		System.out.printf("%s (please enter yes/no)\n",prompt);
		
		do {								
			
			providedAnswer = sc.next();
			
			if (providedAnswer.equalsIgnoreCase("yes") || providedAnswer.equalsIgnoreCase("no")) {
				validAnswer = true;
			} else {
				System.out.println("Value entered is invalid, please enter yes or no:");
			} 	//if - test the input to see if it was valid
			
		} while (!validAnswer);		//while no valid answer keep looping until valid
		
		switch (providedAnswer.toLowerCase()) {
			case "yes":
				return true;
			case "no":
				return false;			
			default:
				return false;		// wont reach here
		}
	}	
	
	/*
	 * validModuleSelection tests if module input is within a valid range											
	 */		
	public boolean validModuleSelection(int module) {
		
		if (module >0 && module <= totalModules) {
			return true;
		}
		
		return false;
	}	
				
	/*
	 * promptValidModuleMark returns a valid module mark by prompting the user for input											
	 */		
	public int promptValidModuleMark() {
		
		boolean validAnswer = false;			//if the input is a valid answer	
		int markModule = 0;						//the mark of the module from input
		
		do {
			
			markModule = promptInputInteger("Please enter the mark you recieved for the module (0-100):");
			
			if(markModule >= 0 && markModule <= 100) {
				validAnswer = true;
			} else {
				System.out.printf("The mark provided (%s) is outside of the given range (0-100), please try again.\n",markModule);
			} 		// test to see if module mark is 0-100
		
		} while (validAnswer == false); 		// do while the answer is not valid and loop until valid answer provided
		
		return markModule;
		
	}
	
	/*
	 * gradeModule returns a string grade for the valid module mark passed to it											
	 */		
	public String gradeModule(int markModuleIn) {		
		
		for (int i = 0; i < gradeCriteria.length; i++) {
			
			if (Integer.parseInt(gradeCriteria[i][0]) <= markModuleIn && Integer.parseInt(gradeCriteria[i][1]) >= markModuleIn) {
				
				return gradeCriteria[i][2];
				
			}			//find the valid grade to return
			
		}			//for length of grade array 
		
		return "Error: Mark is negative or above 100";		//this should never be reached
		
	}
	
	/*
	 * promptContinueModuleGrading asks the user if they want to continue marking											
	 */		
	public boolean promptContinueModuleGrading() {
		return promptInputYesNo("Do you want to continue marking another module?");
	}
	
	/*
	 * startModuleGrading primary method which kicks off the program											
	 */		
	public void startModuleGrading() {		
				
		boolean validModule = false;
		
		System.out.println("*********** Module Grading Program *********");
		
		do {
			module = 0;
			
			do {
				module = promptInputInteger("Please enter the module you want to calculate your grade for (1 - " + totalModules + "):");
				
				validModule = validModuleSelection(module);
				
				if (!validModule) {
					System.out.printf("Module %s is invalid, please provide an answer in the given range.\n",module);
				}
				
			} while(!validModule); //while no valid module selected loop until valid input
			
			moduleMark = promptValidModuleMark();			//get valid mark from input
			moduleGraded = gradeModule(moduleMark);			//get grade of valid mark
				
			System.out.printf("Module %s with a mark of %s has been graded as %s\n\n",module,moduleMark,moduleGraded);
		
			
		} while (promptContinueModuleGrading());		//while promptContinueModuleGrading is true loop until user wants to finish marking
		
		System.out.println("*********** Exiting Module Grading Program *********");
		
	}	

}
