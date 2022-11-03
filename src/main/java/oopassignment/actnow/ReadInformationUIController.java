package oopassignment.actnow;

import javafx.fxml.FXML;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.web.WebView;
import org.commonmark.node.*;
import org.commonmark.parser.Parser;
import org.commonmark.renderer.html.HtmlRenderer;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Objects;
import java.util.Scanner;

public class ReadInformationUIController {
    @FXML
    private GridPane readInformationPane;
    @FXML
    private WebView webView;

    @FXML
    protected void initialize() throws FileNotFoundException {
        Parser parser = Parser.builder().build();
        File targetFile = new File("guides/blizzard-protectyourfamily.md");
        String content = new Scanner(targetFile).useDelimiter("\\Z").next();
        Node document = parser.parse(content);
        HtmlRenderer renderer = HtmlRenderer.builder().build();

        Font.loadFont(Objects.requireNonNull(ReadInformationUIController.class.getResource("Montserrat.ttf")).toExternalForm(), 12);
        webView.getEngine().loadContent("<style>* {font-family: 'Montserrat', Arial, Helvetica, sans-serif}body{padding: 30px}</style>" + "<body>" + renderer.render(document) + "</body>");
    }
}