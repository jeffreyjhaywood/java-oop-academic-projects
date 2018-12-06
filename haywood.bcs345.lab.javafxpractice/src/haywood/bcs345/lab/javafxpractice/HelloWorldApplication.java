package haywood.bcs345.lab.javafxpractice;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HelloWorldApplication extends Application {

	private Label m_greetingLabel;
	private Label m_otherLabel;
	private Button m_pressMe;
	
	@Override
	public void start(Stage primaryStage) {
		
		m_greetingLabel = new Label();
		m_greetingLabel.setText("Hello JavaFX");
		
		m_otherLabel = new Label();
		m_otherLabel.setText("Hello WORLD");
		
		m_pressMe = new Button();
		m_pressMe.setText("Press me");
		m_pressMe.setOnAction(new EventHandler<ActionEvent>() 
		{ 
			@Override public void handle(ActionEvent e) 
			{
				System.out.println("Button Pressed");
			} 
		}
	); 

		
		VBox vbox = new VBox();
		vbox.getChildren().add(m_greetingLabel);
		vbox.getChildren().add(m_otherLabel);
		vbox.getChildren().add(m_pressMe);
		
		Scene scene = new Scene(vbox, 500, 500);
		primaryStage.setScene(scene);
		primaryStage.show();
		primaryStage.setTitle("Test JavaFX");
		
		//primaryStage.setHeight(500);
		//primaryStage.setWidth(500);
		//primaryStage.show();

	}
}
