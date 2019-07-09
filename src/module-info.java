module JavaFXTest {
    requires javafx.controls;
    requires javafx.fxml;
    opens org.dimigo.gui.Helloworld;
    requires javafx.base;

    requires java.desktop;
    requires javafx.web;
}