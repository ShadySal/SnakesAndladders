package com.example.snakesandladders.model;

public class Player {
    private String name;
    private int position;

    // Constructor
    public Player(String name) {
        this.name = name;
        this.position = 0; // Initialize the player's position to start
    }

    // Getter and setter methods for name and position
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }
}
