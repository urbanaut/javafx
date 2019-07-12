package sample;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    public TextField textfield;

    public void initialize() {
        textfield.setText("This is set by the controller");
    }
}
