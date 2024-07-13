package com.example.simplecalculator;

import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;

public class HelloController {

    public String inputs = "";
    @FXML
    private TextField inputText;

    @FXML
    protected void calculatorButtonClick(ActionEvent event) {
        Button clickedButton = (Button) event.getSource();
        String buttonText = clickedButton.getText();
        if (inputs.equals("")) {
            inputs = buttonText;
        }
        else {
            inputs += buttonText;
        }
        inputText.setText(inputs);
    }
}