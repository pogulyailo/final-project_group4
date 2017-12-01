package entity;

import view.Display;

public class Settings implements Display {
    private String settings;

    public Settings() {
        this.settings = "SETTINGS";
    }

    public Settings(String settings) {
        this.settings = settings;
    }

    public String getSettings() {
        return settings;
    }

    public void setSettings(String settings) {
        this.settings = settings;
    }

    @Override
    public void displayMenu() {

    }

    @Override
    public void chooseItem() {

    }
}
