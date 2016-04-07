package lms.presentation;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class LibrarianController {
	@FXML
	TextField txfISBN;
	@FXML
	TextField txfLoanTo;
	@FXML
	Button btnSearchBook;
	@FXML
	Button btnCheckoutBook;
	
	public void clearIsbn (ActionEvent event) {
		
		txfISBN.clear();
	}
	
	

}
