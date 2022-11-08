package oopassignment.actnow;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;

public class MainUIAdminController {
    @FXML
    private GridPane mainAdminPane;

    @FXML
    private ListView loopPane;

    @FXML
    private Label recordNum;

    @FXML
    private TextField searchField;

    @FXML
    protected static void modifyBtnClick(String filename) throws IOException {
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(LoginUI.class.getResource("editinformation-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 800, 600);
        EditInformationUIController controller = fxmlLoader.getController();
        controller.setContent(filename);
        stage.setTitle("Edit Information (Admin-only)");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    protected void createNewBtnClick() throws IOException {
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(LoginUI.class.getResource("createinformation-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 800, 600);
        stage.setTitle("Create Information (Admin-only)");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    protected void readFeedbackBtnClick() throws IOException {
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(LoginUI.class.getResource("listfeedback-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 800, 600);
        stage.setTitle("All Feedbacks (Admin-only)");
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
    protected void searchBtnClick() throws IOException {

    }

    @FXML
    protected void initialize() throws IOException {
        recordNum.setText(MainforUser.getGuideCount() + " record(s) found");
        int counter = 0;
        do {
            FXMLLoader loader = new FXMLLoader(LoginUI.class.getResource("component-adminguide.fxml"));
            GridPane stockView = loader.load();
            GuideAdminComponentController controller = loader.getController();
            controller.setDisasterType(MainforUser.getGuideType(counter));
            controller.setGuideTitle(MainforUser.getGuideTitle(counter));
            controller.setActionBtn(MainforUser.getGuideFilename(counter));
            loopPane.getItems().add(stockView);
            counter++;
        } while (counter < MainforUser.getGuideCount());
    }
}