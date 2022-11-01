package oopassignment.actnow;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;

public class WelcomeUIController {
    @FXML
    private GridPane welcomePane;
    @FXML
    protected void getStartedBtnClick() throws IOException {
        Stage stage = (Stage) welcomePane.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(LoginUI.class.getResource("login-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 430, 500);
        stage.close();
        stage.setTitle("Login to ActNow");
        stage.setScene(scene);
        stage.show();
    }
}