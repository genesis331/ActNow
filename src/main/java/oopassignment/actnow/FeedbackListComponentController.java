package oopassignment.actnow;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.io.IOException;

public class FeedbackListComponentController {
    @FXML
    private Label feedbackTitle;

    @FXML
    private Button actionBtn;

    public void setFeedbackTitle(String title) {
        feedbackTitle.setText(title);
    }

    public void setActionBtn(String filename) {
        actionBtn.setOnAction(e -> {
            try {
                ListFeedbackUIController.reviewBtnClick(filename);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
    }
}
