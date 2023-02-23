package esercizio.model;

import javafx.beans.property.StringProperty;
import javafx.scene.image.Image;

public class Person {
    StringProperty mail;
    StringProperty nome;
    String cognome;
    Image img;

    public Person(StringProperty mail, StringProperty nome, String cognome) {
        this.mail = mail;
        this.nome = nome;
        this.cognome = cognome;
    }
    public Person(StringProperty mail, StringProperty nome, String cognome, Image img) {
        this.mail = mail;
        this.nome = nome;
        this.cognome = cognome;
        this.img = img;
    }

    public StringProperty mailProperty() {
        return mail;
    }
    public String getMail(){
        return mail.get();
    }
    public StringProperty NomeProperty(){
        return nome;
    }

    public String getNome() {
        return nome.get();
    }

    public String getCognome() {
        return cognome;
    }
}
