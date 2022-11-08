package oopassignment.actnow;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class EditInformationUIController {
    @FXML
    private GridPane editInformationPane;

    @FXML
    private TextField disasterField;

    @FXML
    private TextField titleField;

    @FXML
    private TextArea bodyField;

    @FXML
    public void setContent(String filename) throws IOException {
        File targetFile = new File("guides/" + filename);
        Scanner scanner = new Scanner(targetFile);
        String title = scanner.nextLine().substring(2);
        String disaster = scanner.nextLine();
        scanner.nextLine();
        String body = scanner.useDelimiter("\\Z").next();
        titleField.setText(title);
        disasterField.setText(disaster);
        bodyField.setText(body);
    }

    @FXML
    protected void submitBtnClick() throws IOException {
        JFrame f = new JFrame();
        System.out.println("Disaster: " + disasterField.getText());
        System.out.println("Title: " + titleField.getText());
        System.out.println("Content: " + bodyField.getText());

        String disasterTypeName = disasterField.getText().replaceAll("\\s+","").toLowerCase();
        String titleName = titleField.getText().replaceAll("\\s+","").toLowerCase();

        try (PrintWriter out = new PrintWriter("guides/" + disasterTypeName + "-" + titleName + ".md")) {
            out.println("# " + titleField.getText() + "\n" + disasterField.getText() + "\n\n" + bodyField.getText());
        }

        JOptionPane.showMessageDialog(f, "Info is successfully edited into file");

        Stage stage = (Stage) editInformationPane.getScene().getWindow();
        stage.close();
    }
}