package lms.presentation;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import lms.business.Employee;
import lms.business.EmployeeRole;
import lms.business.Service;

public class LoginController implements Initializable{
    
	
	@FXML private TextField txtUserName;
	@FXML private PasswordField txtPassword;
	@FXML private Button btnLogin;
	
	  
	  public void loginClick(ActionEvent event){
		  Employee currentUser=Service.getUser(txtUserName.getText(), txtPassword.getText());
		  MainController main=new MainController();
		if (currentUser != null) {

			if (currentUser.getEmployeeRole() == EmployeeRole.ADMIN) {
				main.loadAdminWindow();
			} else if (currentUser.getEmployeeRole() == EmployeeRole.LIBRARIAN) {
				main.loadLibrarianWindow();
			} else if (currentUser.getEmployeeRole() == EmployeeRole.BOTH) {
				main.loadBothWindow();
			}
			Stage stage = (Stage) btnLogin.getScene().getWindow();
    		stage.close();
		} else {
			// display error message here
		}
		  
	  }
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
		
	}
	

	
}
