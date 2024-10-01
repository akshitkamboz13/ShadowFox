package com.shadowfox.studentinfo.controllers;

import com.shadowfox.studentinfo.models.Student;
import com.shadowfox.studentinfo.utils.FileHandler;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;

public class StudentController {

    @FXML
    private TextField idField;
    @FXML
    private TextField nameField;
    @FXML
    private TextField ageField;
    @FXML
    private TextField classField;
    @FXML
    private Button addButton;
    @FXML
    private Button deleteButton;
    @FXML
    private Button updateButton;
    @FXML
    private TableView<Student> studentTable;
    @FXML
    private TableColumn<Student, String> idColumn;
    @FXML
    private TableColumn<Student, String> nameColumn;
    @FXML
    private TableColumn<Student, String> ageColumn;
    @FXML
    private TableColumn<Student, String> classColumn;

    private ObservableList<Student> students = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        idColumn.setCellValueFactory(new PropertyValueFactory<>("id"));
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        ageColumn.setCellValueFactory(new PropertyValueFactory<>("age"));
        classColumn.setCellValueFactory(new PropertyValueFactory<>("classC"));

        studentTable.setItems(students);

        addButton.setOnAction(e -> addStudent());
        deleteButton.setOnAction(e -> deleteStudent());
        updateButton.setOnAction(e -> updateStudent());
    }

    private void addStudent() {
        String id = idField.getText();
        String name = nameField.getText();
        String age = ageField.getText();
        String classC = classField.getText();

        if (!id.isEmpty() && !name.isEmpty() && !age.isEmpty() && !classC.isEmpty()) {
            students.add(new Student(id, name, age, classC));
            idField.clear();
            nameField.clear();
            ageField.clear();
            classField.clear();
        }
        saveStudents();
    }

    private void deleteStudent() {
        Student selectedStudent = studentTable.getSelectionModel().getSelectedItem();
        if (selectedStudent != null) {
            students.remove(selectedStudent);
        }
    }

    private void updateStudent(){
        Student selectedStudent = studentTable.getSelectionModel().getSelectedItem();
        if (selectedStudent != null) {
            idField.setText(selectedStudent.getId());
            nameField.setText(selectedStudent.getName());
            ageField.setText(selectedStudent.getAge());
            classField.setText(selectedStudent.getClassC());
            students.remove(selectedStudent);
        }
    }

    private void saveStudents() {
        try {
            FileHandler.saveStudents(students);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
