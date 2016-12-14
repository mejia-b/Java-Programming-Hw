import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.scene.paint.Color;

public class ColorandFont extends Application  {

	public static void main(String[] args) {
		Application.launch(args);//call the start method
	}//end of main

	public void start(Stage primaryStage)throws Exception {
		GridPane pane = new GridPane();
		pane.setAlignment(Pos.CENTER);
		pane.setPrefSize(400, 300);
		//Declare an array of type Label
		Label[] lbl = new Label[5];
		//Initialize all labels
		for(int i = 0; i < 5; i++){
			lbl[i] = new Label("Java");
			lbl[i].setFont(Font.font("Times New Roman",FontWeight.BOLD,
					FontPosture.ITALIC,22));
		lbl[i].setTextFill(Color.color(Math.random(),Math.random(),Math.random(),0.80));
		pane.addColumn(2, lbl[i]);
		}//end of for loop
		
		//Rotate pane
		pane.setRotate(90);
		//Declare scene and pass in node,width,and size
		Scene scene = new Scene(pane,500,300);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Color and Font Program");
		primaryStage.show();
	}//end of start

}//end of ColorandFont class
