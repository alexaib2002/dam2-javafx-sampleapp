module com.example.tutorialv {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.xml.bind;
    requires java.prefs;

    opens tutorialV to java.xml.bind, javafx.fxml;
    exports tutorialV;
}