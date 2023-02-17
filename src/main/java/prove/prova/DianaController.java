package prove.prova;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class DianaController {
    @FXML
    private Label etichettaa;
    @FXML
    private Button cambia;

    @FXML
    public void bottone() {
        etichettaa.setText("spero funzioni");
    }

    public void cambiaTitolo() {
        cambia.setText("cambio");
    }
}
