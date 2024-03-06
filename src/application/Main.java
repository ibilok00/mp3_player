package application;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	
	@Override
	public void start(Stage stage) throws IOException {
       
		Parent root = FXMLLoader.load(getClass().getResource("Display.fxml"));
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.setResizable(false);
		stage.show();
		
		stage.setOnCloseRequest(new EventHandler<WindowEvent>() {

		//if we need some clean-up before close, we can do it below
		@Override
		public void handle(WindowEvent arg0) {
				
			Platform.exit();
			System.exit(0);	
		}		
		});
	}	
	
	public static void main(String[] args) {
		launch(args);
	}
}
