module com.example.phase1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.phase1 to javafx.fxml;
    exports com.example.phase1;
}