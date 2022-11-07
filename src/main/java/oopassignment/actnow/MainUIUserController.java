package oopassignment.actnow;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.control.ListView;
import javafx.stage.Stage;

import java.io.IOException;

public class MainUIUserController {
    @FXML
    private GridPane mainUserPane;

    @FXML
    private ListView loopPane;

    @FXML
    protected static void readMoreBtnClick(String filename) throws IOException {
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(LoginUI.class.getResource("readinformation-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 800, 600);
        ReadInformationUIController controller = fxmlLoader.getController();
        controller.setContent(filename);
        stage.setTitle("Read Information");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    protected void initialize() throws IOException {
        for (int i = 0; i < MainforUser.getGuideCount(); i++) {
            FXMLLoader loader = new FXMLLoader(LoginUI.class.getResource("component-userguide.fxml"));
            GridPane stockView = loader.load();
            GuideUserComponentController controller = loader.getController();
            controller.setDisasterType(MainforUser.getGuideType(i));
            controller.setGuideTitle(MainforUser.getGuideTitle(i));
            controller.setActionBtn(MainforUser.getGuideFilename(i));
            loopPane.getItems().add(stockView);
        }
    }
}