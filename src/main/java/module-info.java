module com.myprojects {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.myprojects to javafx.fxml;
    exports com.myprojects;
}
