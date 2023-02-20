package javaFXML.e.MVCTutorial;

import javaFXML.e.MVCTutorial.controller.EditorController;
import javaFXML.e.MVCTutorial.controller.HelloController;
import javaFXML.e.MVCTutorial.controller.ListController;
import javaFXML.e.MVCTutorial.controller.MenuController;
import javaFXML.e.MVCTutorial.model.DataModel;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

public class MVCTutorialApp extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        BorderPane root = new BorderPane();
        FXMLLoader listLoader = new FXMLLoader(getClass().getResource("list.fxml"));
        root.setCenter(listLoader.load());
        ListController listController = listLoader.getController();

        FXMLLoader editorLoader = new FXMLLoader(getClass().getResource("editor.fxml"));
        root.setRight(editorLoader.load());
        EditorController editorController = editorLoader.getController();

        FXMLLoader menuLoader = new FXMLLoader(getClass().getResource("menu.fxml"));
        root.setTop(menuLoader.load());
        MenuController menuController = menuLoader.getController();

        FXMLLoader provaLoader = new FXMLLoader(getClass().getResource("hello-view.fxml"));
        root.setBottom(provaLoader.load());
        HelloController helloController =  provaLoader.getController();

        DataModel model = new DataModel();
        listController.initModel(model);
        editorController.initModel(model);
        menuController.initModel(model);

        Scene scene = new Scene(root, 800, 600);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}