package oopassignment.actnow;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import javax.swing.*;
import java.io.IOException;
import java.io.PrintWriter;

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
        JFrame f = new JFrame();
        System.out.println("Disaster: " + disasterField.getText());
        System.out.println("Title: " + titleField.getText());
        System.out.println("Content: " + bodyField.getText());

        String disasterTypeName = disasterField.getText().replaceAll("\\s+","").toLowerCase();
        String titleName = titleField.getText().replaceAll("\\s+","").toLowerCase();

        JOptionPane.showMessageDialog(f, "File is created successfully with info");

        try (PrintWriter out = new PrintWriter("guides/" + disasterTypeName + "-" + titleName + ".md")) {
            out.println("# " + titleField.getText() + "\n" + disasterField.getText() + "\n\n" + bodyField.getText());
        }

        Stage stage = (Stage) createInformationPane.getScene().getWindow();
        stage.close();
    }
}