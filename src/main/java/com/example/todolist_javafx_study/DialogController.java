package com.example.todolist_javafx_study;

import com.example.todolist_javafx_study.datamodel.ToDoData;
import com.example.todolist_javafx_study.datamodel.ToDoItem;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.time.LocalDate;
import java.util.Date;

public class DialogController {
    @FXML
    private TextField shortDescriptionField;
    @FXML
    private TextArea detailsArea;
    @FXML
    private DatePicker deadlinePicker;

    public void processResults(){
        String shortDescription = shortDescriptionField.getText().trim();
        String details = detailsArea.getText().trim();
        LocalDate deadlineValue = deadlinePicker.getValue();

        ToDoData.getInstance().addToDoItem(new ToDoItem(shortDescription, details, deadlineValue));
    }
}
