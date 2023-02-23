package esercizio.model;

import javafx.beans.property.ListProperty;
import javafx.beans.property.SimpleListProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.ArrayList;
import java.util.List;

public class Client {
    //lista di mail osservabile
    ObservableList<Email> listMailObs;

    //listMail con property cosi si aggiorna nella view
    ListProperty<Email> emailList;

    //Utente loggato
    Person utente;

    public Client(Person utente){
        this.listMailObs = FXCollections.observableList(new ArrayList<>());
        this.emailList = new SimpleListProperty<>();
        this.emailList.set(listMailObs);
        this.utente = utente;
    }

    //Indirizzo dell'utente
    public StringProperty utenteProperty(){
        return utente.mailProperty();
    }

    //lista di mail
    public ListProperty<Email> emailListProperty(){
        return emailList;
    }

    //elimina email
    public void eliminaEmail(Email email){
        listMailObs.remove(email);
    }

    public void importEmail(){

        Person fabio = new Person(new SimpleStringProperty("fabio@unito.it"), new SimpleStringProperty("Fabio"), "De Palma");
        Person diana = new Person(new SimpleStringProperty("diana@unito.it"), new SimpleStringProperty("Diana"), "Malaimare");
        Person tommaso = new Person(new SimpleStringProperty("tommaso@unito.it"), new SimpleStringProperty("Tommaso"), "Rodino");
        Person marta = new Person(new SimpleStringProperty("marta@unito.it"), new SimpleStringProperty("Marta"), "Gentile");
        Person gianna = new Person(new SimpleStringProperty("gianna@aulastudio.com"), new SimpleStringProperty("Gianna"), "Edisu");

         //noi siamo Giorgio
        List<Person> destf = new ArrayList<>();
        destf.add(utente);
        destf.add(diana);
        destf.add(tommaso);
        destf.add(marta);
        Email ef = new Email(fabio,destf,"Inzio Lezioni","Buongiorno, \nvi informo che il giorno 38 gennaio inizieranno le lezioni\n cordiali saluti\n Fabio.");

        List<Person> destd = new ArrayList<>();
        destd.add(fabio);
        destd.add(tommaso);
        destd.add(utente);
        Email ed = new Email(gianna,destd, "Ti puzzano i calzini","Buongiono, \na fronte delle numerose segnalazioni, i gentili studenti sono invitati a lavarsi i piedi. \n Cordiali Saluti, Gianna.");

        List<Person> destt = new ArrayList<>();
        destt.add(marta);
        destt.add(utente);
        Email et = new Email(tommaso, destt, "Dichiarazione","Cara Marta, \nti scrivo perchè è da tanto tempo che vorrei dirti questa cosa ma forse non ho il coraggio...");

        listMailObs.add(ef);
        listMailObs.add(ed);
        listMailObs.add(et);

    }

}
