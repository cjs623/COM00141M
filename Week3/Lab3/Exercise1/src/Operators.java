public class Operators {
	
	static String[] runTypes = {"add","subtract"};	
	
	public static void add(double a, double b) {
		System.out.println(a+b);		
	}
	
	public static void subtract(double a, double b) {
		System.out.println(a-b);
	}	
	
	private static boolean foundType(String value) {
		
		boolean found = false;
		
		for(int i = 0;i<runTypes.length;i++) {
			
			if(runTypes[i].equalsIgnoreCase(value)) {
				found = true;
			}
			
		}
		
		return found;

	}		
	
	private static boolean tryParseInt(String value) {  
	     try {  
	         Integer.parseInt(value);  
	         return true;  
	      } catch (NumberFormatException e) {  
	         return false;  
	      }  
	}	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

				
		
		if (args.length < 3){
			System.out.println("Not enough Args");
		}else if(!foundType(args[0])){
			System.out.println("Could not find type");
		}else if(!tryParseInt(args[1]) || !tryParseInt(args[2])){
			System.out.println("Integers not passed to program");
		}else {
		
			String runType = args[0];			
			int a = Integer.parseInt(args[1]);
			int b = Integer.parseInt(args[2]);	
			
			if(runType.equalsIgnoreCase("add")) {
				add(a,b);			
			}
			if(runType.equalsIgnoreCase("subtract")) {
				subtract(a,b);
			}		
		}

	}

}
