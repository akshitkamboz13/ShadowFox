package com.shadowfox.studentinfo.utils;

import com.shadowfox.studentinfo.models.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileHandler {

    private static final String FILE_PATH = "students.csv";

    public static List<Student> loadStudents() throws IOException {
        List<Student> students = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH));
        String line;
        while ((line = reader.readLine()) != null) {
            String[] data = line.split(",");
            students.add(new Student(data[0], data[1], data[2], data[3]));
        }
        reader.close();
        return students;
    }

    public static void saveStudents(List<Student> students) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH));
        for (Student student : students) {
            writer.write(student.getId() + "," + student.getName() + "," + student.getAge()+ "," + student.getClassC() + "\n");
        }
        writer.close();
    }
}
