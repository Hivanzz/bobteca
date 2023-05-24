package it.hivan.bobteca;

public class UserPrenotazioni {
    String dataRitiro;
    String dataPrenotazione;
    Libro datiLibro;

    public UserPrenotazioni(String dataRitiro, String dataPrenotazione, Libro datiLibro) {
        this.dataRitiro = dataRitiro;
        this.dataPrenotazione = dataPrenotazione;
        this.datiLibro = datiLibro;
    }

    public String getDataRitiro() {
        return this.dataRitiro;
    }

    public void setDataRitiro(String dataRitiro) {
        this.dataRitiro = dataRitiro;
    }

    public String getDataPrenotazione() {
        return this.dataPrenotazione;
    }

    public void setDataPrenotazione(String dataPrenotazione) {
        this.dataPrenotazione = dataPrenotazione;
    }

    public Libro getDatiLibro() {
        return this.datiLibro;
    }

    public void setDatiLibro(Libro datiLibro) {
        this.datiLibro = datiLibro;
    }

}
