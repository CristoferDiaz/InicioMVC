package dad.javafx.login;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class LoginController {

	private LoginView view = new LoginView();
	
	public LoginController() {
		
		view.getLoginButtom().setOnAction(e -> onLoginButtonAction(e));
	}
	
	private void onLoginButtonAction(ActionEvent e) {
		String username = view.getUserText().getText();
		String password = view.getPassText().getText();
		String auth = view.getAuthModesCombo().getSelectionModel().getSelectedItem() ;
		
		Alert alert = new Alert(AlertType.INFORMATION);
		//alert.initOwner(primaryStage);
		alert.setHeaderText("Intento de inicio de sesion");
		alert.setContentText(
				"Usuario: "+username+"\n"+
				"Contraseña: "+password+"\n"+
				"Modo de autentificacion: "+ auth+"\n"
				);
		alert.showAndWait();
		Platform.exit();
	}

	public LoginView getView() {
		return view;
	}

}
