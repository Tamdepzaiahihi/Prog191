module com.example.java_ui {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.java_ui to javafx.fxml;
    exports com.example.java_ui;
}