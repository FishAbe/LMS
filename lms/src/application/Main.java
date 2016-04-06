package application;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.stage.Stage;
import lms.presentation.MainController;



public class Main extends Application {
	@Override
	public void start(Stage primaryStage) throws IOException {
		try {
			MainController window= new MainController();
			window.loadLoginWIndow(primaryStage);
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
