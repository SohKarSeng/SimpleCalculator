package com.example.simplecalculator;

import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.scene.control.Button;

public class HelloController {

    private String inputs = "";
    private String operators = "";
    private float currentNumber = 0;
    private float previousNumber = 0;
    private float fresult = 0;
    private String result = "";
    @FXML
    private TextField inputText;
    @FXML
    private Label operatorLabel;

    @FXML
    protected void calculatorNumberButtonClick(ActionEvent event) {
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

    @FXML
    protected void calculatorOperatorButtonClick(ActionEvent event) {
        Button clickedButton = (Button) event.getSource();
        String buttonText = clickedButton.getText();
        operators = buttonText;
        operatorLabel.setText(buttonText);
        currentNumber = Float.parseFloat(inputs);
        inputs = "";
    }

    @FXML
    protected void calculatorEqualButtonClick() {
        previousNumber = currentNumber;
        currentNumber = Float.parseFloat(inputs);
        if (operators.equals("+")){
            result = Float.toString(previousNumber + currentNumber);
            currentNumber = previousNumber + currentNumber;
            inputText.setText(result);
        }
        if (operators.equals("-")){
            result = Float.toString(previousNumber - currentNumber);
            currentNumber = previousNumber - currentNumber;
            inputText.setText(result);
        }if (operators.equals("x")){
            result = Float.toString(previousNumber * currentNumber);
            currentNumber = previousNumber * currentNumber;
            inputText.setText(result);
        }
        if (operators.equals("/")){
            result = Float.toString(previousNumber / currentNumber);
            currentNumber = previousNumber / currentNumber;
            inputText.setText(result);
        }
    }

    @FXML
    protected void calculatorDelButtonClick() {
        if (!inputs.equals("")) {
            inputs = inputs.substring(0, inputs.length() - 1);
            inputText.setText(inputs);
        }
    }
}