import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.Scene;
public class CheckerBoardFX extends Application {

	public static void main(String[] args) {
		Application.launch(args);//call the start method
		

	}//end of main 
	
	public void start(Stage primaryStage) throws Exception {
		GridPane pane = new GridPane();
		pane.setPrefSize(8, 8);
		Rectangle squares[] = new Rectangle[9];
		int counter = 1;
		for(int j = 1 ; j<=8; j++){
			for(int i = 1; i <= 8; i++){
				
				squares[i]  = new Rectangle(50,50);
				if((counter%2)== 0 )
				{
					squares[i].setFill(Color.BLACK);
				}
				else
				{
					squares[i].setFill(Color.WHITE);
				}
				
				counter++;
				
				pane.add(squares[i],i,j);
			}//end of for loop 
			
			counter++;
		}
		
		Scene scene = new Scene(pane,400,400);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Checker Board");
		primaryStage.show();
	}//end of start

}//end of CheckerBoard class
