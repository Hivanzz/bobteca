package it.hivan.bobteca;

import java.io.IOException;
import javafx.fxml.FXML;

public class Navbar {
    @FXML
    private void goToHome() throws IOException {
        App.setRoot("home/home");
    }

    @FXML
    private void goToFeedback() throws IOException {
        App.setRoot("nuovo_libro_specifico/nuovo_libro_specifico");
    }

    @FXML
    private void goToCambioEmail() throws IOException {
        App.setRoot("cambio_email");
    }
    
    @FXML
    private void goToCambioPassword() throws IOException {
        App.setRoot("cambio_password");
    }
    
    @FXML
    private void goToGestioneUtenti() throws IOException {
        App.setRoot("gestione_utenti/gestione_utenti");
    }
    
    @FXML
    private void goToGestioneLibri() throws IOException {
        App.setRoot("lista_libri_admin/listaAdmin");
    }

    @FXML
    private void goToSignIn() throws IOException {
        App.setRoot("signin");
    }

    public void testCommit() {
        
    }
}