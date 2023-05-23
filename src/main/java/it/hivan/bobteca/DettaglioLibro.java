package it.hivan.bobteca;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.MenuBar;
import javafx.scene.text.Text;
import javafx.scene.layout.Pane;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Button;

public class DettaglioLibro {
    @FXML
    private MenuBar menuBar;

    @FXML
    private Text titolo;

    @FXML
    private Text autore;

    @FXML
    private Text genere;

    @FXML
    private Text dataRilascio;

    @FXML
    private Text isbn;

    @FXML
    private Text editore;

    @FXML
    private Text formato;

    @FXML
    private Text numeroPagine;

    @FXML
    private Pane descrizione;

    @FXML
    private DatePicker datePicker;

    @FXML
    private Button prenotaButton;

    @FXML
    private Text descrizioneLibro;

    @FXML
    public void modificaValori() {
        String nuovoValore = "Hivanzh";
        titolo.setText(nuovoValore);
        autore.setText(nuovoValore);
        genere.setText(nuovoValore);
        dataRilascio.setText(nuovoValore);
        isbn.setText(nuovoValore);
        editore.setText(nuovoValore);
        formato.setText(nuovoValore);
        numeroPagine.setText(nuovoValore);
        descrizioneLibro.setText(nuovoValore);
    }
    
}
