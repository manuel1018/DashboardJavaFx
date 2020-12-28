package application.controller;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuBar;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class FileController implements Initializable{
	
	 @FXML
	  private AnchorPane anchor;
	  @FXML
	  private VBox panelButtons;
	  @FXML
	  private BorderPane mainBoard;
	 // @FXML
	  //private TableView<FilesDescription> viewTable;
	  @FXML
	  private Button btnStart;	 
	  @FXML
	  private HBox textBoxPaths;
	  @FXML
	  private TextField typeArchive; 
	  @FXML
	  private TextField oldDrectory;
	  @FXML
	  private TextField newDirectory;
	  @FXML
	  private Label sideBoard;
	  @FXML 
	  private Label status;
	  @FXML
	  private MenuBar menuBar;
	  //@FXML
	  //private TableColumn<FilesDescription,String> nameColumn;
	  
	  
	  private Stage primaryStage;
	  
	  private List<String>filteredList;
	  
	  public FileController(Stage primaryStage) {
		  this.primaryStage=primaryStage;
	  }  
	  
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		mainBoard.prefHeightProperty().bind(anchor.heightProperty());
		mainBoard.prefWidthProperty().bind(anchor.widthProperty());		
		textBoxPaths.prefWidthProperty().bind(anchor.widthProperty());
		sideBoard.prefHeightProperty().bind(anchor.heightProperty());
		 menuBar.setOnMousePressed(pressEvent->{
		        menuBar.setOnMouseDragged(event->{  	        	
		        	primaryStage.setX(event.getScreenX() - pressEvent.getSceneX());
		        	primaryStage.setY(event.getScreenY() - pressEvent.getSceneY());
		        });
	        });
	}
	
	public void hello() {		
		System.out.println("anchor");			
	}
	
	public void search() {		
		System.out.println("search");	
	}
	
	public void change() {		
		System.out.println("change");		
	}
	
	 @FXML
	private void exit(ActionEvent event) {
		Platform.exit();
	}

}
