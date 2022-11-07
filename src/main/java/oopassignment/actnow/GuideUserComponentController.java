package oopassignment.actnow;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.io.IOException;

public class GuideUserComponentController {
    @FXML
    private Label disasterType;

    @FXML
    private Label guideTitle;

    @FXML
    private Button actionBtn;

    public void setDisasterType(String type) {
        disasterType.setText(type);
    }

    public void setGuideTitle(String title) {
        guideTitle.setText(title);
    }

    public void setActionBtn(String filename) {
        actionBtn.setOnAction(e -> {
            try {
                MainUIUserController.readMoreBtnClick(filename);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
    }
}
