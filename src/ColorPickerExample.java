import javafx.scene.control.ColorPicker;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class ColorPickerExample {
    public static Pane createExample(){
        Pane pane = new Pane();
        pane.setPrefHeight(300);
        pane.setPrefWidth(300);
        Rectangle rec = new Rectangle(100,100);
        rec.setX(100);
        rec.setY(100);
        ColorPicker cp = new ColorPicker();
        pane.getChildren().add(cp);
        pane.getChildren().add(rec);
        cp.valueProperty().addListener((e) -> rec.setFill(cp.getValue()));
        cp.setValue(Color.LIME);
        return pane;
    }
}
