import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class HBoxExampleApp extends Application {
    @Override
    public void start(Stage stage) {
        Scene scene = new Scene(HBoxExample.createExample());
        String styleSheet = getClass().getResource("style.css").toExternalForm();
        scene.getStylesheets().add(styleSheet);

        stage.setTitle("HBox Example");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}