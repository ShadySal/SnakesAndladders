package com.example.snakesandladders.Controller;

import com.example.snakesandladders.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class MainController {

    @FXML
    private Button GameHistoryBtn;

    @FXML
    private Button QuestionManagementBtn;

    @FXML
    private Button StartGameBtn;

    public void StartGame() throws IOException {
        Stage stage = (Stage) StartGameBtn.getScene().getWindow();
        stage.close();

        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("/com/example/snakesandladders/InitializeGame.fxml"));
        primaryStage.setTitle("Welcome!");
        primaryStage.setScene(new Scene(root, 600, 600));
        primaryStage.show();
    }

}
