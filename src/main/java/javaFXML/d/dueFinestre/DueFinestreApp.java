package javaFXML.d.dueFinestre;

import javaFXML.d.dueFinestre.controller.Controller;
import javaFXML.d.dueFinestre.controller.Controller2;
import javaFXML.d.dueFinestre.model.Bill;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;


import java.io.IOException;
import java.net.URL;

public class DueFinestreApp extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Bill electricBill = new Bill(); // creo il model
        URL a = DueFinestreApp.class.getResource("prova.fxml");
        System.out.println(a);
        FXMLLoader fxmlLoader = new FXMLLoader(DueFinestreApp.class.getResource("prova.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 520, 440);
        stage.setTitle("Hello World!");
        stage.setScene(scene);
        Controller contr = fxmlLoader.getController();
        contr.initialize(electricBill);
        stage.show();

        FXMLLoader fxmlLoader2 = new FXMLLoader(DueFinestreApp.class.getResource("sample2.fxml"));
        Scene scene2 = new Scene(fxmlLoader2.load(), 320, 240);
        Stage stage2 = new Stage();
        stage2.setTitle("Hello World 2!");
        stage2.setScene(scene2);
        System.out.println("due");
        Controller2 contr2 = fxmlLoader2.getController();
        System.out.println("tre");
        contr2.initialize(electricBill);
        stage2.show();


    }

    public static void main(String[] args) {
        launch();
    }
}