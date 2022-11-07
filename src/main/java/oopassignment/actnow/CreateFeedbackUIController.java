package oopassignment.actnow;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import javax.swing.*;
import java.io.IOException;

public class CreateFeedbackUIController {
    @FXML
    private GridPane createFeedbackPane;

    @FXML
    private TextField titleField;

    @FXML
    private TextArea bodyField;

    @FXML
    protected void submitBtnClick() throws IOException {
        JFrame f = new JFrame();
        System.out.println("Title: " + titleField.getText());
        System.out.println("Content: " + bodyField.getText());

        if((titleField.getText().isEmpty()) || (titleField.getText() == null)) {
            JOptionPane.showMessageDialog(f, "Title must be filled.");
        }

        else if((bodyField.getText().isEmpty()) || (bodyField.getText() == null)) {
            JOptionPane.showMessageDialog(f, "Content must be filled.");
        }

        else {
            String text1 = "Thank You for Your Feedback!\n";
            String text2 = "We Really Appreciate Your Opinions!\n\n";
            String text3 = "Name: " + "User" + "\nTitle: " + titleField.getText() + "\nFeedback: " + bodyField.getText();
            String display = text1 + text2 + text3;
            JOptionPane.showMessageDialog(f, display);

            Stage stage = (Stage) createFeedbackPane.getScene().getWindow();
            stage.close();
        }
    }
}