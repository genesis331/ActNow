package oopassignment.actnow;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

import java.io.IOException;

public class CreateInformationUIController {
    @FXML
    private GridPane createInformationPane;

    @FXML
    private TextField disasterField;

    @FXML
    private TextField titleField;

    @FXML
    private TextArea bodyField;

    @FXML
    protected void submitBtnClick() throws IOException {
        System.out.println("Disaster: " + disasterField.getText());
        System.out.println("Title: " + titleField.getText());
        System.out.println("Content: " + bodyField.getText());
    }
}