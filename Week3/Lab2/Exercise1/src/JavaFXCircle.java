
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
//import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class JavaFXCircle extends Application {
    public void start(Stage stage) {
        Line lineA = new Line();
        Line lineB = new Line();
        Line lineC = new Line();
        
        lineA.setStartX(50);
        lineA.setStartY(250);
        lineA.setEndX(350);
        lineA.setEndY(250);        
        
        lineB.setStartX(50);
        lineB.setStartY(250);
        lineB.setEndX(200);
        lineB.setEndY(50);   
        
        lineC.setStartX(200);
        lineC.setStartY(50);
        lineC.setEndX(350);
        lineC.setEndY(250);          
        
        Group root = new Group(lineA,lineB,lineC);
        Scene scene = new Scene(root, 400, 300);

        stage.setTitle("My JavaFX Application");
        stage.setScene(scene);
        stage.show();
    }

   
    public static void main(String[] args)     
    {         
    	launch(args);
    }   
}
