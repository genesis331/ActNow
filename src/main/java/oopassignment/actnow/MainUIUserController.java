package oopassignment.actnow;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.control.ListView;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class MainUIUserController {
    @FXML
    private GridPane mainUserPane;

    @FXML
    private ListView loopPane;

    @FXML
    private Label recordNum;

    @FXML
    private TextField searchField;

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
    protected static void shareBtnClick(String filename) throws IOException {
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(LoginUI.class.getResource("shareinformation-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 430, 500);
        ShareInformationUIController controller = fxmlLoader.getController();
        controller.setContent(filename);
        stage.setTitle("Share Information");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    protected void aboutBtnClick() throws IOException {
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(LoginUI.class.getResource("about-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 350, 520);
        stage.setTitle("About ActNow");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    protected void profileBtnClick() throws IOException {
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(LoginUI.class.getResource("profile-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 800, 600);
        stage.setTitle("User Profile");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    protected void createNewBtnClick() throws IOException {
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(LoginUI.class.getResource("createfeedback-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 800, 600);
        stage.setTitle("Create Feedback (User-only)");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    protected void searchBtnClick() throws IOException {
        loopPane.getItems().clear();
        String searchStrPass = searchField.getText().replaceAll("\\s+","").toLowerCase();
        ArrayList<Integer> searchResult = MainforUser.searchGuideFilename(searchStrPass);
        recordNum.setText(searchResult.size() + " record(s) found");
        for (Integer fileIndex : searchResult) {
            FXMLLoader loader = new FXMLLoader(LoginUI.class.getResource("component-userguide.fxml"));
            GridPane stockView = loader.load();
            GuideUserComponentController controller = loader.getController();
            controller.setDisasterType(MainforUser.getGuideType(fileIndex));
            controller.setGuideTitle(MainforUser.getGuideTitle(fileIndex));
            controller.setActionBtn(MainforUser.getGuideFilename(fileIndex));
            loopPane.getItems().add(stockView);
        }
    }

    @FXML
    protected void initialize() throws IOException {
        recordNum.setText(MainforUser.getGuideCount() + " record(s) found");
        int counter = 0;
        do {
            FXMLLoader loader = new FXMLLoader(LoginUI.class.getResource("component-userguide.fxml"));
            GridPane stockView = loader.load();
            GuideUserComponentController controller = loader.getController();
            controller.setDisasterType(MainforUser.getGuideType(counter));
            controller.setGuideTitle(MainforUser.getGuideTitle(counter));
            controller.setActionBtn(MainforUser.getGuideFilename(counter));
            controller.setShareBtn(MainforUser.getGuideFilename(counter));
            loopPane.getItems().add(stockView);
            counter++;
        } while (counter < MainforUser.getGuideCount());
    }
}