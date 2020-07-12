/*
* DegreeGrader
*
* v1
*
* 12/07/2020
*
* Created by Callum Saint
* 
* This program is an algorithm which calculates and displays the overall grade for an MSc degree.
* 
*/

package modulegrader;

public class DegreeGrader extends ModuleGrader {
	
	private String calcOverallGrade = "";			//
	private String achievedGrade = "";				//
	private int avgTaughtMark = 0;					//
	private int avgISMMark = 0;						//
	private int totalCompFailCred = 0;				//
	private int totalModOutFail = 0;				//			
	
	
	/**
	 * getAvgTaughtMark - returns avgTaughtMark
	 */
	public int getAvgTaughtMark() {
		return avgTaughtMark;		
	}
	
	/**
	 * getAvgISMMark - returns avgISMMark
	 */	
	public int getAvgISMMark() {
		return avgISMMark;		
	}
	
	/**
	 * getTotalCompFailCred - returns totalCompFailCred
	 */		
	public int getTotalCompFailCred() {
		return totalCompFailCred;		
	}
	
	/**
	 * getTotalModOutFail - returns totalModOutFail
	 */			
	public int getTotalModOutFail() {
		return totalModOutFail;		
	}	

	/**
	 * getAchievedGrade - returns achievedGrade
	 */				
	public String getAchievedGrade() {
		return achievedGrade;		
	}		
		
	/**
	 * promptTaughtMark - prompt that asks for user input for the avgTaughtMark
	 */		
	public void promptTaughtMark() {
		
		boolean validTaughtMark = false;		//test if module mark is valid
		
		do {
			avgTaughtMark = promptInputInteger("What was your average credit weighted taught module mark (0-100)?");
			
			if (avgTaughtMark >=0 && avgTaughtMark <= 100) {
				validTaughtMark = true;
			} else {
				System.out.println("Invalid response, please re-enter value.");
			}		//test to see if the response is within boundaries
			
		} while(!validTaughtMark);				//while no valid mark continue looping until valid inpuit	
		
	}
	
	/**
	 * promptISMMark - prompt that asks for user input for the avgISMMark
	 */			
	public void promptISMMark() {
		boolean validISMMark = false;
		
		do {
			avgISMMark = promptInputInteger("What was your average credit weighted ISM mark? (0-100)");
			
			if (avgISMMark >=0 && avgISMMark <= 100) {
				validISMMark = true;
			} else {
				System.out.println("Invalid response, please re-enter value.");
			}		//test to see if the response is within boundaries
			
		} while(!validISMMark);				//while no valid mark continue looping until valid input
		
	}
	
	/**
	 * promptCompFailedCred - prompt that asks for user input for the totalCompFailCred
	 */			
	public void promptCompFailedCred() {
		
		boolean validCompFailCred = false;		
		
		do {
			totalCompFailCred = promptInputInteger("How many compensatable fail credits did you recieve (0-180)?");
			
			if (totalCompFailCred >=0 && totalCompFailCred <= 180) {
				validCompFailCred = true;
			} else {
				System.out.println("Invalid response, please re-enter value.");
			}		//test to see if the response is within boundaries
			
		} while(!validCompFailCred);				//while no valid credits continue looping until valid input
		
	}
	
	/**
	 * promptModOutFail - prompt that asks for user input for the totalModOutFail
	 */				
	public void promptModOutFail() {
		
		boolean validModOutFail = false;		
		
		do {
			totalModOutFail = promptInputInteger("How many modules did you fail (0-11)?");
			
			if (totalModOutFail >=0 && totalModOutFail <= 11) {
				validModOutFail = true;
			} else {
				System.out.println("Invalid response, please re-enter value.");
			}		//test to see if the response is within boundaries
			
		} while(!validModOutFail);				//while no valid failed modules continue looping until valid input
		
	}
	
	/**
	 * gradeDegree - take all module marks and returns the overall grade for the MSc
	 */					
	public String gradeDegree(int avgTaughtMarkIn,int avgISMMarkIn,int totalCompFailCredIn,int totalModOutFailIn) {		
		
		if (avgTaughtMarkIn >=70 && avgISMMarkIn >= 70 && totalCompFailCredIn == 0 && totalModOutFailIn == 0) {
			calcOverallGrade = "Distinction";
		} else if (avgTaughtMarkIn >= 60 && avgISMMarkIn >= 60 && totalCompFailCredIn <= 15 && totalModOutFailIn == 0) {
			calcOverallGrade = "Merit";
		} else if (avgTaughtMarkIn >= 50 && avgISMMarkIn >= 50 && totalCompFailCredIn <= 30 && totalModOutFailIn == 0) {
			calcOverallGrade = "Pass";
		} else {
			calcOverallGrade = "Fail";
		}
		
		return calcOverallGrade;
		
	}	

	/**
	 * displayDegreeMark - display all details on the module mark
	 */				
	public void displayDegreeMark() {

		System.out.printf(	"With the following:\n\nAverage taught module mark: %s\nAverage ISM mark: %s\nCompensatable Failed Credits: %s"
							+"\nOutright failed modules: %s\n\nOverall grade achieved: %s\n\n"
							,avgTaughtMark,avgISMMark,totalCompFailCred,totalModOutFail,achievedGrade);		
		
	}	
	
	/**
	 * promtDegreeMarks - runs all of the prompt input methods, calculates grade, and then displays everything
	 */			
	public void promptDegreeMarks() {
				
		promptTaughtMark();				//get taught mark
		promptISMMark();				//get ism mark
		promptCompFailedCred();			//get comp fail credits
		promptModOutFail();				//get outright fails
		
		achievedGrade = gradeDegree(avgTaughtMark
									,avgISMMark
									,totalCompFailCred
									,totalModOutFail);			//get the achieved grade
		
		displayDegreeMark();			//display degree marks
		
	}
	
	/**
	 * promptContinueDegreeGrading - Asks user if they want to continue grading
	 */		
	public boolean promptContinueDegreeGrading() {
		return promptInputYesNo("Do you want to continue marking degrees?");
	}
	
	/**
	 * startDegreeGrading - primary method which starts the program
	 */			
	public void startDegreeGrading() {		
		
		System.out.println("*********** Degree Classification Program *********");
		
		do {
			promptDegreeMarks();
		} while(promptContinueDegreeGrading());		//while promptContinueDegreeGrading is true keep marking until user wants to stop
		
		System.out.println("*********** Exiting Degree Classification Program *********");
		
	}

}
