module com.shadowfox.studentinfo {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.shadowfox.studentinfo.controllers to javafx.fxml;
    opens com.shadowfox.studentinfo.models to javafx.controls, javafx.base;

    exports com.shadowfox.studentinfo.controllers;
    exports com.shadowfox.studentinfo;
}
