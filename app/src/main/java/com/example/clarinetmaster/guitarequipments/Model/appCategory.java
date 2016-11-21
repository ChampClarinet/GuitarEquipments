package com.example.clarinetmaster.guitarequipments.Model;

/**
 * Category int
 * 1 = main
 * 2 = body
 * 3 = pickups
 * 4 = effects
 * 5 = dialog
 */

public class appCategory {

    private final String name;
    private final String imageFileName;
    private final boolean isMainMenu;
    private final String content;
    private int searchCount;

    public appCategory(String name, String imageFileName) {
        this.name = name;
        this.imageFileName = imageFileName;
        this.isMainMenu = true;
        this.content = null;
        this.searchCount = 0;
    }

    public appCategory(String name, String imageFileName, String content) {
        this.name = name;
        this.imageFileName = imageFileName;
        this.isMainMenu = false;
        this.content = content;
        this.searchCount = 0;
    }

    public String getName() {
        return name;
    }

    public String getImageFileName() {
        return imageFileName;
    }

    public boolean isMainMenu(){
        return isMainMenu;
    }

    public String getContent() {
        return content;
    }

}