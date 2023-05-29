package it.hivan.bobteca;

public class UserSession {
    private static UserSession instance;
    private Utente loggedInUser;

    private UserSession() {
        // Private constructor to prevent instantiation
    }

    public static UserSession getInstance() {
        if (instance == null) {
            instance = new UserSession();
        }
        return instance;
    }

    public Utente getLoggedInUser() {
        return loggedInUser;
    }

    public void setLoggedInUser(Utente loggedInUser) {
        this.loggedInUser = loggedInUser;
    }

    public boolean isLoggedIn() {
        return loggedInUser != null;
    }

    public void logout() {
        loggedInUser = null;
    }
}
