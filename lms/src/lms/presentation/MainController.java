package lms.presentation;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainController {

	public void loadLoginWIndow(Stage stage) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("loginWindow.fxml"));
		Scene scene = new Scene(root, 400, 400);
		
		stage.setScene(scene);
		 //scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		stage.show();
	}

	public void loadAdminWindow() {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("AdminWindow.fxml"));
			Scene scene = new Scene(root, 400, 400);
			Stage stage = new Stage();
			stage.setScene(scene);
			stage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void loadLibrarianWindow() {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("LibrarianForm.fxml"));
			Scene scene = new Scene(root, 400, 400);
			Stage stage = new Stage();
			stage.setScene(scene);
			stage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void loadBothWindow() {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("BothWindow.fxml"));
			Scene scene = new Scene(root, 400, 400);
			Stage stage = new Stage();
			stage.setScene(scene);
			stage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
