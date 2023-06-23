import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

public class FieldButtonExample {

    public static Pane createExample(){
        Pane pane = new Pane();
        pane.setPrefHeight(100);
        pane.setPrefWidth(200);
        TextField tf = new TextField();
        tf.setPromptText("Enter your name...");
        Label label = new Label();
        label.setLayoutY(50);
        pane.getChildren().add(label);
        pane.getChildren().add(tf);
        Button btn = new Button();
        btn.setOnAction((e) -> label.setText("Hello, " + tf.getText() + " !"));
        pane.getChildren().add(btn);
        btn.setText("Press Me !");
        btn.setLayoutX(100);
        btn.setLayoutY(50);
        return pane;
    }
}
