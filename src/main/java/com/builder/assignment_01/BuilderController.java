package com.builder.assignment_01;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class BuilderController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}