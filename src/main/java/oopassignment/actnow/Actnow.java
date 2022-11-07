package oopassignment.actnow;

import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Actnow {
    public static void main (String[] args) {
        Platform.startup(() -> {
            System.out.println("Guides status: " + MainforUser.checkGuides());
            FXMLLoader fxmlLoader = new FXMLLoader(WelcomeUI.class.getResource("welcome-view.fxml"));
            Scene scene = null;
            try {
                scene = new Scene(fxmlLoader.load(), 550, 620);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            Stage stage = new Stage();
            stage.setTitle("Welcome to ActNow");
            stage.setScene(scene);
            stage.show();
        });
    }
}
