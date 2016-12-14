import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
public class Grid extends Application {

	public static void main(String[] args) {
		Application.launch(args);
	}//end of main 

	
	public void start(Stage primaryStage) throws Exception {
		Pane pane = new Pane();
		
		Line hLine1 = new Line(0,0,0,0);
		hLine1.setStroke(Color.BLUE);
		hLine1.startYProperty().bind(pane.heightProperty().divide(3));
		hLine1.endXProperty().bind(pane.widthProperty());
	    hLine1.endYProperty().bind(pane.heightProperty().divide(3));
		
	    Line hLine2 = new Line(0,0,0,0);
		hLine2.setStroke(Color.BLUE);
		hLine2.startYProperty().bind(pane.heightProperty().multiply(2).divide(3));
	    hLine2.endXProperty().bind(pane.widthProperty());
	    hLine2.endYProperty().bind(pane.heightProperty().multiply(2).divide(3));
	    
	    Line vLine1 = new Line(0,0,0,0);
	    vLine1.setStroke(Color.RED);
	    vLine1.startXProperty().bind(pane.widthProperty().divide(3));
	    vLine1.endYProperty().bind(pane.heightProperty());
	    vLine1.endXProperty().bind(pane.widthProperty().divide(3));
	    
	    Line vLine2 = new Line(0,0,0,0);
	    vLine2.setStroke(Color.RED);
	    vLine2.startXProperty().bind(pane.widthProperty().multiply(2).divide(3));
	    vLine2.endYProperty().bind(pane.heightProperty());
	    vLine2.endXProperty().bind(pane.widthProperty().multiply(2).divide(3));
		pane.getChildren().addAll(hLine1,hLine2,vLine1,vLine2);
		
		
		
		Scene scene = new Scene(pane,300,300);
		primaryStage.setScene(scene);
		primaryStage.setTitle("3 X 3 Grid");
		primaryStage.show();
	}//end of start

}//end of Grid class
