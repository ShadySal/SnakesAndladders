package com.example.snakesandladders.model;

public class Snake {
    private int start; // Starting position of the snake
    private int end;   // Ending position of the snake

    public Snake(int start, int end) {
        this.start = start;
        this.end = end;
    }

    // Getter methods for start and end positions
    public int getStart() {
        return start;
    }

    public int getEnd() {
        return end;
    }

    // Other methods related to the Snake class
}
