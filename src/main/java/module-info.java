module it.hivan.bobteca {
    requires javafx.controls;
    requires javafx.fxml;

    opens it.hivan.bobteca to javafx.fxml;
    exports it.hivan.bobteca;
}
