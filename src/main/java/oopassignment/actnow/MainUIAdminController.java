package oopassignment.actnow;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;

public class MainUIAdminController {
    @FXML
    private GridPane mainAdminPane;

    @FXML
    protected void modifyBtnClick() throws IOException {
        Stage stage = (Stage) mainAdminPane.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(LoginUI.class.getResource("readinformation-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 800, 600);
        stage.close();
        stage.setTitle("Read Information");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    protected void readFeedbackBtnClick() throws IOException {
        Stage stage = (Stage) mainAdminPane.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(LoginUI.class.getResource("readfeedback-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 800, 600);
        stage.close();
        stage.setTitle("Read Feedback (Admin-only)");
        stage.setScene(scene);
        stage.show();
    }
}