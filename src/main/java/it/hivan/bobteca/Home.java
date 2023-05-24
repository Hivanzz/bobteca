package it.hivan.bobteca;

import java.io.IOException;

import javafx.fxml.FXML;

public class Home {
    @FXML
    private void goToListaLibri() throws IOException {
        App.setRoot("lista_libri/lista");
    }
}
