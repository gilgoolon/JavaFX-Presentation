// This example is taken from the course's book "Java How to Program Early Objects 11th edition"

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class TransformExampleApp extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("TransformExampleApp.fxml"));
        Parent root = loader.load();

        Scene scene = new Scene(root);
        stage.setScene(scene);

        stage.setTitle("Transform Example");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
