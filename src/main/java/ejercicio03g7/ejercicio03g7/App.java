package ejercicio03g7.ejercicio03g7;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.*;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {
    	
    	Label lblUsuario = new Label("Usuario");
    	TextField txtUsuario = new TextField();
    	
    	Label lblPassword = new Label("Password");
    	PasswordField txtPassword = new PasswordField();
    	Button btnLogin = new Button("Login");
    	Button btnCancelar = new Button ("Cancelar");
    	
    	HBox filaUsuario = new HBox(lblUsuario,txtUsuario);
    	HBox filaPassword = new HBox(lblPassword,txtPassword);
    	HBox filaBotones = new HBox (btnLogin,btnCancelar);
    	VBox tabla = new VBox(filaUsuario,filaPassword,filaBotones);
    	
    	var scene = new Scene(tabla, 250, 150);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}