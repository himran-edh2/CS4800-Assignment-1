package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.geometry.Pos;
import javafx.scene.control.TextField;

public class calculator extends Application {
	private Label answerLabel;
	private TextField myTextField, myTextField2;
	private double calc;
	
	@Override
	public void start(Stage primaryStage) {
		Label label1 = new Label("Calculator");
		label1.setTextFill(Color.ORANGE);
		label1.setFont(Font.font("Verdana", 50));
		myTextField = new TextField();
		myTextField.setMaxWidth(200);
		myTextField2 = new TextField();
		myTextField2.setMaxWidth(200);
		Button button1 = new Button("+");
		button1.setOnAction(event -> {
			try {
		         Double toDouble = Double.valueOf(myTextField.getText());
		         Double toDouble2 = Double.valueOf(myTextField2.getText());
		         calc = toDouble + toDouble2;
		         answerLabel.setText("Result = " + Double.toString(calc));
		         answerLabel.setTextFill(Color.LIGHTGREEN);
		      }catch (NumberFormatException ex) {
		    	  answerLabel.setText("NOT VALID INPUT");
		    	  answerLabel.setTextFill(Color.RED);
		      }
		});
		Button button2 = new Button("-");
		button2.setOnAction(event -> {
			try {
		         Double toDouble = Double.valueOf(myTextField.getText());
		         Double toDouble2 = Double.valueOf(myTextField2.getText());
		         calc = toDouble - toDouble2;
		         answerLabel.setText("Result = " + Double.toString(calc));
		         answerLabel.setTextFill(Color.LIGHTGREEN);
		      }catch (NumberFormatException ex) {
		    	  answerLabel.setText("NOT VALID INPUT");
		    	  answerLabel.setTextFill(Color.RED);
		      }
		});
		Button button3 = new Button("×");
		button3.setOnAction(event -> {
			try {
		         Double toDouble = Double.valueOf(myTextField.getText());
		         Double toDouble2 = Double.valueOf(myTextField2.getText());
		         calc = toDouble * toDouble2;
		         answerLabel.setText("Result = " + Double.toString(calc));
		         answerLabel.setTextFill(Color.LIGHTGREEN);
		      }catch (NumberFormatException ex) {
		    	  answerLabel.setText("NOT VALID INPUT");
		    	  answerLabel.setTextFill(Color.RED);
		      }
		});
		Button button4 = new Button("÷");
		button4.setOnAction(event -> {
			try {
		         Double toDouble = Double.valueOf(myTextField.getText());
		         Double toDouble2 = Double.valueOf(myTextField2.getText());
		         if (toDouble2 == 0) {
		        	 answerLabel.setText("NOT VALID INPUT");
		        	 answerLabel.setTextFill(Color.GOLD);
		         }
		         else {
		        	 calc = toDouble / toDouble2;
			         answerLabel.setText("Result = " + Double.toString(calc));
			         answerLabel.setTextFill(Color.LIGHTGREEN);
		         }
		      }catch (NumberFormatException ex) {
		    	  answerLabel.setText("NOT VALID INPUT");
		    	  answerLabel.setTextFill(Color.RED);
		      }
		});
		answerLabel = new Label("Enter A Calculation");
		answerLabel.setTextFill(Color.WHITE);
		answerLabel.setFont(Font.font("Verdana", 40));
		HBox hbox = new HBox(20, button1, button2, button3, button4);
		hbox.setAlignment(Pos.CENTER);
		HBox hbox2 = new HBox(20, myTextField, myTextField2);
		hbox2.setAlignment(Pos.CENTER);
		VBox vbox = new VBox(20, label1, hbox2, hbox, answerLabel);
		vbox.setAlignment(Pos.CENTER);
		vbox.setStyle("-fx-background-color:#5a5d5d");
		Scene scene = new Scene(vbox, 600, 400);
		primaryStage.setTitle("CS4800 Assignment 1");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
