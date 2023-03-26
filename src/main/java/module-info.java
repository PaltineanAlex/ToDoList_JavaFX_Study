module com.example.todolist_javafx_study {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.todolist_javafx_study to javafx.fxml;
    exports com.example.todolist_javafx_study;
}