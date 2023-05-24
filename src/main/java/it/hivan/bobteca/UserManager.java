package it.hivan.bobteca;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Vector;

import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class UserManager implements Serializable {
    private final static String DATABASE_FILE = "src/main/java/it/hivan/bobteca/loginData/users.ser";
    private static final long serialVersionUID = 6845857363574396199L;

    private UserSession userSession = UserSession.getInstance();
    private static Vector<Utente> listaRegistrati = new Vector<Utente>();
    
    @FXML
    private TextField dataEmail;
    
    @FXML
    private TextField dataPassword;

    @FXML
    private TextField oldPass;

    @FXML
    private TextField newPass;

    @FXML
    private TextField newUsername;

    @FXML
    private TextField emailRecupera;

    @FXML 
    private PasswordField passwordRecupera;

    @FXML
    private void tryLogin() throws IOException, ClassNotFoundException {
        UserManager.caricaUtentiRegistrati();
        //listaRegistrati.add(new Utente("admin", "admin"));
        //UserManager.salvaUtentiRegistrati();
        for(Utente user: listaRegistrati) {
            if (user.getUsername().equals(dataEmail.getText()) && user.getPassword().equals(dataPassword.getText())) {
                userSession.setLoggedInUser(user);
                
                App.setRoot("home/home");
                break;
            }
        }
    }

    @FXML
    private void tryRegister() throws IOException, ClassNotFoundException {
        UserManager.caricaUtentiRegistrati();
        if(!controllaSeRegistrato(dataEmail.getText())) {
            Utente user = new Utente(dataEmail.getText(), dataEmail.getText());
            listaRegistrati.add(user);
            UserManager.salvaUtentiRegistrati();
            App.setRoot("login");
        }
    }

    @FXML
    private void tryChangePass() throws IOException, ClassNotFoundException {
        String userPassword = userSession.getLoggedInUser().getPassword();
        String oldPassL = oldPass.getText();
        if(userPassword.equals(oldPassL)){
            userSession.getLoggedInUser().setPassword(newPass.getText());
            salvaUtentiRegistrati();
            userSession.logout();
            App.setRoot("login");
        }
    }

    @FXML
    private void tryChangeUsername() throws IOException, ClassNotFoundException {
        userSession.getLoggedInUser().setUsername(newUsername.getText());
        salvaUtentiRegistrati();
        userSession.logout();
        App.setRoot("login");
    }

    @FXML
    private void tryNuovaPassword() throws IOException, ClassNotFoundException{
        caricaUtentiRegistrati();
        for(Utente user: listaRegistrati) {
            if(user.getUsername().equals(emailRecupera.getText())) {
                user.setPassword(passwordRecupera.getText());
                salvaUtentiRegistrati();
                App.setRoot("login");
            }
        }
    }

    public static boolean controllaSeRegistrato(String username) {
        for(Utente user: listaRegistrati) {
            if(user.getUsername().equals(username)) {
                return true;
            }
        }
        return false;
    }

    public static void caricaUtentiRegistrati() throws ClassNotFoundException, IOException {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(DATABASE_FILE))) {
            listaRegistrati = (Vector<Utente>) inputStream.readObject();
            System.out.println("Lista utenti registrati caricata correttamente.");
        } catch (EOFException e) {
            System.out.println("Il file dei dati è vuoto.");
        }
    }

    public static void salvaUtentiRegistrati() throws IOException {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(DATABASE_FILE))) {
            outputStream.writeObject(listaRegistrati);
            System.out.println("Lista utenti registrati salvata correttamente.");
        }
    }

    // Pulsanti e collegamenti ipertestuali //
    @FXML
    private void goToSignIn() throws IOException {
        App.setRoot("signin");
    }

    @FXML
    private void goToLogin() throws IOException {
        App.setRoot("login");
    }

    @FXML
    private void goToPasswordDimenticata() throws IOException {
        App.setRoot("password_dimenticata");
    }
}