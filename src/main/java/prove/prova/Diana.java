package prove.prova;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Diana extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Diana.class.getResource("diana.fxml"));
        Scene scene = new Scene(fxmlLoader.load()) ;
        stage.setTitle("Maronn!");
        stage.setScene(scene);
        stage.show();
    }
}
