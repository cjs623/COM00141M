

	import javafx.application.Application; 
	import javafx.geometry.Pos; 
	import javafx.scene.Scene; 
	import javafx.scene.control.Button; 
	import javafx.scene.control.Label; 
	import javafx.scene.control.TextField; 
	import javafx.scene.layout.VBox; 
	import javafx.scene.paint.Color; 
	import javafx.scene.text.Font; 
	import javafx.stage.Stage;
	
	public class PushMe extends Application 
	{ 
		@Override    
		public void start(Stage stage)     
		{ 
			// create and configure a text field for user entry        
			TextField pushMeTextField = new TextField();         
			pushMeTextField.setMaxWidth(250);
			
			// create and configure a label to display the output         
			Label pushMeLabel= new Label();         
			pushMeLabel.setTextFill(Color.RED);         
			pushMeLabel.setFont(Font.font("Arial", 20));
			
			// create and configure a label which will cause the text to be displayed        
			Button changeUpperBtn = new Button();         
			changeUpperBtn.setText("Change to Upper Case");         
			changeUpperBtn.setOnAction(e -> pushMeLabel.setText("Upper is: " + pushMeTextField.getText().toUpperCase()));
			
			// create and configure a label which will cause the text to be displayed        
			Button displayLengthBtn = new Button();         
			displayLengthBtn.setText("Length");         
			displayLengthBtn.setOnAction(e -> pushMeLabel.setText("Text length is: " + pushMeTextField.getText().length()));			
			
			// create and configure a VBox to hold our components               
			VBox root = new VBox();         
			root.setSpacing(10);         
			root.setAlignment(Pos.CENTER); 
			
			//add the components to the VBox         
			root.getChildren().addAll(pushMeTextField, changeUpperBtn,displayLengthBtn, pushMeLabel); 
	
	
			// create a new scene         
			Scene scene = new Scene(root, 350, 150);  
			
			//add the scene to the stage, then configure the stage and make it visible        
			stage.setScene(scene);         
			stage.setTitle("Push Me");         
			stage.show();             
	}     

	public static void main(String[] args)     
	{         
		launch(args);     
	} 
}



