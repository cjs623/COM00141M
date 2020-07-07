import java.util.*;

import javax.swing.JOptionPane;


public class Shopping {
	
	 private ArrayList<String> shoppingList;
	 private String alternatives[] = {"List", "Add", "Show","Exit"};
	 
	 public Shopping() {
		 shoppingList = new ArrayList<String>();
	 }	 

	 public void addItem(String shoppingItem) {
		 shoppingList.add(shoppingItem);
	 }
	 
	 public int numberOfItems() {
		 return shoppingList.size();
	 } 
	 
	 public void showItem(int itemIn) {
		 
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
	 
	 public void listItems() {
		 
		System.out.println("Here are all the items on the shopping list");
		for (int i=0;i<numberOfItems();i++){
			System.out.printf("Item number %s on the shopping list is %s\n",i+1,shoppingList.get(i));	 			 
		}
	 } 
	 
	 public void displayShoppingList() {
		 
		showItem(5);		
		showItem(3);
		System.out.printf("The shopping list has %s long items\n",numberOfItems());
		listItems();
		 
	 }

	 public void generateList() {
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
		 }
	 
	 
	public void runShoppingList() {
		// TODO Auto-generated method stub
        int option = getChoice();
        while (option != 3)
        {
          //Action depending on choice
        	if (option == 0){//List notes
			if (numberOfItems() >0 ){ 
				listItems();
			}
			else System.out.println("No notes in list");
          }
          else if (option == 1) //Add note
          {
           String newNote= JOptionPane.showInputDialog(null,"Enter a new shopping list item","New Shopping Item", JOptionPane.PLAIN_MESSAGE);
           addItem(newNote) ; 
         
          }
          else if (option == 2)
          {
            if (numberOfItems() >0 )
            {
              String strNum= JOptionPane.showInputDialog(null,"Enter a note Number","Show Note", JOptionPane.PLAIN_MESSAGE);
              int num = Integer.parseInt(strNum); 
              if (num <= numberOfItems())
              {
            	  showItem(num) ;
              }
              else System.out.println("Invalid number");
            }
            else System.out.println("No notes in list");
          }
           else JOptionPane.showMessageDialog(null, "No Comprendo " +option);
         //Prompt again
         option = getChoice();
        }//End while
	}
	
    public int getChoice()
    {
        int choice = JOptionPane.showOptionDialog(null, "Select from ..","Notebook Menu",
                     JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, alternatives, alternatives[0]);
        return choice;
    }	

}
