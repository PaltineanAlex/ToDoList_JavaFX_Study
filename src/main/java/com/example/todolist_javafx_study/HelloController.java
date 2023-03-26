package com.example.todolist_javafx_study;

import com.example.todolist_javafx_study.datamodel.ToDoItem;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class HelloController {

    private List<ToDoItem> toDoItems;

    public void initialize(){
        ToDoItem item1 = new ToDoItem("Mail birthday card",
                "Buy a 30th birthday card for John", LocalDate.of(2023, Month.MARCH, 26));
        ToDoItem item2 = new ToDoItem("Doctor's Appointment",
                "See Dr. Smith at 123 Main Street. Bring paperwork", LocalDate.of(2023, Month.MARCH, 26));
        ToDoItem item3 = new ToDoItem("Finish design proposal for client",
                "I promised Mike I'd email website mockups by Friday 22nd April", LocalDate.of(2023, Month.APRIL, 22));
        ToDoItem item4 = new ToDoItem("Pickup Doug at the train station",
                "Doug's arriving on March 23 on the 5:00 train", LocalDate.of(2023, Month.MARCH, 23));
        ToDoItem item5 = new ToDoItem("Pickup dry cleaning",
                "The clothes should be ready by Wednesday", LocalDate.of(2023, Month.APRIL, 20));

        toDoItems = new ArrayList<>();
        toDoItems.add(item1);
        toDoItems.add(item2);
        toDoItems.add(item3);
        toDoItems.add(item4);
        toDoItems.add(item5);
    }
}