package oopassignment.actnow;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.layout.GridPane;

import java.io.IOException;

public class ProfileUIController {
    @FXML
    private GridPane profilePane;

    @FXML
    protected void logoutBtnClick() {
        Platform.exit();
    }
}