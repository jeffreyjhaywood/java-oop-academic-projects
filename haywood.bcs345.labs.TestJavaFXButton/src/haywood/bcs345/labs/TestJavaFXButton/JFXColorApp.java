package haywood.bcs345.labs.TestJavaFXButton;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class JFXColorApp extends Application {
	private Button yellowButton, redButton, greenButton;
	private VBox vbox;
	private ComboBox<String> colorComboBox;
	private MenuBar menuBar;
	private Menu fileMenu;
	private MenuItem yellowMenuItem, redMenuItem, greenMenuItem;
	private ListView<String> namesListView;
	private ObservableList<String> namesOL;
	
	//private Visit m_Visit;
	
	@Override
	public void start(Stage primaryStage) {
		
		menuBar = new MenuBar();
		fileMenu = new Menu("File");
		yellowMenuItem = new MenuItem("Yellow");
		redMenuItem = new MenuItem("Red");
		greenMenuItem = new MenuItem("Green");
		
		menuBar.getMenus().add(fileMenu);
		fileMenu.getItems().add(yellowMenuItem);
		fileMenu.getItems().add(redMenuItem);
		fileMenu.getItems().add(greenMenuItem);
		
		yellowMenuItem.setOnAction( new EventHandler<ActionEvent>() {
		      public void handle(ActionEvent t) {
		            System.out.println("Yellow menu item selected.");
		            vbox.setStyle("-fx-background-color: #FFFF00;");
		      }
		   }
		);

		redMenuItem.setOnAction( new EventHandler<ActionEvent>() {
		      public void handle(ActionEvent t) {
		            System.out.println("Red menu item selected.");
		            vbox.setStyle("-fx-background-color: #FF0000;");
		      }
		   }
		);
		
		greenMenuItem.setOnAction( new EventHandler<ActionEvent>() {
		      public void handle(ActionEvent t) {
		            System.out.println("Green menu item selected.");
		            vbox.setStyle("-fx-background-color: #00FF00;");
		      }
		   }
		);
		
		yellowButton = new Button();
		yellowButton.setText("Yellow");
		yellowButton.setOnAction(new EventHandler<ActionEvent>()
			{
				@Override public void handle(ActionEvent e) 
				{
					System.out.println("Yellow button pressed");
					vbox.setStyle("-fx-background-color: #FFFF00;");
				} 
			}
		);
		
		redButton = new Button();
		redButton.setText("Red");
		redButton.setOnAction(new EventHandler<ActionEvent>()
			{
				@Override public void handle(ActionEvent e) 
				{
					System.out.println("Red button pressed");
					vbox.setStyle("-fx-background-color: #FF0000;");  
				} 
			}
		);
		
		greenButton = new Button();
		greenButton.setText("Green");
		greenButton.setOnAction(new EventHandler<ActionEvent>()
			{
				@Override public void handle(ActionEvent e) 
				{
					System.out.println("Green button pressed");
					vbox.setStyle("-fx-background-color: #00FF00;");
				} 
			}
		);
		
		colorComboBox = new ComboBox<String>();
		colorComboBox.getItems().add("Yellow");
		colorComboBox.getItems().add("Red");
		colorComboBox.getItems().add("Green");
		
		colorComboBox.setOnAction(new EventHandler<ActionEvent>() {
			@Override
				public void handle(ActionEvent event) {
			    	String selectedItem = colorComboBox.getSelectionModel().getSelectedItem();
			    	if (selectedItem.equals("Yellow"))  
			    	{
			          System.out.println("Yellow selected");
			        	  vbox.setStyle("-fx-background-color: #FFFF00;");
			    	}
			    	if (selectedItem.equals("Red")) 
			    	{
			          System.out.println("Red selected");
			          vbox.setStyle("-fx-background-color: #FF0000;");
			    	}
			    	if (selectedItem.equals("Green")) 
			       	{
			          System.out.println("Green selected");
			          vbox.setStyle("-fx-background-color: #00FF00;");
			       	}
			   }
		}
		);
		
		namesListView = new ListView<String>();
		namesOL = FXCollections.observableArrayList("A", "B", "C", "D");
		namesOL.add("Islanders"); // Added another item to the list
		//namesOL.clear();
		namesOL.add("Blue Jackets");
		namesListView.setItems(namesOL);
		
		vbox = new VBox();
		vbox.getChildren().add(menuBar); // MenuBar must always be at the top.
		vbox.getChildren().add(yellowButton);
		vbox.getChildren().add(redButton);
		vbox.getChildren().add(greenButton);
		vbox.getChildren().add(colorComboBox);
		vbox.getChildren().add(namesListView);
		
		Scene scene = new Scene(vbox, 500, 500);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("Lab - JavaFX Buttons");
		primaryStage.show();
	}
}
