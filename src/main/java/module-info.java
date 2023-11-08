module com.georgiancollege.week10 {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.google.gson;
    requires java.net.http;

    opens com.georgiancollege.week10 to javafx.fxml, com.google.gson;
    exports com.georgiancollege.week10;
}