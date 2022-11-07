package oopassignment.actnow;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import org.commonmark.node.Node;
import org.commonmark.parser.Parser;
import org.commonmark.renderer.html.HtmlRenderer;

import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.util.Objects;
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

    }

    @FXML
    protected void submitBtnClick() throws IOException {
        JFrame f = new JFrame();
        System.out.println("Disaster: " + disasterField.getText());
        System.out.println("Title: " + titleField.getText());
        System.out.println("Content: " + bodyField.getText());

        JOptionPane.showMessageDialog(f, "Info is successfully edited into file");

        Stage stage = (Stage) editInformationPane.getScene().getWindow();
        stage.close();
    }
}