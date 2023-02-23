package esercizio;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ClientMailApp extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(ClientMailApp.class.getResource("clientMail.fxml"));
        Scene scena = new Scene(loader.load());
        stage.setTitle("ClientMail");
        stage.setScene(scena);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
