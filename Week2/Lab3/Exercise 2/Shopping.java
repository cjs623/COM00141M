import java.util.*;


public class Shopping {
	
	 public static ArrayList<String> shoppingList = new ArrayList<String>();	

	 public static void addItem(String shoppingItem) {
		 shoppingList.add(shoppingItem);
	 }
	 
	 public static int numberOfItems() {
		 return shoppingList.size();
	 } 
	 
	 public static void showItem(int itemIn) {
		 
		 int item = itemIn - 1;
		 
		if(item < 0) {
		    // This is not a valid note number, so do nothing.
		}
		else if(item < numberOfItems()) {
		    // This is a valid note number, so we can print it.
			System.out.printf("Item number %s on the shopping list is %s\n",itemIn,shoppingList.get(item));
		}
		else {
			System.out.println("Item does not exist");
		}		 
		 
	 }
	 
	 public static void listItems() {
		 
		System.out.println("Here are all the items on the shopping list");
		for (int i=0;i<numberOfItems();i++){
			System.out.printf("Item number %s on the shopping list is %s\n",i+1,shoppingList.get(i));	 			 
		}
	 } 
	 
	 public static void displayShoppingList() {
		 
		System.out.printf("The shopping list has %s long items\n",numberOfItems());
		listItems();
		 
	 }

	 
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean finishedList = false;
		String ansEntered;
		
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Please enter the item you wish to add to the shopping list (enter finished to complete the list):");
			ansEntered = sc.next();
			if (ansEntered.equalsIgnoreCase("finished")){
				finishedList = true;
			}else {				
				addItem(ansEntered);
			}
			
		}while(!finishedList);
		sc.close();
		
		
		showItem(5);		
		showItem(3);		
		displayShoppingList();		
		
		

	}

}
