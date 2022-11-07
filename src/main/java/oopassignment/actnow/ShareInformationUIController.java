package oopassignment.actnow;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ShareInformationUIController {
    @FXML
    private GridPane shareInformationPane;

    @FXML
    private Label downloadLabel;

    @FXML
    public void setContent(String filename) throws IOException {
        File targetFile = new File("guides/" + filename);
        Scanner scanner = new Scanner(targetFile);
        String title = scanner.nextLine().substring(2);
        String disaster = scanner.nextLine();
        downloadLabel.setText(disaster + " - " + title);
    }
}