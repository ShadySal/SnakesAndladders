package com.example.snakesandladders.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Game {
    private List<Player> players;
    private int currentPlayerIndex;
    private int diceValue;
    private boolean gameOver;

    // Constructor
    public Game() {
        players = new ArrayList<>();
        currentPlayerIndex = 0;
        diceValue = 0;
        gameOver = false;
    }

    // Method to add a player to the game
    public void addPlayer(String playerName) {
        players.add(new Player(playerName));
    }

    // Method to roll the dice
    public void rollDice() {
        Random random = new Random();
        diceValue = random.nextInt(10) + 1; // Roll a random number between 1 and 6
    }

    // Method to move the current player based on the dice roll
    public void moveCurrentPlayer() {
        if (!gameOver) {
            Player currentPlayer = players.get(currentPlayerIndex);
            int currentPosition = currentPlayer.getPosition();
            int newPosition = currentPosition + diceValue;
            // Add logic here to handle snakes and ladders
            // Update player position
            currentPlayer.setPosition(newPosition);
            // Check for win condition
            if (newPosition >= 100) {
                gameOver = true;
                // Player has won
            }
            // Move to the next player
            currentPlayerIndex = (currentPlayerIndex + 1) % players.size();
        }
    }



    // Getters and setters for various properties

    public List<Player> getPlayers() {
        return players;
    }

    public int getCurrentPlayerIndex() {
        return currentPlayerIndex;
    }

    public int getDiceValue() {
        return diceValue;
    }

    public boolean isGameOver() {
        return gameOver;
    }
}
