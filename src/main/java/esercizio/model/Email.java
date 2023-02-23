package esercizio.model;

import javafx.collections.ObservableList;

import java.util.List;

public class Email {
   private Person mittente;
   private List<Person> dest;
   private String titolo;
   private String testo;


    public Email(Person mittente, List<Person> dest, String titolo, String testo) {
        this.mittente = mittente;
        this.dest = dest;
        this.titolo = titolo;
        this.testo = testo;
    }

    public Person getMittente() {
        return mittente;
    }

    public List<Person> getDest() {
        return dest;
    }

    public String getTitolo() {
        return titolo;
    }

    public String getTesto() {
        return testo;
    }

   /* @Override
    public String toString() {
        return "Email{" +
                "mittente=" + mittente +
                ", dest=" + dest +
                ", titolo='" + titolo + '\'' +
                ", testo='" + testo + '\'' +
                '}';
    }*/

    @Override
    public String toString() {
        return String.join(" - ", List.of(this.mittente.getNome(), this.titolo));
    }
}
