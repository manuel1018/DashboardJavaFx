package application;
	
import application.controller.FileController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;


public class Main extends Application {
	private static final double WIDTH_DEFAULT = 1100;
	private static final double HEIGHT_DEFAULT= 600;
	
	@Override
	public void start(Stage primaryStage) {
		try {
			FXMLLoader fxmlLoader=new FXMLLoader (getClass().getResource("View.fxml"));
			FileController control=new FileController(primaryStage);
			fxmlLoader.setController(control);
			Pane root=fxmlLoader.load();
			Scene scene = new Scene(root,WIDTH_DEFAULT,HEIGHT_DEFAULT);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.initStyle(StageStyle.UNDECORATED);
			primaryStage.setTitle("Ingenierocrack el Dios de la programación");
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
