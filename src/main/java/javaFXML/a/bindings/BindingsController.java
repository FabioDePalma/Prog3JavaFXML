package javaFXML.a.bindings;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class BindingsController {

    @FXML
    private Label welcomeText;

    @FXML
    private TextField inserimento;

    @FXML
    private TextField visualizza;


    public void bindProperties() {
        visualizza.textProperty().bind(inserimento.textProperty());
    }

    public void onPressButtonClick(ActionEvent actionEvent) {
        welcomeText.setText("hai premuto il bottone");
        bindProperties();
    }
}