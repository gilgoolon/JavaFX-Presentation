import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Circle;

import java.util.Random;

public class ControllerExample {
    @FXML
    private Circle circle;
    private static final Random r = new Random();;

    @FXML
    void moveCircle(MouseEvent e){
        double x = circle.getCenterX();
        double y = circle.getCenterY();
        switch(r.nextInt(4)){
            case 0 -> circle.setCenterX(x + 10);
            case 1 -> circle.setCenterY(y + 10);
            case 2 -> circle.setCenterX(x - 10);
            case 3 -> circle.setCenterY(y - 10);
        }
    }
}
