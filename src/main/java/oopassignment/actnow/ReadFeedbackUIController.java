package oopassignment.actnow;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadFeedbackUIController {
    @FXML
    private GridPane readFeedbackPane;

    @FXML
    private Label titleField;

    @FXML
    private Label bodyField;

    @FXML
    public void setContent(String filename) throws IOException {
        File targetFile = new File("feedbacks/" + filename);
        Scanner scanner = new Scanner(targetFile);
        String title = scanner.nextLine();
        scanner.nextLine();
        String body = scanner.useDelimiter("\\Z").next();
        titleField.setText(title);
        bodyField.setText(body);
    }

    @FXML
    private void resolveBtnClick() throws IOException {
        Stage stage = (Stage) readFeedbackPane.getScene().getWindow();
        stage.close();
    }
}