package view;

import entity.Main;

import java.util.Scanner;

public class MainDisplay implements Display{

    private static final String MENU = "Select the menu item :";
    private static final String ITEM1 = "1. Go to YouTube Analytics";
    private static final String ITEM2 = "2. Go to settings";
    private static final String ITEM3 = "3. Exit";

    private Main main;
    private MainDisplay mainDisplay;
    private YouTubeDisplay youTubeDisplay;
    private SettingsDisplay settingsDisplay;

    public MainDisplay() {
        this.main = new Main();
        this.mainDisplay = new MainDisplay();
        this.youTubeDisplay = new YouTubeDisplay();
        this.settingsDisplay = new SettingsDisplay();
    }

    public void displayMenu() {
        System.out.println(main.getGreeting());
        System.out.println(main.getVersion());
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
            case 1: youTubeDisplay.displayMenu();               //переходим на экран YouTube
            case 2: settingsDisplay.displayMenu();              //переходим на экран Settings
            case 3: System.exit(0);                      //выход из программы
        }
    }

}
