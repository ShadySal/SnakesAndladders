package com.example.snakesandladders.model;

public class Snake {
    private int startPosition;
    private int endPosition;

    public Snake(int startPosition, int endPosition) {
        // Initialize snake attributes here
    }

    public void triggerEffect(Player player) {
        // Move the player to the endPosition when they land on the snake
    }
    public int getStart(){
        return this.startPosition;
    }
}
