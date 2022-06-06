module com.example.taqueriadb {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.taqueriadb to javafx.fxml;
    exports com.example.taqueriadb;
}
