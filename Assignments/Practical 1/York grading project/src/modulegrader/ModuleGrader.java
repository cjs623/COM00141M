
package modulegrader;

import java.util.Scanner;

public class ModuleGrader {
	
	private int totalModules = 0; //if running the main function the object needs to be initialised with an int of the total modules;
	
	private Scanner sc = new Scanner(System.in); //scanner in scope for all functions
	
	private String[][] gradeCriteria = new String[][] 	{
												{"0","39","Outright fail","0","1"}
												,{"40","49","Compensatable fail","1","0"}
												,{"50","59","Satisfactory","0","0"}
												,{"60","69","Good","0","0"}
												,{"70","100","Excellent","0","0"}
												}; 	//String array of string arrays for each grade criteria - lowest mark, highest mark, string description
													//, compensatable fail (1 = yes, 0 = no), outright fail (1 = yes, 0 = no)
												
	
												
	private int moduleMark = 0;
	private int module = 0;
	private String moduleGrade = "";
	private boolean compfailedModule = true;
	private boolean failedModule = true;

	
	public String getModuleGrade() {
		return moduleGrade;
	}
	
	public int getModuleMark() {
		return moduleMark;
	}
	
	public boolean getFailedModules() {
		return failedModule;
	}	
	
	public boolean getCompFailedModules() {
		return compfailedModule;
	}		
												

	public ModuleGrader() {		
		
	}												
												
	public ModuleGrader(int totalModulesIn) {
		
		totalModules = totalModulesIn;
		
	} 												
												
	public int getValidModuleMark() {
		
		boolean validAnswer = false;		
		int markModule = 0;
				
		
		do {
			markModule = getResponseInt("Please enter the mark you recieved for the module (0-100):");
			
			if(markModule >= 0 && markModule <= 100) {
				validAnswer = true;
			}else {
				System.out.printf("The mark provided (%s) is outside of the given range (0-100), please try again.\n",markModule);
			}
		
		} while (validAnswer == false);
		
		return markModule;
		
	}
	
	public String gradeModule(int markModuleIn) {		
		
		for(int i = 0;i < gradeCriteria.length;i++) {
			if(Integer.parseInt(gradeCriteria[i][0]) <= markModuleIn && Integer.parseInt(gradeCriteria[i][1]) >= markModuleIn) {
				
				if (Integer.parseInt(gradeCriteria[i][3]) == 1){
					compfailedModule = true;
				}else if (Integer.parseInt(gradeCriteria[i][4]) == 1){
					failedModule = true;
				} else {
					
				}		
				
				return gradeCriteria[i][2];
			}	
		} 
		return "Error: Mark is negative or above 100";
		
	}
	
	public int getResponseInt(String questionIn) {
		
		int providedInt = 0;
		boolean validAnswer = false;
		String providedAnswer;
		
		System.out.println(questionIn);
		
		do {
			
			providedAnswer = sc.next();
			
			try{
				
				providedInt = Integer.parseInt(providedAnswer);
				
				validAnswer = true;
				
			}catch(Exception e){
				
				System.out.printf("%s is not an integer, please enter a value between the limits given above:\n",providedAnswer);
				
			}
		}while (!validAnswer);	
		
		return providedInt;
		
	}
	
	public void closeScanner() {
		sc.close();
	}
	
	public boolean getResponseYesNo(String prompt) {
		
		String providedAnswer = "";
		boolean validAnswer = false;
		
		System.out.printf("%s (please enter yes/no)\n",prompt);
		
		do {								
			
			providedAnswer = sc.next();
			
			if(providedAnswer.equalsIgnoreCase("yes") || providedAnswer.equalsIgnoreCase("no")) {
				validAnswer = true;
			}else {
				System.out.println("Value entered is invalid, please enter yes or no:");
			}
			
		}while(validAnswer == false);
		
		switch(providedAnswer.toLowerCase()) {
			case "yes":
				return true;
			case "no":
				return false;			
			default:
				return false;
		}
	}
	
	public boolean validModuleSelection(int module) {
		
		if (module >0 && module <= totalModules) {
			return true;
		}
		
		return false;
	}
	
	public boolean promptContinueModuleGrading() {
		return getResponseYesNo("Do you want to continue marking another module?");
	}
	public void startModuleGrading() {		
				
		boolean validModule = false;
		
		String moduleGraded = "";
		
		System.out.println("*********** Module Grading Program *********");
		
		do {
			module = 0;
			
			do {
				module = getResponseInt("Please enter the module you want to calculate your grade for (1 - " + totalModules + "):");
				
				validModule = validModuleSelection(module);
				
				if(!validModule) {
					System.out.printf("Module %s is invalid, please provide an answer in the given range.\n",module);
				}
				
			}while(!validModule);
			
			moduleMark = getValidModuleMark();
			moduleGraded = gradeModule(moduleMark);

				
			System.out.printf("Module %s with a mark of %s has been graded as %s\n\n",module,moduleMark,moduleGraded);
		
			
		} while (promptContinueModuleGrading());
		
		System.out.println("*********** Exiting Module Grading Program *********");
		
	}	

}
