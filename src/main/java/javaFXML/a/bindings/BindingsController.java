package javaFXML.a.bindings;

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

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("hai premuto il bottone");
        bindProperties();
    }

    public void bindProperties() {
        visualizza.textProperty().bind(inserimento.textProperty());
    }
}