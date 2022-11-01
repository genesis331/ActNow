package oopassignment.actnow;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;

public class MainUIUserController {
    @FXML
    private GridPane mainUserPane;

    @FXML
    protected void readMoreBtnClick() throws IOException {
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(LoginUI.class.getResource("readinformation-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 800, 600);
        stage.setTitle("Read Information");
        stage.setScene(scene);
        stage.show();
    }
}