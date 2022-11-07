package oopassignment.actnow;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;

public class ListFeedbackUIController {
    @FXML
    private GridPane listFeedbackPane;

    @FXML
    private ListView loopPane;

    @FXML
    protected static void reviewBtnClick(String filename) throws IOException {
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(LoginUI.class.getResource("readfeedback-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 800, 600);
        ReadFeedbackUIController controller = fxmlLoader.getController();
        controller.setContent(filename);
        stage.setTitle("Read Feedback (Admin-only)");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    protected void initialize() throws IOException {
        for (int i = 0; i < Feedback.getFeedbackCount(); i++) {
            FXMLLoader loader = new FXMLLoader(LoginUI.class.getResource("component-feedbacklist.fxml"));
            GridPane stockView = loader.load();
            FeedbackListComponentController controller = loader.getController();
            controller.setFeedbackTitle(Feedback.getFeedbackTitle(i));
            controller.setActionBtn(Feedback.getFeedbackFilename(i));
            loopPane.getItems().add(stockView);
        }
    }
}