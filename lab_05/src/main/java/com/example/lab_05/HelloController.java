package com.example.lab_05;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.shape.Circle;

public class HelloController {
    @FXML
    private Circle exercise_1_circle;

    @FXML
    private Button exercise_1_btn_enlarge;

    @FXML
    private Button exercise_1_btn_shrink;

    @FXML
    protected void exercise_1_btn_enlarge_click(){
        exercise_1_circle.setRadius(exercise_1_circle.getRadius() + 5);
    }

    @FXML
    protected void exercise_1_btn_shrink_click(){
        double circleSize = exercise_1_circle.getRadius() - 5;

        if(circleSize > 0){
            exercise_1_circle.setRadius(circleSize);
        }
    }
}