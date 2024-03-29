package com.example.snakesandladders.Controller;
import com.example.snakesandladders.Enums.Difficulty;
import com.example.snakesandladders.model.Player;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;

import java.util.ArrayList;
import java.util.List;
public class PlayerSelectionController {

    @FXML
    private Pane contentPane;

    @FXML
    private Text PlayerSelectionTurn;

    @FXML
    private TextField PlayerName;

    @FXML
    private ComboBox<String> ObjectSelect;

    private int currentPlayerNumber;
    private int totalPlayers;
    private List<Player> players;

    public void initialize() {
        ObjectSelect.getItems().addAll("Object 1", "Object 2", "Object 3", "Object 4", "Object 5", "Object 6");
        players = new ArrayList<>();
    }

    public void setPlayerData(int playerNumber, Player player, int currentPlayerNumber, int totalPlayers) {
        this.currentPlayerNumber = currentPlayerNumber;
        this.totalPlayers = totalPlayers;
        players.add(player);

        // If all players have made selections, start the game or perform any other action.
        if (currentPlayerNumber == totalPlayers) {
         /* TOD0!!!
             startGame();
          */

        } else {
            // Update the UI for the next player.
            updateUIForNextPlayer();
        }
    }

    private void updateUIForNextPlayer() {
        // Clear previous player's selections
        PlayerName.clear();
        ObjectSelect.getSelectionModel().clearSelection();
        PlayerSelectionTurn.setText("Player " + currentPlayerNumber);


        /* TO DO!!!!
          Name Check if it has been chosen or not
         */
        // Update UI elements to indicate the next player's turn (if needed)
        // You can update labels or display messages here.
    }

    private void startGame() {
        /*
         Implement  logic to start the game!
       */
        System.out.println("Game Started");
    }

    @FXML
    private void savePlayerSelection() {
        String playerName = PlayerName.getText();
        String selectedObject = ObjectSelect.getValue();
        if(currentPlayerNumber > 1){
            Player p = new Player(playerName, currentPlayerNumber);
            players.add(p);
        }
        // Set the player's name and selected object in the player instance
        Player currentPlayer = players.get(currentPlayerNumber - 1);
        currentPlayer.setName(playerName);
        currentPlayer.setSelectedObject(selectedObject);
        System.out.println(currentPlayer);

        // Proceed to the next player or start the game
        if (currentPlayerNumber < totalPlayers) {
            currentPlayerNumber++;
            updateUIForNextPlayer();
        } else {
            startGame();
        }
    }
}
