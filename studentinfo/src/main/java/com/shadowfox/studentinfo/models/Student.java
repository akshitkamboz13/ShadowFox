package com.shadowfox.studentinfo.models;

import javafx.beans.property.SimpleStringProperty;

public class Student {
    private SimpleStringProperty name;
    private SimpleStringProperty id;
    private SimpleStringProperty age;
    private SimpleStringProperty classC;

    public Student(String id, String name, String age,String classC) {
        this.id = new SimpleStringProperty(id);
        this.name = new SimpleStringProperty(name);
        this.age = new SimpleStringProperty(age);
        this.classC = new SimpleStringProperty(classC);
    }

    public String getName() {
        return name.get();
    }

    public void setName(String name) {
        this.name.set(name);
    }

    public String getId() {
        return id.get();
    }

    public void setId(String id) {
        this.id.set(id);
    }

    public String getAge() {
        return age.get();
    }

    public void setAge(String age) {this.age.set(age);}

    public String getClassC() {return classC.get();}

    public void setClassC(String ClassC) {this.classC.set(ClassC);}
}
