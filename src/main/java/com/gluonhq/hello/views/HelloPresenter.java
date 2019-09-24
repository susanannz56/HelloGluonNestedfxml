package com.gluonhq.hello.views;

import com.gluonhq.charm.glisten.mvc.View;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import java.util.ResourceBundle;

public class HelloPresenter {

    @FXML View pane;
    @FXML
    private Button button;

    @FXML
    private Label label;

    @FXML
    private ResourceBundle resources;

    public void initialize() {
        button.setOnAction(e -> {
            label.setText(resources.getString("label.text") + " " + System.getProperty("javafx.version"));
            label.setVisible(! label.isVisible());
        });
    }

}
