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
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(LoginUI.class.getResource("editinformation-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 800, 600);
        stage.setTitle("Edit Information (Admin-only)");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    protected void createNewBtnClick() throws IOException {
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(LoginUI.class.getResource("createinformation-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 800, 600);
        stage.setTitle("Create Information (Admin-only)");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    protected void readFeedbackBtnClick() throws IOException {
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(LoginUI.class.getResource("readfeedback-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 800, 600);
        stage.setTitle("Read Feedback (Admin-only)");
        stage.setScene(scene);
        stage.show();
    }
}