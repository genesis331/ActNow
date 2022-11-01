package oopassignment.actnow;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class LoginUIController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}