import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class BorderPaneExampleApp extends Application {
    @Override
    public void start(Stage stage) {
        Scene scene = new Scene(BorderPaneExample.createExample());
        String styleSheet = getClass().getResource("style.css").toExternalForm();
        scene.getStylesheets().add(styleSheet);
        stage.setTitle("BorderPane Example");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}