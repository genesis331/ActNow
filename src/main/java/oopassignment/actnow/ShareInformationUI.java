package oopassignment.actnow;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ShareInformationUI extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(ShareInformationUI.class.getResource("shareinformation-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 430, 500);
        stage.setTitle("Share Information");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}