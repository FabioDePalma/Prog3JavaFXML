package prove.antipatico;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
public class AntipaticoController {
    @FXML
    private Label fabio;
    @FXML
    private Button antipatico1;
    @FXML
    private Button antipatico2;

    @FXML
    protected void button1(){
        fabio.setText("SUUUUPER ANTIPIATICOOOO!");
    }

    public void button2(ActionEvent actionEvent) {
    }
}
