package modulegrader;

public class DegreeGrader extends ModuleGrader{
	
	private String calcOverallGrade = "";
	
	private int avgTaughtMark = 0;
	private int avgISMMark = 0;
	private int totalCompFailCred = 0;
	private int totalModOutFail = 0;
	String achievedGrade = "";
	
//	private String[][] gradeCourse = new String[][] 	{
//														{"Module 1","Taught","15","","",""}
//														,{"Module 2","Taught","15","","",""}
//														,{"Module 3","Taught","15","",""}
//														,{"Module 4","Taught","15","","",""}
//														,{"Module 5","Taught","15","","",""}
//														,{"Module 6","Taught","15","","",""}
//														,{"Module 7","Taught","15","","",""}
//														,{"Module 8","Taught","15","","",""}
//														,{"Module 9","Taught","15","","",""}
//														,{"Module 10","Independent Study Module (ISM)","15","","",""}
//														,{"Module 11","Independent Study Module (ISM)","30","","",""}
//														};
//														
//	public void setModuleMark(int moduleIn,int moduleMarkIn,String moduleGradeIn,boolean passIn) {
//		
//		int correctedModule = moduleIn - 1;
//		
//		gradeCourse[correctedModule][3] = Integer.toString(moduleMarkIn);
//		gradeCourse[correctedModule][4] = moduleGradeIn;
//		gradeCourse[correctedModule][5] = Boolean.toString(passIn);
//		
//		//setModuleMark(module,moduleMark,moduleGraded,true);
//	}												
	
	public int getAvgTaughtMark() {
		return avgTaughtMark;		
	}
	
	public int getAvgISMMark() {
		return avgISMMark;		
	}
	
	public int getTotalCompFailCred() {
		return totalCompFailCred;		
	}
	
	public int getTotalModOutFail() {
		return totalModOutFail;		
	}	

	public String getAchievedGrade() {
		return achievedGrade;		
	}		
	
	public String gradeDegree(int avgTaughtMarkIn,int avgISMMarkIn,int totalCompFailCredIn,int totalModOutFailIn) {		
		
		if(avgTaughtMarkIn >=70 && avgISMMarkIn >= 70 && totalCompFailCredIn == 0 && totalModOutFailIn == 0) {
			calcOverallGrade = "Distinction";
		}else if (avgTaughtMarkIn >= 60 && avgISMMarkIn >= 60 && totalCompFailCredIn <= 15 && totalModOutFailIn == 0) {
			calcOverallGrade = "Merit";
		}else if (avgTaughtMarkIn >= 50 && avgISMMarkIn >= 50 && totalCompFailCredIn <= 30 && totalModOutFailIn == 0) {
			calcOverallGrade = "Pass";
		}else {
			calcOverallGrade = "Fail";
		}
		
		return calcOverallGrade;
		
	}
	
	public void promptTaughtMark() {
		
		boolean validTaughtMark = false;
		
		do {
			avgTaughtMark = getResponseInt("What was your average credit weighted taught module mark (0-100)?");
			
			if(avgTaughtMark >=0 && avgTaughtMark <= 100) {
				validTaughtMark = true;
			}else {
				System.out.println("Invalid response, please re-enter value.");
			}
			
		}while(!validTaughtMark);		
		
	}
	
	public void promptISMMark() {
		boolean validISMMark = false;
		
		do {
			avgISMMark = getResponseInt("What was your average credit weighted ISM mark? (0-100)");
			
			if(avgISMMark >=0 && avgISMMark <= 100) {
				validISMMark = true;
			}else {
				System.out.println("Invalid response, please re-enter value.");
			}
			
		}while(!validISMMark);
		
	}
	
	public void promptCompFailedCred() {
		
		boolean validCompFailCred = false;		
		
		do {
			totalCompFailCred = getResponseInt("How many compensatable fail credits did you recieve (0-180)?");
			
			if(totalCompFailCred >=0 && totalCompFailCred <= 180) {
				validCompFailCred = true;
			}else {
				System.out.println("Invalid response, please re-enter value.");
			}
			
		}while(!validCompFailCred);
		
	}
	
	public void promptModOutFail() {
		boolean validModOutFail = false;		
		
		do {
			totalModOutFail = getResponseInt("How many modules did you fail (0-11)?");
			
			if(totalModOutFail >=0 && totalModOutFail <= 11) {
				validModOutFail = true;
			}else {
				System.out.println("Invalid response, please re-enter value.");
			}
			
		}while(!validModOutFail);
		
	}
	
	public void displayDegreeMark() {

		System.out.printf("With the following:\n\nAverage taught module mark: %s\nAverage ISM mark: %s\nCompensatable Failed Credits: %s\nOutright failed modules:%s\n\nOverall grade achieved: %s\n\n"
				,avgTaughtMark,avgISMMark,totalCompFailCred,totalModOutFail,achievedGrade);		
		
	}
	
	
	public void promtDegreeMarks() {
		
		
		promptTaughtMark();
		promptISMMark();
		promptCompFailedCred();
		promptModOutFail();	
		
		achievedGrade = gradeDegree(avgTaughtMark,avgISMMark,totalCompFailCred,totalModOutFail);
		
		displayDegreeMark();
		
	}
	
	public boolean promptContinueDegreeGrading() {
		return getResponseYesNo("Do you want to continue marking degrees?");
	}
	
	public void startDegreeGrading() {		
		
		System.out.println("*********** Degree Classification Program *********");
		
		do {
			promtDegreeMarks();
		}while(promptContinueDegreeGrading());
		
		System.out.println("*********** Exiting Degree Classification Program *********");
	}
	
	public void startStoreModuleGrading() {		
		
		System.out.println("*********** Degree Classification Program *********");
		
		//startStoreModuleGrading();
		
		System.out.println("*********** Exiting Degree Classification Program *********");
	}	

}
