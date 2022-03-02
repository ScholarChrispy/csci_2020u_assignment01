module com.builder.assignment_01 {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;


    opens com.builder.assignment_01 to javafx.fxml;
    exports com.builder.assignment_01;
}