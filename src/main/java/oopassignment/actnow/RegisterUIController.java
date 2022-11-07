package oopassignment.actnow;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;

public class RegisterUIController {
    @FXML
    private GridPane registerPane;

    @FXML
    protected void signUpBtnClick() throws IOException {
        Stage stage = (Stage) registerPane.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(MainUIUser.class.getResource("mainuser-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 800, 600);
        stage.close();
        stage.setTitle("Read Information");
        stage.setScene(scene);
        stage.show();
    }
}