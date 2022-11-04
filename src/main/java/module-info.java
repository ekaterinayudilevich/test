module com.example.andersentrainee {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.andersentrainee to javafx.fxml;
    exports com.example.andersentrainee;
}