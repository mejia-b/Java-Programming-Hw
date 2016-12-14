/*Brenda Mejia
 Program 14.2 Tic-Tac-Toe
 This program will display 
 x,o,or no image at random.
 December 13, 2016
*/


import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.layout.*;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
public class TicTacToe extends Application {

	public static void main(String[] args) {
		Application.launch(args);

	}//end of main


	public void start(Stage primaryStage) throws Exception {
		GridPane pane = new GridPane();
		pane.setPrefSize(6, 6);
		pane.setAlignment(Pos.CENTER);
		Image imageX = new Image("x.gif");
		Image imageO = new Image("o.gif");
	
		int index;
		for(int j = 0; j < 3; j++){
			for(int i = 0; i < 3; i++){
				index = (int)(Math.random() * 3);
				System.out.println(index);
				if(index == 1){
					pane.add(new ImageView(imageX), i, j);
				}
				else if (index == 0){
					pane.add(new ImageView(imageO), i, j);
					
				}//end of if statement
			}//end of inner for loop
		}//end of outer for loop 
		
		//Scene is created and placed in stage
		Scene scene = new Scene(pane,400,400);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Tic-Tac-Toe");
		primaryStage.show();
		
		
	}//end of start

}//end of TicTacToe class
