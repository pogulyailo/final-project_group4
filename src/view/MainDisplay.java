package view;

import entity.Main;
import entity.Settings;
import entity.YouTubeAnalytics;

import java.util.Scanner;

public class MainDisplay implements Display{
    private String greeting;
    private String version;
    private static final String MENU = "Select the menu item :";
    private static final String ITEM1 = "1. Go to YouTube Analytics";
    private static final String ITEM2 = "2. Go to settings";
    private static final String ITEM3 = "3. Exit";

    private Main main;
    private YouTubeAnalytics youTubeAnalytics;
    private Settings settings;

    public MainDisplay() {
        this.main = new Main();
        this.youTubeAnalytics = new YouTubeAnalytics();
        this.settings = new Settings();
        this.greeting = main.getGreeting();
        this.version = main.getVersion();
    }

    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public void displayMenu() {
        System.out.println(greeting);
        System.out.println(version);
        System.out.println(MENU);
        System.out.println(ITEM1);
        System.out.println(ITEM2);
        System.out.println(ITEM3);

        chooseItem();
    }

    public void chooseItem() {
        Scanner scanner = new Scanner(System.in);
        int item = scanner.nextInt();
        switch (item){
            case 1: youTubeAnalytics.displayMenu();
            case 2: settings.displayMenu();
            case 3: System.exit(0);
        }


    }
}
