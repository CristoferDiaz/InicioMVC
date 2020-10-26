package dad.javafx.login;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class LoginView extends VBox {
	private Label userLabel, passLabel;
	private TextField userText;
	private PasswordField passText;
	private ComboBox<String> authModesCombo;
	private Button loginButtom;
	
	public LoginView() {
		super();
		userLabel = new Label("Usuario:");
		userLabel.setMinWidth(80);
		
		passLabel = new Label("contraseña:");
		passLabel.setMinWidth(80);
		
		userText=new TextField();
		userText.setPromptText("contraseña");
		userText.setMaxWidth(80);
		
		passText = new PasswordField();
		passText.setPromptText("contraseña");
		passText.setMaxWidth(80);
		
		authModesCombo = new ComboBox<String>();
		authModesCombo.getItems().addAll("cuenta local","LDAP","base de datos");
		authModesCombo.setPromptText("modo de auntentificacion");
		
		loginButtom = new Button("Acceder");
		loginButtom.setDefaultButton(true);
		HBox userBox = new HBox(5,userLabel,userText);
		userBox.setAlignment(Pos.CENTER);

		
		HBox passBox = new HBox(5,passLabel,passText);
		passBox.setAlignment(Pos.CENTER);
		
		HBox authBox = new HBox(5,authModesCombo,loginButtom);
		authBox.setAlignment(Pos.CENTER);
		
		setSpacing(5);
		getChildren().addAll(userBox,passBox,authBox);
		setAlignment(Pos.CENTER);
	}

	public Label getUserLabel() {
		return userLabel;
	}

	public Label getPassLabel() {
		return passLabel;
	}

	public TextField getUserText() {
		return userText;
	}

	public PasswordField getPassText() {
		return passText;
	}

	public ComboBox<String> getAuthModesCombo() {
		return authModesCombo;
	}

	public Button getLoginButtom() {
		return loginButtom;
	}
	
}
