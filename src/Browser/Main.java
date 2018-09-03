package Browser;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.VBox;
import javafx.scene.web.WebEngine;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	
	@Override
	public void start(Stage primaryStage) {
		try {
			//Below code creates the window and UI content
			VBox root = (VBox) FXMLLoader.load(getClass().getResource("/Browser/Titan.fxml"));
			Scene scene = new Scene(root, 1100, 600);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.setTitle("Titan");
			primaryStage.getIcons().add(new Image(Main.class.getResourceAsStream("titans logo.png")));
			primaryStage.setResizable(false);
			primaryStage.show();			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
