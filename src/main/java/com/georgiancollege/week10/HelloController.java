package com.georgiancollege.week10;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");

        ApiResponse apiResponse = ApiUtility.getDataFromAPIQuick("hulk");
        System.out.println(apiResponse);
    }
}