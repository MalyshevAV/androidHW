
package com.javafx.myfirstapp;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button forgotPasswordButton;

    @FXML
    private Button logginSignUpButton;

    @FXML
    private TextField loginField;

    @FXML
    private TextField passWordField;

    @FXML
    private Button signUpField;

    @FXML
    void initialize() {
        signUpField.setOnAction(event -> System.out.println("Вы нажали на кнопку войти"));
    }

}

