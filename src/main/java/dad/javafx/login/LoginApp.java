package dad.javafx.login;

import javafx.application.Application;
import javafx.stage.Stage;

public class LoginApp extends Application{

	private LoginController controller = new LoginController();
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		
		Scene scene = new Scene(controller.getView(),320,200);
		
		Stage stage = new Stage();
		stage.setTitle("inciar sesion");
		stage.setScene(scene);
		stage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
