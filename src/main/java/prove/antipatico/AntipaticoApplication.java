package prove.antipatico;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class AntipaticoApplication extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(AntipaticoApplication.class.getResource("FabioAntipatico.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Il più antipatico del mondo!");
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {
        launch();
    }
}
