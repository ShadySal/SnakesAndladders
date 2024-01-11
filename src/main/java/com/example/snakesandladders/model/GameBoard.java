package com.example.snakesandladders.model;

import java.util.Map;
import java.util.HashMap;

public class GameBoard {
    private int size; // The size of the game board
    private Map<Integer, Snake> snakes; // Map to store snake positions
    private Map<Integer, Ladder> ladders; // Map to store ladder positions
    private Map<Player, Integer> playerPositions; // Map to store player positions

    public GameBoard(int size) {
        this.size = size;
        this.snakes = new HashMap<>();
        this.ladders = new HashMap<>();
        this.playerPositions = new HashMap<>();
    }

    // Method to add a snake to the board
    public void addSnake(Snake snake) {
        snakes.put(snake.getStart(), snake);
    }

    // Method to add a ladder to the board
    public void addLadder(Ladder ladder) {
        ladders.put(ladder.getStart(), ladder);
    }

    // Method to add a player to the board
    public void addPlayer(Player player, int startPosition) {
        playerPositions.put(player, startPosition);
    }

    // Method to move a player based on the dice roll
    public void movePlayer(Player player, int diceRoll) {
        // Implement player movement logic here
        // Check for snakes and ladders
        // Update player position accordingly
    }

    // Add other methods for game logic as needed

    // Getter methods for board size, snakes, ladders, and player positions
    public int getSize() {
        return size;
    }

    public Map<Integer, Snake> getSnakes() {
        return snakes;
    }

    public Map<Integer, Ladder> getLadders() {
        return ladders;
    }

    public Map<Player, Integer> getPlayerPositions() {
        return playerPositions;
    }
}
