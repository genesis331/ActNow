package oopassignment.actnow;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

//import javax.swing.*;
import java.io.IOException;

public class LoginUIController {
    @FXML
    private GridPane loginPane;
    @FXML
    private TextField usernameField;
    @FXML
    private TextField passwordField;

    @FXML
    protected void loginBtnClick() throws IOException {
        System.out.println("Username: " + usernameField.getText());
        System.out.println("Password: " + passwordField.getText());
        Stage stage = (Stage) loginPane.getScene().getWindow();
        LoginPage.validateLogin(usernameField.getText(), passwordField.getText(), stage);
    }

    @FXML
    protected void signUpBtnClick() throws IOException {
        Stage stage = (Stage) loginPane.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(LoginUI.class.getResource("register-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 430, 500);
        stage.close();
        stage.setTitle("Sign Up for ActNow");
        stage.setScene(scene);
        stage.show();
    }
}