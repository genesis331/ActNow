package oopassignment.actnow;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class LoginUIController {
    @FXML
    private TextField usernameField;
    @FXML
    private TextField passwordField;

    @FXML
    protected void loginBtnClick() {
        System.out.println("Username: " + usernameField.getText());
        System.out.println("Password: " + passwordField.getText());
    }
}