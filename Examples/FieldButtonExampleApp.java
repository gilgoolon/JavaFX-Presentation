import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class FieldButtonExampleApp extends Application {
    @Override
    public void start(Stage stage) {
        Scene scene = new Scene(FieldButtonExample.createExample());
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}