package haywood.bcs345.lab.javafxtabpane;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TabTab extends Application {
	private TabPane m_tabPane;
	private Scene m_scene1;
	private Tab m_messagesTab, m_dataTab;
	private Label m_messagesLabel, m_fNameLabel, m_lNameLabel;
	private TextArea m_messagesTextArea, m_fNameTextArea;
	private Button m_inputButton;

	@Override
	public void start(Stage primaryStage) {
		m_tabPane = new TabPane();
		
		VBox messagesVBox = new VBox();
		m_messagesTab = new Tab("Messages");
		m_messagesTab.setClosable(false);
		m_tabPane.getTabs().add(m_messagesTab);
		m_messagesTab.setContent(messagesVBox);
		m_messagesLabel = new Label("Messages");
		messagesVBox.getChildren().add(m_messagesLabel);
		m_messagesTextArea = new TextArea();
		messagesVBox.getChildren().add(m_messagesTextArea);
		
		VBox dataVBox = new VBox();
		m_dataTab = new Tab("Data");
		m_dataTab.setClosable(false);
		m_tabPane.getTabs().add(m_dataTab);
		m_dataTab.setContent(dataVBox);
		m_fNameLabel = new Label("First Name");
		m_fNameTextArea = new TextArea();
		dataVBox.getChildren().add(m_fNameLabel);
		dataVBox.getChildren().add(m_fNameTextArea);
		m_inputButton = new Button("Input");
		
		m_inputButton.setOnAction(new EventHandler<ActionEvent>()
				{
					@Override public void handle(ActionEvent e)
					{
						String fName;
						fName = m_fNameTextArea.getText();
						m_fNameTextArea.setText("");
						
						m_messagesTextArea.setText(fName);
					}
				}
			);
		dataVBox.getChildren().add(m_inputButton);
		
		m_scene1 = new Scene(m_tabPane, 500, 300); // Not doing it like this in HW6
		
		primaryStage.setScene(m_scene1);
		//primaryStage.setHeight(500);
		//primaryStage.setWidth(500);
		primaryStage.setTitle("Lab – JavaFX TabPane");
		primaryStage.show();
	}
}
