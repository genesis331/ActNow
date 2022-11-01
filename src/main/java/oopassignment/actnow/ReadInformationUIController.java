package oopassignment.actnow;

import javafx.fxml.FXML;
import javafx.scene.layout.GridPane;
import javafx.scene.web.WebView;
//import org.commonmark.node.*;
//import org.commonmark.parser.Parser;
//import org.commonmark.renderer.html.HtmlRenderer;

import java.net.URL;

public class ReadInformationUIController {
    @FXML
    private GridPane readInformationPane;
    @FXML
    private WebView webView;

//    Parser parser = Parser.builder().build();
//    Node document = parser.parse("This is *Sparta*");
//    HtmlRenderer renderer = HtmlRenderer.builder().build();

    @FXML
    protected void initialize() {
        webView.getEngine().loadContent("<b>asdf</b>");
    }
}