package it.hivan.bobteca;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class ModificaLibro {
    @FXML
    private void goToModificaLibro() throws IOException {
        App.setRoot("../modifica_libro/modifica_libro");
    }

    @FXML
    private TextField nuovoAutore;
    
    @FXML
    private void trySaveChanges(){

    }
}
