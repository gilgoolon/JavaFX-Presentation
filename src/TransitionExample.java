// This example is taken from the course's book "Java How to Program Early Objects 11th edition"

import javafx.animation.*;
import javafx.fxml.FXML;
import javafx.scene.paint.Color;
import javafx.scene.shape.LineTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.scene.shape.Rectangle;
import javafx.util.Duration;

public class TransitionExample {
    @FXML
    private Rectangle rectangle;

    @FXML
    void startButtonPressed(){
        FillTransition fillTransition = new FillTransition(Duration.seconds(1));
        fillTransition.setToValue(Color.CYAN);
        fillTransition.setCycleCount(2);
        fillTransition.setAutoReverse(true);

        StrokeTransition strokeTransition = new StrokeTransition(Duration.seconds(1));
        strokeTransition.setToValue(Color.BLUE);
        strokeTransition.setCycleCount(2);
        strokeTransition.setAutoReverse(true);

        ParallelTransition parallelTransition = new ParallelTransition(fillTransition, strokeTransition);

        FadeTransition fadeTransition = new FadeTransition(Duration.seconds(1));
        fadeTransition.setFromValue(1.0);
        fadeTransition.setToValue(0.0);
        fadeTransition.setCycleCount(2);
        fadeTransition.setAutoReverse(true);

        RotateTransition rotateTransition = new RotateTransition(Duration.seconds(1));
        rotateTransition.setToAngle(360.0);
        rotateTransition.setCycleCount(2);
        rotateTransition.setInterpolator(Interpolator.EASE_BOTH);
        rotateTransition.setAutoReverse(true);

        Path path = new Path(new MoveTo(45 ,45), new LineTo(45,0),
                new LineTo(90, 0), new LineTo(90, 90), new LineTo(0, 90));
        PathTransition pathTransition = new PathTransition(Duration.seconds(1), path);
        pathTransition.setCycleCount(2);
        pathTransition.setInterpolator(Interpolator.EASE_IN);
        pathTransition.setAutoReverse(true);

        ScaleTransition scaleTransition = new ScaleTransition(Duration.seconds(1));
        scaleTransition.setByX(0.75);
        scaleTransition.setByY(0.75);
        scaleTransition.setCycleCount(2);
        scaleTransition.setInterpolator(Interpolator.EASE_OUT);
        scaleTransition.setAutoReverse(true);

        SequentialTransition sequentialTransition = new SequentialTransition(rectangle,
                parallelTransition,fadeTransition, rotateTransition, pathTransition, scaleTransition);
        sequentialTransition.play();
    }
}
