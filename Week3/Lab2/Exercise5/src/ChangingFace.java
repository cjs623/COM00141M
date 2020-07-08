import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene; 
import javafx.scene.control.Button; 
import javafx.scene.layout.Background; 
import javafx.scene.layout.HBox; 
import javafx.scene.layout.VBox; 
import javafx.scene.paint.Color; 
import javafx.scene.shape.Arc; 
import javafx.scene.shape.ArcType; 
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Font; 
import javafx.scene.text.Text; 
import javafx.stage.Stage; 
import javafx.geometry.Pos;

public class ChangingFace extends Application {
	
	boolean[] smilePresent = new boolean[3];
	 // create and configure a smiling mouth (this is how it will start)    
	 Arc smileMouth = new Arc(125, 150, 45, 35, 0, -180);        
	 Arc frownMouth = new Arc(125, 150, 45, 35, 0, 180);          
	 Line thinkMouth = new Line(50,100,200,100);
		
	 
	 public ChangingFace() {
		 
		 smileMouth.setFill(Color.YELLOW);         
		 smileMouth.setStroke(Color.BLUE);         
		 smileMouth.setType(ArcType.OPEN);
		 
		 frownMouth.setFill(Color.YELLOW);         
		 frownMouth.setStroke(Color.BLUE);         
		 frownMouth.setType(ArcType.OPEN); 	
		 
		 thinkMouth.setFill(Color.YELLOW);  		 
		 thinkMouth.setStroke(Color.BLUE);			 
		 
	 }
	
	
	public void printout(String type,double len,double a, double b,ObservableList<Node> ol) {
		System.out.printf("type: %s, len: %s, x: %s, y: %s\n",type,len,a,b);
		for(int i =0;i< ol.size();i++) {
			System.out.println(ol.get(i));
		}
	}
	
	public boolean[] findSmiles(Group group) {
		boolean[] smilePresentOut = new boolean[3];
		
		smilePresentOut[0] = group.getChildren().contains(smileMouth);
		smilePresentOut[1] = group.getChildren().contains(thinkMouth);
		smilePresentOut[2] = group.getChildren().contains(frownMouth);
		
		return smilePresentOut;
		
	}
	
	 @Override     
	 public void start(Stage stage)     
	 { 
		 // create and configure the main circle for the face        
		 Circle face = new Circle(125, 125, 80);          
		 face.setFill(Color.YELLOW);         
		 face.setStroke(Color.RED);  
		 
		 // create and configure the circle for the right eye         
		 Circle rightEye = new Circle(86, 100, 10);         
		 rightEye.setFill(Color.YELLOW);         
		 rightEye.setStroke(Color.BLUE); 
		 
		 // create and configure the circle for the left eye         
		 Circle leftEye = new Circle(162, 100, 10);         
		 leftEye.setFill(Color.YELLOW);         
		 leftEye.setStroke(Color.BLUE);   
		 
 
		 
		 // create and configure the text        
		 Text caption = new Text(68, 240, "Changing Face");         
		 caption.setFill(Color.BLUE);         
		 caption.setFont(Font.font ("Verdana", 15));
		 
		 // create a group that holds all the features           
		 Group group = new Group(face, rightEye, leftEye, smileMouth,  caption); 
		 
		 // create a button that will make the face smile         
		 Button smileButton = new Button("Smile"); 
		 
		 // create a button that will make the face frown         
		 Button frownButton = new Button("Frown"); 
		 
		 // create a button that will make the face think         
		 Button thinkButton = new Button("Think");		 
	 
	     // create and configure a horizontal container to hold the buttons    
		 HBox buttonBox = new HBox(10);         
		 buttonBox.setAlignment(Pos.CENTER); 
		 
		 //add the buttons to the horizontal container         
		 buttonBox.getChildren().addAll(smileButton,thinkButton, frownButton);
		 
		 // create and configure a vertical container to hold the button box and the face group         
		 VBox root = new VBox(10); 
		 root.setBackground(Background.EMPTY);         
		 root.setAlignment(Pos.CENTER); 
		 
		 //add the button box and the face group to the vertical container         
		 root.getChildren().addAll(buttonBox, group);
		 
		 // create and configure a new scene         
		 Scene scene = new Scene(root, 250, 275, Color.YELLOW);		
		 
		 // supply the code that is executed when the smile button is pressed  
		 smileButton.setOnAction(e -> 	{
			 							smilePresent = findSmiles(group);			 							
										
										if(!smilePresent[0]) {
											if(smilePresent[1]) {
												group.getChildren().remove(thinkMouth);
												System.out.println("Removing Think Mouth");
											}
											if(smilePresent[2]) {
												group.getChildren().remove(frownMouth);
												System.out.println("Removing Frown Mouth");
											}											
											
											group.getChildren().add(smileMouth);
											System.out.println("Adding Smile Mouth");
										}
		 								}
			 					);
		 
		 // supply the code that is executed when the think button is pressed  
		 thinkButton.setOnAction(e -> 	{
			 							smilePresent = findSmiles(group);			 							
										
										if(!smilePresent[1]) {
											if(smilePresent[0]) {
												group.getChildren().remove(smileMouth);	
												System.out.println("Removing Smile Mouth");
											}
											if(smilePresent[2]) {
												group.getChildren().remove(frownMouth);
												System.out.println("Removing Frown Mouth");
											}											
											
											group.getChildren().add(thinkMouth);
											System.out.println("Adding Think Mouth");
										}										
										}
				 				);	
		 
		 // supply the code that is executed when the frown button is pressed   
		 frownButton.setOnAction(e -> 	{		 			 							
			 							smilePresent = findSmiles(group);
										if(!smilePresent[2]) {
											if(smilePresent[0]) {
												group.getChildren().remove(smileMouth);	
												System.out.println("Removing Smile Mouth");
											}
											if(smilePresent[1]) {
												group.getChildren().remove(thinkMouth);
												System.out.println("Removing Think Mouth");
											}											
											
											group.getChildren().add(frownMouth);
											System.out.println("Adding Frown Mouth");
										}		 							
			 							
										
										}
				 				);		 
		 
		 // add the scene to the stage, then set the title        
		 stage.setScene(scene);         
		 stage.setTitle("Changing Face");  
		 
		 // show the stage         
		 stage.show();             
	}         
	 
	 public static void main(String[] args)     
	 {         
		 launch(args);     
	 }
}
	


