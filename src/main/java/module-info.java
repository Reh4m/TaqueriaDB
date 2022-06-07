module com.example.taqueriadb {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.taqueriadb to javafx.fxml;
    exports com.example.taqueriadb;
}
