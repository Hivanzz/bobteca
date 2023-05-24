package it.hivan.bobteca;

import java.io.Serializable;
import java.util.Vector;

public class Utente implements Serializable {
    private static final long serialVersionUID = 6845857363574396199L;

    private String username;
    private String password;
    Vector<UserPrenotazioni> listaPrenotazioni;

    public Utente(String username, String password) {
        this.username = username;
        this.password = password;
        listaPrenotazioni = new Vector<UserPrenotazioni>();
    }

    // Getters and setters

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}