package com.shadowfox.studentinfo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws IOException {
        // Load the FXML file
        Parent root = FXMLLoader.load(getClass().getResource("/com/shadowfox/studentinfo/views/StudentView.fxml"));
        primaryStage.setTitle("Student Information System");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
