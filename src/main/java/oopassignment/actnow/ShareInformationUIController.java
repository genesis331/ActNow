package oopassignment.actnow;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ShareInformationUIController {
    @FXML
    private GridPane shareInformationPane;

    @FXML
    private Label downloadLabel;

    @FXML
    private Label hiddenLabel;

    @FXML
    public void setContent(String filename) throws IOException {
        File targetFile = new File("guides/" + filename);
        Scanner scanner = new Scanner(targetFile);
        String title = scanner.nextLine().substring(2);
        String disaster = scanner.nextLine();
        downloadLabel.setText(disaster + " - " + title);
        hiddenLabel.setText(filename);
    }

    @FXML
    private void downloadBtnClick() throws IOException {
        String filename = hiddenLabel.getText();
        File targetFile = new File("guides/" + filename);
        String content = new Scanner(targetFile).useDelimiter("\\Z").next();

        File saveFile = new File("downloads/" + filename);
        java.io.FileWriter writer = new java.io.FileWriter(saveFile);
        writer.write(content);
        writer.close();

        JFrame f = new JFrame();
        JOptionPane.showMessageDialog(f, "File downloaded successfully!");

        Stage stage = (Stage) shareInformationPane.getScene().getWindow();
        stage.close();
    }
}