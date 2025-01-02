package com.myprojects;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class PrimaryController {
    @FXML
    private Label currNumLabel;

    private static String currNumber = "";

    @FXML
    private void button0() {
        currNumber = currNumber + "0";
        showNum();
    }
    @FXML
    private void button1() {
        currNumber = currNumber + "1";
        showNum();
    }
    @FXML
    private void button2() {
        currNumber = currNumber + "2";
        showNum();
    }
    @FXML
    private void button3() {
        currNumber = currNumber + "3";
        showNum();
    }
    @FXML
    private void button4() {
        currNumber = currNumber + "4";
        showNum();
    }
    @FXML
    private void button5() {
        currNumber = currNumber + "5";
        showNum();
    }
    @FXML
    private void button6() {
        currNumber = currNumber + "6";
        showNum();
    }
    @FXML
    private void button7() {
        currNumber = currNumber + "7";
        showNum();
    }
    @FXML
    private void button8() {
        currNumber = currNumber + "8";
        showNum();
    }
    @FXML
    private void button9() {
        currNumber = currNumber + "9";
        showNum();
    }

    @FXML
    private void buttonAdd() {
        
    }
    @FXML
    private void buttonSub() {
        
    }
    @FXML
    private void buttonMult() {
        
    }
    @FXML
    private void buttonDivi() {
        
    }
    @FXML
    private void buttonEq() {
        
    }

    private void showNum() {
        currNumLabel.setText(currNumber);
    }
}
