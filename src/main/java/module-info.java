module com.example.custcont {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.custcont to javafx.fxml;
    exports com.example.custcont;
}