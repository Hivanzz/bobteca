package it.hivan.bobteca;

import java.io.IOException;
import javafx.fxml.FXML;

public class Ricerca {
    @FXML
    private void goToLibroSpecifico() throws IOException {
        App.setRoot("nuovo_libro_specifico/nuovo_libro_specifico");
    }
}