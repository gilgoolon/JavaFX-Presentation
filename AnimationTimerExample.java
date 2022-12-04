import javafx.animation.AnimationTimer;
import javafx.fxml.FXML;
import javafx.geometry.Bounds;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;

import java.security.SecureRandom;

public class AnimationTimerExample {
    @FXML
    private Circle circle;
    @FXML
    private Pane pane;

    @FXML
    void initialize(){
        SecureRandom random = new SecureRandom();

        AnimationTimer animationTimer = new AnimationTimer() {
            int dx = 1 + random.nextInt(5);
            int dy = 1 + random.nextInt(5);
            final int v = 60;
            long previousTime = System.nanoTime();

            @Override
            public void handle(long now) {
                double elapsed = (now - previousTime) / 1000000000.0;
                previousTime = now;
                double scale = elapsed * v;
                Bounds bounds = pane.getBoundsInLocal();
                circle.setLayoutX(circle.getLayoutX() + dx * scale);
                circle.setLayoutY(circle.getLayoutY() + dy * scale);

                if (hitRightOrLeft(bounds))
                    dx *= -1;
                if (hitTopOrBottom(bounds))
                    dy *= -1;
            }

            private boolean hitRightOrLeft(Bounds bounds){
                return (circle.getLayoutX() <= (bounds.getMinX() + circle.getRadius())) ||
                        (circle.getLayoutX() >= (bounds.getMaxX() - circle.getRadius()));
            }

            private boolean hitTopOrBottom(Bounds bounds){
                return (circle.getLayoutY() <= (bounds.getMinY() + circle.getRadius())) ||
                        (circle.getLayoutY() >= (bounds.getMaxY() - circle.getRadius()));
            }
        };
        animationTimer.start();
    }
}
