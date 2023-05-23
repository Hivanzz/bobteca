package it.hivan.bobteca;

import java.io.IOException;
import javafx.fxml.FXML;

public class Navbar {
    //private final DettaglioLibro controller;
    private UserSession userSession = UserSession.getInstance();

    @FXML
    private void goToHome() throws IOException {
        App.setRoot("home/home");
    }

    @FXML
    private void goToFeedback() throws IOException {
        Libro libro = new Libro("Il nome del vento", "Patrick Rothfuss", "Fantasy", "01/03/2007",
                                "9788804564512", "Mondadori", "Copertina rigida", 662, "Descrizione del libro.");
        //controller.modificaValori(libro);
        App.setRoot("nuovo_libro_specifico/nuovo_libro_specifico");
    }

    @FXML
    private void goToCambioEmail() throws IOException {
        if(userSession.isLoggedIn()) {
            App.setRoot("cambio_email");
        }
    }
    
    @FXML
    private void goToCambioPassword() throws IOException {
        if(userSession.isLoggedIn()) {
            App.setRoot("cambio_password");
        }
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

    @FXML
    private void esciAccount() throws IOException {
        userSession.logout();
        App.setRoot("login");
    }

}