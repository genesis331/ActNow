package oopassignment.actnow;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

//import javax.swing.*;
import java.io.IOException;

public class LoginUIController {
    @FXML
    private GridPane loginPane;
    @FXML
    private TextField usernameField;
    @FXML
    private TextField passwordField;

    @FXML
    protected void loginBtnClick() throws IOException {
//        JFrame f = new JFrame();
//        JOptionPane.showMessageDialog(f,"Wrong username or password!");
        System.out.println("Username: " + usernameField.getText());
        System.out.println("Password: " + passwordField.getText());
        Stage stage = (Stage) loginPane.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(LoginUI.class.getResource("mainuser-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 800, 600);
        stage.close();
        stage.setTitle("Home Screen (User)");
        stage.setScene(scene);
        stage.show();
    }
}