package esercizio.model;

import javafx.beans.property.ListProperty;
import javafx.beans.property.SimpleListProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.ArrayList;

public class Client {
    //lista di mail osservabile
    ObservableList<Email> listMailObs;

    //listMail con property cosi possiamo fare il binding
    ListProperty<Email> emailList;
    StringProperty utente;

    public Client(String indirizzoMail){
        this.listMailObs = FXCollections.observableList(new ArrayList<>());
        this.emailList = new SimpleListProperty<>();
        this.emailList.set(listMailObs);
        this.utente = new SimpleStringProperty();
    }

    //Indirizzo dell'utente
    public StringProperty utenteProperty(){
        return utente;
    }

    //lista di mail
    public ListProperty<Email> emailListProperty(){
        return emailList;
    }

}
