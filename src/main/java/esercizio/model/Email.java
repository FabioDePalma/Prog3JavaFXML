package esercizio.model;

import javafx.collections.ObservableList;

import java.util.List;

public class Email {
   private String idUtente;
   private Person mittente;
   private List<Person> dest;
   private String titolo;
   private String testo;


    public Email(String idUtente, Person mittente, List<Person> dest, String titolo, String testo) {
        this.mittente = mittente;
        this.dest = dest;
        this.titolo = titolo;
        this.testo = testo;
    }

}
