package javaFXML.b.properties;

import javaFXML.b.properties.controller.PropertiesController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class PropertiesApp extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(PropertiesApp.class.getResource("propertiesView.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Binding with properties");
        stage.setScene(scene);
        PropertiesController contr = fxmlLoader.getController();
        contr.bindProperties();
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}