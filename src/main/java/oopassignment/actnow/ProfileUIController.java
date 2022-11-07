package oopassignment.actnow;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;

public class ProfileUIController {
    @FXML
    private GridPane profilePane;

    @FXML
    protected void logoutBtnClick() throws IOException {
        Platform.exit();
    }
}