package com.example.snakesandladders.model;

public class Square {
    private int position;
    private String content; // Content of the square (e.g., "Snake", "Ladder", "Question", "Surprise")

    public Square(int position, String content) {
        this.position = position;
        this.content = content;
    }

    // Getters and setters for the attributes

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Position: " + position + ", Content: " + content;
    }
}
