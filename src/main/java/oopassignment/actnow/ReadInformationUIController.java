package oopassignment.actnow;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.web.WebView;
import javafx.stage.Stage;
import org.commonmark.node.*;
import org.commonmark.parser.Parser;
import org.commonmark.renderer.html.HtmlRenderer;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;

public class ReadInformationUIController {
    @FXML
    private GridPane readInformationPane;
    @FXML
    private WebView webView;

    @FXML
    public void setContent(String filename) throws IOException {
        Parser parser = Parser.builder().build();
        File targetFile = new File("guides/" + filename);
        String content = new Scanner(targetFile).useDelimiter("\\Z").next();
        Node document = parser.parse(content);
        HtmlRenderer renderer = HtmlRenderer.builder().build();

        Font.loadFont(Objects.requireNonNull(ReadInformationUIController.class.getResource("Montserrat.ttf")).toExternalForm(), 12);
        webView.getEngine().loadContent("<style>* {font-family: 'Montserrat', Arial, Helvetica, sans-serif}body{padding: 30px}</style>" + "<body>" + renderer.render(document) + "</body>");
    }
}