package esercizio.controller;

import esercizio.model.Client;
import esercizio.model.Email;
import esercizio.model.Person;
import javafx.beans.property.SimpleStringProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class ClientMailController {
    @FXML
    public ListView<Email> listEmail;
    @FXML
    public Label lblMittente;
    @FXML
    public Label lblDestinatario;
    @FXML
    public Label lblOggetto;
    @FXML
    public TextArea txtContenutoEmail;
    @FXML
    public Button btnElimina;

    @FXML
    public ImageView imgProfilo;
    @FXML
    public Label lblNomeUtente;

    private Client model;
    private Email mailSelezionata;

    public void initialize() throws FileNotFoundException {
        if(model != null)
            throw new IllegalStateException("model può essere inizializzato una volta sola");
        //istanza nuovo client
        File f = new File("src/main/resources/esercizio/images/img.png");
        Image immag = new Image(f.toURI().toString());
        imgProfilo.setImage(immag);

        Person giorgio = new Person(new SimpleStringProperty("giorgio@unito.it"), new SimpleStringProperty("Giorgio"), "Sonoio", imgProfilo.getImage());
        model = new Client(giorgio);

        model.importEmail();

        mailSelezionata = null;
        updateEmailArea(null);
        //binding tra listEmail e emailListProperty
        listEmail.itemsProperty().bind(model.emailListProperty());
        listEmail.setOnMouseClicked(e -> this.mostraEmailSelezionata());
        //colleghiamo il nome utente alla view
        lblNomeUtente.textProperty().bind(model.utenteProperty());

       // mailVuota = new Email(null, List.of(new Person(new SimpleStringProperty(" "),new SimpleStringProperty(" "),"")), "", "");

    }

    private void mostraEmailSelezionata(){
        Email email = listEmail.getSelectionModel().getSelectedItem();
        mailSelezionata = email;
        //settiamo la mail selezionata
        updateEmailArea(email);

    }
    public void onActionElimina() {
        model.eliminaEmail(mailSelezionata);
        updateEmailArea(null);
    }
    public void updateEmailArea(Email email){
        if(email != null){
            lblMittente.setText(email.getMittente().getMail());
            List<String> destinatari = new ArrayList<>();
            for (Person elem : email.getDest()) {
                destinatari.add(elem.getMail());
            }
            lblDestinatario.setText(String.join(", ", destinatari));
            lblOggetto.setText(email.getTitolo());
            txtContenutoEmail.setText(email.getTesto());
        }else{
            mailSelezionata = null;
            lblMittente.setText("");
            lblDestinatario.setText("");
            lblOggetto.setText("");
            txtContenutoEmail.setText("");
        }
    }

}
