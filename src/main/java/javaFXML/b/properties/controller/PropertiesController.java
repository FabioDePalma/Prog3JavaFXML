package javaFXML.b.properties.controller;

import javaFXML.b.properties.model.Bill;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


import java.util.Random;

public class PropertiesController {
    private Bill electricBill = new Bill();
    private final Random r = new Random();
    @FXML
    private TextField billValue;
    @FXML
    private Label ris;

    @FXML
    protected void onHelloButtonClick() {
        ris.setText("Value of bill:"); // brutto...
        int i = r.nextInt(10000);
        electricBill.setAmountDue(new StringBuilder().append(i).toString());
    }

    public void bindProperties() {
        // Questa istruzione associa la SimpleStringPropert del textField billValue (billValue.textProperty())
        // alla SimpleStringProperty amountDueProperty di electricBill
        // Quindi ogni volta che amountDueProperty viene modificata,
        // si aggiorna la visualizzazione di billValue nella GUI.

        // Inoltre il binding tra queste due property
        // evita di definire un listener di cambiamento esplicito (ChangeListener)
        // Quindi semplifica il codice del controller
        billValue.textProperty().bind(electricBill.amountDueProperty());
        // questo listener rimane solo per poter scrivere su standard output il valore di amountDue
        // non serve per la visualizzazione sulla finestra dell'applicazione
        electricBill.amountDueProperty().addListener(new ChangeListener<String>() {
            public void changed(ObservableValue<? extends String> observableValue, String oldVal, String newVal) {
                System.out.println("Electric bill has changed to " + newVal + "!");
            }
        });
    }
}