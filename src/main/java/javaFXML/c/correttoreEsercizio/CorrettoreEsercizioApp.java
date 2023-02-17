package javaFXML.c.correttoreEsercizio;

import javaFXML.c.correttoreEsercizio.controller.CorrettoreEsercizioController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class CorrettoreEsercizioApp extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        URL a = CorrettoreEsercizioApp.class.getResource("correttoreEsercizioView.fxml");
        System.out.println(a);
        FXMLLoader fxmlLoader = new FXMLLoader(CorrettoreEsercizioApp.class.getResource("correttoreEsercizioView.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        CorrettoreEsercizioController contr = fxmlLoader.getController();
        contr.initModel();
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}