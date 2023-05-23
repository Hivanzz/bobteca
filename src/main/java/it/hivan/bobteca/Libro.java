package it.hivan.bobteca;

public class Libro {
    private String titolo;
    private String autore;
    private String genere;
    private String dataPubblicazione;
    private String isbn;
    private String editore;
    private String formato;
    private int numeroPagine;

    // Costruttore
    public Libro(String titolo, String autore, String genere, String dataPubblicazione, String isbn,
                 String editore, String formato, int numeroPagine) {
        this.titolo = titolo;
        this.autore = autore;
        this.genere = genere;
        this.dataPubblicazione = dataPubblicazione;
        this.isbn = isbn;
        this.editore = editore;
        this.formato = formato;
        this.numeroPagine = numeroPagine;
    }

    // Metodi getter e setter per gli attributi
    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public String getGenere() {
        return genere;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }

    public String getDataPubblicazione() {
        return dataPubblicazione;
    }

    public void setDataPubblicazione(String dataPubblicazione) {
        this.dataPubblicazione = dataPubblicazione;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getEditore() {
        return editore;
    }

    public void setEditore(String editore) {
        this.editore = editore;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public int getNumeroPagine() {
        return numeroPagine;
    }

    public void setNumeroPagine(int numeroPagine) {
        this.numeroPagine = numeroPagine;
    }
}
