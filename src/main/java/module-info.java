module com.put.poznan {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    opens com.put.poznan to javafx.fxml;
    exports com.put.poznan.Controllers;
}