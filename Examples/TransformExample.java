import javafx.fxml.FXML;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.scene.transform.Transform;

import java.security.SecureRandom;

public class TransformExample {
    @FXML private Pane pane;
    private static final SecureRandom random = new SecureRandom();

    @FXML
    void initialize(){
        Double[] points = {205.0,150.0, 217.0,186.0, 259.0,186.0, 223.0,204.0,
                233.0,246.0, 205.0,222.0, 177.0,246.0, 187.0,204.0, 151.0,186.0, 193.0,186.0};

        for (int count = 0; count < 18; count++){
            Polygon star = new Polygon();
            star.getPoints().addAll(points);

            star.setStroke(Color.GREY);
            star.setFill(Color.rgb(random.nextInt(255), random.nextInt(255), random.nextInt(255), random.nextDouble()));

            star.getTransforms().add(Transform.rotate(count*20, 150, 150));
            pane.getChildren().add(star);
        }
    }
}
