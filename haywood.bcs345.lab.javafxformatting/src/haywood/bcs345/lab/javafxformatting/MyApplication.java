package haywood.bcs345.lab.javafxformatting;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MyApplication extends Application{

	private Label m_FirstLabel;
	private TextField m_FirstTextField;
	
	private Label m_LastLabel;
	private TextField m_LastTextField;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		VBox mainVBox = new VBox();
		
		HBox firstRowHBox = new HBox();
		m_FirstLabel = new Label("First");
		m_FirstTextField = new TextField();
		
		firstRowHBox.getChildren().add(m_FirstLabel);
		firstRowHBox.getChildren().add(m_FirstTextField);
		
		HBox secondRowHBox = new HBox();
		m_LastLabel = new Label("Last");
		m_LastTextField = new TextField();
		
		secondRowHBox.getChildren().add(m_LastLabel);
		secondRowHBox.getChildren().add(m_LastTextField);
		
		mainVBox.getChildren().add(firstRowHBox);
		mainVBox.getChildren().add(secondRowHBox);
		//mainVBox.getChildren().add(m_FirstLabel);
		//mainVBox.getChildren().add(m_FirstTextField);
		//mainVBox.getChildren().add(m_LastLabel);
		//mainVBox.getChildren().add(m_LastTextField);
		
		Scene scene = new Scene(mainVBox, 600, 600);
		
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}
