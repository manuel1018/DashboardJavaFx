package application;
	
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

//import com.mysql.cj.xdevapi.SessionFactory;

import application.controller.FileController;
import application.models.Trainer;
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
		setAndLoad();
		launch(args);
	}
	  
	public static void setAndLoad() {
		
		SessionFactory factory= new Configuration()
								.configure("hibernate.cfg.xml")///This is the default name,it's not necesary to be explicit
								.addAnnotatedClass(Trainer.class)// if the name as equal as this
								.buildSessionFactory();
		
		//Session session=factory.getCurrentSession();
		
		try {
			System.out.println("Creating a new object...");
			
			Trainer trainer=new Trainer("Wayne","Jhon","ABJM",600,40);
			
			/*Set<String>classes=trainer.getClasses();			    
			classes.add("Spinnig");
			classes.add("Yoga");
			classes.add("Aerobics");*/
			
			//session.beginTransaction();
			Session session = factory.openSession();
	        session.beginTransaction();
			
			System.out.println("Saving a new object...");
			
			session.save(trainer);
			
			session.getTransaction().commit();
			session.close();
			//factory.close();
			System.out.println("Object has been saved...");
		}finally { 
			//session.close();
			//factory.close();
		
		}
	} 
}
