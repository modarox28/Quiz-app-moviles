package com.example.quiz;

public class GameCharacter {
    private String name;
    private String description;
    private int imageResource;

    public GameCharacter(String name, String description, int imageResource) {
        this.name = name;
        this.description = description;
        this.imageResource = imageResource;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getImageResource() {
        return imageResource;
    }
}
