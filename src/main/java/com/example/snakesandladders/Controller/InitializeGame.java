package com.example.snakesandladders.Controller;

import com.example.snakesandladders.Enums.Difficulty;
import com.example.snakesandladders.model.Player;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import java.util.ArrayList;
import java.util.List;
import javafx.scene.Parent;
import javafx.stage.Stage;

public class InitializeGame {
    @FXML
    private Pane MainPane;

    @FXML
    private ComboBox<Integer> PlayersNum;

    @FXML
    private ComboBox<Difficulty> SelectDifficulty;

    @FXML
    private Button NextButton;
    @FXML
    private TextField PlayerName;


    private List<Player> players;
    private int currentPlayerNumber;
    public void initialize() {
        PlayersNum.getItems().clear();
        for (int i = 2; i <= 6; i++) {
            PlayersNum.getItems().add(i);
        }
        PlayersNum.setValue(2);
        SelectDifficulty.setItems(FXCollections.observableArrayList(Difficulty.values()));
        SelectDifficulty.setValue(Difficulty.EASY);
        players = new ArrayList<>();
        currentPlayerNumber = 1;
    }
    @FXML
    void SubmitChoices(ActionEvent event) {
        int numberOfPlayers = PlayersNum.getValue();


        // Load the player selection scene for each player

            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/snakesandladders/player_selection.fxml"));
                Parent root = loader.load();

                // Get the controller for the player selection scene (PlayerSelectionController)
                PlayerSelectionController playerSelectionController = loader.getController();

                // Create a new Player instance for this player
                Player player = new Player("Player " + currentPlayerNumber );
                player.setPlayerNumber(currentPlayerNumber);
                players.add(player);

                // Pass the player number and player instance to the controller
                playerSelectionController.setPlayerData(currentPlayerNumber, player, currentPlayerNumber, numberOfPlayers);

                // Create a new scene and set it on a new stage for each player
                MainPane.getChildren().clear();
                MainPane.getChildren().add(root);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }


    public ComboBox<Integer> getPlayersNum() {
        return PlayersNum;
    }
}
