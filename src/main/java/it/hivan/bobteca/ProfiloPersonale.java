package it.hivan.bobteca;

import java.io.Serializable;

import javafx.fxml.FXML;
import javafx.scene.text.Text;

public class ProfiloPersonale implements Serializable {
    
    private UserSession userSession = UserSession.getInstance();

    @FXML
    private Text emailPlaceHolder;
    
    @FXML
    private void initialize() {
        emailPlaceHolder.setText(userSession.getLoggedInUser().getUsername());
    }
}
